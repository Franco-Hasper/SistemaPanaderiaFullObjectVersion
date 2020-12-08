package operacionesCaja;

import calsesPadre.Tabla;
import entidades.PrecioProducto;
import entidades.Producto_Venta;
import entidades.Venta;
import formularios.FormularioRegistrarCorte;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * @author Hasper Franco
 */
public class TablaVentas extends Tabla {

    public void ejecutarRellenarTabla(FormularioRegistrarCorte formularioRegistrarCorte) {
        setTabla(formularioRegistrarCorte.getTablaEntradas());
        datosVentas();
    }

    /**
     * Ejecuata los metodos necesarios para rellenar la tabla de la entradas en
     * la ventana Corte de caja con los resultados de la consulta de entradas.
     *
     * @param p
     */
    public void datosVentas() {
        setConsultaList("from Venta");
        obtenerListaConsulta();
        rellenarTablaFromVenatas();
    }
    
        /**
     * Toma los resultados de la consulta entradas y los agrega en la tabla
     * entradas de la ventana Corte de Caja.
     *
     */
    public void rellenarTablaFromVenatas() {

        DefaultTableModel tablaEntradas = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();

        for (Object o : lista) {
            Venta v = (Venta) o;
            Vector<Object> fila = new Vector<>();
            if (operacionesUtilidad.compararFecha(v.getFechaHoraVenta())) {
                List<Producto_Venta> productos = v.getProductos();
                for (Producto_Venta pr : productos) {
                    fila.add(pr.getCodigoProducto().getNombre());
                    fila.add(pr.getTotalUnidades());
                    List<PrecioProducto> precios
                            = pr.getCodigoProducto().getPrecios();
                    for (PrecioProducto pre : precios) {
                        if (pre.getCodigoEstado().getIdEstado().equals(1)) {
                            fila.add(pr.getTotalUnidades() * pre.getPrecioTotal());
                        }
                    }
                }
                fila.add(v.getPrecioTotal().toString());
                tablaEntradas.addRow(fila);

            }

        }

    }
    
    

    @Deprecated
    @Override
    public void ejecutarRellenarTabla() {

    }

    @Deprecated
    @Override
    public void rellenarTabla(String valorBusqueda) {

    }

    @Deprecated
    @Override
    public Integer obtenerIdFilaSeleccionada() {
        return 0;
    }

    @Deprecated
    @Override
    public boolean verificarFilaSeleccionada() {
        return false;
    }

}
