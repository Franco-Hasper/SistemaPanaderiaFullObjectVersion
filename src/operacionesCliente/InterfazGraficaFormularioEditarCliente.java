package operacionesCliente;

import calsesPadre.InterfazGraficaFormularioEditar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalCliente;
import formularios.FormularioEditarCliente;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarCliente extends InterfazGraficaFormularioEditar {

    public InterfazGraficaFormularioEditarCliente() {
        setEstadoConsulta(0);
    }

    protected PrincipalCliente principalCliente;
    protected TablaCliente tablaCliente;

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public TablaCliente getTablaCliente() {
        return tablaCliente;
    }

    public void setTablaCliente(TablaCliente tablaCliente) {
        this.tablaCliente = tablaCliente;
    }

    @Override
    public void nuevoFormularioEditar() {
        FormularioEditarCliente formularioEditar = new FormularioEditarCliente(frame, true);
        formularioEditar.setPrincipalCliente(principalCliente);
        principalCliente.setEditarCliente(formularioEditar);
        colorTema();
        agregarBoxes();
        rellenarBoxes();
        infoTextPrompt();
        transferirDatos();
        principalCliente.getEditarCliente().setVisible(true);
    }

    @Override
    public void colorTema() {
        principalCliente.getEditarCliente().getPanelPrincipalTop().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
        new TablaCliente().setPrincipalCliente(principalCliente);
        int fila = principalCliente.getTablaGrafica().getSelectedRow();
        principalCliente.getEditarCliente().getTxtNombre().setText(principalCliente.getTablaGrafica().getValueAt(fila, 0).toString());
        principalCliente.getEditarCliente().getTxtApellido().setText(principalCliente.getTablaGrafica().getValueAt(fila, 1).toString());
        principalCliente.getEditarCliente().getTxtRazonSocial().setText(principalCliente.getTablaGrafica().getValueAt(fila, 2).toString());
        principalCliente.getEditarCliente().getTxtDireccion().setText(principalCliente.getTablaGrafica().getValueAt(fila, 3).toString());
        principalCliente.getEditarCliente().getTxtnuemroDireccion().setText(principalCliente.getTablaGrafica().getValueAt(fila, 4).toString());
        principalCliente.getEditarCliente().getTxtTelefono().setText(principalCliente.getTablaGrafica().getValueAt(fila, 8).toString());

        String localidad = principalCliente.getTablaGrafica().getValueAt(fila, 5).toString();
        String provincia = principalCliente.getTablaGrafica().getValueAt(fila, 6).toString();
        String tipodomicilio = principalCliente.getTablaGrafica().getValueAt(fila, 7).toString();
        String tipotelefono = principalCliente.getTablaGrafica().getValueAt(fila, 9).toString();

        autoSelectBox(provincia, localidad, tipodomicilio, tipotelefono);
    }

    private void autoSelectBox(String provincia, String localidad, String tipodomicilio, String tipotelefono) {
        principalCliente.getEditarCliente().getBoxProvincia().setSelectedItem(provincia);
        principalCliente.getEditarCliente().getBoxLocalidad().setSelectedItem(localidad);
        principalCliente.getEditarCliente().getBoxTipoTelefono().setSelectedItem(tipotelefono);
        principalCliente.getEditarCliente().getBoxtipoDom().setSelectedItem(tipodomicilio);
    }

    public void infoTextPrompt() {
        new TextPrompt("NOMBRE", principalCliente.getEditarCliente().getTxtNombre());
        new TextPrompt("APELLIDO", principalCliente.getEditarCliente().getTxtApellido());
        new TextPrompt("DIRECCION", principalCliente.getEditarCliente().getTxtDireccion());
        new TextPrompt("RAZON SOCIAL", principalCliente.getEditarCliente().getTxtRazonSocial());
        new TextPrompt("TELEFONO", principalCliente.getEditarCliente().getTxtTelefono());
        new TextPrompt("NUMERO DE DIRECCION", principalCliente.getEditarCliente().getTxtnuemroDireccion());
        principalCliente.getEditarCliente().getTxtNombre().grabFocus();
    }

    @Override
    public void agregarBoxes() {
        this.setBoxLocalidad(principalCliente.getEditarCliente().getBoxLocalidad());
        this.setBoxProvincia(principalCliente.getEditarCliente().getBoxProvincia());
        this.setBoxTipoDomicilio(principalCliente.getEditarCliente().getBoxtipoDom());
        this.setBoxTipoTelefono(principalCliente.getEditarCliente().getBoxTipoTelefono());
    }

    @Override
    public void rellenarBoxes() {
        this.consultaRellenarProvincia();
        this.consultaRellenarLocalidad();
        this.consultaRellenarTipoDomicilio();
        this.consultaRellenarTipoTelefono();
    }

}
