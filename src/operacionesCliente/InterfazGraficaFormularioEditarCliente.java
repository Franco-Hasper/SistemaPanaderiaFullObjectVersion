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
        principalCliente.instancias.setEditarCliente(formularioEditar);
        transferirDatos();
        colorTema();
        principalCliente.instancias.getEditarCliente().setVisible(true);
    }

    /**
     * @deprecated
     */
    @Override
    public void infoTextPrompt() {
    }

    @Override
    public void colorTema() {
        principalCliente.instancias.getEditarCliente().getPanelPrincipalTop().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
        TablaCliente tablaCliente = new TablaCliente();
        tablaCliente.setPrincipalCliente(principalCliente);
        int fila = principalCliente.getTabla().getSelectedRow();
        principalCliente.instancias.getEditarCliente().getTxtNombre().setText(principalCliente.getTabla().getValueAt(fila, 0).toString());
        principalCliente.instancias.getEditarCliente().getTxtApellido().setText(principalCliente.getTabla().getValueAt(fila, 1).toString());
        principalCliente.instancias.getEditarCliente().getTxtRazonSocial().setText(principalCliente.getTabla().getValueAt(fila, 2).toString());
    }

}
