package operacionesVenta;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalVenta;
import formularios.FormularioRegistrarVenta;
import java.util.Date;
import javax.swing.SwingConstants;
import principal.PrincipalAdministrador;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarVenta extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarVenta() {
        setEstadoConsulta(0);
    }

    private PrincipalVenta principalVenta;
    private PrincipalAdministrador principalAdministrador;

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }

    public PrincipalVenta getPrincipalVenta() {
        return principalVenta;
    }

    public void setPrincipalVenta(PrincipalVenta principalVenta) {
        this.principalVenta = principalVenta;
    }

    @Override
    public void nuevoFormularioRegistrar() {
        FormularioRegistrarVenta formularioRegistrar = new FormularioRegistrarVenta(frame, true);
        formularioRegistrar.setPrincipalVenta(principalVenta);
        principalVenta.setRegistrarVenta(formularioRegistrar);
        agregarBoxes();

        infoTextPrompt();
        colorTema();
        TablaProductosDisponibles tablaProductosDisponibles = new TablaProductosDisponibles();
        tablaProductosDisponibles.setPrincipalVenta(principalVenta);
        tablaProductosDisponibles.ejecutarRellenarTabla();
        principalVenta.getRegistrarVenta().setTablaProductosDisponibles(tablaProductosDisponibles);

        TablaProductosListados tablaProductosListados = new TablaProductosListados();
        principalVenta.getRegistrarVenta().setTablaProductosListados(tablaProductosListados);
        configuracionTxtCantidad();
        OperacionesSecundariasVenta operacionesSecundariasVenta = new OperacionesSecundariasVenta();
        principalVenta.getRegistrarVenta().setOperacionesSecundariasVenta(operacionesSecundariasVenta);
        rellenarBoxes();
        fechaActual();
        principalVenta.getRegistrarVenta().setVisible(true);

    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("CANTIDAD", principalVenta.getRegistrarVenta().getTxtCantidad());
        new TextPrompt("BUSCAR POR NOMBRE", principalVenta.getRegistrarVenta().getTxtBuscar());
        principalVenta.getRegistrarVenta().getTxtBuscar().grabFocus();
    }

    @Deprecated
    @Override
    public void agregarBoxes() {
    }

    @Override
    public void rellenarBoxes() {
        principalVenta.getRegistrarVenta().getBoxTipoVenta().addItem("Venta Simple");
        principalVenta.getRegistrarVenta().getBoxTipoVenta().addItem("Pedido");
    }

    @Override
    public void colorTema() {
        principalVenta.getRegistrarVenta().getPanelPrincipalTop().setBackground(principalVenta.getPanelPrincipalTop().getBackground());
    }

    private void configuracionTxtCantidad() {
        principalVenta.getRegistrarVenta().getTxtCantidad().setText("1");
        principalVenta.getRegistrarVenta().getTxtCantidad().setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void fechaActual() {
        Date fechaActual = new Date();
        principalVenta.getRegistrarVenta().getrSDateChooser().setDatoFecha(fechaActual);
    }

}
