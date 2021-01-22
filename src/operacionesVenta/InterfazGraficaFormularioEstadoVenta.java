package operacionesVenta;

import escritorios.PrincipalVenta;
import formularios.FormularioDetalleDeVenta;
import formularios.FormularioEstadoVenta;
import java.awt.Frame;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEstadoVenta {

    private PrincipalVenta principalVenta;

    public PrincipalVenta getPrincipalVenta() {
        return principalVenta;
    }

    public void setPrincipalVenta(PrincipalVenta principalVenta) {
        this.principalVenta = principalVenta;
    }

    public void nuevoFormularioEstadoVenta() {
        FormularioEstadoVenta formularioEstadoVenta = new FormularioEstadoVenta(new Frame(), true);
        formularioEstadoVenta.setPrincipalVenta(principalVenta);
        principalVenta.setFormularioEstadoVenta(formularioEstadoVenta);
        colorTema();
        principalVenta.getFormularioEstadoVenta().setVisible(true);
    }

    public void colorTema() {
        principalVenta.getFormularioEstadoVenta().getPanelPrincipalTop().setBackground(principalVenta.getPanelPrincipalTop().getBackground());
    }
}
