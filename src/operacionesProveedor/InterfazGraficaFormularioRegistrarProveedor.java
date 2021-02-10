package operacionesProveedor;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalProveedor;
import formularios.FormularioRegistrarProveedor;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarProveedor extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarProveedor() {
        setEstadoConsulta(0);
    }

    private PrincipalProveedor principalProveedor;

    public PrincipalProveedor getPrincipalProveedor() {
        return principalProveedor;
    }

    public void setPrincipalProveedor(PrincipalProveedor principalProveedor) {
        this.principalProveedor = principalProveedor;
    }

    @Override
    public void nuevoFormularioRegistrar() {
        if (principalProveedor.getRegistrarProveedor() == null) {
            FormularioRegistrarProveedor formularioRegistrar = new FormularioRegistrarProveedor(frame, true);
            formularioRegistrar.setPrincipalProveedor(principalProveedor);
            principalProveedor.setRegistrarProveedor(formularioRegistrar);
            colorTema();
            agregarBoxes();
            rellenarBoxes();
            infoTextPrompt();
            autoseccionarBoxes();
        }

        principalProveedor.getRegistrarProveedor().setVisible(true);
        principalProveedor.setRegistrarProveedor(null);
    }

    private void autoseccionarBoxes() {
        String localidad = "Oberá";
        String provincia = "Misiones";
        String tipotelefono = "movil";
        principalProveedor.getRegistrarProveedor().getBoxProvincia().setSelectedItem(provincia);
        principalProveedor.getRegistrarProveedor().getBoxLocalidad().setSelectedItem(localidad);
        principalProveedor.getRegistrarProveedor().getBoxTipoTelefono().setSelectedItem(tipotelefono);
    }

    @Override
    protected void infoTextPrompt() {
        new TextPrompt("NOMBRE", principalProveedor.getRegistrarProveedor().getTxtNombre());
        new TextPrompt("DIRECCION", principalProveedor.getRegistrarProveedor().getTxtDireccion());
        new TextPrompt("N° DIREICCION", principalProveedor.getRegistrarProveedor().getTxtnuemroDireccion());
        new TextPrompt("N° TELEFONO", principalProveedor.getRegistrarProveedor().getTxtTelefono());
        principalProveedor.getRegistrarProveedor().getTxtNombre().grabFocus();
    }

    @Override
    public void colorTema() {
        principalProveedor.getRegistrarProveedor().getPanelPrincipalTop().setBackground(principalProveedor.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void agregarBoxes() {
        this.setBoxLocalidad(principalProveedor.getRegistrarProveedor().getBoxLocalidad());
        this.setBoxProvincia(principalProveedor.getRegistrarProveedor().getBoxProvincia());
        this.setBoxTipoTelefono(principalProveedor.getRegistrarProveedor().getBoxTipoTelefono());
    }

    @Override
    public void rellenarBoxes() {
        this.consultaRellenarProvincia();
        this.consultaRellenarLocalidad();
        this.consultaRellenarTipoTelefono();
    }

}
