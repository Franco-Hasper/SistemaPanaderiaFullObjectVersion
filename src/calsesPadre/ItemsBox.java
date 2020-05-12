package calsesPadre;

import clasesUtilidadGeneral.OperacionesUtiles;
import entidades.Localidad;
import entidades.Provincia;
import entidades.TipoDomicilio;
import entidades.TipoTelefono;
import java.util.List;
import javax.swing.JComboBox;

/**
 * @author Hasper Franco
 */
public abstract class ItemsBox extends Consultas {

    private final OperacionesUtiles operacionesUtilidad = new OperacionesUtiles();

    protected JComboBox boxProvincia;
    protected JComboBox boxLocalidad;
    protected JComboBox boxTipoDomicilio;
    protected JComboBox boxTipoTelefono;
    protected Integer estadoConsulta;

    public Integer getEstadoConsulta() {
        return estadoConsulta;
    }

    public void setEstadoConsulta(Integer estadoConsulta) {
        this.estadoConsulta = estadoConsulta;
    }

    public JComboBox getBoxProvincia() {
        return boxProvincia;
    }

    public void setBoxProvincia(JComboBox boxProvincia) {
        this.boxProvincia = boxProvincia;
    }

    public JComboBox getBoxLocalidad() {
        return boxLocalidad;
    }

    public void setBoxLocalidad(JComboBox boxLocalidad) {
        this.boxLocalidad = boxLocalidad;
    }

    public JComboBox getBoxTipoDomicilio() {
        return boxTipoDomicilio;
    }

    public void setBoxTipoDomicilio(JComboBox boxTipoDomicilio) {
        this.boxTipoDomicilio = boxTipoDomicilio;
    }

    public JComboBox getBoxTipoTelefono() {
        return boxTipoTelefono;
    }

    public void setBoxTipoTelefono(JComboBox boxTipoTelefono) {
        this.boxTipoTelefono = boxTipoTelefono;
    }

    /**
     * Se utiliza para insertar todos los boxes del formulario en un solo
     * metodo.
     */
    public abstract void agregarBoxes();

    /**
     * Se utiliza para implemntar varios consultaRellenar# en un solo metodo.
     */
    public abstract void rellenarBoxes();

    /**
     * Evalua el estado de la consulta para eviatar realizar una cada vez que se
     * seleccione un box provincia.
     */
    public void evaluarEstadoConsultaLocalidad() {
        switch (getEstadoConsulta()) {
            case 0:
                consultaRellenarLocalidad();
                break;
            case 1:
                consultaRellenarLocalidadSinBusqueda();
                break;
        }
    }

    /**
     * Genera la consulta, obtiene los resultados y ejecuta el metodo
     * rellenarBoxProvincia.
     */
    public void consultaRellenarProvincia() {
        setConsultaList("from Provincia");
        obtenerListaConsulta();
        rellenarBoxProvincia();
    }

    /**
     * Genera la consulta, obtiene los resultados y ejecuta el metodo
     * rellenarBoxLocalidad.
     */
    public void consultaRellenarLocalidad() {
        while (getBoxLocalidad().getItemCount() > 0) {
            getBoxLocalidad().removeAllItems();
        }
        setConsultaList("from Provincia");
        obtenerListaConsulta();
        rellenarBoxLocalidad();
    }

    /**
     * Se implementa en el caso de que la consulta ya haya sido realizada
     * previamente, ejecuta el metodo rellenarBoxLocalidad.
     */
    public void consultaRellenarLocalidadSinBusqueda() {
        while (getBoxLocalidad().getItemCount() > 0) {
            getBoxLocalidad().removeAllItems();
        }
        rellenarBoxLocalidad();
    }

    /**
     * Genera la consulta, obtiene los resultados y ejecuta el metodo
     * rellenarTipoDomicilio.
     */
    public void consultaRellenarTipoDomicilio() {
        setConsultaList("from TipoDomicilio");
        obtenerListaConsulta();
        rellenarTipoDomicilio();
    }

    /**
     * Genera la consulta, obtiene los resultados y ejecuta el metodo
     * rellenarTipoTelefono.
     */
    public void consultaRellenarTipoTelefono() {
        setConsultaList("from TipoTelefono");
        obtenerListaConsulta();
        rellenarTipoTelefono();

    }

    /**
     * Agrega Items obtenidos de la consulta al boxTipoTelefono
     */
    public void rellenarTipoTelefono() {
        List lista = this.getListaResultados();
        List<TipoTelefono> lista_TipoTelefono
                = (List<TipoTelefono>) lista;
        for (Object o : lista_TipoTelefono) {
            TipoTelefono t = (TipoTelefono) o;
            operacionesUtilidad.agregarItem(t.getNombre(), getBoxTipoTelefono());

        }

    }

    /**
     * Agrega Items obtenidos de la consulta al boxTipoDomicilio
     */
    public void rellenarTipoDomicilio() {
        List lista = this.getListaResultados();
        List<TipoDomicilio> lista_tipoDom
                = (List<TipoDomicilio>) lista;
        for (Object o : lista_tipoDom) {
            TipoDomicilio td = (TipoDomicilio) o;
            operacionesUtilidad.agregarItem(td.getNombre(), getBoxTipoDomicilio());

        }

    }

    /**
     * Agrega Items obtenidos de la consulta al boxProvincia.
     */
    public void rellenarBoxProvincia() {
        List lista = this.getListaResultados();
        List<Provincia> lista_provincia
                = (List<Provincia>) lista;
        for (Object o : lista_provincia) {
            Provincia p = (Provincia) o;
            operacionesUtilidad.agregarItem(p.getNombre(), getBoxProvincia());
        }

    }

    /**
     * Agrega Items obtenidos de la consulta al boxLocalidad dependiendo de la
     * provincia seleccionada.
     */
    public void rellenarBoxLocalidad() {
        List lista = this.getListaResultados();
        List<Provincia> lista_Provincias
                = (List<Provincia>) lista;
        for (Object o : lista_Provincias) {
            Provincia p = (Provincia) o;
            if (p.getNombre().equals(getBoxProvincia().getSelectedItem().toString())) {
                List<Localidad> localidades = p.getLocalidades();
                for (Localidad l : localidades) {
                    getBoxLocalidad().addItem(l.getNombre());
                }

            }

        }
        setEstadoConsulta(1);
    }

}
