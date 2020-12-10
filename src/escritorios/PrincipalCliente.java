package escritorios;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import operacionesCliente.ABMCliente;
import operacionesCliente.TablaCliente;
import clasesUtilidadGeneral.OperacionesUtiles;
import formularios.FormularioEditarCliente;
import formularios.FormularioRegistrarCliente;
import formularios.FormularioRegistrarVenta;
import operacionesCaja.OperacionesSecundariasCaja;
import operacionesCliente.InterfazGraficaFormularioEditarCliente;
import operacionesCliente.InterfazGraficaFormularioRegistrarCliente;
import operacionesVenta.OperacionesSecundariasVenta;
import principal.MaterialButton;
import principal.PrincipalAdministrador;

/**
 *
 * @author TELCOM MPC
 */
public class PrincipalCliente extends javax.swing.JInternalFrame {

    public PrincipalCliente() {
        initComponents();
        registrarCliente = null;
        editarCliente = null;
    }

    private InterfazGraficaFormularioRegistrarCliente formularioRegistrar;
    private InterfazGraficaFormularioEditarCliente formularioEditar;
    private FormularioRegistrarCliente registrarCliente;
    private FormularioEditarCliente editarCliente;
    private TablaCliente tablaCliente;
    private final ABMCliente abm = new ABMCliente();
    private FormularioRegistrarVenta formularioRegistrarVenta;
    private int tipoFormulario;

    public int getTipoFormulario() {
        return tipoFormulario;
    }

    public void setTipoFormulario(int tipoFormulario) {
        this.tipoFormulario = tipoFormulario;
    }
    
    



    public TablaCliente getTablaCliente() {
        return tablaCliente;
    }

    public void setTablaCliente(TablaCliente tablaCliente) {
        this.tablaCliente = tablaCliente;
    }

    public JTable getTablaGrafica() {
        return tablaGrafica;
    }

    public void setTablaGrafica(JTable tablaGrafica) {
        this.tablaGrafica = tablaGrafica;
    }

    public MaterialButton getBtnSeleccionarCliente() {
        return btnSeleccionarCliente;
    }

