package calsesPadre;

import complementos.Cargar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import principal.PrincipalAdministrador;

/**
 * @author Hasper Franco
 */
public abstract class InterfazGraficaEscritorio {

    protected PrincipalAdministrador principalAdministrador;

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }

    public abstract void nuevaVentana();

    public abstract void infoTextPrompt();

    /**
     * Modifica el color de los elementos de la ventana segun el color de
     * PrincipalAdministador panel.
     */
    public abstract void colorInterfazEscritorio();

    public void ejecutarNuevaVentana() {
        ExecutorService exe = Executors.newFixedThreadPool(2);
        //exe.execute(new TareaCargando());
        System.out.println("aaaa");
        exe.execute(new TareaVentana());
        
    }

    public class TareaVentana implements Runnable {

        @Override
        public void run() {
            try {
                nuevaVentana();
//                principalAdministrador.getInstancias().getCargar().dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void nuevoDialogCargando() {
       // if (principalAdministrador.estacerrado(principalAdministrador.getInstancias().getCargar())) {
            Cargar c = new Cargar(null, true);
            principalAdministrador.instancias.setCargar(c);
            principalAdministrador.instancias.getCargar().ejecutatDialogCargar();
            c.dispose();
        //}
    }

    public class TareaCargando implements Runnable {

        @Override
        public void run() {
            try {
                nuevoDialogCargando();
            } catch (Exception ex) {
            }

        }
    }

}
