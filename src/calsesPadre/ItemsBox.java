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

    public abstract void agregarBoxes();

    public abstract void rellenarBoxes();

    public void evaluarEstadoConsultaLocalidad() {
        switch (getEstadoConsulta()) {
            case 0:
                accionRellenarLocalidad();
                break;
            case 1:
                accionRellenarLocalidadSinBusqueda();
                break;
        }
    }

    public void accionRellenarProvincia() {
        setConsultaList("from Provincia");
        obtenerListaConsulta();
        rellenarBoxProvincia();
    }

    public void accionRellenarLocalidad() {
        while (getBoxLocalidad().getItemCount() > 0) {
            getBoxLocalidad().removeAllItems();
        }
        setConsultaList("from Provincia");
        obtenerListaConsulta();
        rellenarBoxLocalidad();
    }

    public void accionRellenarLocalidadSinBusqueda() {
        while (getBoxLocalidad().getItemCount() > 0) {
            getBoxLocalidad().removeAllItems();
        }
        rellenarBoxLocalidad();
    }

    public void accionRellenarTipoDomicilio() {
        setConsultaList("from TipoDomicilio");
        obtenerListaConsulta();
        rellenarTipoDomicilio();
    }

    public void accionRellenarTipoTelefono() {
        setConsultaList("from TipoTelefono");
        obtenerListaConsulta();
        rellenarTipoTelefono();

    }

    public void rellenarTipoTelefono() {
        List lista = this.getListaResultados();
        List<TipoTelefono> lista_TipoTelefono
                = (List<TipoTelefono>) lista;
        for (Object o : lista_TipoTelefono) {
            TipoTelefono t = (TipoTelefono) o;
            operacionesUtilidad.agregarItem(t.getNombre(), getBoxTipoTelefono());

        }

    }

    public void rellenarTipoDomicilio() {
        List lista = this.getListaResultados();
        List<TipoDomicilio> lista_tipoDom
                = (List<TipoDomicilio>) lista;
        for (Object o : lista_tipoDom) {
            TipoDomicilio td = (TipoDomicilio) o;
            operacionesUtilidad.agregarItem(td.getNombre(), getBoxTipoDomicilio());

        }

    }

    public void rellenarBoxProvincia() {
        List lista = this.getListaResultados();
        List<Provincia> lista_provincia
                = (List<Provincia>) lista;
        for (Object o : lista_provincia) {
            Provincia p = (Provincia) o;
            operacionesUtilidad.agregarItem(p.getNombre(), getBoxProvincia());
        }

    }

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
