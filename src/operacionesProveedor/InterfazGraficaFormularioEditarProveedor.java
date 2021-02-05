package operacionesProveedor;

import calsesPadre.InterfazGraficaFormularioEditar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalProveedor;
import formularios.FormularioEditarProveedor;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarProveedor extends InterfazGraficaFormularioEditar {

    public InterfazGraficaFormularioEditarProveedor(){
        setEstadoConsulta(0);
    }
    
    protected PrincipalProveedor principalProveedor;

    protected TablaProveedor tablaProveedor;

    public PrincipalProveedor getPrincipalProveedor() {
        return principalProveedor;
    }

    public void setPrincipalProveedor(PrincipalProveedor principalProveedor) {
        this.principalProveedor = principalProveedor;
    }

    public TablaProveedor getTablaProveedor() {
        return tablaProveedor;
    }

    public void setTablaProveedor(TablaProveedor tablaProveedor) {
        this.tablaProveedor = tablaProveedor;
    }

    @Override
    public void nuevoFormularioEditar() {
        FormularioEditarProveedor formularioEditar = new FormularioEditarProveedor(frame, true);
        formularioEditar.setPrincipalProveedor(principalProveedor);
        principalProveedor.setEditarProveedor(formularioEditar);
        transferirDatos();
        colorTema();
        agregarBoxes();
        rellenarBoxes();
        infoTextPrompt();
        principalProveedor.getEditarProveedor().setVisible(true);
    }

    @Override
    public void colorTema() {
        principalProveedor.getEditarProveedor().getPanelPrincipalTop().setBackground(principalProveedor.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
        TablaProveedor tablaProveedor = new TablaProveedor();
        tablaProveedor.setPrincipalProveedor(principalProveedor);
        int fila = principalProveedor.getTablaGrafica().getSelectedRow();
        principalProveedor.getEditarProveedor().getTxtNombre().setText(principalProveedor.getTablaGrafica().getValueAt(fila, 0).toString());

    }

    protected void infoTextPrompt() {
        new TextPrompt("NOMBRE", principalProveedor.getEditarProveedor().getTxtNombre());
        new TextPrompt("DIRECCION", principalProveedor.getEditarProveedor().getTxtDireccion());
        new TextPrompt("N° DIREICCION", principalProveedor.getEditarProveedor().getTxtnuemeroDireccion());
        new TextPrompt("N° TELEFONO", principalProveedor.getEditarProveedor().getTxtTelefono());
        principalProveedor.getEditarProveedor().getTxtNombre().grabFocus();
    }

    @Override
    public void agregarBoxes() {
        this.setBoxLocalidad(principalProveedor.getEditarProveedor().getBoxLocalidad());
        this.setBoxProvincia(principalProveedor.getEditarProveedor().getBoxProvincia());
        this.setBoxTipoTelefono(principalProveedor.getEditarProveedor().getBoxTipoTelefono());
    }

    @Override
    public void rellenarBoxes() {
        this.consultaRellenarProvincia();
        this.consultaRellenarLocalidad();
        this.consultaRellenarTipoTelefono();
    }

}
