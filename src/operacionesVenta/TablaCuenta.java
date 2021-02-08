package operacionesVenta;

import calsesPadre.Tabla;
import clasesUtilidadGeneral.OperacionesUtiles;
import ds.desktop.notify.DesktopNotify;
import entidades.Cuenta;
import escritorios.PrincipalCuenta;
import formularios.FormularioEditarVenta;
import formularios.FormularioRegistrarVenta;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * @author Hasper Franco
 */
public class TablaCuenta extends Tabla {

    private Integer idCliente;
    private FormularioRegistrarVenta formularioRegistrarVenta;
    private List<Integer> listaIds = new ArrayList<Integer>();

    public TablaCuenta() {
        setEstadoConsulta(0);
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public FormularioRegistrarVenta getFormularioRegistrarVenta() {
        return formularioRegistrarVenta;
    }

    public void setFormularioRegistrarVenta(FormularioRegistrarVenta formularioRegistrarVenta) {
        this.formularioRegistrarVenta = formularioRegistrarVenta;
    }


    public List<Integer> getListaIds() {
        return listaIds;
    }

    public void setListaIds(List<Integer> listaIds) {
        this.listaIds = listaIds;
    }

    /**
     * Ejecuata los metodos necesarios para rellenar la tabla cuentas de la
     * ventana PrincipalCuenta.
     *
     * @param p
     */
    @Override
    public void ejecutarRellenarTabla() {
        setTabla(formularioRegistrarVenta.getTablaGraficaDescontarCuenta());
        setStringConsulta("from Cuenta where codigoCliente=" + this.idCliente);
        evaluarEstadoConsulta();
        rellenarTabla("");
    }

    @Override
    public Integer obtenerIdFilaSeleccionada() {
        try {
            Integer totalFilas = formularioRegistrarVenta.getTablaGraficaDescontarCuenta().getRowCount();
            Integer filasSeleccionada = formularioRegistrarVenta.getTablaGraficaDescontarCuenta().getSelectedRow();
            List<Integer> listaResutadosActualesThis =formularioRegistrarVenta.getTablaCuenta().listaIds;
            Integer id = operacionesUtilidad.obtenerId(listaResutadosActualesThis, totalFilas, filasSeleccionada);
            this.setIdTabla(id);
        } catch (Exception e) {
        }
        return idTabla;
    }

    @Override
    public void rellenarTabla(String valorBusqueda) {

        DefaultTableModel tablaCuenta = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();
        operacionesUtilidad.removerFilas(tablaCuenta);

        try {
            this.listaIds.clear();
        } catch (NullPointerException e) {
        }

        for (Object o : lista) {
            Cuenta c = (Cuenta) o;
            this.listaIds.add(0, c.getIdCuenta());
            Vector<Object> fila = new Vector<>();
            fila.add(c.getIdCuenta());
            fila.add(c.getBalance());
            tablaCuenta.addRow(fila);

        }
        OperacionesUtiles.ordenarLista(listaIds);
    }

    @Override
    public boolean verificarFilaSeleccionada() {
        try {
            int fila = formularioRegistrarVenta.getTablaGraficaDescontarCuenta().getSelectedRow();
            formularioRegistrarVenta.getTablaGraficaDescontarCuenta().getValueAt(fila, 0).toString();
            return true;
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("Informacion", "Debe seleccionar una fila", DesktopNotify.INFORMATION, 7000);
            return false;
        }
    }

    
    public void cacularNuevoBalance(){
        formularioRegistrarVenta.getLblNuevoBalance().setText("adasdkaopsd");
    }
    
    
    

}
