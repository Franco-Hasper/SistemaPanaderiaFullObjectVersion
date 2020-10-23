
package operacionesCliente;

import calsesPadre.ABM;
import entidades.Cliente;
import entidades.Direccion_Cliente;
import entidades.Estado;
import entidades.Localidad;
import entidades.Provincia;
import entidades.RazonSocial;
import entidades.TelefonoCliente;
import entidades.TipoCliente;
import entidades.TipoDomicilio;
import entidades.TipoTelefono;
import formularios.FormularioEditarCliente;
import formularios.FormularioRegistrarCliente;
import java.util.List;
import escritorios.PrincipalCliente;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class ABMCliente extends ABM {

   private  FormularioRegistrarCliente formularioRegistrarCliente;
   private  FormularioEditarCliente formularioEditarCliente;

    //se utiliza solo para eliminar
   private  PrincipalCliente principalCliente;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public FormularioRegistrarCliente getFormularioRegistrarCliente() {
        return formularioRegistrarCliente;
    }

    public void setFormularioRegistrarCliente(FormularioRegistrarCliente formularioRegistrarCliente) {
        this.formularioRegistrarCliente = formularioRegistrarCliente;
    }

    public FormularioEditarCliente getFormularioEditarCliente() {
        return formularioEditarCliente;
    }

    public void setFormularioEditarCliente(FormularioEditarCliente formularioEditarCliente) {
        this.formularioEditarCliente = formularioEditarCliente;
    }

    @Override
    public void obtenerFormularioRegistrar() {
        setFormularioRegistrar(this.getFormularioRegistrarCliente());
        setListaCampos(this.getFormularioRegistrarCliente().getListaCampos());
    }

    @Override
    public void obtenerFormularioEditar() {
        setFormularioEditar(this.getFormularioEditarCliente());
        setListaCampos(this.getFormularioEditarCliente().getListaCampos());
    }

    @Override
    public void transaccionRegistrar(Session miSesion) {

        Estado e = (Estado) miSesion.get(Estado.class, 1);
        Cliente c = new Cliente();
        c.setNombre(formularioRegistrarCliente.getTxtNombre().getText());
        c.setApellido(formularioRegistrarCliente.getTxtApellido().getText());

        if (formularioRegistrarCliente.getRadioButon().isSelected()) {

            RazonSocial rs = (RazonSocial) miSesion.get(RazonSocial.class, 1);

            c.setCodigoRazonSocial(rs);
        } else {
            RazonSocial rs = new RazonSocial();
            rs.setNombre(formularioRegistrarCliente.getTxtRazonSocial().getText());
            miSesion.save(rs);
            c.setCodigoRazonSocial(rs);
        }

        TipoCliente tc = (TipoCliente) miSesion.get(TipoCliente.class, 2);
        c.setCodigoTipoCliente(tc);

        c.setCodigoEstado(e);

        miSesion.save(c);

        TelefonoCliente tlc = new TelefonoCliente();

        tlc.setCodigoCliente(c);
        tlc.setNuemero(formularioRegistrarCliente.getTxtTelefono().getText());

        List<TipoTelefono> lista_tipotelefono
                = (List<TipoTelefono>) miSesion.createQuery("from TipoTelefono").list();
        for (TipoTelefono tt : lista_tipotelefono) {
            if (tt.getNombre().equals(formularioRegistrarCliente.getBoxTipoTelefono().getSelectedItem())) {
                tlc.setCodigoTipoTelefono(tt);
            }
        }
        miSesion.save(tlc);
        Direccion_Cliente dc = new Direccion_Cliente();

        List<TipoDomicilio> lista_tipodomicilio
                = (List<TipoDomicilio>) miSesion.createQuery("from TipoDomicilio").list();
        for (TipoDomicilio tdm : lista_tipodomicilio) {
            if (tdm.getNombre().equals(formularioRegistrarCliente.getBoxtipoDom().getSelectedItem())) {
                dc.setCodigoTipoDomicilio(tdm);
            }
        }

        dc.setCodigoCliente(c);
        dc.setNombre(formularioRegistrarCliente.getTxtDireccion().getText());
        dc.setNumero(Integer.parseInt(formularioRegistrarCliente.getTxtnuemroDireccion().getText()));

        List<Localidad> lista_Lc
                = (List<Localidad>) miSesion.createQuery("from Localidad").list();
        List<Provincia> lista_Pr
                = (List<Provincia>) miSesion.createQuery("from Provincia").list();

        for (Localidad lc : lista_Lc) {
            if (lc.getNombre().equals(formularioRegistrarCliente.getBoxLocalidad().getSelectedItem())) {
                dc.setCodigoLocalidad(lc);
                for (Provincia pr : lista_Pr) {
                    if (pr.getNombre().equals(formularioRegistrarCliente.getBoxProvincia().getSelectedItem())) {
                        lc.setCodigoProvincia(pr);
                    }
                }
            }
        }

        miSesion.save(dc);

    }

    @Override
    public void transaccionEditar(Session miSesion) {

        Integer totalFilas = principalCliente.getTablaGrafica().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGrafica().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaCliente().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Cliente c = (Cliente) miSesion.get(Cliente.class, id);

        c.setNombre(formularioEditarCliente.getTxtNombre().getText());

        c.setApellido(formularioEditarCliente.getTxtApellido().getText());

        if (formularioEditarCliente.getRadioButon().isSelected()) {
            RazonSocial rs = (RazonSocial) miSesion.get(RazonSocial.class, 1);
            c.setCodigoRazonSocial(rs);

        } else {
            if (c.getCodigoRazonSocial().getIdRazonSocial().equals(1)) {
                RazonSocial rs = new RazonSocial();
                rs.setNombre(formularioEditarCliente.getTxtRazonSocial().getText());
                miSesion.save(rs);
                c.setCodigoRazonSocial(rs);
            } else {
                RazonSocial rs = (RazonSocial) miSesion.get(RazonSocial.class, (c.getCodigoRazonSocial().getIdRazonSocial()));
                rs.setNombre(formularioEditarCliente.getTxtRazonSocial().getText());
                miSesion.saveOrUpdate(rs);
                c.setCodigoRazonSocial(rs);
            }

        }

        miSesion.saveOrUpdate(c);
    }

    @Override
    public void transaccionEliminar(Session miSesion) {
        Estado e = (Estado) miSesion.get(Estado.class, 2);
        Integer totalFilas = principalCliente.getTablaGrafica().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGrafica().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaCliente().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Cliente c = (Cliente) miSesion.get(Cliente.class, id);
        c.setCodigoEstado(e);
        miSesion.saveOrUpdate(c);
    }

}
