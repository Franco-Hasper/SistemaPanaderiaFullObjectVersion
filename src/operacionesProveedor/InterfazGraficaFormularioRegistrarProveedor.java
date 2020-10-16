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
        FormularioRegistrarProveedor formularioRegistrar = new FormularioRegistrarProveedor(frame, true);
        formularioRegistrar.setPrincipalProveedor(principalProveedor);
        principalProveedor.setRegistrarProveedor(formularioRegistrar);
        agregarBoxes();
        rellenarBoxes();
        infoTextPrompt();
        colorTema();
        principalProveedor.getRegistrarProveedor().setVisible(true);
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
