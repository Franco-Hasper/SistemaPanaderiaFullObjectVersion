package operacionesCaja;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import escritorios.PrincipalCaja;
import formularios.FormularioRegistrarCorte;


/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarCorte extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarCorte() {
        setEstadoConsulta(0);
    }

    private PrincipalCaja principalCaja;

    public PrincipalCaja getPrincipalCaja() {
        return principalCaja;
    }

    public void setPrincipalCaja(PrincipalCaja principalCaja) {
        this.principalCaja = principalCaja;
    }

    @Override
    public void nuevoFormularioRegistrar() {
        FormularioRegistrarCorte formularioRegistrar = new FormularioRegistrarCorte(frame, true);
        formularioRegistrar.setPrincipalCaja(principalCaja);
        principalCaja.setRegistrarCorte(formularioRegistrar);
        colorTema();
        principalCaja.getRegistrarCorte().setVisible(true);
    }

    @Override
    public void colorTema() {
        principalCaja.getRegistrarCorte().getPanelPrincipalTop().setBackground(principalCaja.getPanelPrincipalTop().getBackground());
    }

    @Deprecated
    @Override
    protected void infoTextPrompt() {
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
