package operacionesCuenta;

import escritorios.PrincipalCuenta;
import formularios.FormularioReporteMovimientos;
import java.awt.Frame;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaReporteMovimientos {
 private PrincipalCuenta principalCuenta;

    public PrincipalCuenta getPrincipalCuenta() {
        return principalCuenta;
    }

    public void setPrincipalCuenta(PrincipalCuenta principalCuenta) {
        this.principalCuenta = principalCuenta;
    }



    public void nuevoFormularioReporte() {
        FormularioReporteMovimientos formularioReporte = new FormularioReporteMovimientos(new Frame(), true);
        ReporteMovimientos reporteMovimientos = new ReporteMovimientos();
        reporteMovimientos.setFormularioReporteMovimientos(formularioReporte);
        formularioReporte.setReporteMovimientos(reporteMovimientos);
        colorTema(formularioReporte);
        formularioReporte.setVisible(true);

    }

    private void colorTema(FormularioReporteMovimientos formularioReporte) {
        formularioReporte.getFechaInicio().setColorBackground(principalCuenta.getPanelPrincipalTop().getBackground());
        formularioReporte.getFechaFin().setColorBackground(principalCuenta.getPanelPrincipalTop().getBackground());
        formularioReporte.getPanelPrincipalTop().setBackground(principalCuenta.getPanelPrincipalTop().getBackground());
    }

}
