package operacionesCliente;

import calsesPadre.InterfazGraficaFormularioEditar;
import escritorios.PrincipalCliente;
import formularios.FormularioEditarCliente;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarCliente extends InterfazGraficaFormularioEditar {

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
        transferirDatos();
        colorTema();
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
    }

}
