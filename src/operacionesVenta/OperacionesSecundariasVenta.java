package operacionesVenta;

import formularios.FormularioRegistrarVenta;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * @author Hasper Franco
 */
public class OperacionesSecundariasVenta {

    FormularioRegistrarVenta formularioRegistrarVenta;

    public FormularioRegistrarVenta getFormularioRegistrarVenta() {
        return formularioRegistrarVenta;
    }

    public void setFormularioRegistrarVenta(FormularioRegistrarVenta formularioRegistrarVenta) {
        this.formularioRegistrarVenta = formularioRegistrarVenta;
    }

    public void tipoVentaSeleccionada(String valor) {

        if (valor.equals("Pedido")) {
            formularioRegistrarVenta.getRadButonConsumidorFinal().setEnabled(false);
            this.modeloTabla();
        } else {
            formularioRegistrarVenta.getRadButonConsumidorFinal().setEnabled(true);
            this.modeloTabla();
        }
    }

    public void modeloTabla() {
        Vector datosTabla = new Vector();
        Vector<String> encabezadoTabla = new Vector<>();
        encabezadoTabla.add("NOMBRE");
        encabezadoTabla.add("TELEFONO");
        encabezadoTabla.add("DIRECCION");
        formularioRegistrarVenta.getTablaCliente().setModel(new DefaultTableModel(datosTabla, encabezadoTabla));

    }

    

}
