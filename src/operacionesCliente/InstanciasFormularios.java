package operacionesCliente;

import formularios.FormularioEditarCliente;
import formularios.FormularioRegistrarCliente;

/**
 * @author Hasper Franco
 */
public class InstanciasFormularios {

    private FormularioRegistrarCliente registrarCliente;
    private FormularioEditarCliente editarCliente;

    public InstanciasFormularios() {
        this.registrarCliente = null;
        this.editarCliente = null;
    }

    public FormularioRegistrarCliente getRegistrarCliente() {
        return registrarCliente;
    }

    public void setRegistrarCliente(FormularioRegistrarCliente registrarCliente) {
        this.registrarCliente = registrarCliente;
    }

    public FormularioEditarCliente getEditarCliente() {
        return editarCliente;
    }

    public void setEditarCliente(FormularioEditarCliente editarCliente) {
        this.editarCliente = editarCliente;
    }
    
    
    
}
