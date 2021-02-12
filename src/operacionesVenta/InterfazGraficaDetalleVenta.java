package operacionesVenta;

import clasesUtilidadGeneral.OperacionesUtiles;
import escritorios.PrincipalVenta;
import formularios.FormularioDetalleDeVenta;
import formularios.FormularioEstadoVenta;
import java.awt.Frame;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaDetalleVenta {

    private PrincipalVenta principalVenta;

    public PrincipalVenta getPrincipalVenta() {
        return principalVenta;
    }

    public void setPrincipalVenta(PrincipalVenta principalVenta) {
        this.principalVenta = principalVenta;
    }

    public void nuevoFormularioDetalleDeVenta() {

        FormularioDetalleDeVenta formularioDetalleVenta = new FormularioDetalleDeVenta(new Frame(), true);
        formularioDetalleVenta.setPrincipalVenta(principalVenta);
        principalVenta.setDetalleVenta(formularioDetalleVenta);
        colorTema();
        //TABIENRELLENA LOS LABELS LOS LABELS
        TablaDetalleVenta tablaDetalleVenta = new TablaDetalleVenta();
        tablaDetalleVenta.setPrincipalVenta(principalVenta);
        tablaDetalleVenta.ejecutarRellenarTabla();
        principalVenta.getDetalleVenta().setIdVenta(tablaDetalleVenta.getIdVenta());
        principalVenta.getDetalleVenta().setVisible(true);
    }

    public void colorTema() {
        principalVenta.getDetalleVenta().getPanelPrincipalTop().setBackground(principalVenta.getPanelPrincipalTop().getBackground());
    }

}
