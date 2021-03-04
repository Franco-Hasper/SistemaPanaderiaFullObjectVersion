package lanzarAplicacion;

import clasesUtilidadGeneral.ApiDolar;
import operacionesConfiguracion.ConfiguracionTxt;
import operacionesCuenta.SaldoCuentaBajo;
import operacionesLogin.InterfazGraficaLogin;
import principal.PrincipalAdministrador;

/**
 *
 * @author TELCOM MPC
 */
public class Iniciar {

    public static void main(String[] args) {
        new InicarAplicacion().run();
    }

    public static class InicarAplicacion implements Runnable {

        @Override
        public void run() {
            exceptionNativa();
            
            InterfazGraficaLogin login=new InterfazGraficaLogin();
            
            login.ejecutar();
            
        }

        private void exceptionNativa() {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }

    }

}
