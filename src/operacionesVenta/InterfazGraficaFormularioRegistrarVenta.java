package operacionesVenta;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalCliente;
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
        //seccion formulario
        FormularioRegistrarVenta formularioRegistrar = new FormularioRegistrarVenta(frame, true);
        formularioRegistrar.setPrincipalVenta(principalVenta);
        formularioRegistrar.setPrincipalAdministrador(principalAdministrador);
        principalVenta.setRegistrarVenta(formularioRegistrar);
        infoTextPrompt();
        colorTema();

        //Seccion Tabla Productos Disponibles
        TablaProductosDisponibles tablaProductosDisponibles = new TablaProductosDisponibles();
        tablaProductosDisponibles.setPrincipalVenta(principalVenta);
        tablaProductosDisponibles.ejecutarRellenarTabla();
        principalVenta.getRegistrarVenta().setTablaProductosDisponibles(tablaProductosDisponibles);

        //Seccion Tabla Productos Listados
        TablaProductosListados tablaProductosListados = new TablaProductosListados();
        principalVenta.getRegistrarVenta().setTablaProductosListados(tablaProductosListados);
        configuracionTxtCantidadTxtTotal();

        //Seccion Operaciones Secundarias
        //creo el objeto operaciones secundarias
        OperacionesSecundariasVenta operacionesSecundariasVenta = new OperacionesSecundariasVenta();
        //le pego el formulario con el que va a trabajar
        operacionesSecundariasVenta.setFormularioRegistrarVenta(formularioRegistrar);
        //le asigno el valor del tipo de formulario para los switchs(si es registrar 1 va a trabajar de una forma si es editar 2 va a trabajar de otra)
        operacionesSecundariasVenta.setTipoFormulario(1);
        //guardo el la instancia en el formulario grafico
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

    private void configuracionTxtCantidadTxtTotal() {
        principalVenta.getRegistrarVenta().getTxtCantidad().setText("1");
        principalVenta.getRegistrarVenta().getTxtCantidad().setHorizontalAlignment(SwingConstants.CENTER);
        principalVenta.getRegistrarVenta().getLblPrecioTotal().setText("0.0");
    }

    private void fechaActual() {
        Date fechaActual = new Date();
        principalVenta.getRegistrarVenta().getrSDateChooser().setDatoFecha(fechaActual);
    }

}
