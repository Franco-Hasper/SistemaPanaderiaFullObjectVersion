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

    /**
     * Crea y ejecuta un hilo con una instancia de la clase TareaVentana y otro
     * con una instancia de la clase Treacargando.
     */
    public void ejecutarNuevaVentana() {
        ExecutorService exe = Executors.newFixedThreadPool(2);
        //exe.execute(new TareaCargando());

        exe.execute(new TareaVentana());

    }

    /**
     * implemnta el metodo nuevaVentana dentro del metodo run, leugo finaliza la
     * instancia del dialog cargar.
     */
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

    /**
     * Crea una instancia de dialog Cargar.
     */
    public void nuevoDialogCargando() {
        // if (principalAdministrador.estacerrado(principalAdministrador.getInstancias().getCargar())) {
        Cargar c = new Cargar(null, true);
        principalAdministrador.instancias.setCargar(c);
        principalAdministrador.instancias.getCargar().ejecutatDialogCargar();
        c.dispose();
        //}
    }

    /**
     * Implemnta el metodo nuevoDialogCargando dentro del metodo run.
     */
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
