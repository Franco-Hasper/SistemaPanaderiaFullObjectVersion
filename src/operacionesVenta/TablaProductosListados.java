package operacionesVenta;

import calsesPadre.Tabla;
import escritorios.PrincipalVenta;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

    @Override
    public void ejecutarRellenarTabla() {
        setTabla(principalVenta.getRegistrarVenta().getTablaGraficaProductosDisponibles());
        setTablaProductosListados(principalVenta.getRegistrarVenta().getTablaListarProductos());
        rellenarTabla();
    }

    


    public void quitarIdsEnLista() {
        setTablaProductosListados(principalVenta.getRegistrarVenta().getTablaListarProductos());
        Integer filasSeleccionadaProductosListados = getTablaProductosListados().getSelectedRow();
        listaProductosListados.remove(filasSeleccionadaProductosListados);
    }

 
    public void rellenarTabla() {
        DefaultTableModel tablaProductosListados = (DefaultTableModel) getTablaProductosListados().getModel();
        DefaultTableModel tablaProductosDisponibles = (DefaultTableModel) getTabla().getModel();
        int filaSeleccionada = getTabla().getSelectedRow();
        Vector<Object> fila = new Vector<>();
        fila.add(tablaProductosDisponibles.getValueAt(filaSeleccionada, 0).toString());

        fila.add(principalVenta.getRegistrarVenta().getTxtCantidad().getText());
       Double total=Double.valueOf(tablaProductosDisponibles.getValueAt(filaSeleccionada, 2).toString())*Double.valueOf(principalVenta.getRegistrarVenta().getTxtCantidad().getText());
       fila.add(total);

        tablaProductosListados.addRow(fila);
        agregarIdsEnLista();
    }
    
    /**
 * Agrega la id del producto listado en un arreglo
 * que se usara para guardar en el registro de venta en la bd.
 * @author Hasper Franco
 * @version 1.0
 * @since 2020-12-07
 */
        public void agregarIdsEnLista() {
        
        Integer totalFilasProductosDisponibles = getTabla().getRowCount();
        Integer filasSeleccionadaProductosDisponibles = getTabla().getSelectedRow();
        List<Integer> listaResutadosActuales = tablaRegistrarVenta.getListaResutladosActuales();
        Integer idProductosDisponibles = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilasProductosDisponibles, filasSeleccionadaProductosDisponibles);
        listaProductosListados.add(idProductosDisponibles);
    }
    
    

    @Deprecated
    @Override
    public Integer obtenerIdFilaSeleccionada() {
        return 0;
    }

    @Override
    public boolean verificarFilaSeleccionada() {
        try {
            int fila = principalVenta.getRegistrarVenta().getTablaListarProductos().getSelectedRow();
            principalVenta.getRegistrarVenta().getTablaListarProductos().getValueAt(fila, 0).toString();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    @Deprecated
    @Override
    public void rellenarTabla(String valorBusqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
