package operacionesCuenta;

import calsesPadre.Consultas;
import clasesUtilidadGeneral.OperacionesUtiles;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import ds.desktop.notify.DesktopNotify;
import entidades.IngresoMateriaPrima;
import entidades.MovimientoCuenta;
import formularios.FormularioReporteIngresoMateriaPrima;
import formularios.FormularioReporteMovimientos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * @author Hasper Franco
 */
public class ReporteMovimientos extends Consultas {

    private FormularioReporteMovimientos formularioReporteMovimientos;
    private String fechaIicio;
    private String fechaFin;
    private List lista;
    private Integer idCuenta;

    private String cliente = "";
    private String nroCuenta = "";
    private String balanceActual = "";

    private static final Font titulofuente = new Font(Font.FontFamily.UNDEFINED, 12, Font.BOLD);
    private static final Font datosfuente = new Font(Font.FontFamily.UNDEFINED, 10, Font.BOLD);

    

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public FormularioReporteMovimientos getFormularioReporteMovimientos() {
        return formularioReporteMovimientos;
    }

    public void setFormularioReporteMovimientos(FormularioReporteMovimientos formularioReporteMovimientos) {
        this.formularioReporteMovimientos = formularioReporteMovimientos;
    }

    public void ejecutarBusqueda() {
        obtenerFechas();
        consultaIngresos();
        rellenarTabla();
    }

    private void obtenerFechas() {
        fechaIicio = (String) new OperacionesUtiles().formatoFechaSinHoraYearFirst(formularioReporteMovimientos.getFechaInicio().getDatoFecha());
        fechaFin = (String) new OperacionesUtiles().formatoFechaSinHoraYearFirst(formularioReporteMovimientos.getFechaFin().getDatoFecha());
    }

    private void consultaIngresos() {
        //necesito obtener el numero de cuenta 
        setConsultaList("from MovimientoCuenta where fecha BETWEEN '" + fechaIicio + "' AND '" + fechaFin + "' AND codigoCuenta=" + idCuenta.toString());
        obtenerListaConsulta();
    }

    private void rellenarTabla() {

        DefaultTableModel tablaIngresos = (DefaultTableModel) formularioReporteMovimientos.getTablaGrafica().getModel();
        lista = this.getListaResultados();
        new OperacionesUtiles().removerFilas(tablaIngresos);

        for (Object o : lista) {
            MovimientoCuenta m = (MovimientoCuenta) o;
            Vector<Object> fila = new Vector<>();
            fila.add(m.getMotivo());
            fila.add(m.getMonto());
            fila.add(m.getBalance());
            fila.add(new OperacionesUtiles().formatoFechaSinHora(m.getFecha()));
            this.cliente = m.getCodigoCuenta().getCodigoCliente().getNombre() + " " + m.getCodigoCuenta().getCodigoCliente().getApellido();
            this.nroCuenta = m.getCodigoCuenta().getIdCuenta().toString();
            this.balanceActual = m.getCodigoCuenta().getBalance().toString();
            tablaIngresos.addRow(fila);

        }
        formularioReporteMovimientos.getLblCliente().setText(cliente);
        formularioReporteMovimientos.getLblNroCuenta().setText(nroCuenta);
        formularioReporteMovimientos.getLblBalance().setText(balanceActual);

    }

    public void ejecutarGenerarReportes() throws FileNotFoundException, DocumentException {
        generarReportePDF5(new File("reportes//MovimientosCuenta//Movimientos " + fechaIicio + " hasta " + fechaFin + ".pdf"));
    }

    public void generarReportePDF5(File pdfNewFile) {
        try {

            //al añadir un new Chapter se cambia a otra pagina
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));
            document.open();
            //capitulo
            // Chapter chapterOne = new Chapter(0);
            Paragraph texto = new Paragraph();
            texto.setFont(titulofuente);
            texto.add("Reporte Movimientos Cuenta");

            DottedLineSeparator dottedline = new DottedLineSeparator();
            dottedline.setOffset(-2);
            dottedline.setGap(2f);
            texto.add(dottedline);
            texto.setFont(datosfuente);
            texto.add("\n");
            texto.add("Cliente: " + this.cliente);
            texto.add("\n");

            texto.add("N° Cuenta: " + this.nroCuenta);
            texto.add("\n");

            texto.add("Balance Actual: $" + this.balanceActual);
            texto.add("\n");

            texto.add("Fecha en la que se genero este reporte: " + OperacionesUtiles.formatoFechaSinHora(new Date()));
            texto.add("\n");
            String fechaIicioPdf = (String) new OperacionesUtiles().formatoFechaSinHora(formularioReporteMovimientos.getFechaInicio().getDatoFecha());
            String fechaFinPdf = (String) new OperacionesUtiles().formatoFechaSinHora(formularioReporteMovimientos.getFechaFin().getDatoFecha());

            texto.add(new Paragraph("Desde: " + fechaIicioPdf + " Hasta: " + fechaFinPdf));

            texto.add(new Paragraph("\n"));

            Double resultado = 0.0;

            PdfPTable table = new PdfPTable(4);
            PdfPCell columnHeader;

            columnHeader = new PdfPCell(new Phrase("Motivo"));
            table.addCell(columnHeader);
            columnHeader = new PdfPCell(new Phrase("Monto"));
            table.addCell(columnHeader);
            columnHeader = new PdfPCell(new Phrase("Balance"));
            table.addCell(columnHeader);
            columnHeader = new PdfPCell(new Phrase("Fecha"));
            table.addCell(columnHeader);
            columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);

            table.setHeaderRows(1);

            for (Object o : lista) {
                MovimientoCuenta m = (MovimientoCuenta) o;
                table.addCell(m.getMotivo());
                table.addCell("$ " + m.getMonto().toString());
                table.addCell("$ " + m.getBalance().toString());
                table.addCell((String) new OperacionesUtiles().formatoFechaSinHora(m.getFecha()));
            }

            texto.add(table);
            document.add(texto);
            document.close();
            DesktopNotify.showDesktopMessage("exito ", "   REPORTE GENERADO\n   CON EXITO", DesktopNotify.SUCCESS, 7000);
        } catch (FileNotFoundException | DocumentException e) {
            DesktopNotify.showDesktopMessage("error ", "    NO SE PUDO GENERAR\n    EL REPORTE", DesktopNotify.ERROR, 7000);
        }
    }

}