    public void setBtnSeleccionarCliente(MaterialButton btnSeleccionarCliente) {
        this.btnSeleccionarCliente = btnSeleccionarCliente;
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

    public InterfazGraficaFormularioRegistrarCliente getFormularioRegistrar() {
        return formularioRegistrar;
    }

    public void setFormularioRegistrar(InterfazGraficaFormularioRegistrarCliente formularioRegistrar) {
        this.formularioRegistrar = formularioRegistrar;
    }

    public InterfazGraficaFormularioEditarCliente getFormularioEditar() {
        return formularioEditar;
    }

    public void setFormularioEditar(InterfazGraficaFormularioEditarCliente formularioEditar) {
        this.formularioEditar = formularioEditar;
    }

    public FormularioRegistrarVenta getFormularioRegistrarVenta() {
        return formularioRegistrarVenta;
    }

    public void setFormularioRegistrarVenta(FormularioRegistrarVenta formularioRegistrarVenta) {
        this.formularioRegistrarVenta = formularioRegistrarVenta;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalTop = new javax.swing.JPanel();
        btnSeleccionarCliente = new principal.MaterialButton();
        txtBuscar = new javax.swing.JTextField();
        btnnuevoCliente = new principal.MaterialButton();
        btnCuenta = new principal.MaterialButton();
        btnnEditarCliente = new principal.MaterialButton();
        btnEliminarCli = new principal.MaterialButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGrafica = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        btnTelefonos = new principal.MaterialButton();
        btnDirecciones = new principal.MaterialButton();

        panelPrincipalTop.setBackground(new java.awt.Color(204, 0, 0));

        btnSeleccionarCliente.setBackground(new java.awt.Color(0, 0, 0,60));
        btnSeleccionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarCliente.setText("SELECCIONAR CLIENTE");
        btnSeleccionarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionarCliente.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnSeleccionarCliente.setMaximumSize(new java.awt.Dimension(130, 35));
        btnSeleccionarCliente.setMinimumSize(new java.awt.Dimension(130, 35));
        btnSeleccionarCliente.setPreferredSize(new java.awt.Dimension(130, 35));
        btnSeleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarClienteActionPerformed(evt);
            }
        });

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnnuevoCliente.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevoCliente.setText("NUEVO CLIENTE");
        btnnuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevoCliente.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnuevoCliente.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnuevoCliente.setMinimumSize(new java.awt.Dimension(130, 35));
        btnnuevoCliente.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoClienteActionPerformed(evt);
            }
        });

        btnCuenta.setBackground(new java.awt.Color(0, 0, 0,60));
        btnCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCuenta.setText("CUENTA");
        btnCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCuenta.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnCuenta.setMaximumSize(new java.awt.Dimension(130, 35));
        btnCuenta.setMinimumSize(new java.awt.Dimension(130, 35));
        btnCuenta.setPreferredSize(new java.awt.Dimension(130, 35));
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });

        btnnEditarCliente.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnnEditarCliente.setText("EDITAR CLIENTE");
        btnnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnEditarCliente.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnEditarCliente.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnEditarCliente.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCli.setBackground(new java.awt.Color(0, 0, 0,60));
        btnEliminarCli.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCli.setText("ELIMINAR CLIENTE");
        btnEliminarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCli.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminarCli.setMaximumSize(new java.awt.Dimension(130, 35));
        btnEliminarCli.setMinimumSize(new java.awt.Dimension(130, 35));
        btnEliminarCli.setPreferredSize(new java.awt.Dimension(130, 35));
        btnEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliActionPerformed(evt);
            }
        });

        tablaGrafica.setBackground(new java.awt.Color(255, 255, 255));
        tablaGrafica.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGrafica.setForeground(new java.awt.Color(102, 0, 0));
        tablaGrafica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "RAZON SOCIAL", "DIRECCION", "NUMERO/DIR", "LOCALIDAD", "PROVINCIA", "TELEFONO", "TIPO TEPLEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
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
        if (tablaGrafica.getColumnModel().getColumnCount() > 0) {
            tablaGrafica.getColumnModel().getColumn(0).setResizable(false);
            tablaGrafica.getColumnModel().getColumn(1).setResizable(false);
            tablaGrafica.getColumnModel().getColumn(2).setResizable(false);
            tablaGrafica.getColumnModel().getColumn(3).setResizable(false);
            tablaGrafica.getColumnModel().getColumn(4).setResizable(false);
            tablaGrafica.getColumnModel().getColumn(5).setResizable(false);
            tablaGrafica.getColumnModel().getColumn(6).setResizable(false);
            tablaGrafica.getColumnModel().getColumn(7).setResizable(false);
            tablaGrafica.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLIENTES");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_group_man_man_80px.png"))); // NOI18N

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel_60px.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
        );

        btnTelefonos.setBackground(new java.awt.Color(0, 0, 0,60));
        btnTelefonos.setForeground(new java.awt.Color(255, 255, 255));
        btnTelefonos.setText("TELEFONOS");
        btnTelefonos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTelefonos.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnTelefonos.setMaximumSize(new java.awt.Dimension(130, 35));
        btnTelefonos.setMinimumSize(new java.awt.Dimension(130, 35));
        btnTelefonos.setPreferredSize(new java.awt.Dimension(130, 35));
        btnTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefonosActionPerformed(evt);
            }
        });

        btnDirecciones.setBackground(new java.awt.Color(0, 0, 0,60));
        btnDirecciones.setForeground(new java.awt.Color(255, 255, 255));
        btnDirecciones.setText("DIRECCIONES");
        btnDirecciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDirecciones.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnDirecciones.setMaximumSize(new java.awt.Dimension(130, 35));
        btnDirecciones.setMinimumSize(new java.awt.Dimension(130, 35));
        btnDirecciones.setPreferredSize(new java.awt.Dimension(130, 35));
        btnDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireccionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.setBackground(new java.awt.Color(0, 0, 0, 60));

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

    private void btnSeleccionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarClienteActionPerformed
        OperacionesSecundariasVenta operacionesSecundariasVenta =new OperacionesSecundariasVenta ();
        
        if(tipoFormulario==1){
            operacionesSecundariasVenta.setTipoFormulario(1);
            operacionesSecundariasVenta.setFormularioRegistrarVenta(formularioRegistrarVenta);
            operacionesSecundariasVenta.setPrincipalCliente(this);
            operacionesSecundariasVenta.rellenarTablaVentaCliente();
            operacionesSecundariasVenta.retornarFormularioVenta();
            
        }else{
            
            
        }
        
    }//GEN-LAST:event_btnSeleccionarClienteActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        tablaCliente.setPrincipalCliente(this);
        tablaCliente.ejecutarRellenarTabla();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void tablaGraficaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaGraficaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaGraficaComponentHidden

    private void btnnuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoClienteActionPerformed
        // TODO add your handling code here:
        formularioRegistrar.setPrincipalCliente(this);
        formularioRegistrar.nuevoFormularioRegistrar();

    }//GEN-LAST:event_btnnuevoClienteActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed


    }//GEN-LAST:event_btnCuentaActionPerformed

    private void btnEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliActionPerformed

        abm.setPrincipalCliente(this);
        tablaCliente.setPrincipalCliente(this);
        if (tablaCliente.verificarFilaSeleccionada()) {
            if (tablaCliente.verficarClienteNoconsumidorFinal(1)) {
                if (OperacionesUtiles.mensajeEliminarRegistro()) {
                    if (abm.ejecutarEliminar()) {
                        tablaCliente.setEstadoConsulta(0);
                        tablaCliente.ejecutarRellenarTabla();
                    }
                }
            }
        }

    }//GEN-LAST:event_btnEliminarCliActionPerformed

    private void btnnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnEditarClienteActionPerformed
        // TODO add your handling code here:
        tablaCliente.setPrincipalCliente(this);
        if (tablaCliente.verificarFilaSeleccionada()) {
            if (tablaCliente.verficarClienteNoconsumidorFinal(1)) {
                InterfazGraficaFormularioEditarCliente formularioEditar = new InterfazGraficaFormularioEditarCliente();
                formularioEditar.setPrincipalCliente(this);
                formularioEditar.nuevoFormularioEditar();
            }
        }
    }//GEN-LAST:event_btnnEditarClienteActionPerformed

    private void btnTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelefonosActionPerformed

    }//GEN-LAST:event_btnTelefonosActionPerformed

    private void btnDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireccionesActionPerformed


    }//GEN-LAST:event_btnDireccionesActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }

    public MaterialButton getBtnDirecciones() {
        return btnDirecciones;
    }

    public void setBtnDirecciones(MaterialButton btnDirecciones) {
        this.btnDirecciones = btnDirecciones;
    }

    public MaterialButton getBtnTelefonos() {
        return btnTelefonos;
    }

    public void setBtnTelefonos(MaterialButton btnTelefonos) {
        this.btnTelefonos = btnTelefonos;
    }

    public MaterialButton getBtnnuevocliente() {
        return btnnuevoCliente;
    }

    public void setBtnnuevocliente(MaterialButton btnnuevocliente) {
        this.btnnuevoCliente = btnnuevocliente;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public MaterialButton getBtnEliminarCli() {
        return btnEliminarCli;
    }

    public void setBtnEliminarCli(MaterialButton btnEliminarCli) {
        this.btnEliminarCli = btnEliminarCli;
    }

    public MaterialButton getBtnnEditarCl() {
        return btnnEditarCliente;
    }

    public void setBtnnEditarCl(MaterialButton btnnEditarCl) {
        this.btnnEditarCliente = btnnEditarCl;
    }

    public MaterialButton getBtnCuenta() {
        return btnCuenta;
    }

    public void setBtnCuenta(MaterialButton btnCuenta) {
        this.btnCuenta = btnCuenta;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButton btnCuenta;
    private principal.MaterialButton btnDirecciones;
    private principal.MaterialButton btnEliminarCli;
    private principal.MaterialButton btnSeleccionarCliente;
    private principal.MaterialButton btnTelefonos;
    private principal.MaterialButton btnnEditarCliente;
    private principal.MaterialButton btnnuevoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelPrincipalTop;
    private javax.swing.JTable tablaGrafica;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
