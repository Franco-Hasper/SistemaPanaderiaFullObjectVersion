package escritorios;

import clasesUtilidadGeneral.OperacionesUtiles;
import formularios.FormularioEditarCorte;
import formularios.FormularioRegistrarCorte;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import operacionesCaja.ABMCaja;
import operacionesCaja.InterfazGraficaFormularioEditarCorte;
import operacionesCaja.InterfazGraficaFormularioRegistrarCorte;
import operacionesCaja.TablaCaja;

/**
 *
 * @author TELCOM MPC
 */
public class PrincipalCaja extends javax.swing.JInternalFrame {

    /**
     * Creates new form PrincipalCaja
     */
    public PrincipalCaja() {
        initComponents();
        registrarCorte = null;
        editarCorte = null;
    }

    private InterfazGraficaFormularioRegistrarCorte formularioRegistrar;
    private InterfazGraficaFormularioEditarCorte formularioEditar;
    private FormularioRegistrarCorte registrarCorte;
    private FormularioEditarCorte editarCorte;
    private TablaCaja tablaCaja;
    private final ABMCaja abm = new ABMCaja();

    public InterfazGraficaFormularioRegistrarCorte getFormularioRegistrar() {
        return formularioRegistrar;
    }

    public void setFormularioRegistrar(InterfazGraficaFormularioRegistrarCorte formularioRegistrar) {
        this.formularioRegistrar = formularioRegistrar;
    }

    public InterfazGraficaFormularioEditarCorte getFormularioEditar() {
        return formularioEditar;
    }

    public void setFormularioEditar(InterfazGraficaFormularioEditarCorte formularioEditar) {
        this.formularioEditar = formularioEditar;
    }

    public FormularioRegistrarCorte getRegistrarCorte() {
        return registrarCorte;
    }

    public void setRegistrarCorte(FormularioRegistrarCorte registrarCorte) {
        this.registrarCorte = registrarCorte;
    }



    public FormularioEditarCorte getEditarCorte() {
        return editarCorte;
    }

    public void setEditarCorte(FormularioEditarCorte editarCorte) {
        this.editarCorte = editarCorte;
    }

    public TablaCaja getTablaCaja() {
        return tablaCaja;
    }

    public void setTablaCaja(TablaCaja tablaCaja) {
        this.tablaCaja = tablaCaja;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTable getTablaGrafica() {
        return tablaGrafica;
    }

    public void setTablaGrafica(JTable tablaGrafica) {
        this.tablaGrafica = tablaGrafica;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        panelPrincipalTop = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGrafica = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        btnCrearC = new principal.MaterialButton();
        txtBuscar = new javax.swing.JTextField();
        btnnEditarC = new principal.MaterialButton();
        btnEliminarC = new principal.MaterialButton();

        jRadioButton1.setText("jRadioButton1");

        panelPrincipalTop.setBackground(new java.awt.Color(204, 0, 0));

        tablaGrafica.setBackground(new java.awt.Color(255, 255, 255));
        tablaGrafica.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGrafica.setForeground(new java.awt.Color(102, 0, 0));
        tablaGrafica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INGRESOS", "EGRESOS", "BALANCE", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaGrafica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaGrafica.setDoubleBuffered(true);
        tablaGrafica.setRowHeight(40);
        tablaGrafica.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tablaGrafica.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGrafica.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaGrafica.getTableHeader().setReorderingAllowed(false);
        tablaGrafica.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tablaGraficaComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(tablaGrafica);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("HISTORIAL DE CORTES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cash_register_80px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CAJA");

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel_60px.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btnCrearC.setBackground(new java.awt.Color(0, 0, 0,60));
        btnCrearC.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearC.setText("NUEVO CORTE");
        btnCrearC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearC.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnCrearC.setMaximumSize(new java.awt.Dimension(240, 50));
        btnCrearC.setMinimumSize(new java.awt.Dimension(100, 50));
        btnCrearC.setPreferredSize(new java.awt.Dimension(240, 50));
        btnCrearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCActionPerformed(evt);
            }
        });

        txtBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));
        txtBuscar.setMaximumSize(new java.awt.Dimension(310, 50));
        txtBuscar.setMinimumSize(new java.awt.Dimension(100, 50));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnnEditarC.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnEditarC.setForeground(new java.awt.Color(255, 255, 255));
        btnnEditarC.setText("EDITAR CORTE");
        btnnEditarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnEditarC.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnEditarC.setMaximumSize(new java.awt.Dimension(240, 50));
        btnnEditarC.setMinimumSize(new java.awt.Dimension(100, 50));
        btnnEditarC.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnEditarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnEditarCActionPerformed(evt);
            }
        });

        btnEliminarC.setBackground(new java.awt.Color(0, 0, 0,60));
        btnEliminarC.setBorder(new javax.swing.border.MatteBorder(null));
        btnEliminarC.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarC.setText("ELIMINAR CORTE");
        btnEliminarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarC.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminarC.setMaximumSize(new java.awt.Dimension(240,50));
        btnEliminarC.setMinimumSize(new java.awt.Dimension(100, 50));
        btnEliminarC.setPreferredSize(new java.awt.Dimension(210, 50));
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnEditarC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnEditarC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCActionPerformed
        formularioRegistrar.setPrincipalCaja(this);
        formularioRegistrar.nuevoFormularioRegistrar();
    }//GEN-LAST:event_btnCrearCActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped

    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        tablaCaja.setPrincipalCaja(this);
        tablaCaja.ejecutarRellenarTabla();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void tablaGraficaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaGraficaComponentHidden

    }//GEN-LAST:event_tablaGraficaComponentHidden

    private void btnnEditarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnEditarCActionPerformed
        tablaCaja.setPrincipalCaja(this);
        if (tablaCaja.verificarFilaSeleccionada()) {

            InterfazGraficaFormularioEditarCorte formularioEditar = new InterfazGraficaFormularioEditarCorte();
            formularioEditar.setPrincipalCaja(this);
            formularioEditar.nuevoFormularioEditar();

        }

    }//GEN-LAST:event_btnnEditarCActionPerformed

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed
        abm.setPrincipalCaja(this);
        tablaCaja.setPrincipalCaja(this);
        if (tablaCaja.verificarFilaSeleccionada()) {
            if (OperacionesUtiles.mensajeEliminarRegistro()) {
                if (abm.ejecutarEliminar()) {
                    tablaCaja.setEstadoConsulta(0);
                    tablaCaja.ejecutarRellenarTabla();
                }
            }

        }

    }//GEN-LAST:event_btnEliminarCActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButton btnCrearC;
    private principal.MaterialButton btnEliminarC;
    private principal.MaterialButton btnnEditarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panelPrincipalTop;
    private javax.swing.JTable tablaGrafica;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
