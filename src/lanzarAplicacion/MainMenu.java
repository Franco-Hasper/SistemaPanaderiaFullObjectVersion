package lanzarAplicacion;

import clasesUtilidadGeneral.ApiDolar;
import operacionesConfiguracion.ConfiguracionTxt;
import operacionesCuenta.SaldoCuentaBajo;
import principal.PrincipalAdministrador;

/**
 * @author Hasper Franco
 */
public class MainMenu {

    public void ejecutar() {
        
        PrincipalAdministrador principalAdministrador = new PrincipalAdministrador();
        ConfiguracionTxt configuracion = new ConfiguracionTxt();
        configuracion.leerArchivoConfig();
        configuracion.setPrincipalAdministrador(principalAdministrador);
        configuracion.setTemaPrincipalAdministrador();
        principalAdministrador.setVisible(true);

        try {
            new ApiDolar().precioDolarOficial(principalAdministrador);
            try {
                Thread.sleep(3);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        new SaldoCuentaBajo().ejecutar(configuracion.getSaldoCuenta());
    }

}
