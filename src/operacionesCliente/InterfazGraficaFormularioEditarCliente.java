package operacionesCliente;

import calsesPadre.InterfazGraficaFormularioEditar;
import escritorios.PrincipalCliente;
import formularios.FormularioEditarCliente;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarCliente extends InterfazGraficaFormularioEditar {

    protected PrincipalCliente principalCliente;

     public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }
     
     

    protected TablaCliente tablaCliente;

    public TablaCliente getTablaCliente() {
        return tablaCliente;
    }

    public void setTablaCliente(TablaCliente tablaCliente) {
        this.tablaCliente = tablaCliente;
    }


    private final FormularioEditarCliente formularioEditar = new FormularioEditarCliente(frame, true);

    
    
    @Override
    public void nuevoFormularioEditar() {
        formularioEditar.setPrincipalCliente(principalCliente);
        principalCliente.setEditarCliente(formularioEditar);
        transferirDatos();
        colorTema();
        principalCliente.getEditarCliente().setVisible(true);
    }

    /**
     * @deprecated
     */
    @Override
    public void infoTextPrompt() {
    }

    @Override
    public void colorTema() {
        principalCliente.getEditarCliente().getPanelPrincipalTop().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
        TablaCliente tablaCliente = new TablaCliente();
        tablaCliente.setPrincipalCliente(principalCliente);
        int fila = principalCliente.getTablaGrafica().getSelectedRow();
        principalCliente.getEditarCliente().getTxtNombre().setText(principalCliente.getTablaGrafica().getValueAt(fila, 0).toString());
        principalCliente.getEditarCliente().getTxtApellido().setText(principalCliente.getTablaGrafica().getValueAt(fila, 1).toString());
        principalCliente.getEditarCliente().getTxtRazonSocial().setText(principalCliente.getTablaGrafica().getValueAt(fila, 2).toString());
    }

}
