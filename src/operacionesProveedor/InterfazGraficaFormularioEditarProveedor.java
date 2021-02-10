package operacionesProveedor;

import calsesPadre.InterfazGraficaFormularioEditar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalProveedor;
import formularios.FormularioEditarProveedor;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarProveedor extends InterfazGraficaFormularioEditar {

    public InterfazGraficaFormularioEditarProveedor() {
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
        if (principalProveedor.getEditarProveedor() == null) {
            FormularioEditarProveedor formularioEditar = new FormularioEditarProveedor(frame, true);
            formularioEditar.setPrincipalProveedor(principalProveedor);
            principalProveedor.setEditarProveedor(formularioEditar);
            colorTema();
            agregarBoxes();
            rellenarBoxes();
            infoTextPrompt();
            transferirDatos();
        }

        principalProveedor.getEditarProveedor().setVisible(true);
        principalProveedor.setEditarProveedor(null);
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
        principalProveedor.getEditarProveedor().getTxtDireccion().setText(principalProveedor.getTablaGrafica().getValueAt(fila, 1).toString());
        principalProveedor.getEditarProveedor().getTxtnuemeroDireccion().setText(principalProveedor.getTablaGrafica().getValueAt(fila, 2).toString());
        principalProveedor.getEditarProveedor().getTxtTelefono().setText(principalProveedor.getTablaGrafica().getValueAt(fila, 5).toString());

        String provincia = principalProveedor.getTablaGrafica().getValueAt(fila, 4).toString();
        String localidad = principalProveedor.getTablaGrafica().getValueAt(fila, 3).toString();
        String tipotelefono = principalProveedor.getTablaGrafica().getValueAt(fila, 6).toString();

        autoSelectBox(provincia, localidad, tipotelefono);
    }

    private void autoSelectBox(String provincia, String localidad, String tipotelefono) {
        principalProveedor.getEditarProveedor().getBoxProvincia().setSelectedItem(provincia);
        principalProveedor.getEditarProveedor().getBoxLocalidad().setSelectedItem(localidad);
        principalProveedor.getEditarProveedor().getBoxTipoTelefono().setSelectedItem(tipotelefono);
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
