package escritorios;

import clasesUtilidadGeneral.OperacionesUtiles;
import formularios.FormularioEditarCuenta;
import formularios.FormularioEditarMovimientoCuenta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import operacionesCuenta.ABMCuenta;
import operacionesCuenta.ABMMovimientoCuenta;
import operacionesCuenta.InterfazGraficaEditarCuenta;
import operacionesCuenta.InterfazGraficaEditarMovimiento;
import operacionesCuenta.InterfazGraficaEscritorioCuenta;
import operacionesCuenta.TablaCuenta;
import operacionesCuenta.TablaMovimientoCuenta;
import principal.MaterialButton;

/**
 *
 * @author TELCOM MPC
 */
public class PrincipalCuenta extends javax.swing.JInternalFrame {

    public PrincipalCuenta() {
        initComponents();
        estadoInicialVentanaCuenta();
        formularioEditarMovimiento = null;
        formularioEditarMovimiento = null;
    }

    private TablaCuenta tablaCuenta;
    private TablaMovimientoCuenta tablaMovimientoCuenta;
    private Integer idCliente;
    private final ABMCuenta abm = new ABMCuenta();
    private final ABMMovimientoCuenta abmMovimiento = new ABMMovimientoCuenta();
    private FormularioEditarMovimientoCuenta formularioEditarMovimiento;
    private InterfazGraficaEditarMovimiento InterfazEditarMovimiento;
    private FormularioEditarCuenta formularioEditar;
    private InterfazGraficaEditarCuenta InterfazEditarCuenta;

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

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public FormularioEditarCuenta getFormularioEditar() {
        return formularioEditar;
    }

    public void setFormularioEditar(FormularioEditarCuenta formularioEditar) {
        this.formularioEditar = formularioEditar;
    }

    public InterfazGraficaEditarCuenta getInterfazEditarCuenta() {
        return InterfazEditarCuenta;
    }

    public void setInterfazEditarCuenta(InterfazGraficaEditarCuenta InterfazEditarCuenta) {
        this.InterfazEditarCuenta = InterfazEditarCuenta;
    }

    public JTable getTablaGraficaCuenta() {
        return tablaGraficaCuenta;
    }

    public InterfazGraficaEditarMovimiento getInterfazEditarMovimiento() {
        return InterfazEditarMovimiento;
    }

    public void setInterfazEditarMovimiento(InterfazGraficaEditarMovimiento InterfazEditarMovimiento) {
        this.InterfazEditarMovimiento = InterfazEditarMovimiento;
    }

    public void setTablaGraficaCuenta(JTable tablaGraficaCuenta) {
        this.tablaGraficaCuenta = tablaGraficaCuenta;
    }

    public JTable getTablaGraficaMovimiento() {
        return tablaGraficaMovimiento;
    }

    public void setTablaGraficaMovimiento(JTable tablaGraficaMovimiento) {
        this.tablaGraficaMovimiento = tablaGraficaMovimiento;
    }

    public TablaCuenta getTablaCuenta() {
        return tablaCuenta;
    }

    public void setTablaCuenta(TablaCuenta tablaCuenta) {
        this.tablaCuenta = tablaCuenta;
    }

    public TablaMovimientoCuenta getTablaMovimientoCuenta() {
        return tablaMovimientoCuenta;
    }

