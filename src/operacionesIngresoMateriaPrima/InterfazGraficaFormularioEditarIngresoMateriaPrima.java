package operacionesIngresoMateriaPrima;

import calsesPadre.InterfazGraficaFormularioEditar;
import escritorios.PrincipalIngresoMatPrima;
import formularios.FormularioEditarIngresoMateriaPrima;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarIngresoMateriaPrima extends InterfazGraficaFormularioEditar {

    protected PrincipalIngresoMatPrima principalIngresoMateriaPrima;
    protected TablaIngresoMateriaPrima tablaIngresoMateriaPrima;

    public PrincipalIngresoMatPrima getPrincipalIngresoMateriaPrima() {
        return principalIngresoMateriaPrima;
    }

    public void setPrincipalIngresoMateriaPrima(PrincipalIngresoMatPrima principalIngresoMateriaPrima) {
        this.principalIngresoMateriaPrima = principalIngresoMateriaPrima;
    }

    public TablaIngresoMateriaPrima getTablaIngresoMateriaPrima() {
        return tablaIngresoMateriaPrima;
    }

    public void setTablaIngresoMateriaPrima(TablaIngresoMateriaPrima tablaIngresoMateriaPrima) {
        this.tablaIngresoMateriaPrima = tablaIngresoMateriaPrima;
    }

    @Override
    public void nuevoFormularioEditar() {
        FormularioEditarIngresoMateriaPrima formularioEditar = new FormularioEditarIngresoMateriaPrima(frame, true);
        formularioEditar.setPrincipalIngresoMateriaPrima(principalIngresoMateriaPrima);
        principalIngresoMateriaPrima.setEditarIngresoMateriaPrima(formularioEditar);
        transferirDatos();
        colorTema();
        principalIngresoMateriaPrima.getEditarIngresoMateriaPrima().setVisible(true);
    }

    @Override
    public void colorTema() {
        principalIngresoMateriaPrima.getEditarIngresoMateriaPrima().getPanelPrincipalTop().setBackground(principalIngresoMateriaPrima.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
        new TablaIngresoMateriaPrima().setPrincipalIngresoMateriaPrima(principalIngresoMateriaPrima);
        int fila = principalIngresoMateriaPrima.getTablaGrafica().getSelectedRow();
        principalIngresoMateriaPrima.getEditarIngresoMateriaPrima().getTxtMatPr().setText(principalIngresoMateriaPrima.getTablaGrafica().getValueAt(fila, 0).toString());
        principalIngresoMateriaPrima.getEditarIngresoMateriaPrima().getTxttotalEnvases().setText(principalIngresoMateriaPrima.getTablaGrafica().getValueAt(fila, 1).toString());
        principalIngresoMateriaPrima.getEditarIngresoMateriaPrima().getTxtUdsPorEnvase().setText(principalIngresoMateriaPrima.getTablaGrafica().getValueAt(fila, 2).toString());
        principalIngresoMateriaPrima.getEditarIngresoMateriaPrima().getTxtPrecioTotal().setText(principalIngresoMateriaPrima.getTablaGrafica().getValueAt(fila, 4).toString());
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
