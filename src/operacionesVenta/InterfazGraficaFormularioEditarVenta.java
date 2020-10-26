package operacionesVenta;

import calsesPadre.InterfazGraficaFormularioEditar;
import escritorios.PrincipalVenta;
import formularios.FormularioEditarVenta;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarVenta extends InterfazGraficaFormularioEditar {

    protected PrincipalVenta principalVenta;
    protected TablaVenta tablaVenta;

    public PrincipalVenta getPrincipalVenta() {
        return principalVenta;
    }

    public void setPrincipalVenta(PrincipalVenta principalVenta) {
        this.principalVenta = principalVenta;
    }

    public TablaVenta getTablaVenta() {
        return tablaVenta;
    }

    public void setTablaVenta(TablaVenta tablaVenta) {
        this.tablaVenta = tablaVenta;
    }

    @Override
    public void nuevoFormularioEditar() {
        FormularioEditarVenta formularioEditar = new FormularioEditarVenta(frame, true);
        formularioEditar.setPrincipalVenta(principalVenta);
        principalVenta.setEditarVenta(formularioEditar);
        transferirDatos();
        colorTema();
        principalVenta.getEditarVenta().setVisible(true);
    }

    @Override
    public void colorTema() {
        principalVenta.getEditarVenta().getPanelPrincipalTop().setBackground(principalVenta.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
      //CAmBIAR TODA ESTA SECCION
    }

}
