package operacionesIngresoMateriaPrima;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalIngresoMatPrima;
import escritorios.PrincipalMateriaPrima;
import formularios.FormularioRegistrarIngresoMateriaPrima;
import operacionesMateriaPrima.TablaMateriaPrima;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarIngresoMateriaPrima extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarIngresoMateriaPrima() {
        setEstadoConsulta(0);
    }

    private PrincipalMateriaPrima principalMateriaPrima;
    private PrincipalIngresoMatPrima principalIngresoMateriaPrima;

    public PrincipalMateriaPrima getPrincipalMateriaPrima() {
        return principalMateriaPrima;
    }

    public void setPrincipalMateriaPrima(PrincipalMateriaPrima principalMateriaPrima) {
        this.principalMateriaPrima = principalMateriaPrima;
    }

    public PrincipalIngresoMatPrima getPrincipalIngresoMateriaPrima() {
        return principalIngresoMateriaPrima;
    }

    public void setPrincipalIngresoMateriaPrima(PrincipalIngresoMatPrima principalIngresoMateriaPrima) {
        this.principalIngresoMateriaPrima = principalIngresoMateriaPrima;
    }

    


    @Override
    public void nuevoFormularioRegistrar() {
        FormularioRegistrarIngresoMateriaPrima formularioRegistrar = new FormularioRegistrarIngresoMateriaPrima(frame, true);
        formularioRegistrar.setPrincipalMateriaPrima(principalMateriaPrima);
        formularioRegistrar.setPrincipalIngresoMateriaPrima(getPrincipalIngresoMateriaPrima());
        principalMateriaPrima.setRegistrarIngresoMateriaPrima(formularioRegistrar);
        transferirDatos();
        infoTextPrompt();
        colorTema();
        principalMateriaPrima.getRegistrarIngresoMateriaPrima().setVisible(true);
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("TOTAL ENVASES", principalMateriaPrima.getRegistrarIngresoMateriaPrima().getTxttotalEnvases());
        new TextPrompt("UDS POR ENVASES", principalMateriaPrima.getRegistrarIngresoMateriaPrima().getTxtUdsPorEnvase());
        new TextPrompt("PRECIO TOTAL", principalMateriaPrima.getRegistrarIngresoMateriaPrima().getTxtPrecioTotal());
        principalMateriaPrima.getRegistrarIngresoMateriaPrima().getTxttotalEnvases().grabFocus();
    }
    
    public void transferirDatos() {
        new TablaMateriaPrima().setPrincipalMateriaPrima(principalMateriaPrima);
        int fila = principalMateriaPrima.getTablaGrafica().getSelectedRow();
        principalMateriaPrima.getRegistrarIngresoMateriaPrima().getTxtMatPr().setText(principalMateriaPrima.getTablaGrafica().getValueAt(fila, 0).toString());
    }

    @Override
    public void colorTema() {
        principalMateriaPrima.getRegistrarIngresoMateriaPrima().getPanelPrincipalTop().setBackground(principalMateriaPrima.getPanelPrincipalTop().getBackground());
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
