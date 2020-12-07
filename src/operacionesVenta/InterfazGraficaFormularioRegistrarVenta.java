package operacionesVenta;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalVenta;
import formularios.FormularioRegistrarVenta;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarVenta extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarVenta() {
        setEstadoConsulta(0);
    }

    private PrincipalVenta principalVenta;

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
        rellenarBoxes();
        infoTextPrompt();
        colorTema();
        TablaProductosDisponibles tablaProductosDisponibles = new TablaProductosDisponibles();
        tablaProductosDisponibles.setPrincipalVenta(principalVenta);
        tablaProductosDisponibles.ejecutarRellenarTabla();
        principalVenta.getRegistrarVenta().setTablaProductosDisponibles(tablaProductosDisponibles);
        
        TablaProductosListados tablaProductosListados=new TablaProductosListados();
        principalVenta.getRegistrarVenta().setTablaProductosListados(tablaProductosListados);

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

    @Deprecated
    @Override
    public void rellenarBoxes() {
    }

    @Override
    public void colorTema() {
        principalVenta.getRegistrarVenta().getPanelPrincipalTop().setBackground(principalVenta.getPanelPrincipalTop().getBackground());
    }

}
