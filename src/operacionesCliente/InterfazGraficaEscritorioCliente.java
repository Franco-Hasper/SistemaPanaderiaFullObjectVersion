package operacionesCliente;

import calsesPadre.InterfazGraficaEscritorio;
import escritorios.PrincipalCliente;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import clasesUtilidadGeneral.TextPrompt;
import formularios.FormularioEditarVenta;
import formularios.FormularioRegistrarVenta;
import principal.PrincipalAdministrador;

/**
 *
 * @author Hasper Franco
 */
public class InterfazGraficaEscritorioCliente extends InterfazGraficaEscritorio {

    private boolean caso;

    public boolean isCaso() {
        return caso;
    }

    public void setCaso(boolean caso) {
        this.caso = caso;
    }

    @Override
    public void nuevaVentana() {
        if (principalAdministrador.getEscritorio().estacerrado(principalAdministrador.getCliente())) {
            PrincipalCliente principalCliente = new PrincipalCliente();
            principalAdministrador.setCliente(principalCliente);
            BasicInternalFrameTitlePane menupanel = (BasicInternalFrameTitlePane) ((BasicInternalFrameUI) principalCliente.getUI()).getNorthPane();
            int width = principalAdministrador.getEscritorio().getWidth();
            int Height = principalAdministrador.getEscritorio().getHeight();
            principalAdministrador.getCliente().remove(menupanel);
            principalAdministrador.getCliente().setSize(width, Height);
            principalAdministrador.getEscritorio().add(principalAdministrador.getCliente());
            infoTextPrompt();
            TablaCliente tablaCliente = new TablaCliente();
            tablaCliente.setPrincipalCliente(principalAdministrador.getCliente());
            tablaCliente.ejecutarRellenarTabla();
            principalAdministrador.getCliente().setTablaCliente(tablaCliente);
            InterfazGraficaFormularioRegistrarCliente formularioRegistrar = new InterfazGraficaFormularioRegistrarCliente();
            InterfazGraficaFormularioEditarCliente formularioEditar = new InterfazGraficaFormularioEditarCliente();
            principalAdministrador.getCliente().setFormularioRegistrar(formularioRegistrar);
            principalAdministrador.getCliente().setFormularioEditar(formularioEditar);
            //solo para pasar admin al EscritorioCuenta
            principalAdministrador.getCliente().setPrincipalAdministrador(principalAdministrador);
            if (caso) {
                //
            } else {
                principalAdministrador.getCliente().show();
            }

        }
        if (caso) {
            //
        } else {
            habilitarBotones();
        }
        colorInterfazEscritorio();
        principalAdministrador.getCliente().toFront();
    }

    @Override
    public void colorInterfazEscritorio() {
        principalAdministrador.getCliente().getPanelPrincipalTop().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getTablaGrafica().setForeground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getTablaGrafica().setSelectionBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("BUSCAR POR NOMBRE", principalAdministrador.getCliente().getTxtBuscar());
        principalAdministrador.getCliente().getTxtBuscar().grabFocus();
    }

    public void deshabilitarBotones(PrincipalAdministrador principalAdministrador,
            FormularioRegistrarVenta formularioRegistrarVenta, int tipoFormulario) {
        principalAdministrador.getCliente().setTipoFormulario(1);
        principalAdministrador.getCliente().setFormularioRegistrarVenta(formularioRegistrarVenta);
        principalAdministrador.getCliente().show();
        principalAdministrador.getCliente().toFront();
        principalAdministrador.getCliente().getBtnSeleccionarCliente().setEnabled(true);
        principalAdministrador.getCliente().getBtnEliminarCli().setEnabled(false);
        principalAdministrador.getCliente().getBtnnEditarCl().setEnabled(false);
        principalAdministrador.getCliente().getBtnnuevocliente().setEnabled(false);
        principalAdministrador.getCliente().getBtnCuenta().setEnabled(false);
    }

    public void deshabilitarBotonesEditar(PrincipalAdministrador principalAdministrador,
            FormularioEditarVenta formularioEditarVenta, int tipoFormulario) {
        principalAdministrador.getCliente().setTipoFormulario(2);
        principalAdministrador.getCliente().setFormularioEditarVenta(formularioEditarVenta);
        principalAdministrador.getCliente().show();
        principalAdministrador.getCliente().toFront();
        principalAdministrador.getCliente().getBtnSeleccionarCliente().setEnabled(true);
        principalAdministrador.getCliente().getBtnEliminarCli().setEnabled(false);
        principalAdministrador.getCliente().getBtnnEditarCl().setEnabled(false);
        principalAdministrador.getCliente().getBtnnuevocliente().setEnabled(false);
        principalAdministrador.getCliente().getBtnCuenta().setEnabled(false);
    }

    public void habilitarBotones() {
        principalAdministrador.getCliente().getBtnSeleccionarCliente().setEnabled(false);
        principalAdministrador.getCliente().getBtnEliminarCli().setEnabled(true);
        principalAdministrador.getCliente().getBtnnEditarCl().setEnabled(true);
        principalAdministrador.getCliente().getBtnnuevocliente().setEnabled(true);
        principalAdministrador.getCliente().getBtnCuenta().setEnabled(true);

    }

}
