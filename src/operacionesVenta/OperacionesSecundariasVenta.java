package operacionesVenta;

import calsesPadre.Consultas;
import clasesUtilidadGeneral.OperacionesUtiles;
import conexion.ConexionHibernate;
import ds.desktop.notify.DesktopNotify;
import entidades.Cliente;
import escritorios.PrincipalCliente;
import formularios.FormularioEditarVenta;
import formularios.FormularioRegistrarVenta;
import java.util.List;
import java.util.Vector;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class OperacionesSecundariasVenta {

    private int tipoFormulario;
    private FormularioRegistrarVenta formularioRegistrarVenta;
    private FormularioEditarVenta formularioEditarVenta;
    private PrincipalCliente principalCliente;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public int getTipoFormulario() {
        return tipoFormulario;
    }

    public void setTipoFormulario(int tipoFormulario) {
        this.tipoFormulario = tipoFormulario;
    }

    public FormularioRegistrarVenta getFormularioRegistrarVenta() {
        return formularioRegistrarVenta;
    }

    public void setFormularioRegistrarVenta(FormularioRegistrarVenta formularioRegistrarVenta) {
        this.formularioRegistrarVenta = formularioRegistrarVenta;
    }

    public FormularioEditarVenta getFormularioEditarVenta() {
        return formularioEditarVenta;
    }

    public void setFormularioEditarVenta(FormularioEditarVenta formularioEditarVenta) {
        this.formularioEditarVenta = formularioEditarVenta;
    }

    public void nuevaVentanaCliente() {

    }

    public void calcularVuelto() {
        Double sumaTotal = 0.00;
        Double pago = 0.00;
        Double descuento = 0.00;
        try {

            sumaTotal = Double.valueOf(formularioRegistrarVenta.getLblPrecioTotal().getText());
            pago = Double.valueOf(formularioRegistrarVenta.getTxtPago().getText());
            descuento = Double.valueOf(formularioRegistrarVenta.getTxtDescuento().getText());
            Double sumaConDescuento = sumaTotal - (descuento);
            Double vuelto = pago - (sumaConDescuento);
            formularioRegistrarVenta.getLblVuelto().setText(new OperacionesUtiles().formatoDouble(vuelto));

        } catch (java.lang.NumberFormatException e) {

            Double sumaConDescuento = sumaTotal - (descuento);
            Double vuelto = pago - (sumaConDescuento);
            formularioRegistrarVenta.getLblVuelto().setText(new OperacionesUtiles().formatoDouble(vuelto));
        }

    }

    public void tipoVentaSeleccionada(String valor) {
        switch (tipoFormulario) {
            case 1:
                if (valor.equals("Pedido")) {
                    if (formularioRegistrarVenta.getRadButonConsumidorFinal().isSelected()) {
                        modeloTabla();
                    }
                    formularioRegistrarVenta.getRadButonConsumidorFinal().setEnabled(false);
                    formularioRegistrarVenta.getRadButonConsumidorFinal().setSelected(false);

                } else {
                    formularioRegistrarVenta.getRadButonConsumidorFinal().setEnabled(true);
                    modeloTabla();
                }
                break;
            case 2:
                if (valor.equals("Pedido")) {
                    if (formularioEditarVenta.getRadButonConsumidorFinal().isSelected()) {
                        modeloTabla();
                    }
                    formularioEditarVenta.getRadButonConsumidorFinal().setEnabled(false);
                    formularioEditarVenta.getRadButonConsumidorFinal().setSelected(false);
                } else {
                    formularioEditarVenta.getRadButonConsumidorFinal().setEnabled(true);
                    modeloTabla();
                }
                break;
        }
    }

    public void tipoConsumidorFinalEnabled() {
        switch (tipoFormulario) {
            case 1:
                if (formularioRegistrarVenta.getRadButonConsumidorFinal().isSelected()) {
                    formularioRegistrarVenta.getBtnBuscarCliente().setEnabled(false);
                    modeloTabla();
                    datosventaSimpleConsumidorFinal();
                    deshabilitarBotonesCuenta();
                } else {
                    formularioRegistrarVenta.getBtnBuscarCliente().setEnabled(true);
                    modeloTabla();
                    habilitarBotonesCuenta();
                }
                break;
            case 2:
                if (formularioEditarVenta.getRadButonConsumidorFinal().isSelected()) {
                    formularioEditarVenta.getBtnBuscarCliente().setEnabled(false);
                    modeloTabla();
                    datosventaSimpleConsumidorFinal();
                } else {
                    formularioEditarVenta.getBtnBuscarCliente().setEnabled(true);
                    modeloTabla();
                }
                break;
        }

    }

    public void transferirDatos(JTable tablaOrigen, JTable tablaDestino) {
        int fila = tablaOrigen.getSelectedRow();
        String nombreApellido = tablaOrigen.getValueAt(fila, 0).toString();
        String telefono = tablaOrigen.getValueAt(fila, 1).toString();
        String direccion = tablaOrigen.getValueAt(fila, 2).toString();

        DefaultTableModel tablaCliente = (DefaultTableModel) tablaDestino.getModel();
        OperacionesUtiles.removerFilas(tablaCliente);
        Vector datosTabla = new Vector();
        datosTabla.add(nombreApellido);
        datosTabla.add(telefono);
        datosTabla.add(direccion);
        tablaCliente.addRow(datosTabla);
    }
    
   
    
    
    

    public void rellenarTablaVentaCliente() {
        int fila = principalCliente.getTablaGrafica().getSelectedRow();
        String nombre = principalCliente.getTablaGrafica().getValueAt(fila, 0).toString() + " " + principalCliente.getTablaGrafica().getValueAt(fila, 1).toString();
        String telefono = principalCliente.getTablaGrafica().getValueAt(fila, 7).toString();
        String direccion = principalCliente.getTablaGrafica().getValueAt(fila, 3).toString() + "/" + principalCliente.getTablaGrafica().getValueAt(fila, 4).toString() + "-" + principalCliente.getTablaGrafica().getValueAt(fila, 5).toString() + "-" + principalCliente.getTablaGrafica().getValueAt(fila, 6).toString();

        switch (tipoFormulario) {
            case 1:
                DefaultTableModel tablaVentaCliente = (DefaultTableModel) formularioRegistrarVenta.getTablaCliente().getModel();
                OperacionesUtiles.removerFilas(tablaVentaCliente);
                Vector datosTabla = new Vector();
                datosTabla.add(nombre);
                datosTabla.add(telefono);
                datosTabla.add(direccion);
                tablaVentaCliente.addRow(datosTabla);
                break;
            case 2:
                DefaultTableModel tablaVentaClienteE = (DefaultTableModel) formularioEditarVenta.getTablaGraficaCliente().getModel();
                OperacionesUtiles.removerFilas(tablaVentaClienteE);
                Vector datosTablaE = new Vector();
                datosTablaE.add(nombre);
                datosTablaE.add(telefono);
                datosTablaE.add(direccion);
                tablaVentaClienteE.addRow(datosTablaE);
                break;
        }
    }

    public void datosventaSimpleConsumidorFinal() {
        switch (tipoFormulario) {
            case 1:
                DefaultTableModel tablaVentaCliente = (DefaultTableModel) formularioRegistrarVenta.getTablaCliente().getModel();
                OperacionesUtiles.removerFilas(tablaVentaCliente);
                Vector datosTabla = new Vector();
                datosTabla.add("Cons. Final");
                datosTabla.add("---");
                datosTabla.add("----");
                tablaVentaCliente.addRow(datosTabla);
                break;
            case 2:
                DefaultTableModel tablaVentaClienteE = (DefaultTableModel) formularioEditarVenta.getTablaGraficaCliente().getModel();
                OperacionesUtiles.removerFilas(tablaVentaClienteE);
                Vector datosTablaE = new Vector();
                datosTablaE.add("Cons. Final");
                datosTablaE.add("---");
                datosTablaE.add("----");
                tablaVentaClienteE.addRow(datosTablaE);
                break;
        }
    }

    private void modeloTabla() {
        switch (tipoFormulario) {

            case 1:
                Vector datosTabla = new Vector();
                Vector<String> encabezadoTabla = new Vector<>();
                encabezadoTabla.add("NOMBRE");
                encabezadoTabla.add("TELEFONO");
                encabezadoTabla.add("DIRECCION");
                formularioRegistrarVenta.getTablaCliente().setModel(new DefaultTableModel(datosTabla, encabezadoTabla));
                break;
            case 2:
                Vector datosTablaE = new Vector();
                Vector<String> encabezadoTablaE = new Vector<>();
                encabezadoTablaE.add("NOMBRE");
                encabezadoTablaE.add("TELEFONO");
                encabezadoTablaE.add("DIRECCION");
                formularioEditarVenta.getTablaGraficaCliente().setModel(new DefaultTableModel(datosTablaE, encabezadoTablaE));
                break;
        }

    }

    public void obtenerPrecioTotal() {

        switch (tipoFormulario) {
            case 1:
                try {
                    Double total = 0.00;
                    for (int i = 0; i < formularioRegistrarVenta.getTablaListarProductos().getRowCount(); i++) {
                        total = total + (Double.valueOf(formularioRegistrarVenta.getTablaListarProductos().getValueAt(i, 2).toString()));
                    }
                    formularioRegistrarVenta.getLblPrecioTotal().setText(OperacionesUtiles.formatoDouble(total));
                } catch (ArrayIndexOutOfBoundsException e) {
                    formularioRegistrarVenta.getLblPrecioTotal().setText("0.00");
                }
                break;
            case 2:
                try {
                    Double total = 0.00;
                    for (int i = 0; i < formularioEditarVenta.getTablaListarProductos().getRowCount(); i++) {
                        total = total + (Double.valueOf(formularioEditarVenta.getTablaListarProductos().getValueAt(i, 2).toString()));
                    }
                    formularioEditarVenta.getLblPrecioTotal().setText(OperacionesUtiles.formatoDouble(total));
                } catch (ArrayIndexOutOfBoundsException e) {
                    formularioEditarVenta.getLblPrecioTotal().setText("0.00");
                }
                break;
        }

    }

    public boolean validarListaProductos() {
        switch (tipoFormulario) {
            case 1:
                if (formularioRegistrarVenta.getTablaListarProductos().getRowCount() < 1) {

                    DesktopNotify.showDesktopMessage(" Informacion", " La tabla 'Productos Listados' debe contener almenos un producto", DesktopNotify.INFORMATION, 7000);
                    return false;
                } else {
                    return true;
                }

            case 2:
                if (formularioEditarVenta.getTablaListarProductos().getRowCount() < 1) {
                    DesktopNotify.showDesktopMessage(" Informacion", " La tabla 'Productos Listados' debe contener almenos un producto", DesktopNotify.INFORMATION, 7000);
                    return false;
                } else {
                    return true;
                }
        }
        return false;
    }

    public boolean validarFecha() {

        switch (tipoFormulario) {
            case 1:
                try {
                    if (formularioRegistrarVenta.getrSDateChooser().getDatoFecha() == null
                            || formularioRegistrarVenta.getrSDateChooser().getDatoFecha().equals(" ")) {
                        DesktopNotify.showDesktopMessage(" Informacion", " Debe seleccionar una fecha", DesktopNotify.INFORMATION, 7000);
                        return false;
                    } else {
                        return true;
                    }
                } catch (NullPointerException e) {
                    DesktopNotify.showDesktopMessage(" Informacion", " Debe seleccionar una fecha", DesktopNotify.INFORMATION, 7000);
                    return false;
                }
            case 2:
                try {
                    if (formularioEditarVenta.getrSDateChooser().getDatoFecha() == null
                            || formularioEditarVenta.getrSDateChooser().getDatoFecha().equals(" ")) {
                        DesktopNotify.showDesktopMessage(" Informacion", " Debe seleccionar una fecha", DesktopNotify.INFORMATION, 7000);
                        return false;
                    } else {
                        return true;
                    }
                } catch (NullPointerException e) {
                    DesktopNotify.showDesktopMessage(" Informacion", " Debe seleccionar una fecha", DesktopNotify.INFORMATION, 7000);
                    return false;
                }
        }
        return false;
    }

    public boolean validarTablaCliente() {
        switch (tipoFormulario) {
            case 1:
                if (formularioRegistrarVenta.getTablaCliente().getRowCount() < 1) {
                    DesktopNotify.showDesktopMessage(" Informacion", " Debe seleccionar un cliente o consumidor final", DesktopNotify.INFORMATION, 7000);
                    return false;
                } else {
                    return true;
                }
            case 2:
                if (formularioEditarVenta.getTablaGraficaCliente().getRowCount() < 1) {
                    DesktopNotify.showDesktopMessage(" Informacion", " Debe seleccionar un cliente o consumidor final", DesktopNotify.INFORMATION, 7000);
                    return false;
                } else {
                    return true;
                }
        }
        return false;
    }

    public void retornarFormularioVenta() {
        switch (tipoFormulario) {
            case 1:
                formularioRegistrarVenta.setPrincipalCliente(principalCliente);
                formularioRegistrarVenta.setVisible(true);
                formularioRegistrarVenta.toFront();

                break;
            case 2:
                formularioEditarVenta.setPrincipalCliente(principalCliente);
                formularioEditarVenta.setVisible(true);
                formularioEditarVenta.toFront();
                break;
        }
    }

    public void cuentaDisable() {
        if (formularioRegistrarVenta == null) {
            formularioEditarVenta.getRadBtnDescontar().setSelected(false);
            DefaultTableModel tablaCuenta = (DefaultTableModel) formularioEditarVenta.getTablaGraficaDescontarCuenta().getModel();
            new OperacionesUtiles().removerFilas(tablaCuenta);
            formularioEditarVenta.getLblNuevoBalance().setText("");
            formularioEditarVenta.setIdCuenta(null);
        } else {
            formularioRegistrarVenta.getRadBtnDescontar().setSelected(false);
            DefaultTableModel tablaCuenta = (DefaultTableModel) formularioRegistrarVenta.getTablaGraficaDescontarCuenta().getModel();
            new OperacionesUtiles().removerFilas(tablaCuenta);
            formularioRegistrarVenta.getLblNuevoBalance().setText("");
            formularioRegistrarVenta.setIdCuenta(null);
        }

    }

    public void deshabilitarBotonesCuenta() {
        if (formularioRegistrarVenta == null) {
            formularioEditarVenta.getRadBtnDescontar().setEnabled(false);
            formularioEditarVenta.getBtnDescontar().setEnabled(false);
        } else {
            formularioRegistrarVenta.getRadBtnDescontar().setEnabled(false);

        }

    }

    private void habilitarBotonesCuenta() {
        if (formularioRegistrarVenta == null) {
            formularioEditarVenta.getRadBtnDescontar().setEnabled(true);
            formularioEditarVenta.getBtnDescontar().setEnabled(true);
        } else {
            formularioRegistrarVenta.getRadBtnDescontar().setEnabled(true);

        }

    }

}
