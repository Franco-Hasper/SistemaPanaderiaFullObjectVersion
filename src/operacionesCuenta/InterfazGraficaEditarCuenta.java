package operacionesCuenta;

import calsesPadre.InterfazGraficaFormularioEditar;
import escritorios.PrincipalCuenta;
import formularios.FormularioEditarCuenta;
import formularios.FormularioEditarMovimientoCuenta;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaEditarCuenta extends InterfazGraficaFormularioEditar {

    private PrincipalCuenta principalCuenta;
    private TablaCuenta tablaCuenta;

    public PrincipalCuenta getPrincipalCuenta() {
        return principalCuenta;
    }

    public void setPrincipalCuenta(PrincipalCuenta principalCuenta) {
        this.principalCuenta = principalCuenta;
    }

    public TablaCuenta getTablaCuenta() {
        return tablaCuenta;
    }

    public void setTablaCuenta(TablaCuenta tablaCuenta) {
        this.tablaCuenta = tablaCuenta;
    }



    @Override
    public void nuevoFormularioEditar() {
        FormularioEditarCuenta formularioEditar = new FormularioEditarCuenta(frame, true);
        formularioEditar.setPrincipalCuenta(principalCuenta);
        principalCuenta.setFormularioEditar(formularioEditar);
        transferirDatos();
        colorTema();
        principalCuenta.getFormularioEditar().setVisible(true);
    }

    @Override
    public void colorTema() {
        principalCuenta.getFormularioEditar().getPanelPrincipalTop().setBackground(principalCuenta.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {

        int fila = principalCuenta.getTablaGraficaCuenta().getSelectedRow();
        principalCuenta.getFormularioEditar().getTxtBalance().setText(principalCuenta.getTablaGraficaCuenta().getValueAt(fila, 1).toString());
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
