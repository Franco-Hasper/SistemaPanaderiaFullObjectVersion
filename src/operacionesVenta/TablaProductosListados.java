package operacionesVenta;

import calsesPadre.Tabla;
import conexion.ConexionHibernate;
import ds.desktop.notify.DesktopNotify;
import entidades.PrecioProducto;
import escritorios.PrincipalVenta;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class TablaProductosListados extends Tabla {

    private PrincipalVenta principalVenta;

    private TablaProductosDisponibles tablaRegistrarVenta;

    private List<Integer> listaProductosListados = new ArrayList<Integer>();

    private JTable tablaProductosListados;

    public JTable getTablaProductosListados() {
        return tablaProductosListados;
    }

    public void setTablaProductosListados(JTable tablaProductosListados) {
        this.tablaProductosListados = tablaProductosListados;
    }

    public PrincipalVenta getPrincipalVenta() {
        return principalVenta;
    }

    public void setPrincipalVenta(PrincipalVenta principalVenta) {
        this.principalVenta = principalVenta;
    }

    public TablaProductosDisponibles getTablaRegistrarVenta() {
        return tablaRegistrarVenta;
    }

    public void setTablaRegistrarVenta(TablaProductosDisponibles tablaRegistrarVenta) {
        this.tablaRegistrarVenta = tablaRegistrarVenta;
    }

    public List<Integer> getListaProductosListados() {
        return listaProductosListados;
    }

    public void setListaProductosListados(List<Integer> listaProductosListados) {
        this.listaProductosListados = listaProductosListados;
    }

    /**
     * ejecuta los metodos necesarios para listar un nuevo producto en la tabla
     * productos listados.
     */
    public void ejecutarAgregarProducto() {
        setTabla(principalVenta.getRegistrarVenta().getTablaGraficaProductosDisponibles());
        setTablaProductosListados(principalVenta.getRegistrarVenta().getTablaListarProductos());
        agregarProducto();
    }

    public void quitarProducto() {
        quitarIdsEnLista();
        DefaultTableModel tablaProductosListados = (DefaultTableModel) getTablaProductosListados().getModel();
        int filaSeleccionada = getTablaProductosListados().getSelectedRow();
        tablaProductosListados.removeRow(filaSeleccionada);
    }

    public void quitarIdsEnLista() {
        DefaultTableModel tablaProductosListados = (DefaultTableModel) getTablaProductosListados().getModel();
        int filaSeleccionada = getTablaProductosListados().getSelectedRow();
        listaProductosListados.remove(filaSeleccionada);
    }

    public void agregarProducto() {
        DefaultTableModel tablaProductosListados = (DefaultTableModel) getTablaProductosListados().getModel();
        DefaultTableModel tablaProductosDisponibles = (DefaultTableModel) getTabla().getModel();
        int filaSeleccionada = getTabla().getSelectedRow();
        Vector<Object> fila = new Vector<>();
        fila.add(tablaProductosDisponibles.getValueAt(filaSeleccionada, 0).toString());

        fila.add(principalVenta.getRegistrarVenta().getTxtCantidad().getText());
        Double total = Double.valueOf(tablaProductosDisponibles.getValueAt(filaSeleccionada, 2).toString()) * Double.valueOf(principalVenta.getRegistrarVenta().getTxtCantidad().getText());
        fila.add(total);

        tablaProductosListados.addRow(fila);
        conexion();
    }

    /**
     * abre una conexion para obtener la id de los prouctos listados desde
     * precio_producto
     */
    private void conexion() {
        Session miSesion = ConexionHibernate.tomarConexion();
        try {
            miSesion.beginTransaction();
            agregarIdsEnLista(miSesion);
            miSesion.getTransaction().commit();
        } catch (Exception e) {
        }
    }

    /**
     * Agrega la id del producto listado en un arreglo que se usara para guardar
     * en el registro de venta en la bd.
     *
     * @author Hasper Franco
     * @version 1.0
     * @since 2020-12-07
     */
    public void agregarIdsEnLista(Session miSesion) {
        Integer totalFilasProductosDisponibles = getTabla().getRowCount();
        Integer filasSeleccionadaProductosDisponibles = getTabla().getSelectedRow();
        List<Integer> listaResutadosActuales = tablaRegistrarVenta.getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilasProductosDisponibles, filasSeleccionadaProductosDisponibles);
        PrecioProducto prepro = (PrecioProducto) miSesion.get(PrecioProducto.class, id);
        Integer idProductosDisponibles = prepro.getCodigoProducto().getIdProducto();
        listaProductosListados.add(idProductosDisponibles);
    }

    @Override
    public boolean verificarFilaSeleccionada() {
        try {
            int fila = principalVenta.getRegistrarVenta().getTablaListarProductos().getSelectedRow();
            principalVenta.getRegistrarVenta().getTablaListarProductos().getValueAt(fila, 0).toString();
            return true;
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("  Iinformación   ", " Debe seleccionar una fila ", DesktopNotify.INFORMATION, 5000);

            return false;
        }
    }

    public boolean verificarValor() {

        if (principalVenta.getRegistrarVenta().getTxtCantidad().getText().equals("")) {
            DesktopNotify.showDesktopMessage("  Iinformación   ", " El campo (cantidad) debe contener un valor ", DesktopNotify.INFORMATION, 5000);
            return false;
        } else {
            return true;
        }

    }

    @Deprecated
    @Override
    public Integer obtenerIdFilaSeleccionada() {
        return 0;
    }

    @Deprecated
    @Override
    public void rellenarTabla(String valorBusqueda) {

    }

    @Deprecated
    @Override
    public void ejecutarRellenarTabla() {

    }

}
