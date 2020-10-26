package formularios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import operacionesGasto.ABMGasto;
import clasesUtilidadGeneral.OperacionesUtiles;
import escritorios.PrincipalGastos;
import rojeru_san.componentes.RSDateChooser;

/**
 *
 * @author TELCOM MPC
 */
public class FormularioRegistrarGasto extends javax.swing.JDialog {

    public FormularioRegistrarGasto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private final ABMGasto abm = new ABMGasto();
    private PrincipalGastos principalGastos;

    public PrincipalGastos getPrincipalGastos() {
        return principalGastos;
    }

    public void setPrincipalGastos(PrincipalGastos principalGastos) {
        this.principalGastos = principalGastos;
    }

    public JEditorPane getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(JEditorPane txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public JTextField getTxtTotlaGasatado() {
        return txtTotlaGasatado;
    }

    public void setTxtTotlaGasatado(JTextField txtTotlaGasatado) {
        this.txtTotlaGasatado = txtTotlaGasatado;
    }

    public RSDateChooser getrSDateChooser() {
        return rSDateChooser;
    }

    public void setrSDateChooser(RSDateChooser rSDateChooser) {
        this.rSDateChooser = rSDateChooser;
    }

    public List getListaCampos() {
        List listCamposTexto = new ArrayList();
        listCamposTexto.add(this.getTxtTotlaGasatado());
        return listCamposTexto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelPrincipalTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PanelIngresoMateriaPrima = new javax.swing.JPanel();
        rSDateChooser = new rojeru_san.componentes.RSDateChooser();
        txtTotlaGasatado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JEditorPane();
        radioButtonFecha = new javax.swing.JRadioButton();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        btnCancelar = new principal.MaterialButton();
        btnRegistrar = new principal.MaterialButton();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), java.awt.Color.gray, new java.awt.Color(102, 102, 102), java.awt.Color.gray));

        panelPrincipalTop.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGITRAR GASTO");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new_copy_70px.png"))); // NOI18N

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        PanelIngresoMateriaPrima.setBackground(new java.awt.Color(255, 255, 255));
        PanelIngresoMateriaPrima.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelIngresoMateriaPrimaMouseDragged(evt);
            }
        });

        txtTotlaGasatado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));
        txtTotlaGasatado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotlaGasatadoActionPerformed(evt);
            }
        });
        txtTotlaGasatado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotlaGasatadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotlaGasatadoKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(txtDescripcion);

        radioButtonFecha.setText("FECHA ACTUAL");
        radioButtonFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonFechaActionPerformed(evt);
            }
        });

        filler22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0,60));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnCancelar.setPreferredSize(new java.awt.Dimension(70, 50));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0,60));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnRegistrar.setMaximumSize(new java.awt.Dimension(170, 35));
        btnRegistrar.setMinimumSize(new java.awt.Dimension(170, 35));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        filler23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        filler24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        filler26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        filler27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        filler28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout PanelIngresoMateriaPrimaLayout = new javax.swing.GroupLayout(PanelIngresoMateriaPrima);
        PanelIngresoMateriaPrima.setLayout(PanelIngresoMateriaPrimaLayout);
        PanelIngresoMateriaPrimaLayout.setHorizontalGroup(
            PanelIngresoMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresoMateriaPrimaLayout.createSequentialGroup()
                .addGroup(PanelIngresoMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelIngresoMateriaPrimaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filler22, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelIngresoMateriaPrimaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PanelIngresoMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIngresoMateriaPrimaLayout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(filler24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIngresoMateriaPrimaLayout.createSequentialGroup()
                                .addGroup(PanelIngresoMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(filler23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioButtonFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rSDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(filler26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTotlaGasatado)
                                    .addComponent(filler27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(filler28, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelIngresoMateriaPrimaLayout.setVerticalGroup(
            PanelIngresoMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIngresoMateriaPrimaLayout.createSequentialGroup()
                .addComponent(filler28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotlaGasatado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelIngresoMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelIngresoMateriaPrima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelPrincipalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelIngresoMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelIngresoMateriaPrimaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelIngresoMateriaPrimaMouseDragged

    }//GEN-LAST:event_PanelIngresoMateriaPrimaMouseDragged

    private void txtTotlaGasatadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotlaGasatadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotlaGasatadoActionPerformed

    private void txtTotlaGasatadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotlaGasatadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotlaGasatadoKeyReleased

    private void txtTotlaGasatadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotlaGasatadoKeyTyped
        if (new OperacionesUtiles().advertenciaNum(evt)) {
            OperacionesUtiles.borrarCampo(txtTotlaGasatado);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotlaGasatadoKeyTyped

    private void radioButtonFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonFechaActionPerformed

        if (radioButtonFecha.isSelected()) {
            OperacionesUtiles.insertarFechaActualDateChooser(rSDateChooser);
        } else {
            rSDateChooser.setDatoFecha(null);
        }
    }//GEN-LAST:event_radioButtonFechaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        OperacionesUtiles.mensajeCancelarFormulario(this);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        abm.setFormularioRegistrarGasto(this);
        if (abm.ejecutarRegistrar()) {
            principalGastos.getTablaGasto().setPrincipalGastos(principalGastos);
            principalGastos.getTablaGasto().setEstadoConsulta(0);
            principalGastos.getTablaGasto().ejecutarRellenarTabla();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioRegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioRegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioRegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioRegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioRegistrarGasto dialog = new FormularioRegistrarGasto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelIngresoMateriaPrima;
    public static principal.MaterialButton btnCancelar;
    public static principal.MaterialButton btnRegistrar;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler26;
    private javax.swing.Box.Filler filler27;
    private javax.swing.Box.Filler filler28;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipalTop;
    private rojeru_san.componentes.RSDateChooser rSDateChooser;
    private javax.swing.JRadioButton radioButtonFecha;
    private javax.swing.JEditorPane txtDescripcion;
    private javax.swing.JTextField txtTotlaGasatado;
    // End of variables declaration//GEN-END:variables
}