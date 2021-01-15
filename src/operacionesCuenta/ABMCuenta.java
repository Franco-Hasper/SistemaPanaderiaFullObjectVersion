package operacionesCuenta;

import calsesPadre.ABM;
import entidades.Cliente;
import entidades.Cuenta;
import entidades.MovimientoCuenta;
import escritorios.PrincipalCuenta;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class ABMCuenta extends ABM {
    
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
        setListaCampos(this.principalCuenta.getListaCamposCuenta());
    }
    
    @Override
    public void obtenerFormularioEditar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void transaccionRegistrar(Session miSesion) {
        Cliente cl = (Cliente) miSesion.get(Cliente.class, principalCuenta.getIdCliente());
        Cuenta cu = new Cuenta();
        cu.setBalance(Double.valueOf(principalCuenta.getTxtMontoInicial().getText()));
        cu.setCodigoCliente(cl);
        miSesion.save(cu);
        MovimientoCuenta mc = new MovimientoCuenta();
        mc.setMotivo("Monto Inicial");
        mc.setMonto(Double.valueOf(principalCuenta.getTxtMontoInicial().getText()));
        mc.setBalance(Double.valueOf(principalCuenta.getTxtMontoInicial().getText()));
        mc.setCodigoCuenta(cu);
    }
    
    @Override
    public void transaccionEditar(Session miSesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void transaccionEliminar(Session miSesion) {
        Integer id = principalCuenta.getTablaCuenta().obtenerIdFilaSeleccionada();
        Cuenta c = (Cuenta) miSesion.get(Cuenta.class, id);
        miSesion.delete(c);
    }
    
}
