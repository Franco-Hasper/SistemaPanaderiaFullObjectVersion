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
import javax.swing.JOptionPane;
import lanzarAplicacion.InterfazGraficaPrincipal;

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

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
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
        setTabla(principalCliente.getTabla());
        setStringConsulta("from Cliente");
        evaluarEstadoConsulta();
        setCampoTexto(principalCliente.getTxtBuscar());
        rellenarTabla(getCampoTexto().getText());
    }

    @Override
    public Integer obtenerIdFilaSeleccionada() {
        setTabla(tabla);
        setConsultaList("from Cliente");
        obtenerListaConsulta();
        buscarCopiaEnBaseDeDatos();
        return idTabla;
    }

    @Override
    public void rellenarTabla(String valorBusqueda) {
        DefaultTableModel tablaCliente = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();
        operacionesUtilidad.removerFilas(tablaCliente);
        Integer vueltaDir = 0;
        Integer vueltaTel = 0;
        for (Object o : lista) {
            Cliente c = (Cliente) o;
            Vector<Object> fila = new Vector<>();

            boolean resultadoComparacion = OperacionesUtiles.convertirResultado(c.getNombre(), valorBusqueda);
            //***********************
            if (c.getCodigoEstado().getIdEstado().equals(1) && resultadoComparacion) {
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
    }

    /**
     * Compara los valores de una fila seleccionada en la tabla de
     * PrincipalCliente con los resultados obtenidos de la base datos, si estos
     * coinciden guarda el resultado en la variable idCliente.
     */
    @Override
    public void buscarCopiaEnBaseDeDatos() {

        int fila = principalCliente.getTabla().getSelectedRow();
        String nombreCliente = principalCliente.getTabla().getValueAt(fila, 0).toString();
        String apellido = principalCliente.getTabla().getValueAt(fila, 1).toString();
        String razonSocial = principalCliente.getTabla().getValueAt(fila, 2).toString();

        for (Object o : getListaResultados()) {
            //asignamos todos los resultados a m
            Cliente c = (Cliente) o;
            if (c.getNombre().equals(nombreCliente)
                    && c.getApellido().equals(apellido)
                    && c.getCodigoRazonSocial().getNombre().equals(razonSocial)) {
                this.setIdTabla(c.getIdCliente());
            }
        }
    }

    @Override
    public boolean verificarFilaSeleccionada() {
        try {
            int fila = principalCliente.getTabla().getSelectedRow();
            principalCliente.getTabla().getValueAt(fila, 0).toString();
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
