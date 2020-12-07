package operacionesIngresoMateriaPrima;

import calsesPadre.InterfazGraficaEscritorio;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalIngresoMatPrima;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaEscritorioIngresoMateriaPrima extends InterfazGraficaEscritorio {

    @Override
    public void nuevaVentana() {
        if (principalAdministrador.getEscritorio().estacerrado(principalAdministrador.getIngresoMateriaPrima())) {
            PrincipalIngresoMatPrima principalIngresoMatPrima = new PrincipalIngresoMatPrima();
            principalAdministrador.setIngresoMateriaPrima(principalIngresoMatPrima);
            BasicInternalFrameTitlePane menupanel = (BasicInternalFrameTitlePane) ((BasicInternalFrameUI) principalIngresoMatPrima.getUI()).getNorthPane();
            int width = principalAdministrador.getEscritorio().getWidth();
            int Height = principalAdministrador.getEscritorio().getHeight();
            principalAdministrador.getIngresoMateriaPrima().remove(menupanel);
            principalAdministrador.getIngresoMateriaPrima().setSize(width, Height);
            principalAdministrador.getEscritorio().add(principalAdministrador.getIngresoMateriaPrima());
            infoTextPrompt();
            TablaIngresoMateriaPrima tablaIngresoMateriaPrima = new TablaIngresoMateriaPrima();
            tablaIngresoMateriaPrima.setPrincipalIngresoMateriaPrima(principalAdministrador.getIngresoMateriaPrima());
            tablaIngresoMateriaPrima.ejecutarRellenarTabla();
            principalAdministrador.getIngresoMateriaPrima().setTablaIngresoMateriaPrima(tablaIngresoMateriaPrima);
            //REVISAR FORMULARIO EDITAR (se crea aca y en escritorioGasto, en gastoe s necesario pero aca?)
            //InterfazGraficaFormularioRegistrarIngresoMateriaPrima formularioRegistrar = new InterfazGraficaFormularioRegistrarIngresoMateriaPrima();
            InterfazGraficaFormularioEditarIngresoMateriaPrima formularioEditar = new InterfazGraficaFormularioEditarIngresoMateriaPrima();
           // principalAdministrador.getIngresoMateriaPrima().setFormularioRegistrar(formularioRegistrar);
            principalAdministrador.getIngresoMateriaPrima().setFormularioEditar(formularioEditar);
            principalAdministrador.getIngresoMateriaPrima().show();
        }
        colorInterfazEscritorio();
        principalAdministrador.getIngresoMateriaPrima().toFront();
    }
    
     @Override
    public void infoTextPrompt() {
        new TextPrompt("BUSCAR POR NOMBRE", principalAdministrador.getIngresoMateriaPrima().getTxtBuscar());
        principalAdministrador.getIngresoMateriaPrima().getTxtBuscar().grabFocus();
    }

    @Override
    public void colorInterfazEscritorio() {
        principalAdministrador.getIngresoMateriaPrima().getPanelPrincipalTop().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getIngresoMateriaPrima().getTablaGrafica().setForeground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getIngresoMateriaPrima().getTablaGrafica().setSelectionBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
    }
    
    
    
    
    
    
    
    
    
    

}
