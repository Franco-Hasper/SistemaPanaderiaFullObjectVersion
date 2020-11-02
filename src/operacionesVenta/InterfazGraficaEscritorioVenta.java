package operacionesVenta;

import calsesPadre.InterfazGraficaEscritorio;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalVenta;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaEscritorioVenta extends InterfazGraficaEscritorio {
    
    @Override
    public void nuevaVentana() {
        if (principalAdministrador.getEscritorio().estacerrado(principalAdministrador.getVenta())) {
            PrincipalVenta principalVenta = new PrincipalVenta();
            principalAdministrador.setVenta(principalVenta);
            BasicInternalFrameTitlePane menupanel = (BasicInternalFrameTitlePane) ((BasicInternalFrameUI) principalVenta.getUI()).getNorthPane();
            int width = principalAdministrador.getEscritorio().getWidth();
            int Height = principalAdministrador.getEscritorio().getHeight();
            principalAdministrador.getVenta().remove(menupanel);
            principalAdministrador.getVenta().setSize(width, Height);
            principalAdministrador.getEscritorio().add(principalAdministrador.getVenta());
            infoTextPrompt();
            TablaVenta tablaVenta = new TablaVenta();
            tablaVenta.setPrincipalVenta(principalAdministrador.getVenta());
            tablaVenta.ejecutarRellenarTabla();
            principalAdministrador.getVenta().setTablaVenta(tablaVenta);
            //REVISAR FORMULARIO EDITAR (se crea aca y en escritorioGasto, en gastoe s necesario pero aca?)
            InterfazGraficaFormularioRegistrarVenta formularioRegistrar = new InterfazGraficaFormularioRegistrarVenta();
            InterfazGraficaFormularioEditarVenta formularioEditar = new InterfazGraficaFormularioEditarVenta();
            InterfazGraficaDetalleVenta formularioDetalleVenta = new InterfazGraficaDetalleVenta();
            principalAdministrador.getVenta().setFormularioRegistrar(formularioRegistrar);
            principalAdministrador.getVenta().setFormularioEditar(formularioEditar);
            principalAdministrador.getVenta().setFormularioDetalleVenta(formularioDetalleVenta);
            principalAdministrador.getVenta().show();
        }
        colorInterfazEscritorio();
        principalAdministrador.getVenta().toFront();
    }
    
     @Override
    public void infoTextPrompt() {
        new TextPrompt("BUSCAR POR FECHA, FORMATO (AAAA-MM-DD)", principalAdministrador.getVenta().getTxtBuscar());
        principalAdministrador.getVenta().getTxtBuscar().grabFocus();
    }

    @Override
    public void colorInterfazEscritorio() {
        principalAdministrador.getVenta().getPanelPrincipalTop().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getVenta().getTablaGrafica().setForeground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getVenta().getTablaGrafica().setSelectionBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
    }

}
