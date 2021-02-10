package operacionesCaja;

import calsesPadre.InterfazGraficaFormularioEditar;
import conexion.ConexionHibernate;
import entidades.CorteCaja;
import entidades.IngresoMateriaPrima;
import escritorios.PrincipalCaja;
import formularios.FormularioEditarCorte;
import java.awt.HeadlessException;
import java.util.Date;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarCorte extends InterfazGraficaFormularioEditar {

    protected PrincipalCaja principalCaja;
    protected TablaCaja tablaCaja;

    public PrincipalCaja getPrincipalCaja() {
        return principalCaja;
    }

    public void setPrincipalCaja(PrincipalCaja principalCaja) {
        this.principalCaja = principalCaja;
    }

    public TablaCaja getTablaCaja() {
        return tablaCaja;
    }

    public void setTablaCaja(TablaCaja tablaCaja) {
        this.tablaCaja = tablaCaja;
    }

    @Override
    public void nuevoFormularioEditar() {
        if (principalCaja.getEditarCorte() == null) {
            FormularioEditarCorte formularioEditar = new FormularioEditarCorte(frame, true);
            formularioEditar.setPrincipalCaja(principalCaja);
            principalCaja.setEditarCorte(formularioEditar);
            transferirDatos();
            colorTema();
        }

        principalCaja.getEditarCorte().setVisible(true);
        principalCaja.setEditarCorte(null);
    }

    @Override
    public void colorTema() {
        principalCaja.getEditarCorte().getPanelPrincipalTop().setBackground(principalCaja.getPanelPrincipalTop().getBackground());
        principalCaja.getEditarCorte().getrSDateChooser().setColorBackground(principalCaja.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
        new TablaCaja().setPrincipalCaja(principalCaja);
        int fila = principalCaja.getTablaGrafica().getSelectedRow();
        principalCaja.getEditarCorte().getTxtTotalIngresos().setText(principalCaja.getTablaGrafica().getValueAt(fila, 0).toString());
        principalCaja.getEditarCorte().getTxtTotalEgresos().setText(principalCaja.getTablaGrafica().getValueAt(fila, 1).toString());
        principalCaja.getEditarCorte().getTxtBalance().setText(principalCaja.getTablaGrafica().getValueAt(fila, 2).toString());
        fechaCorte();
    }

    @Override
    public void agregarBoxes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rellenarBoxes() {

    }

    private void fechaCorte() {
        transferirFecha(obtenerDatos());
    }

    private Date obtenerDatos() {
        Date fecha = new Date();
        Integer id = principalCaja.getTablaCaja().obtenerIdFilaSeleccionada();
        Session miSesion = ConexionHibernate.tomarConexion();
        try {
            miSesion.beginTransaction();
            CorteCaja c = (CorteCaja) miSesion.get(CorteCaja.class, id);
            fecha = c.getFecha();
            miSesion.getTransaction().commit();
        } catch (HeadlessException | NumberFormatException e) {
        }
        return fecha;
    }

    private void transferirFecha(Date fecha) {
        principalCaja.getEditarCorte().getrSDateChooser().setDatoFecha(fecha);
    }

}
