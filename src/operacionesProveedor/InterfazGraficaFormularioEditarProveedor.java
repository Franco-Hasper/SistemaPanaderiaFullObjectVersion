package operacionesProveedor;

import calsesPadre.InterfazGraficaFormularioEditar;
import escritorios.PrincipalProveedor;
import formularios.FormularioEditarProveedor;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarProveedor extends InterfazGraficaFormularioEditar {

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

    @Override
    public void agregarBoxes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rellenarBoxes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
