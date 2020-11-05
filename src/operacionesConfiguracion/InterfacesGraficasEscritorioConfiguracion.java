package operacionesConfiguracion;

import calsesPadre.InterfazGraficaEscritorio;
import escritorios.PrincipalConfiguracion;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author FRANCO
 */
public class InterfacesGraficasEscritorioConfiguracion extends InterfazGraficaEscritorio {

    /**
     * Crea una nuea instancia para la clase PrincipalConfiguracion (intefaz
     * grafica).
     *
     * @param p
     */
    @Override
    public void nuevaVentana() {
        
        if (principalAdministrador.getEscritorio().estacerrado(principalAdministrador.getConfiguracion())) {
            PrincipalConfiguracion principalConfiguracion = new PrincipalConfiguracion();
            principalAdministrador.setConfiguracion(principalConfiguracion);
            BasicInternalFrameTitlePane menupanel = (BasicInternalFrameTitlePane) ((BasicInternalFrameUI) principalConfiguracion.getUI()).getNorthPane();
            int width = principalAdministrador.getEscritorio().getWidth();
            int Height = principalAdministrador.getEscritorio().getHeight();
            principalAdministrador.getConfiguracion().remove(menupanel);
            principalAdministrador.getConfiguracion().setSize(width, Height);
            
            try {
                principalAdministrador.getEscritorio().add(principalAdministrador.getConfiguracion());
            } catch (IllegalArgumentException e) {
            }
            infoTextPrompt();
            
            ConfiguracionTxt configuracionTxt = new ConfiguracionTxt();
            configuracionTxt.setPrincipalAdministrador(principalAdministrador);
            principalConfiguracion.setConfiguracionTxt(configuracionTxt);
            principalConfiguracion.setInterfacesGraficasEscritorioConfiguracion(this);
            
            principalAdministrador.getConfiguracion().show();
        }
        colorInterfazEscritorio();
        principalAdministrador.getConfiguracion().toFront();
        
    }
    
    @Override
    public void colorInterfazEscritorio() {
        principalAdministrador.getConfiguracion().getPanelPrincipalTop().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
    }
    
    @Deprecated
    @Override
    public void infoTextPrompt() {
    }
    
}
