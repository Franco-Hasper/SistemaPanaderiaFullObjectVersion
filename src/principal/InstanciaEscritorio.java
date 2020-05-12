package principal;

import complementos.Cargar;
import escritorios.PrincipalCliente;

/**
 * @author Hasper Franco
 */
public class InstanciaEscritorio {

    private PrincipalCliente cliente;

    private Cargar cargar;

    public InstanciaEscritorio() {

        this.cliente = null;
        this.cargar=null;
    }

    public PrincipalCliente getCliente() {
        return cliente;
    }

    public void setCliente(PrincipalCliente cliente) {
        this.cliente = cliente;
    }

    public Cargar getCargar() {
        return cargar;
    }

    public void setCargar(Cargar cargar) {
        this.cargar = cargar;
    }

    
    
}
