package calsesPadre;

import java.awt.Frame;

/**
 * @author Hasper Franco
 */
public abstract class InterfazGraficaFormularioEditar {

    protected Frame frame = new Frame();

    public abstract void nuevoFormularioEditar();

    protected abstract void infoTextPrompt();

    public abstract void colorTema();

    public abstract void transferirDatos();

}
