package calsesPadre;

import java.awt.Frame;

/**
 * @author Hasper Franco
 */
public abstract class InterfazGraficaFormularioRegistrar extends ItemsBox{

    protected Frame frame = new Frame();
    
    public abstract void nuevoFormularioRegistrar();
    
    protected abstract void infoTextPrompt();
    
    public abstract void colorTema();
    
    
}
