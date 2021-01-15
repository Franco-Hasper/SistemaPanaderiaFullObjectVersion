package operacionesCuenta;

import calsesPadre.ABM;
import conexion.ConexionHibernate;
import ds.desktop.notify.DesktopNotify;
import entidades.Cuenta;
import entidades.MovimientoCuenta;
import escritorios.PrincipalCuenta;
import java.util.List;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class ABMMovimientoCuenta extends ABM {

    private PrincipalCuenta principalCuenta;

    public PrincipalCuenta getPrincipalCuenta() {
        return principalCuenta;
    }

    public void setPrincipalCuenta(PrincipalCuenta principalCuenta) {
        this.principalCuenta = principalCuenta;
    }

    @Override
    public void obtenerFormularioRegistrar() {
        setFormularioRegistrar(null);
        setListaCampos(this.principalCuenta.getListaCamposMovimientoCuenta());
    }

    @Override
    public void obtenerFormularioEditar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transaccionRegistrar(Session miSesion) {
        MovimientoCuenta mc = new MovimientoCuenta();
        mc.setMotivo(principalCuenta.getEditPaneMotivo().getText());
        mc.setMonto(Double.valueOf(principalCuenta.getTxtMonto().getText()));
        Integer id = principalCuenta.getTablaCuenta().obtenerIdFilaSeleccionada();
        Cuenta c = (Cuenta) miSesion.get(Cuenta.class, id);
        mc.setBalance(c.getBalance() + mc.getMonto());
        mc.setCodigoCuenta(c);
        miSesion.save(mc);
        c.setBalance(mc.getBalance());
        miSesion.saveOrUpdate(c);
    }

    @Override
    public void transaccionEditar(Session miSesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transaccionEliminar(Session miSesion) {
        Integer id = principalCuenta.getTablaMovimientoCuenta().obtenerIdFilaSeleccionada();
        MovimientoCuenta mc = (MovimientoCuenta) miSesion.get(MovimientoCuenta.class, id);
        miSesion.delete(mc);

        /*
        mc.setMotivo(principalCuenta.getEditPaneMotivo().getText());
        mc.setMonto(Double.valueOf(principalCuenta.getTxtMonto().getText()));
        id = principalCuenta.getTablaCuenta().obtenerIdFilaSeleccionada();
        Cuenta c = (Cuenta) miSesion.get(Cuenta.class, id);
        mc.setBalance(c.getBalance() + mc.getMonto());
        mc.setCodigoCuenta(c);
        miSesion.save(mc);
        c.setBalance(mc.getBalance());
        
        */
    
    }
    
    public void ejecutarActualizarMovimientoCuenta(){
        Integer id = principalCuenta.getTablaCuenta().obtenerIdFilaSeleccionada();
        setConsultaList("FROM MovimientoCuenta where codigoCuenta=" + id);
        obtenerListaConsulta();
        actualizarMovimeintoCuenta();
    }

    private void actualizarMovimeintoCuenta() {
        
        Integer idMovCuenta;
        Double monto;
        Double balance;
        

            List lista = this.getListaResultados();
            for (Object o : lista) {
                MovimientoCuenta resultsMC = (MovimientoCuenta) o;

                idMovCuenta = resultsMC.getIdMovimientoCuenta();
                monto = resultsMC.getMonto();
                balance = resultsMC.getBalance();
                
                Session miSesion = ConexionHibernate.tomarConexion();
                miSesion.beginTransaction();
                MovimientoCuenta actualizarMC = (MovimientoCuenta) miSesion.get(MovimientoCuenta.class, idMovCuenta);

                Cuenta cnt = (Cuenta) miSesion.get(Cuenta.class, resultsMC.getCodigoCuenta().getIdCuenta());

                if (resultsMC.getMotivo().equals("Monto Inicial")) {
                    actualizarMC.setMonto(monto);
                    actualizarMC.setBalance(balance);
                    cnt.setBalance(balance);
                } else {
                    Double nuevoBalance = (cnt.getBalance() + (monto));
                    actualizarMC.setMonto(monto);
                    actualizarMC.setBalance(nuevoBalance);
                    cnt.setBalance(nuevoBalance);
                }

                miSesion.saveOrUpdate(actualizarMC);
                miSesion.saveOrUpdate(cnt);
                miSesion.getTransaction().commit();
            }

    }

}
