package escritorios;


import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import clasesUtilidadGeneral.OperacionesUtiles;
import principal.MaterialButton;

/**
 *
 * @author TELCOM MPC
 */
public class PrincipalCuenta extends javax.swing.JInternalFrame {


    public PrincipalCuenta() {
        initComponents();
        estadoInicialVentanaCuenta();

    }

    /**
     * Establece el estado inicial de los elementos de la pestaña Cuenta.
     */
    public void estadoInicialVentanaCuenta() {
        txtMontoInicial.setEnabled(false);
        btnGuardarCuenta.setEnabled(false);
        editPaneMotivo.setEnabled(false);
        txtMonto.setEnabled(false);
        btnGuardarMovimiento.setEnabled(false);
        lblMotivo.setEnabled(false);

    }

    public JComboBox<String> getBoxCuenta() {
        return boxCuenta;
    }

    public void setBoxCuenta(JComboBox<String> boxCuenta) {
        this.boxCuenta = boxCuenta;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JLabel getLblBalance() {
        return lblBalance;
    }

    public void setLblBalance(JLabel lblBalance) {
        this.lblBalance = lblBalance;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_1_primario = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblMotivo = new javax.swing.JLabel();
        txtBuscarHistorial = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        editPaneMotivo = new javax.swing.JEditorPane();
        btnGuardarMovimiento = new principal.MaterialButton();
        btnNuevaCuenta = new principal.MaterialButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtMonto = new javax.swing.JTextField();
        btnGuardarCuenta = new principal.MaterialButton();
        btnNuevoMovimiento = new principal.MaterialButton();
        txtMontoInicial = new javax.swing.JTextField();
        btnnEditarMov = new principal.MaterialButton();
        btnEliminarMov = new principal.MaterialButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnNuevaCuenta1 = new principal.MaterialButton();
        btnNuevaCuenta2 = new principal.MaterialButton();
        btnNuevaCuenta3 = new principal.MaterialButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        boxCuenta = new javax.swing.JComboBox<>();
        lblBalance = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();

        panel_1_primario.setBackground(new java.awt.Color(204, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tabla.setForeground(new java.awt.Color(102, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MOTIVO", "MONTO", "BALANCE", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla.setDoubleBuffered(true);
        tabla.setRowHeight(40);
        tabla.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tabla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tablaComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        lblMotivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMotivo.setText("  MOTIVO:");

        txtBuscarHistorial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));
        txtBuscarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarHistorialActionPerformed(evt);
            }
        });
        txtBuscarHistorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarHistorialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarHistorialKeyTyped(evt);
            }
        });

        editPaneMotivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        btnGuardarMovimiento.setBackground(new java.awt.Color(0, 0, 0,60));
        btnGuardarMovimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarMovimiento.setText("GUARDAR MOVIMIENTO");
        btnGuardarMovimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarMovimiento.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGuardarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMovimientoActionPerformed(evt);
            }
        });

        btnNuevaCuenta.setBackground(new java.awt.Color(0, 0, 0,60));
        btnNuevaCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCuenta.setText("NUEVA CUENTA");
        btnNuevaCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaCuenta.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnNuevaCuenta.setMaximumSize(new java.awt.Dimension(130, 35));
        btnNuevaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCuentaActionPerformed(evt);
            }
        });

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        btnGuardarCuenta.setBackground(new java.awt.Color(0, 0, 0,60));
        btnGuardarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCuenta.setText("GUARDAR CUENTA");
        btnGuardarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCuenta.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGuardarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCuentaActionPerformed(evt);
            }
        });

        btnNuevoMovimiento.setBackground(new java.awt.Color(0, 0, 0,60));
        btnNuevoMovimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoMovimiento.setText("NUEVO MOVIMIENTO");
        btnNuevoMovimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoMovimiento.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnNuevoMovimiento.setMaximumSize(new java.awt.Dimension(130, 35));
        btnNuevoMovimiento.setMinimumSize(new java.awt.Dimension(130, 35));
        btnNuevoMovimiento.setPreferredSize(new java.awt.Dimension(130, 35));
        btnNuevoMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoMovimientoActionPerformed(evt);
            }
        });

        txtMontoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoInicialActionPerformed(evt);
            }
        });
        txtMontoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoInicialKeyTyped(evt);
            }
        });

        btnnEditarMov.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnEditarMov.setForeground(new java.awt.Color(255, 255, 255));
        btnnEditarMov.setText("EDITAR MOVIMIENTO");
        btnnEditarMov.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnEditarMov.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnEditarMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnEditarMovActionPerformed(evt);
            }
        });

        btnEliminarMov.setBackground(new java.awt.Color(0, 0, 0,60));
        btnEliminarMov.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarMov.setText("ELIMINAR MOVIMIENTO");
        btnEliminarMov.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarMov.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminarMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMovActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Cuenta", "Balance"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnNuevaCuenta1.setBackground(new java.awt.Color(0, 0, 0,60));
        btnNuevaCuenta1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCuenta1.setText("GENERAR REPORTE");
        btnNuevaCuenta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaCuenta1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnNuevaCuenta1.setMaximumSize(new java.awt.Dimension(130, 35));
        btnNuevaCuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCuenta1ActionPerformed(evt);
            }
        });

        btnNuevaCuenta2.setBackground(new java.awt.Color(0, 0, 0,60));
        btnNuevaCuenta2.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCuenta2.setText("EDITAR CUENTA");
        btnNuevaCuenta2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaCuenta2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnNuevaCuenta2.setMaximumSize(new java.awt.Dimension(130, 35));
        btnNuevaCuenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCuenta2ActionPerformed(evt);
            }
        });

        btnNuevaCuenta3.setBackground(new java.awt.Color(0, 0, 0,60));
        btnNuevaCuenta3.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCuenta3.setText("ELIMINAR CUENTA");
        btnNuevaCuenta3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaCuenta3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnNuevaCuenta3.setMaximumSize(new java.awt.Dimension(130, 35));
        btnNuevaCuenta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCuenta3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnnEditarMov, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarMov, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevaCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGuardarMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editPaneMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(354, 1329, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevaCuenta2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnGuardarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(294, 294, 294)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(428, 428, 428)
                    .addComponent(btnNuevaCuenta3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1110, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevaCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editPaneMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarMov, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnEditarMov, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btnNuevaCuenta3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(815, Short.MAX_VALUE)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accounting_80px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CUENTA CLIENTE");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(736, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(34, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        boxCuenta.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        boxCuenta.setForeground(new java.awt.Color(255, 255, 255));
        boxCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCuentaActionPerformed(evt);
            }
        });

        lblBalance.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("BALANCE DE LA CUENTA:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("SELECCIONAR CUENTA: ");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("    CLIENTE:");

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout panel_1_primarioLayout = new javax.swing.GroupLayout(panel_1_primario);
        panel_1_primario.setLayout(panel_1_primarioLayout);
        panel_1_primarioLayout.setHorizontalGroup(
            panel_1_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1_primarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boxCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(743, Short.MAX_VALUE))
        );
        panel_1_primarioLayout.setVerticalGroup(
            panel_1_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1_primarioLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_1_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_1_primarioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panel_1_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_1_primarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_1_primarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_1_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_1_primario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_1_primario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaComponentHidden

    private void btnNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuentaActionPerformed
         // TODO add your handling code here:
       

    }//GEN-LAST:event_btnNuevaCuentaActionPerformed

    private void txtBuscarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarHistorialActionPerformed

    private void txtBuscarHistorialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarHistorialKeyReleased
     
    }//GEN-LAST:event_txtBuscarHistorialKeyReleased

    private void txtBuscarHistorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarHistorialKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_txtBuscarHistorialKeyTyped

    private void boxCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCuentaActionPerformed
      
    }//GEN-LAST:event_boxCuentaActionPerformed

    private void btnGuardarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMovimientoActionPerformed
     
    }//GEN-LAST:event_btnGuardarMovimientoActionPerformed

    private void btnGuardarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCuentaActionPerformed
      
    }//GEN-LAST:event_btnGuardarCuentaActionPerformed

    private void btnNuevoMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoMovimientoActionPerformed
      
    }//GEN-LAST:event_btnNuevoMovimientoActionPerformed

    private void txtMontoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoInicialKeyTyped
       
    }//GEN-LAST:event_txtMontoInicialKeyTyped

    private void btnnEditarMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnEditarMovActionPerformed
     
    }//GEN-LAST:event_btnnEditarMovActionPerformed

    private void btnEliminarMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMovActionPerformed
       
    }//GEN-LAST:event_btnEliminarMovActionPerformed

    private void txtMontoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoInicialActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void btnNuevaCuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuenta1ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaCuenta1ActionPerformed

    private void btnNuevaCuenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuenta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaCuenta2ActionPerformed

    private void btnNuevaCuenta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuenta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaCuenta3ActionPerformed

    public JPanel getPanel_1_primario() {
        return panel_1_primario;
    }

    public void setPanel_1_primario(JPanel panel_1_primario) {
        this.panel_1_primario = panel_1_primario;
    }

    public MaterialButton getBtnGuardarCuenta() {
        return btnGuardarCuenta;
    }

    public void setBtnGuardarCuenta(MaterialButton btnGuardarCuenta) {
        this.btnGuardarCuenta = btnGuardarCuenta;
    }

    public JTextField getTxtMontoInicial() {
        return txtMontoInicial;
    }

    public void setTxtMontoInicial(JTextField txtMontoInicial) {
        this.txtMontoInicial = txtMontoInicial;
    }

    public JEditorPane getEditPaneMotivo() {
        return editPaneMotivo;
    }

    public void setEditPaneMotivo(JEditorPane editPaneMotivo) {
        this.editPaneMotivo = editPaneMotivo;
    }

    public JTextField getTxtMonto() {
        return txtMonto;
    }

    public void setTxtMonto(JTextField txtMonto) {
        this.txtMonto = txtMonto;
    }

    public MaterialButton getBtnGuardarMovimiento() {
        return btnGuardarMovimiento;
    }

    public void setBtnGuardarMovimiento(MaterialButton btnGuardarMovimiento) {
        this.btnGuardarMovimiento = btnGuardarMovimiento;
    }

    public JLabel getLblMotivo() {
        return lblMotivo;
    }

    public void setLblMotivo(JLabel lblMotivo) {
        this.lblMotivo = lblMotivo;
    }


    public JTextField getTxtBuscarHistorial() {
        return txtBuscarHistorial;
    }

    public void setTxtBuscarHistorial(JTextField txtBuscarHistorial) {
        this.txtBuscarHistorial = txtBuscarHistorial;
    }

    public MaterialButton getBtnEliminarMov() {
        return btnEliminarMov;
    }

    public void setBtnEliminarMov(MaterialButton btnEliminarMov) {
        this.btnEliminarMov = btnEliminarMov;
    }

    public MaterialButton getBtnNuevaCuenta() {
        return btnNuevaCuenta;
    }

    public void setBtnNuevaCuenta(MaterialButton btnNuevaCuenta) {
        this.btnNuevaCuenta = btnNuevaCuenta;
    }

    public MaterialButton getBtnNuevoMovimiento() {
        return btnNuevoMovimiento;
    }

    public void setBtnNuevoMovimiento(MaterialButton btnNuevoMovimiento) {
        this.btnNuevoMovimiento = btnNuevoMovimiento;
    }

    public MaterialButton getBtnnEditarMov() {
        return btnnEditarMov;
    }

    public void setBtnnEditarMov(MaterialButton btnnEditarMov) {
        this.btnnEditarMov = btnnEditarMov;
    }

//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCuenta;
    private principal.MaterialButton btnEliminarMov;
    private principal.MaterialButton btnGuardarCuenta;
    private principal.MaterialButton btnGuardarMovimiento;
    private principal.MaterialButton btnNuevaCuenta;
    private principal.MaterialButton btnNuevaCuenta1;
    private principal.MaterialButton btnNuevaCuenta2;
    private principal.MaterialButton btnNuevaCuenta3;
    private principal.MaterialButton btnNuevoMovimiento;
    private principal.MaterialButton btnnEditarMov;
    private javax.swing.JEditorPane editPaneMotivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panel_1_primario;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscarHistorial;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtMontoInicial;
    // End of variables declaration//GEN-END:variables
}
