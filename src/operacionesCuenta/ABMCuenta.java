package operacionesCuenta;

import calsesPadre.ABM;
import entidades.Cliente;
import entidades.Cuenta;
import entidades.Gasto;
import entidades.MovimientoCuenta;
import escritorios.PrincipalCuenta;
import formularios.FormularioEditarCuenta;
import java.util.List;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class ABMCuenta extends ABM {

    private PrincipalCuenta principalCuenta;
    private FormularioEditarCuenta formularioEditarCuenta;

    public PrincipalCuenta getPrincipalCuenta() {
        return principalCuenta;
    }

    public void setPrincipalCuenta(PrincipalCuenta principalCuenta) {
        this.principalCuenta = principalCuenta;
    }

    public FormularioEditarCuenta getFormularioEditarCuenta() {
        return formularioEditarCuenta;
    }

    public void setFormularioEditarCuenta(FormularioEditarCuenta formularioEditarCuenta) {
        this.formularioEditarCuenta = formularioEditarCuenta;
    }

    @Override
    public void obtenerFormularioRegistrar() {
        setFormularioRegistrar(null);
        setListaCampos(this.principalCuenta.getListaCamposCuenta());
    }

    @Override
    public void obtenerFormularioEditar() {
        setFormularioEditar(this.getFormularioEditarCuenta());
        setListaCampos(this.getFormularioEditarCuenta().getListaCampos());
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
        Integer id = principalCuenta.getTablaCuenta().obtenerIdFilaSeleccionada();
        Cuenta c = (Cuenta) miSesion.get(Cuenta.class, id);
        MovimientoCuenta mc = (MovimientoCuenta) miSesion.get(MovimientoCuenta.class, c.getIdCuenta());
        c.setBalance(Double.valueOf(formularioEditarCuenta.getTxtBalance().getText()));
        mc.setMonto(Double.valueOf(formularioEditarCuenta.getTxtBalance().getText()));
        mc.setBalance(Double.valueOf(formularioEditarCuenta.getTxtBalance().getText()));
        miSesion.saveOrUpdate(mc);
        miSesion.saveOrUpdate(c);
    }

    @Override
    public void transaccionEliminar(Session miSesion) {
        Integer id = principalCuenta.getTablaCuenta().obtenerIdFilaSeleccionada();
        Cuenta c = (Cuenta) miSesion.get(Cuenta.class, id);
        miSesion.delete(c);
    }

}
