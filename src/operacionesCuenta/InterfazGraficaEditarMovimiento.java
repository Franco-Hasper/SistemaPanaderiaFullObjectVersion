package operacionesCuenta;

import calsesPadre.InterfazGraficaFormularioEditar;
import escritorios.PrincipalCuenta;
import formularios.FormularioEditarMovimientoCuenta;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaEditarMovimiento extends InterfazGraficaFormularioEditar {

    private PrincipalCuenta principalCuenta;
    private TablaMovimientoCuenta tablaMovimientoCuenta;

    public PrincipalCuenta getPrincipalCuenta() {
        return principalCuenta;
    }

    public void setPrincipalCuenta(PrincipalCuenta principalCuenta) {
        this.principalCuenta = principalCuenta;
    }

    public TablaMovimientoCuenta getTablaMovimientoCuenta() {
        return tablaMovimientoCuenta;
    }

    public void setTablaMovimientoCuenta(TablaMovimientoCuenta tablaMovimientoCuenta) {
        this.tablaMovimientoCuenta = tablaMovimientoCuenta;
    }

    @Override
    public void nuevoFormularioEditar() {
        FormularioEditarMovimientoCuenta formularioEditar = new FormularioEditarMovimientoCuenta(frame, true);
        formularioEditar.setPrincipalCuenta(principalCuenta);
        principalCuenta.setFormularioEditarMovimiento(formularioEditar);
        transferirDatos();
        colorTema();
        principalCuenta.getFormularioEditarMovimiento().setVisible(true);
    }

    @Override
    public void colorTema() {
        principalCuenta.getFormularioEditarMovimiento().getPanelPrincipalTop().setBackground(principalCuenta.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {

        int fila = principalCuenta.getTablaGraficaMovimiento().getSelectedRow();
        principalCuenta.getFormularioEditarMovimiento().getTxtMotivo().setText(principalCuenta.getTablaGraficaMovimiento().getValueAt(fila, 0).toString());
        principalCuenta.getFormularioEditarMovimiento().getTxtMonto().setText(principalCuenta.getTablaGraficaMovimiento().getValueAt(fila, 1).toString());
    }

    @Deprecated
    @Override
    public void agregarBoxes() {

    }

    @Deprecated
    @Override
    public void rellenarBoxes() {

    }
}
