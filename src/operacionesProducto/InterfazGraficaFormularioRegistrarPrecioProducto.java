package operacionesProducto;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalProducto;
import formularios.FormularioRegistrarPrecioProducto;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarPrecioProducto extends InterfazGraficaFormularioRegistrar {

    private PrincipalProducto principalProducto;

    public PrincipalProducto getPrincipalProducto() {
        return principalProducto;
    }

    public void setPrincipalProducto(PrincipalProducto principalProducto) {
        this.principalProducto = principalProducto;
    }

    @Deprecated
    public void nuevoFormularioRegistrar() {
    }

    public void nuevoFormularioRegistrarPrecio() {
        FormularioRegistrarPrecioProducto formularioRegistrar = new FormularioRegistrarPrecioProducto(frame, true);
        formularioRegistrar.setPrincipalProducto(principalProducto);
        principalProducto.setRegistrarPrecioProducto(formularioRegistrar);
        agregarBoxes();
        rellenarBoxes();
        infoTextPrompt();
        colorTema();
        principalProducto.getRegistrarPrecioProducto().setVisible(true);
    }

    @Override
    protected void infoTextPrompt() {
        new TextPrompt("PRECIO BRUTO", principalProducto.getRegistrarPrecioProducto().getTxtPrecio());
        new TextPrompt("PRECIO FINAL", principalProducto.getRegistrarPrecioProducto().getTxtPrecioFinal());
        principalProducto.getRegistrarPrecioProducto().getTxtPrecio().grabFocus();
    }

    @Override
    public void colorTema() {
        principalProducto.getRegistrarPrecioProducto().getPanelPrincipalTop().setBackground(principalProducto.getPanelPrincipalTop().getBackground());
    }

    @Deprecated
    public void agregarBoxes() {
    }

    @Deprecated
    public void rellenarBoxes() {
    }

}
