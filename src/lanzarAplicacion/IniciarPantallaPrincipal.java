package lanzarAplicacion;

import clasesUtilidadGeneral.ApiDolar;
import operacionesConfiguracion.ConfiguracionTxt;
import principal.PrincipalAdministrador;

/**
 *
 * @author TELCOM MPC
 */
public class IniciarPantallaPrincipal {

    public static void main(String[] args) {
        new InicarAplicacion().run();
    }

    public static class InicarAplicacion implements Runnable {

        @Override
        public void run() {

            exceptionNativa();
            PrincipalAdministrador principalAdministrador = new PrincipalAdministrador();

            principalAdministrador.setVisible(true);

            ConfiguracionTxt configuracion = new ConfiguracionTxt();
            configuracion.leerArchivoConfig();
            configuracion.setPrincipalAdministrador(principalAdministrador);
            configuracion.setTema();

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
