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
        if (principalVenta.getDetalleVenta() == null) {
            FormularioDetalleDeVenta formularioDetalleVenta = new FormularioDetalleDeVenta(new Frame(), true);
            formularioDetalleVenta.setPrincipalVenta(principalVenta);
            principalVenta.setDetalleVenta(formularioDetalleVenta);
            colorTema();
            TablaDetalleVenta tablaDetalleVenta = new TablaDetalleVenta();
            tablaDetalleVenta.setPrincipalVenta(principalVenta);
            tablaDetalleVenta.ejecutarRellenarTabla();
            principalVenta.getDetalleVenta().setIdVenta(tablaDetalleVenta.getIdVenta());
        }
        principalVenta.getDetalleVenta().setVisible(true);
    }

    public void colorTema() {
        principalVenta.getDetalleVenta().getPanelPrincipalTop().setBackground(principalVenta.getPanelPrincipalTop().getBackground());
    }

    public void seleccionElminar(FormularioEstadoVenta f) {
        f.getLblC().setVisible(false);
        f.getLblE().setVisible(true);
        f.getLblP().setVisible(false);
        f.getLblR().setVisible(false);
    }

    public void seleccionCancelar(FormularioEstadoVenta f) {
        f.getLblC().setVisible(true);
        f.getLblE().setVisible(false);
        f.getLblP().setVisible(false);
        f.getLblR().setVisible(false);
    }

    public void seleccionPendiente(FormularioEstadoVenta f) {
        f.getLblC().setVisible(false);
        f.getLblE().setVisible(false);
        f.getLblP().setVisible(true);
        f.getLblR().setVisible(false);
    }

    public void seleccionRealizado(FormularioEstadoVenta f) {
        f.getLblC().setVisible(false);
        f.getLblE().setVisible(false);
        f.getLblP().setVisible(false);
        f.getLblR().setVisible(true);
    }

}
