package operacionesCliente;

import calsesPadre.InterfazGraficaEscritorio;
import escritorios.PrincipalCliente;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import clasesUtilidadGeneral.TextPrompt;

/**
 *
 * @author Hasper Franco
 */
public class InterfazGraficaEscritorioCliente extends InterfazGraficaEscritorio {

    protected PrincipalCliente principalCliente;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

   

    @Override
    public void nuevaVentana() {
        if (principalAdministrador.estacerrado(principalAdministrador.instancias.getCliente())) {
            PrincipalCliente principalCliente = new PrincipalCliente();
            principalAdministrador.instancias.setCliente(principalCliente);
            BasicInternalFrameTitlePane menupanel = (BasicInternalFrameTitlePane) ((BasicInternalFrameUI) principalCliente.getUI()).getNorthPane();
            int width = principalAdministrador.getEscritorio().getWidth();
            int Height = principalAdministrador.getEscritorio().getHeight();
            principalAdministrador.instancias.getCliente().remove(menupanel);
            principalAdministrador.instancias.getCliente().setSize(width, Height);
            principalAdministrador.getEscritorio().add(principalAdministrador.instancias.getCliente());
//            infoTextPrompt();
            TablaCliente tablaCliente = new TablaCliente();
            tablaCliente.setPrincipalCliente(principalCliente);
            tablaCliente.ejecutarRellenarTabla();
            principalAdministrador.instancias.getCliente().show();
        }
        colorInterfazEscritorio();
        principalAdministrador.instancias.getCliente().toFront();
    }

    @Override
    public void colorInterfazEscritorio() {
        principalAdministrador.instancias.getCliente().getPanelPrincipalTop().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.instancias.getCliente().getTabla().setForeground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.instancias.getCliente().getTabla().setSelectionBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("BUSCAR POR NOMBRE", principalCliente.getTxtBuscar());
        principalCliente.getTxtBuscar().grabFocus();
    }

    

    
}
