package operacionesMateriaPrima;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalMateriaPrima;
import formularios.FormularioRegistrarMateriaPrima;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarMateriaPrima extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarMateriaPrima() {
        setEstadoConsulta(0);
    }

    private PrincipalMateriaPrima principalMateriaPrima;

    public PrincipalMateriaPrima getPrincipalMateriaPrima() {
        return principalMateriaPrima;
    }

    public void setPrincipalMateriaPrima(PrincipalMateriaPrima principalMateriaPrima) {
        this.principalMateriaPrima = principalMateriaPrima;
    }

    @Override
    public void nuevoFormularioRegistrar() {
        if (principalMateriaPrima.getRegistrarMateriaPrima() == null) {
            FormularioRegistrarMateriaPrima formularioRegistrar = new FormularioRegistrarMateriaPrima(frame, true);
            formularioRegistrar.setPrincipalMateriaPrima(principalMateriaPrima);
            principalMateriaPrima.setRegistrarMateriaPrima(formularioRegistrar);
            agregarBoxes();
            rellenarBoxes();
            infoTextPrompt();
            colorTema();
        }
        principalMateriaPrima.getRegistrarMateriaPrima().setVisible(true);
        principalMateriaPrima.setRegistrarMateriaPrima(null);
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("NOMBRE", principalMateriaPrima.getRegistrarMateriaPrima().getTxtNombre());
        principalMateriaPrima.getRegistrarMateriaPrima().getTxtNombre().grabFocus();
    }

    @Override
    public void agregarBoxes() {
        this.setBoxMarca(principalMateriaPrima.getRegistrarMateriaPrima().getBoxMarca());
        this.setBoxProveedor(principalMateriaPrima.getRegistrarMateriaPrima().getBoxProveedor());
        this.setBoxUnidadMedida(principalMateriaPrima.getRegistrarMateriaPrima().getBoxUdeMedida());

    }

    @Override
    public void rellenarBoxes() {
        this.consultaRellenarMarca();
        this.consultaRellenarProveedor();
        this.consultaRellenarUnidadMedida();
    }

    @Override
    public void colorTema() {
        principalMateriaPrima.getRegistrarMateriaPrima().getPanelPrincipalTop().setBackground(principalMateriaPrima.getPanelPrincipalTop().getBackground());
    }

}
