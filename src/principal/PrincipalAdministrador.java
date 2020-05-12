package principal;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import operacionesCliente.InterfazGraficaEscritorioCliente;

/**
 *
 * @author TELCOM MPC
 */
public class PrincipalAdministrador extends javax.swing.JFrame {

    public PrincipalAdministrador() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.btnConfiguracion.setEnabled(false);
        this.btnGestionFinanzas.setEnabled(false);
        this.btnGestionGastos.setEnabled(false);
        this.btnGestionMateriPrima.setEnabled(false);
        this.btnGestionProducto.setEnabled(false);
        this.btnGestionProveedor.setEnabled(false);
        this.btnGestionVentas.setEnabled(false);
    }
    
    
    public InstanciaEscritorio instancias=new InstanciaEscritorio();
    

    private InterfazGraficaEscritorioCliente interfazGraficaCliente=new InterfazGraficaEscritorioCliente();
       
    
    private boolean minimiza = false;
    public boolean cerra = false;


    public boolean estacerrado(Object obj) {
        JInternalFrame[] activos = getEscritorio().getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
                cerra = false;
            }
            i++;
        }
        return cerrado;
    }

    public Escritorio getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(Escritorio escritorio) {
        this.escritorio = escritorio;
    }

   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        panelPrincipalTop = new javax.swing.JPanel();
        lblLibre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelPrincipalBody = new javax.swing.JPanel();
        btnGestionVentas = new principal.MaterialButtomRectangle();
        btnGestionMateriPrima = new principal.MaterialButtomRectangle();
        btnGestionProducto = new principal.MaterialButtomRectangle();
        btnGestionProveedor = new principal.MaterialButtomRectangle();
        btnGestionCliente = new principal.MaterialButtomRectangle();
        btnGestionFinanzas = new principal.MaterialButtomRectangle();
        btnGestionGastos = new principal.MaterialButtomRectangle();
        btnConfiguracion = new principal.MaterialButtomRectangle();
        escritorio = new principal.Escritorio();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBase.setBackground(new java.awt.Color(255, 255, 255));

        panelPrincipalTop.setBackground(new java.awt.Color(142, 131, 54));

        lblLibre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VENTA DOLAR LIBRE:");

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelPrincipalBody.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipalBody.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));

        btnGestionVentas.setBackground(new java.awt.Color(177, 159, 65));
        btnGestionVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionVentas.setText("VENTAS y PEDIDOS");
        btnGestionFinanzas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnGestionMateriPrima.setBackground(new java.awt.Color(177, 159, 65));
        btnGestionMateriPrima.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionMateriPrima.setText("GESTIONAR MATERIA PRIMA");
        btnGestionMateriPrima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnGestionProducto.setBackground(new java.awt.Color(177, 159, 65));
        btnGestionProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionProducto.setText("GESTION DE PRODUCTO");
        btnGestionProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnGestionProveedor.setBackground(new java.awt.Color(177, 159, 65));
        btnGestionProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionProveedor.setText("GESTION DE PROVEEDOR");
        btnGestionProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnGestionCliente.setBackground(new java.awt.Color(177, 159, 65));
        btnGestionCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionCliente.setText("GESTION DE CLIENTE");
        btnGestionCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionClienteActionPerformed(evt);
            }
        });

        btnGestionFinanzas.setBackground(new java.awt.Color(177, 159, 65));
        btnGestionFinanzas.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionFinanzas.setText("CAJA");
        btnGestionFinanzas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnGestionGastos.setBackground(new java.awt.Color(177, 159, 65));
        btnGestionGastos.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionGastos.setText("GASTOS");
        btnGestionGastos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnConfiguracion.setBackground(new java.awt.Color(177, 159, 65));
        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setText("CONFIGURACION");
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelPrincipalBodyLayout = new javax.swing.GroupLayout(panelPrincipalBody);
        panelPrincipalBody.setLayout(panelPrincipalBodyLayout);
        panelPrincipalBodyLayout.setHorizontalGroup(
            panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalBodyLayout.createSequentialGroup()
                .addGroup(panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGestionVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(btnGestionFinanzas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(btnConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(btnGestionProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(btnGestionProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(btnGestionCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(btnGestionGastos, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(btnGestionMateriPrima, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalBodyLayout.setVerticalGroup(
            panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalBodyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnGestionMateriPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnGestionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnGestionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnGestionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnGestionGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnGestionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnGestionFinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addComponent(panelPrincipalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipalBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionClienteActionPerformed
        interfazGraficaCliente.setPrincipalAdministrador(this);
        interfazGraficaCliente.ejecutarNuevaVentana();
    }//GEN-LAST:event_btnGestionClienteActionPerformed

    public JPanel getPanelPrincipalBody() {
        return panelPrincipalBody;
    }

    public void setPanelPrincipalBody(JPanel panelPrincipalBody) {
        this.panelPrincipalBody = panelPrincipalBody;
    }

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }



    public MaterialButtomRectangle getBtnConfiguracion() {
        return btnConfiguracion;
    }

    public void setBtnConfiguracion(MaterialButtomRectangle btnConfiguracion) {
        this.btnConfiguracion = btnConfiguracion;
    }

    public MaterialButtomRectangle getBtnGestionCliente() {
        return btnGestionCliente;
    }

    public void setBtnGestionCliente(MaterialButtomRectangle btnGestionCliente) {
        this.btnGestionCliente = btnGestionCliente;
    }

    public MaterialButtomRectangle getBtnGestionFinanzas() {
        return btnGestionFinanzas;
    }

    public void setBtnGestionFinanzas(MaterialButtomRectangle btnGestionFinanzas) {
        this.btnGestionFinanzas = btnGestionFinanzas;
    }

    public MaterialButtomRectangle getBtnGestionMateriPrima() {
        return btnGestionMateriPrima;
    }

    public void setBtnGestionMateriPrima(MaterialButtomRectangle btnGestionMateriPrima) {
        this.btnGestionMateriPrima = btnGestionMateriPrima;
    }

    public MaterialButtomRectangle getBtnGestionPedidos() {
        return btnGestionVentas;
    }

    public void setBtnGestionPedidos(MaterialButtomRectangle btnGestionPedidos) {
        this.btnGestionVentas = btnGestionPedidos;
    }

    public MaterialButtomRectangle getBtnGestionGastos() {
        return btnGestionGastos;
    }

    public void setBtnGestionGastos(MaterialButtomRectangle btnGestionGastos) {
        this.btnGestionGastos = btnGestionGastos;
    }

    public MaterialButtomRectangle getBtnGestionProducto() {
        return btnGestionProducto;
    }

    public void setBtnGestionProducto(MaterialButtomRectangle btnGestionProducto) {
        this.btnGestionProducto = btnGestionProducto;
    }

    public MaterialButtomRectangle getBtnGestionProveedor() {
        return btnGestionProveedor;
    }

    public void setBtnGestionProveedor(MaterialButtomRectangle btnGestionProveedor) {
        this.btnGestionProveedor = btnGestionProveedor;
    }

    public JLabel getLblLibre() {
        return lblLibre;
    }

    public void setLblLibre(JLabel lblLibre) {
        this.lblLibre = lblLibre;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButtomRectangle btnConfiguracion;
    private principal.MaterialButtomRectangle btnGestionCliente;
    private principal.MaterialButtomRectangle btnGestionFinanzas;
    private principal.MaterialButtomRectangle btnGestionGastos;
    private principal.MaterialButtomRectangle btnGestionMateriPrima;
    private principal.MaterialButtomRectangle btnGestionProducto;
    private principal.MaterialButtomRectangle btnGestionProveedor;
    private principal.MaterialButtomRectangle btnGestionVentas;
    private principal.Escritorio escritorio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLibre;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelPrincipalBody;
    private javax.swing.JPanel panelPrincipalTop;
    // End of variables declaration//GEN-END:variables
}
