package operacionesVenta;

import calsesPadre.Tabla;
import clasesUtilidadGeneral.OperacionesUtiles;
import ds.desktop.notify.DesktopNotify;
import entidades.PrecioProducto;
import escritorios.PrincipalVenta;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * @author Hasper Franco
 */
public class TablaProductosDisponibles extends Tabla {

    public TablaProductosDisponibles() {
        setEstadoConsulta(0);
    }

    private PrincipalVenta principalVenta;
    //se usa para manejar la id.
    private List<Integer> listaResutladosActuales = new ArrayList<Integer>();

    private int tipoFormulario;

    public int getTipoFormulario() {
        return tipoFormulario;
    }

    public void setTipoFormulario(int tipoFormulario) {
        this.tipoFormulario = tipoFormulario;
    }

    public PrincipalVenta getPrincipalVenta() {
        return principalVenta;
    }

    public void setPrincipalVenta(PrincipalVenta principalVenta) {
        this.principalVenta = principalVenta;
    }

    public List<Integer> getListaResutladosActuales() {
        return listaResutladosActuales;
    }

    public void setListaResutladosActuales(List<Integer> listaResutladosActuales) {
        this.listaResutladosActuales = listaResutladosActuales;
    }

    @Override
    public void ejecutarRellenarTabla() {

        switch (tipoFormulario) {
            case 1:
                setTabla(principalVenta.getRegistrarVenta().getTablaGraficaProductosDisponibles());
                setStringConsulta("from PrecioProducto");
                evaluarEstadoConsulta();
                setCampoTexto(principalVenta.getRegistrarVenta().getTxtBuscar());
                rellenarTabla(getCampoTexto().getText());

                break;
            case 2:
                setTabla(principalVenta.getEditarVenta().getTablaGraficaProductosDisponibles());
                setStringConsulta("from PrecioProducto");
                evaluarEstadoConsulta();
                setCampoTexto(principalVenta.getEditarVenta().getTxtBuscar());
                rellenarTabla(getCampoTexto().getText());
                break;

        }
    }

    @Override
    public void rellenarTabla(String valorBusqueda) {
        DefaultTableModel tablaProducto = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();
        operacionesUtilidad.removerFilas(tablaProducto);

        try {
            this.listaResutladosActuales.clear();
        } catch (NullPointerException e) {
        }

        for (Object o : lista) {
            PrecioProducto pr = (PrecioProducto) o;
            Vector<Object> fila = new Vector<>();
            boolean resultadoComparacion = OperacionesUtiles.convertirResultado(pr.getCodigoProducto().getNombre(), valorBusqueda);
            if (pr.getCodigoEstado().getIdEstado().equals(1)
                    && pr.getCodigoProducto().getCodigoEstado().getIdEstado().equals(1) && resultadoComparacion) {
                this.listaResutladosActuales.add(0, pr.getIdPrecio());
                fila.add(pr.getCodigoProducto().getNombre());
                fila.add(pr.getCodigoProducto().getDescripcion());
                fila.add(OperacionesUtiles.formatoDouble(pr.getPrecioTotal()));
                tablaProducto.addRow(fila);
            }
        }
        OperacionesUtiles.ordenarLista(listaResutladosActuales);
    }

    @Deprecated
    @Override
    public Integer obtenerIdFilaSeleccionada() {
        try {
            Integer totalFilas = principalVenta.getRegistrarVenta().getTablaGraficaProductosDisponibles().getRowCount();
            Integer filasSeleccionada = principalVenta.getRegistrarVenta().getTablaGraficaProductosDisponibles().getSelectedRow();
            List<Integer> listaResutadosActualesThis = principalVenta.getRegistrarVenta().getTablaProductosDisponibles().getListaResutladosActuales();
            Integer id = operacionesUtilidad.obtenerId(listaResutadosActualesThis, totalFilas, filasSeleccionada);
            this.setIdTabla(id);
        } catch (Exception e) {
        }
        return idTabla;
    }

    @Override
    public boolean verificarFilaSeleccionada() {

        switch (tipoFormulario) {
            case 1:
                try {
                    int fila = principalVenta.getRegistrarVenta().getTablaGraficaProductosDisponibles().getSelectedRow();
                    principalVenta.getRegistrarVenta().getTablaGraficaProductosDisponibles().getValueAt(fila, 0).toString();
                    return true;
                } catch (Exception e) {
                    DesktopNotify.showDesktopMessage("  Iinformación   ", " Debe seleccionar una fila", DesktopNotify.INFORMATION, 5000);
                    return false;
                }
            case 2:
                try {
                    int fila = principalVenta.getEditarVenta().getTablaGraficaProductosDisponibles().getSelectedRow();
                    principalVenta.getEditarVenta().getTablaGraficaProductosDisponibles().getValueAt(fila, 0).toString();
                    return true;
                } catch (Exception e) {
                    DesktopNotify.showDesktopMessage("  Iinformación   ", " Debe seleccionar una fila", DesktopNotify.INFORMATION, 5000);
                    return false;
                }
        }

        return false;

    }

}
