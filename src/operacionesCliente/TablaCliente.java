package operacionesCliente;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import calsesPadre.Tabla;
import entidades.Cliente;
import entidades.Direccion_Cliente;
import entidades.TelefonoCliente;
import escritorios.PrincipalCliente;
import clasesUtilidadGeneral.OperacionesUtiles;
import conexion.ConexionHibernate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 * <h1>Clase TablaMatetiaPrima</h1>
 * Contiene atributos y metodos que se encargan de manejar operaciones
 * relaacionadas con JTable de la interfaz grafica materia prima
 *
 * @author Hasper Franco
 * @version 0.1
 * @since 2020-01-15
 */
public class TablaCliente extends Tabla {

    private PrincipalCliente principalCliente;
    private List<Integer> listaResutladosActuales = new ArrayList<Integer>();

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public List<Integer> getListaResutladosActuales() {
        return listaResutladosActuales;
    }

    public void setListaResutladosActuales(List<Integer> listaResutladosActuales) {
        this.listaResutladosActuales = listaResutladosActuales;
    }

    public TablaCliente() {
        setEstadoConsulta(0);
    }

    /**
     * Ejecuata los metodos necesarios para rellenar la tabla de la ventana
     * PrincipalCliente.
     *
     * @param p
     */
    @Override
    public void ejecutarRellenarTabla() {
        setTabla(principalCliente.getTablaGrafica());
        setStringConsulta("from Cliente");
        evaluarEstadoConsulta();
        setCampoTexto(principalCliente.getTxtBuscar());
        rellenarTabla(getCampoTexto().getText());
    }

    @Override
    public Integer obtenerIdFilaSeleccionada() {
        Session miSesion = ConexionHibernate.tomarConexion();
        try {
            Integer totalFilas = principalCliente.getTablaGrafica().getRowCount();
            Integer filasSeleccionada = principalCliente.getTablaGrafica().getSelectedRow();
            List<Integer> listaResutadosActualesThis = principalCliente.getTablaCliente().getListaResutladosActuales();
            Integer id = operacionesUtilidad.obtenerId(listaResutadosActualesThis, totalFilas, filasSeleccionada);
            miSesion.beginTransaction();
            Cliente c = (Cliente) miSesion.get(Cliente.class, id);
            miSesion.getTransaction().commit();
            this.setIdTabla(c.getIdCliente());
        } catch (Exception e) {
        }
        return idTabla;
    }

    @Override
    public void rellenarTabla(String valorBusqueda) {
        OperacionesUtiles utilidad = new OperacionesUtiles();
        DefaultTableModel tablaCliente = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();
        operacionesUtilidad.removerFilas(tablaCliente);
        Integer vueltaDir = 0;
        Integer vueltaTel = 0;
        
          try {
            this.listaResutladosActuales.clear();
        } catch (NullPointerException e) {
        }
        
        for (Object o : lista) {
            Cliente c = (Cliente) o;
            Vector<Object> fila = new Vector<>();

            boolean resultadoComparacion = OperacionesUtiles.convertirResultado(c.getNombre(), valorBusqueda);
            //***********************
            if (c.getCodigoEstado().getIdEstado().equals(1) && resultadoComparacion) {
                this.listaResutladosActuales.add(0, c.getIdCliente());
                fila.add(c.getNombre());
                fila.add(c.getApellido());
                fila.add(c.getCodigoRazonSocial().getNombre());
                List<Direccion_Cliente> direcciones = c.getDireccionesclientes();
                List<TelefonoCliente> telefonos = c.getTelefonos();
                if (c.getDireccionesclientes().size() == 0) {
                    fila.add("sin registros");
                    fila.add("sin registros");
                    fila.add("sin registros");
                    fila.add("sin registros");
                } else {
                    for (Direccion_Cliente drCl : direcciones) {
                        if (vueltaDir != 1) {
                            fila.add(drCl.getNombre());
                            fila.add(drCl.getNumero());
                            fila.add(drCl.getCodigoLocalidad().getNombre());
                            fila.add(drCl.getCodigoLocalidad().getCodigoProvincia().getNombre());
                            vueltaDir = 1;
                        }
                    }
                }
                if (c.getTelefonos().size() == 0) {
                    fila.add("sin registros");
                    fila.add("sin registros");
                } else {
                    for (TelefonoCliente tlcl : telefonos) {
                        if (vueltaTel != 1) {
                            fila.add(tlcl.getNuemero());
                            fila.add(tlcl.getCodigoTipoTelefono().getNombre());
                            vueltaTel = 1;
                        }
                    }
                }

                vueltaDir = 0;
                vueltaTel = 0;

                tablaCliente.addRow(fila);

            }
        }
         utilidad.ordenarLista(listaResutladosActuales);
    }

    /**
     * Compara los valores de una fila seleccionada en la tabla de
     * PrincipalCliente con los resultados obtenidos de la base datos, si estos
     * coinciden guarda el resultado en la variable idCliente.
     */
    @Override
    public void buscarCopiaEnBaseDeDatos() {

//        int fila = principalCliente.getTablaGrafica().getSelectedRow();
//        String nombreCliente = principalCliente.getTablaGrafica().getValueAt(fila, 0).toString();
//        String apellido = principalCliente.getTablaGrafica().getValueAt(fila, 1).toString();
//        String razonSocial = principalCliente.getTablaGrafica().getValueAt(fila, 2).toString();
//
//        for (Object o : getListaResultados()) {
//            //asignamos todos los resultados a m
//            Cliente c = (Cliente) o;
//            if (c.getNombre().equals(nombreCliente)
//                    && c.getApellido().equals(apellido)
//                    && c.getCodigoRazonSocial().getNombre().equals(razonSocial)) {
//                this.setIdTabla(c.getIdCliente());
//            }
//        }
    }

    @Override
    public boolean verificarFilaSeleccionada() {
        try {
            int fila = principalCliente.getTablaGrafica().getSelectedRow();
            principalCliente.getTablaGrafica().getValueAt(fila, 0).toString();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public boolean verficarClienteNoconsumidorFinal(Integer botonSeleccionado) {
        if (obtenerIdFilaSeleccionada().equals(1)) {
            switch (botonSeleccionado) {
                case 1:
                    JOptionPane.showMessageDialog(null, "No se puede eliminar ni editar 'Consumidor Final' ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    return false;
                case 2:
                    JOptionPane.showMessageDialog(null, "El cliente 'Consumidor Final' no puede abrir una cuenta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    return false;
            }
            return false;
        } else {
            return true;
        }
    }

    /**
     * @deprecated
     */
    @Override
    public void rellenarTabla() {

    }

}
