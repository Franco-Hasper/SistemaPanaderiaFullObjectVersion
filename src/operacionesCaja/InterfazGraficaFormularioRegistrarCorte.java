package operacionesCaja;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import escritorios.PrincipalCaja;
import formularios.FormularioRegistrarCorte;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarCorte extends InterfazGraficaFormularioRegistrar {
    
    public InterfazGraficaFormularioRegistrarCorte() {
        setEstadoConsulta(0);
    }
    
    private PrincipalCaja principalCaja;
    
    public PrincipalCaja getPrincipalCaja() {
        return principalCaja;
    }
    
    public void setPrincipalCaja(PrincipalCaja principalCaja) {
        this.principalCaja = principalCaja;
    }
    
    @Override
    public void nuevoFormularioRegistrar() {
        FormularioRegistrarCorte formularioRegistrar = new FormularioRegistrarCorte(frame, true);
        formularioRegistrar.setPrincipalCaja(principalCaja);
        principalCaja.setRegistrarCorte(formularioRegistrar);
        colorTema();
        valoresIniciales();
        new TablaGastos().ejecutarRellenarTabla(formularioRegistrar);
        new TablaVentas().ejecutarRellenarTabla(formularioRegistrar);
        new OperacionesSecundariasCaja().calcularTotalVentas(formularioRegistrar);
        new OperacionesSecundariasCaja().calcularTotalGastos(formularioRegistrar);
        new OperacionesSecundariasCaja().calcularBalance(formularioRegistrar);
        principalCaja.getRegistrarCorte().setVisible(true);
        
    }
    
    @Override
    public void colorTema() {
        principalCaja.getRegistrarCorte().getPanelPrincipalTop().setBackground(principalCaja.getPanelPrincipalTop().getBackground());
    }
    
    private void valoresIniciales() {
        principalCaja.getRegistrarCorte().getTxtTotalVentas().setText("0");
        principalCaja.getRegistrarCorte().getTxtTotalGastos().setText("0");
        principalCaja.getRegistrarCorte().getTxtBalance().setText("0");
    }
    
    @Deprecated
    @Override
    protected void infoTextPrompt() {
    }
    
    @Deprecated
    @Override
    public void agregarBoxes() {
        
    }
    
    @Deprecated
    @Override
    public void rellenarBoxes() {
        
    }
    
}
