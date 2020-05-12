package calsesPadre;

import clasesUtilidadGeneral.OperacionesUtiles;
import conexion.ConexionHibernate;
import ds.desktop.notify.DesktopNotify;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public abstract class ABM extends Consultas {

    protected OperacionesUtiles operacionesUtilidad = new OperacionesUtiles();
    protected JOptionPane jOptionPane = new JOptionPane();
    protected JDialog formularioRegistrar;
    protected JDialog formularioEditar;
    protected List listaCampos;

    public JDialog getFormularioRegistrar() {
        return formularioRegistrar;
    }

    public void setFormularioRegistrar(JDialog formularioRegistrar) {
        this.formularioRegistrar = formularioRegistrar;
    }

    public JDialog getFormularioEditar() {
        return formularioEditar;
    }

    public void setFormularioEditar(JDialog formularioEditar) {
        this.formularioEditar = formularioEditar;
    }

    public List getListaCampos() {
        return listaCampos;
    }

    public void setListaCampos(List listaCampos) {
        this.listaCampos = listaCampos;
    }

    
    //desde el abm hijo obtenemos el formulario correspondiente este varia pero aqui usamos getfomulario.dispose
    ///entonces en hijo debemos tener otro formulario pero no es jdialog...sino que una clase de formulario especifica...aqui usamos
    //jfialog par ale dipose...por eso transeferimos de la clase hijo a esta clase el formulario para usar el dispose del jdialog
    public abstract void obtenerFormularioRegistrar();
    public abstract void obtenerFormularioEditar();
    
    public boolean ejecutarRegistrar() {
        obtenerFormularioRegistrar();
        if (operacionesUtilidad.verificarCamposTextoVacios(getListaCampos())) {
            conexionTransaccionRegistrar();
            getFormularioRegistrar().dispose();
            return true;
        }
        return false;
    }

    public boolean ejecutarEditar() {
        obtenerFormularioEditar();
        if (operacionesUtilidad.verificarCamposTextoVacios(getListaCampos())) {
            conexionTransaccionEditar();
            getFormularioEditar().dispose();
            return true;
        }
        return false;
    }

    public boolean ejecutarEliminar() {
        conexionTransaccionEliminar();
        return true;
    }

    public void conexionTransaccionRegistrar() {
        Session miSesion = ConexionHibernate.tomarConexion();
        try {
            miSesion.beginTransaction();
            transaccionRegistrar(miSesion);
            miSesion.getTransaction().commit();
            DesktopNotify.showDesktopMessage("   exito   ", "   Nuevo registro creado con exito", DesktopNotify.SUCCESS, 7000);
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("   error    ", "   Error al intentar crear  registro", DesktopNotify.ERROR, 7000);
        }
    }

    public void conexionTransaccionEditar() {
        Session miSesion = ConexionHibernate.tomarConexion();
        try {
            miSesion.beginTransaction();
            transaccionEditar(miSesion);
            miSesion.getTransaction().commit();
            DesktopNotify.showDesktopMessage("   exito   ", "    Registro editado con exito", DesktopNotify.SUCCESS, 7000);
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("   error   ", "   Error al intentar editar  registro", DesktopNotify.ERROR, 7000);
        }
    }

    public void conexionTransaccionEliminar() {
        Session miSesion = ConexionHibernate.tomarConexion();
        try {
            miSesion.beginTransaction();
            transaccionEliminar(miSesion);
            miSesion.getTransaction().commit();
            DesktopNotify.showDesktopMessage("   exito   ", "    Registro eliminado con exito", DesktopNotify.SUCCESS, 7000);
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("   error    ", "    Error al intentar eliminar  registro", DesktopNotify.ERROR, 7000);
        }

    }

    public abstract void transaccionRegistrar(Session miSesion);

    public abstract void transaccionEditar(Session miSesion);

    public abstract void transaccionEliminar(Session miSesion);

}
