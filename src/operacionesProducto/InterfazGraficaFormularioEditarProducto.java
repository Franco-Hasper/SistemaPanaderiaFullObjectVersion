package operacionesProducto;

import calsesPadre.InterfazGraficaFormularioEditar;
import escritorios.PrincipalProducto;
import formularios.FormularioEditarProducto;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarProducto extends InterfazGraficaFormularioEditar {

    protected PrincipalProducto principalProducto;
    protected TablaProducto tablaProducto;

    public PrincipalProducto getPrincipalProducto() {
        return principalProducto;
    }

    public void setPrincipalProducto(PrincipalProducto principalProducto) {
        this.principalProducto = principalProducto;
    }

    public TablaProducto getTablaProducto() {
        return tablaProducto;
    }

    public void setTablaProducto(TablaProducto tablaProducto) {
        this.tablaProducto = tablaProducto;
    }

    @Override
    public void nuevoFormularioEditar() {
        FormularioEditarProducto formularioEditar = new FormularioEditarProducto(frame, true);
        formularioEditar.setPrincipalProducto(principalProducto);
        principalProducto.setEditarProducto(formularioEditar);
        transferirDatos();
        colorTema();
        principalProducto.getEditarProducto().setVisible(true);
    }

    @Override
    public void colorTema() {
        principalProducto.getEditarProducto().getPanelPrincipalTop().setBackground(principalProducto.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
        new TablaProducto().setPrincipalProducto(principalProducto);
        int fila = principalProducto.getTablaGrafica().getSelectedRow();
        principalProducto.getEditarProducto().getTxtNombre().setText(principalProducto.getTablaGrafica().getValueAt(fila, 0).toString());
        principalProducto.getEditarProducto().getTxtDescripcion().setText(principalProducto.getTablaGrafica().getValueAt(fila, 1).toString());
    }

}
