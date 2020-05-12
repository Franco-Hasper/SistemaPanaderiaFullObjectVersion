package operacionesCliente;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalCliente;
import formularios.FormularioRegistrarCliente;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarCliente extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarCliente() {
        setEstadoConsulta(0);
    }

    private PrincipalCliente principalCliente;

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    @Override
    public void nuevoFormularioRegistrar() {
        FormularioRegistrarCliente formularioRegistrar = new FormularioRegistrarCliente(frame, true);
        formularioRegistrar.setPrincipalCliente(principalCliente);
        principalCliente.instancias.setRegistrarCliente(formularioRegistrar);
        agregarBoxes();
        rellenarBoxes();
        infoTextPrompt();
        colorTema();
        principalCliente.instancias.getRegistrarCliente().setVisible(true);
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("NOMBRE", principalCliente.instancias.getRegistrarCliente().getTxtNombre());
        new TextPrompt("APELLIDO", principalCliente.instancias.getRegistrarCliente().getTxtApellido());
        new TextPrompt("DIRECCION", principalCliente.instancias.getRegistrarCliente().getTxtDireccion());
        new TextPrompt("RAZON SOCIAL", principalCliente.instancias.getRegistrarCliente().getTxtRazonSocial());
        new TextPrompt("TELEFONO", principalCliente.instancias.getRegistrarCliente().getTxtTelefono());
        new TextPrompt("NUMERO DE DIRECCION", principalCliente.instancias.getRegistrarCliente().getTxtnuemroDireccion());
        principalCliente.instancias.getRegistrarCliente().getTxtNombre().grabFocus();
    }

    @Override
    public void agregarBoxes() {
        this.setBoxLocalidad(principalCliente.instancias.getRegistrarCliente().getBoxLocalidad());
        this.setBoxProvincia(principalCliente.instancias.getRegistrarCliente().getBoxProvincia());
        this.setBoxTipoDomicilio(principalCliente.instancias.getRegistrarCliente().getBoxtipoDom());
        this.setBoxTipoTelefono(principalCliente.instancias.getRegistrarCliente().getBoxTipoTelefono());
    }

    @Override
    public void rellenarBoxes() {
        this.accionRellenarProvincia();
        this.accionRellenarLocalidad();
        this.accionRellenarTipoDomicilio();
        this.accionRellenarTipoTelefono();
    }

    @Override
    public void colorTema() {
        principalCliente.instancias.getRegistrarCliente().getPanelPrincipalTop().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
    }

}
