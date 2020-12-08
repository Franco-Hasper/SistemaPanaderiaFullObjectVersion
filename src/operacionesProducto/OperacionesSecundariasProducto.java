package operacionesProducto;

import conexion.ConexionHibernate;
import entidades.Estado;
import entidades.Iva;
import entidades.PrecioProducto;
import entidades.Producto;
import escritorios.PrincipalProducto;
import formularios.FormularioRegistrarPrecioProducto;
import formularios.FormularioRegistrarProducto;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import clasesUtilidadGeneral.OperacionesUtiles;
import org.hibernate.Session;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author TELCOM MPC
 */
public class OperacionesSecundariasProducto {

    public void aplicarIvaPrecioProducto(FormularioRegistrarPrecioProducto f) {

        Double precioBruto;
        Double iva;
        Double porcentage;
        Double precioFinal;

        Session miSesion = ConexionHibernate.tomarConexion();

        try {
            miSesion.beginTransaction();
            Estado e = (Estado) miSesion.get(Estado.class, 1);
            Iva i = (Iva) miSesion.createQuery("from Iva where codigoEstado= " + e.getIdEstado()).uniqueResult();

            if (f.getTxtPrecio().getText().length() == 0) {
                showMessageDialog(null, "Debe insertar un valor en el campo 'PRECIO BRUTO'");
                f.getRadioIva().setSelected(false);
            } else {
                precioBruto = Double.valueOf(f.getTxtPrecio().getText());
                iva = i.getPorcentaje();
                porcentage = precioBruto * iva;
                precioFinal = precioBruto + porcentage;
                f.getTxtPrecioFinal().setText(precioFinal.toString());
            }

            miSesion.getTransaction().commit();

        } catch (Exception e) {

        }

    }

    public void aplicarIvaProducto(FormularioRegistrarProducto f) {

        Double precioBruto;
        Double iva;
        Double porcentage;
        Double precioFinal;
        Session miSesion = ConexionHibernate.tomarConexion();
        try {
            miSesion.beginTransaction();
            Estado e = (Estado) miSesion.get(Estado.class, 1);
            Iva i = (Iva) miSesion.createQuery("from Iva where codigoEstado= " + e.getIdEstado()).uniqueResult();
            if (f.getTxtPrecio().getText().length() == 0) {
                showMessageDialog(null, "Debe insertar un valor en el campo preciobBruto");
                f.getRadioIva().setSelected(false);
            } else {
                precioBruto = Double.valueOf(f.getTxtPrecio().getText());
                iva = i.getPorcentaje();
                porcentage = precioBruto * iva;
                precioFinal = precioBruto + porcentage;
                f.getTxtPrecioFinal().setText(precioFinal.toString());
            }
            miSesion.getTransaction().commit();

        } catch (Exception e) {

        }

    }

    public void graficarHistorialPrecios(PrincipalProducto principalProducto) {

        
        Session miSesion = ConexionHibernate.tomarConexion();
   

            miSesion.beginTransaction();
            Integer totalFilas = principalProducto.getTablaGrafica().getRowCount();
            Integer filasSeleccionada = principalProducto.getTablaGrafica().getSelectedRow();
            List<Integer> listaResutadosActuales = principalProducto.getTablaProducto().getListaResutladosActuales();
            Integer idProducto = OperacionesUtiles.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            Producto prd = (Producto) miSesion.get(Producto.class, idProducto);

            List<PrecioProducto> precios = prd.getPrecios();

            for (PrecioProducto p : precios) {
                dataset.setValue(p.getPrecioTotal(), "", OperacionesUtiles.formatoFecha(p.getFecha()).toString());
            }
            miSesion.getTransaction().commit();
            JFreeChart chart = ChartFactory.createBarChart3D("Historial de Precios", "Fecha", "Precios", dataset, PlotOrientation.VERTICAL, true, true, false);
            ChartFrame frame = new ChartFrame("JFreeChart", chart);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

   

    }

}
