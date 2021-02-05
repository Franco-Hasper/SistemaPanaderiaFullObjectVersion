package operacionesCaja;

import calsesPadre.InterfazGraficaFormularioEditar;
import escritorios.PrincipalCaja;
import formularios.FormularioEditarCorte;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarCorte  extends InterfazGraficaFormularioEditar {

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
        FormularioEditarCorte formularioEditar = new FormularioEditarCorte(frame, true);
        formularioEditar.setPrincipalCaja(principalCaja);
        principalCaja.setEditarCorte(formularioEditar);
        transferirDatos();
        colorTema();
        principalCaja.getEditarCorte().setVisible(true);
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
    }

    @Override
    public void agregarBoxes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rellenarBoxes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
