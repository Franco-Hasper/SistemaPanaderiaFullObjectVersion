package operacionesProducto;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalProducto;
import formularios.FormularioRegistrarProducto;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarProducto extends InterfazGraficaFormularioRegistrar {

    private PrincipalProducto principalProducto;

    public PrincipalProducto getPrincipalProducto() {
        return principalProducto;
    }

    public void setPrincipalProducto(PrincipalProducto principalProducto) {
        this.principalProducto = principalProducto;
    }

    @Override
    public void nuevoFormularioRegistrar() {
        FormularioRegistrarProducto formularioRegistrar = new FormularioRegistrarProducto(frame, true);
        formularioRegistrar.setPrincipalProducto(principalProducto);
        principalProducto.setRegistrarProducto(formularioRegistrar);
        agregarBoxes();
        rellenarBoxes();
        infoTextPrompt();
        colorTema();
        principalProducto.getRegistrarProducto().setVisible(true);
    }

    @Override
    protected void infoTextPrompt() {
        new TextPrompt("NOMBRE", principalProducto.getRegistrarProducto().getTxtNombre());
        new TextPrompt("DESCRIPCION", principalProducto.getRegistrarProducto().getTxtDescripcion());
        new TextPrompt("PRECIO BRUTO", principalProducto.getRegistrarProducto().getTxtPrecio());
        new TextPrompt("PRECIO FINAL", principalProducto.getRegistrarProducto().getTxtPrecioFinal());
        principalProducto.getRegistrarProducto().getTxtNombre().grabFocus();
    }

    @Override
    public void colorTema() {
        principalProducto.getRegistrarProducto().getPanelPrincipalTop().setBackground(principalProducto.getPanelPrincipalTop().getBackground());
    }

    @Deprecated
    public void agregarBoxes() {
    }

    @Deprecated
    public void rellenarBoxes() {
    }

}