    public void setTablaMovimientoCuenta(TablaMovimientoCuenta tablaMovimientoCuenta) {
        this.tablaMovimientoCuenta = tablaMovimientoCuenta;
    }

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }

    public FormularioEditarMovimientoCuenta getFormularioEditarMovimiento() {
        return formularioEditarMovimiento;
    }

    public void setFormularioEditarMovimiento(FormularioEditarMovimientoCuenta formularioEditarMovimiento) {
        this.formularioEditarMovimiento = formularioEditarMovimiento;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public List getListaCamposCuenta() {
        List listCamposTexto = new ArrayList();
        listCamposTexto.add(this.getTxtMontoInicial());
        return listCamposTexto;
    }

    public List getListaCamposMovimientoCuenta() {
        List listCamposTexto = new ArrayList();
        listCamposTexto.add(this.getTxtMonto());
        return listCamposTexto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalTop = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGraficaMovimiento = new javax.swing.JTable();
        lblMotivo = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
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
        tablaGraficaCuenta = new javax.swing.JTable();
        btnNuevaCuenta1 = new principal.MaterialButton();
        btnNuevaCuenta2 = new principal.MaterialButton();
        btnNuevaCuenta3 = new principal.MaterialButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();

        panelPrincipalTop.setBackground(new java.awt.Color(204, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tablaGraficaMovimiento.setBackground(new java.awt.Color(255, 255, 255));
        tablaGraficaMovimiento.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGraficaMovimiento.setForeground(new java.awt.Color(102, 0, 0));
        tablaGraficaMovimiento.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaGraficaMovimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaGraficaMovimiento.setDoubleBuffered(true);
        tablaGraficaMovimiento.setRowHeight(40);
        tablaGraficaMovimiento.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tablaGraficaMovimiento.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGraficaMovimiento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaGraficaMovimiento.getTableHeader().setReorderingAllowed(false);
        tablaGraficaMovimiento.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tablaGraficaMovimientoGraficaMovimientoComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(tablaGraficaMovimiento);

        lblMotivo.setBackground(new java.awt.Color(0, 0, 0));
        lblMotivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMotivo.setText("  MOTIVO:");

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

        tablaGraficaCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Cuenta", "Balance"
            }
        ));
        tablaGraficaCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaGraficaCuentaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaGraficaCuenta);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 827, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(editPaneMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnNuevaCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNuevaCuenta3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnNuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGuardarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 720, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevaCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevaCuenta3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
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

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));

        lblCliente.setBackground(new java.awt.Color(255, 255, 255));
        lblCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("CLIENTE:");

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tablaGraficaMovimientoGraficaMovimientoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaGraficaMovimientoGraficaMovimientoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaGraficaMovimientoGraficaMovimientoComponentHidden

    private void btnNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuentaActionPerformed
        new InterfazGraficaEscritorioCuenta().habilitarNuevaCuenta(this);
    }//GEN-LAST:event_btnNuevaCuentaActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnGuardarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMovimientoActionPerformed
        abmMovimiento.setPrincipalCuenta(this);
        if (abmMovimiento.ejecutarRegistrar()) {
            tablaCuenta.setEstadoConsulta(0);
            tablaCuenta.ejecutarRellenarTabla();
            tablaMovimientoCuenta.setEstadoConsulta(0);
            tablaMovimientoCuenta.ejecutarRellenarTabla();
            new InterfazGraficaEscritorioCuenta().desHabilitarNuevoMovimientoCuenta(this);
        }
    }//GEN-LAST:event_btnGuardarMovimientoActionPerformed

    private void btnGuardarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCuentaActionPerformed
        abm.setPrincipalCuenta(this);
        if (abm.ejecutarRegistrar()) {
            tablaCuenta.setEstadoConsulta(0);
            tablaCuenta.ejecutarRellenarTabla();
            new InterfazGraficaEscritorioCuenta().desHabilitarNuevaCuenta(this);
        }
    }//GEN-LAST:event_btnGuardarCuentaActionPerformed

    private void btnNuevoMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoMovimientoActionPerformed
        new InterfazGraficaEscritorioCuenta().habilitarNuevoMovimientoCuenta(this);
    }//GEN-LAST:event_btnNuevoMovimientoActionPerformed

    private void txtMontoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoInicialKeyTyped

    }//GEN-LAST:event_txtMontoInicialKeyTyped

    private void btnnEditarMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnEditarMovActionPerformed
        tablaMovimientoCuenta.setPrincipalCuenta(this);
        if (tablaMovimientoCuenta.verificarFilaSeleccionada()) {
            if (tablaMovimientoCuenta.verficarNoMontoInicial()) {
                InterfazEditarMovimiento.setPrincipalCuenta(this);
                InterfazEditarMovimiento.nuevoFormularioEditar();
            }

        }
    }//GEN-LAST:event_btnnEditarMovActionPerformed

    private void btnEliminarMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMovActionPerformed
        abmMovimiento.setPrincipalCuenta(this);
        if (tablaMovimientoCuenta.verificarFilaSeleccionada()) {
            if (tablaMovimientoCuenta.verficarNoMontoInicial()) {
                if (OperacionesUtiles.mensajeEliminarRegistro()) {
                    if (abmMovimiento.ejecutarEliminar()) {
                        //Quitar este if y autoseleccionar la fial, por que se deselecciona luego de una actualización
                        if (tablaCuenta.verificarFilaSeleccionada()) {
                            abmMovimiento.ejecutarActualizarMovimientoCuenta();
                            tablaMovimientoCuenta.setEstadoConsulta(0);
                            tablaMovimientoCuenta.ejecutarRellenarTabla();
                        }
                    }
                }
            }
        }
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
        tablaCuenta.setPrincipalCuenta(this);
        if (tablaCuenta.verificarFilaSeleccionada()) {
            InterfazEditarCuenta.setPrincipalCuenta(this);
            InterfazEditarCuenta.nuevoFormularioEditar();
        }
    }//GEN-LAST:event_btnNuevaCuenta2ActionPerformed

    private void btnNuevaCuenta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuenta3ActionPerformed
        abm.setPrincipalCuenta(this);
        if (tablaCuenta.verificarFilaSeleccionada()) {
            if (OperacionesUtiles.mensajeEliminarRegistro()) {
                if (abm.ejecutarEliminar()) {
                    tablaCuenta.setEstadoConsulta(0);
                    tablaCuenta.ejecutarRellenarTabla();
                }
            }
        }

    }//GEN-LAST:event_btnNuevaCuenta3ActionPerformed

    private void tablaGraficaCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGraficaCuentaMousePressed
        tablaMovimientoCuenta.setIdCuenta(tablaCuenta.obtenerIdFilaSeleccionada());
        tablaMovimientoCuenta.ejecutarRellenarTabla();
        tablaMovimientoCuenta.setEstadoConsulta(0);
    }//GEN-LAST:event_tablaGraficaCuentaMousePressed

    public JPanel getPanel_1_primario() {
        return panelPrincipalTop;
    }

    public void setPanel_1_primario(JPanel panel_1_primario) {
        this.panelPrincipalTop = panel_1_primario;
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

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panelPrincipalTop;
    private javax.swing.JTable tablaGraficaCuenta;
    private javax.swing.JTable tablaGraficaMovimiento;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtMontoInicial;
    // End of variables declaration//GEN-END:variables
}