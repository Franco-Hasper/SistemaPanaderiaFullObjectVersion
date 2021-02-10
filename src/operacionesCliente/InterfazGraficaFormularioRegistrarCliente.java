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
        if (principalCliente.getRegistrarCliente() == null) {
            FormularioRegistrarCliente formularioRegistrar = new FormularioRegistrarCliente(frame, true);
            formularioRegistrar.setPrincipalCliente(principalCliente);
            principalCliente.setRegistrarCliente(formularioRegistrar);
            colorTema();
            agregarBoxes();
            rellenarBoxes();
            razonSocialDisabled();
            infoTextPrompt();
            autoseccionarBoxes();
        }
        
        principalCliente.getRegistrarCliente().setVisible(true);
        principalCliente.setRegistrarCliente(null);
    }

    private void razonSocialDisabled() {
        principalCliente.getRegistrarCliente().getTxtRazonSocial().setEnabled(false);
    }
    
    private void autoseccionarBoxes() {
        String localidad = "Oberá";
        String provincia = "Misiones";
        String tipotelefono = "movil";
        principalCliente.getRegistrarCliente().getBoxProvincia().setSelectedItem(provincia);
        principalCliente.getRegistrarCliente().getBoxLocalidad().setSelectedItem(localidad);
        principalCliente.getRegistrarCliente().getBoxTipoTelefono().setSelectedItem(tipotelefono);
    }
    
    @Override
    public void infoTextPrompt() {
        new TextPrompt("NOMBRE", principalCliente.getRegistrarCliente().getTxtNombre());
        new TextPrompt("APELLIDO", principalCliente.getRegistrarCliente().getTxtApellido());
        new TextPrompt("DIRECCION", principalCliente.getRegistrarCliente().getTxtDireccion());
        new TextPrompt("RAZON SOCIAL", principalCliente.getRegistrarCliente().getTxtRazonSocial());
        new TextPrompt("TELEFONO", principalCliente.getRegistrarCliente().getTxtTelefono());
        new TextPrompt("NUMERO DE DIRECCION", principalCliente.getRegistrarCliente().getTxtnuemroDireccion());
        principalCliente.getRegistrarCliente().getTxtNombre().grabFocus();
    }
    
    @Override
    public void agregarBoxes() {
        this.setBoxLocalidad(principalCliente.getRegistrarCliente().getBoxLocalidad());
        this.setBoxProvincia(principalCliente.getRegistrarCliente().getBoxProvincia());
        this.setBoxTipoTelefono(principalCliente.getRegistrarCliente().getBoxTipoTelefono());
    }
    
    @Override
    public void rellenarBoxes() {
        this.consultaRellenarProvincia();
        this.consultaRellenarLocalidad();
        this.consultaRellenarTipoTelefono();
    }
    
    @Override
    public void colorTema() {
        principalCliente.getRegistrarCliente().getPanelPrincipalTop().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
    }
    
}
