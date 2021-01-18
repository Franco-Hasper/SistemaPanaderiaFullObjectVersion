package operacionesGasto;

import calsesPadre.InterfazGraficaFormularioEditar;
import escritorios.PrincipalGastos;
import formularios.FormularioEditarCliente;
import formularios.FormularioEditarGasto;
import java.util.Date;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarGasto extends InterfazGraficaFormularioEditar {

    protected PrincipalGastos principalGastos;
    protected TablaGastos tablaGastos;

    public PrincipalGastos getPrincipalGastos() {
        return principalGastos;
    }

    public void setPrincipalGastos(PrincipalGastos principalGastos) {
        this.principalGastos = principalGastos;
    }

    public TablaGastos getTablaGastos() {
        return tablaGastos;
    }

    public void setTablaGastos(TablaGastos tablaGastos) {
        this.tablaGastos = tablaGastos;
    }

    @Override
    public void nuevoFormularioEditar() {
        FormularioEditarGasto formularioEditar = new FormularioEditarGasto(frame, true);
        formularioEditar.setPrincipalGastos(principalGastos);
        principalGastos.setEditarGasto(formularioEditar);
        transferirDatos();
        colorTema();
        principalGastos.getEditarGasto().setVisible(true);
    }

    @Override
    public void colorTema() {
        principalGastos.getEditarGasto().getPanelPrincipalTop().setBackground(principalGastos.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
      //  new TablaGastos().setPrincipalGastos(principalGastos);
        int fila = principalGastos.getTablaGrafica().getSelectedRow();
        principalGastos.getEditarGasto().getTxtDescripcion().setText(principalGastos.getTablaGrafica().getValueAt(fila, 0).toString());
        principalGastos.getEditarGasto().getTxtTotalGastado().setText(principalGastos.getTablaGrafica().getValueAt(fila, 1).toString());
    }

    @Deprecated
    @Override
    public void agregarBoxes() {
       
    }

    @Deprecated
    @Override
    public void rellenarBoxes() {
        
    }

}
