package escritorios;

import clasesUtilidadGeneral.OperacionesUtiles;
import formularios.FormularioEditarProducto;
import formularios.FormularioRegistrarPrecioProducto;
import formularios.FormularioRegistrarProducto;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import operacionesProducto.ABMProducto;
import operacionesProducto.InterfazGraficaFormularioEditarProducto;
import operacionesProducto.InterfazGraficaFormularioRegistrarPrecioProducto;
import operacionesProducto.InterfazGraficaFormularioRegistrarProducto;
import operacionesProducto.OperacionesSecundariasProducto;
import operacionesProducto.TablaProducto;

public class PrincipalProducto extends javax.swing.JInternalFrame {

    public PrincipalProducto() {
        registrarProducto = null;
        editarProducto = null;
        registrarPrecioProducto = null;
        initComponents();
    }

    private InterfazGraficaFormularioRegistrarProducto formularioRegistrar;
    private InterfazGraficaFormularioEditarProducto formularioEditar;
    private InterfazGraficaFormularioRegistrarPrecioProducto formularioPrecio;
    private FormularioRegistrarProducto registrarProducto;
    private FormularioEditarProducto editarProducto;
    private FormularioRegistrarPrecioProducto registrarPrecioProducto;
    private TablaProducto tablaProducto;
    private final ABMProducto abm = new ABMProducto();

    public InterfazGraficaFormularioRegistrarProducto getFormularioRegistrar() {
        return formularioRegistrar;
    }

    public void setFormularioRegistrar(InterfazGraficaFormularioRegistrarProducto formularioRegistrar) {
        this.formularioRegistrar = formularioRegistrar;
    }

    public InterfazGraficaFormularioEditarProducto getFormularioEditar() {
        return formularioEditar;
    }

    public void setFormularioEditar(InterfazGraficaFormularioEditarProducto formularioEditar) {
        this.formularioEditar = formularioEditar;
    }

    public FormularioRegistrarProducto getRegistrarProducto() {
        return registrarProducto;
    }

    public void setRegistrarProducto(FormularioRegistrarProducto registrarProducto) {
        this.registrarProducto = registrarProducto;
    }

    public FormularioEditarProducto getEditarProducto() {
        return editarProducto;
    }

    public void setEditarProducto(FormularioEditarProducto editarProducto) {
        this.editarProducto = editarProducto;
    }

    public InterfazGraficaFormularioRegistrarPrecioProducto getFormularioPrecio() {
        return formularioPrecio;
    }

    public void setFormularioPrecio(InterfazGraficaFormularioRegistrarPrecioProducto formularioPrecio) {
        this.formularioPrecio = formularioPrecio;
    }

    public FormularioRegistrarPrecioProducto getRegistrarPrecioProducto() {
        return registrarPrecioProducto;
    }

    public void setRegistrarPrecioProducto(FormularioRegistrarPrecioProducto registrarPrecioProducto) {
        this.registrarPrecioProducto = registrarPrecioProducto;
    }

    public TablaProducto getTablaProducto() {
        return tablaProducto;
    }

    public void setTablaProducto(TablaProducto tablaProducto) {
        this.tablaProducto = tablaProducto;
    }

    public JTable getTablaGrafica() {
        return tablaGrafica;
    }

    public void setTablaGrafica(JTable tablaGrafica) {
        this.tablaGrafica = tablaGrafica;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalTop = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGrafica = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lbltrigo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnNuevo = new principal.MaterialButton();
        btnGraficarHistorialPrecios = new principal.MaterialButton();
        btnEliminar = new principal.MaterialButton();
        btnEditar = new principal.MaterialButton();
        btnNuevoPrecio = new principal.MaterialButton();

        panelPrincipalTop.setBackground(new java.awt.Color(204, 0, 0));
        panelPrincipalTop.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tablaGrafica.setBackground(new java.awt.Color(255, 255, 255));
        tablaGrafica.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGrafica.setForeground(new java.awt.Color(102, 0, 0));
        tablaGrafica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "DESCRIPCION", "PRECIO", "FECHA"
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
        tablaGrafica.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tablaGrafica.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGrafica.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaGrafica.setShowHorizontalLines(false);
        tablaGrafica.setShowVerticalLines(false);
        tablaGrafica.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaGrafica);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1606, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0, 60));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        lbltrigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bread_80px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRODUCTO");

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel_60px.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltrigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbltrigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );

        txtBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0,0,0,60));
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO ");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGraficarHistorialPrecios.setBackground(new java.awt.Color(0,0,0,60));
        btnGraficarHistorialPrecios.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficarHistorialPrecios.setText("HISTORIAL DE PRECIOS ");
        btnGraficarHistorialPrecios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGraficarHistorialPrecios.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGraficarHistorialPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarHistorialPreciosActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0,0,0,60));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0,0,0,60));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevoPrecio.setBackground(new java.awt.Color(0,0,0,60));
        btnNuevoPrecio.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoPrecio.setText("NUEVO PRECIO");
        btnNuevoPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoPrecio.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnNuevoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGraficarHistorialPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraficarHistorialPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        tablaProducto.setPrincipalProducto(this);
        tablaProducto.ejecutarRellenarTabla();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        formularioRegistrar.setPrincipalProducto(this);
        formularioRegistrar.nuevoFormularioRegistrar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGraficarHistorialPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarHistorialPreciosActionPerformed
        if (tablaProducto.verificarFilaSeleccionada()) {
            new OperacionesSecundariasProducto().graficarHistorialPrecios(this);
        }

    }//GEN-LAST:event_btnGraficarHistorialPreciosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        abm.setPrincipalProducto(this);
        tablaProducto.setPrincipalProducto(this);
        if (tablaProducto.verificarFilaSeleccionada()) {
            if (OperacionesUtiles.mensajeEliminarRegistro()) {
                if (abm.ejecutarEliminar()) {
                    tablaProducto.setEstadoConsulta(0);
                    tablaProducto.ejecutarRellenarTabla();
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        tablaProducto.setPrincipalProducto(this);
        if (tablaProducto.verificarFilaSeleccionada()) {
            formularioEditar.setPrincipalProducto(this);
            formularioEditar.nuevoFormularioEditar();

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPrecioActionPerformed
        tablaProducto.setPrincipalProducto(this);
        if (tablaProducto.verificarFilaSeleccionada()) {
            formularioPrecio.setPrincipalProducto(this);
            formularioPrecio.nuevoFormularioRegistrarPrecio();
        }
    }//GEN-LAST:event_btnNuevoPrecioActionPerformed

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
    private principal.MaterialButton btnEditar;
    private principal.MaterialButton btnEliminar;
    private principal.MaterialButton btnGraficarHistorialPrecios;
    private principal.MaterialButton btnNuevo;
    private principal.MaterialButton btnNuevoPrecio;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalir;
    public static javax.swing.JLabel lbltrigo;
    private javax.swing.JPanel panelPrincipalTop;
    private javax.swing.JTable tablaGrafica;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
