package operacionesGasto;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalGastos;
import formularios.FormularioRegistrarGasto;
import java.util.Date;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarGasto extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarGasto() {
        setEstadoConsulta(0);
    }

    private PrincipalGastos principalGastos;

    public PrincipalGastos getPrincipalGastos() {
        return principalGastos;
    }

    public void setPrincipalGastos(PrincipalGastos principalGastos) {
        this.principalGastos = principalGastos;
    }

    @Override
    public void nuevoFormularioRegistrar() {
        if (principalGastos.getRegistrarGasto() == null) {
            FormularioRegistrarGasto formularioRegistrar = new FormularioRegistrarGasto(frame, true);
            formularioRegistrar.setPrincipalGastos(principalGastos);
            principalGastos.setRegistrarGasto(formularioRegistrar);
            infoTextPrompt();
            colorTema();
            fecha();
        }
        principalGastos.getRegistrarGasto().setVisible(true);
        principalGastos.setRegistrarGasto(null);
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("DESCRIPCION", principalGastos.getRegistrarGasto().getTxtDescripcion());
        new TextPrompt("TOTAL GASTADO", principalGastos.getRegistrarGasto().getTxtTotlaGasatado());
        principalGastos.getRegistrarGasto().getTxtDescripcion().grabFocus();
    }

    private void fecha() {
        principalGastos.getRegistrarGasto().getrSDateChooser().setDatoFecha(new Date());
    }

    @Deprecated
    @Override
    public void agregarBoxes() {
    }

    @Deprecated
    @Override
    public void rellenarBoxes() {
    }

    @Override
    public void colorTema() {
        principalGastos.getRegistrarGasto().getPanelPrincipalTop().setBackground(principalGastos.getPanelPrincipalTop().getBackground());
    }

}
