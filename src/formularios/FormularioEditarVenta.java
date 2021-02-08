package formularios;

import entidades.Producto_Venta;
import escritorios.PrincipalCliente;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import escritorios.PrincipalVenta;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import operacionesCliente.InterfazGraficaEscritorioCliente;
import operacionesVenta.ABMVenta;
import operacionesVenta.OperacionesSecundariasVenta;
import operacionesVenta.TablaProductosDisponibles;
import operacionesVenta.TablaProductosListados;
import principal.MaterialButton;
import principal.PrincipalAdministrador;
import rojeru_san.componentes.RSDateChooser;

/**
 *
 * @author FRANCO
 */
public class FormularioEditarVenta extends javax.swing.JDialog {

    /**
     * Creates new form FormularioEditarVenta
     */
    public FormularioEditarVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        //setCambiarCliente(0);
    }

    private PrincipalVenta principalVenta;
    private final ABMVenta abm = new ABMVenta();
    private PrincipalAdministrador principalAdministrador;
    private boolean cambiarCliente;
    private PrincipalCliente principalCliente;
    private OperacionesSecundariasVenta operacionesSecundariasVenta;
    private TablaProductosDisponibles tablaProductosDisponibles;
    private TablaProductosListados tablaProductosListados;
    private Integer idCliente;
    private List<Producto_Venta> listaProductosEliminar;

    public List<Producto_Venta> getListaProductosEliminar() {
        return listaProductosEliminar;
    }

    public void setListaProductosEliminar(List<Producto_Venta> listaProductosEliminar) {
        this.listaProductosEliminar = listaProductosEliminar;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public OperacionesSecundariasVenta getOperacionesSecundariasVenta() {
        return operacionesSecundariasVenta;
    }

    public void setOperacionesSecundariasVenta(OperacionesSecundariasVenta operacionesSecundariasVenta) {
        this.operacionesSecundariasVenta = operacionesSecundariasVenta;
    }

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public boolean isCambiarCliente() {
        return cambiarCliente;
    }

    public void setCambiarCliente(boolean cambiarCliente) {
        this.cambiarCliente = cambiarCliente;
    }

    public PrincipalVenta getPrincipalVenta() {
        return principalVenta;
    }

    public void setPrincipalVenta(PrincipalVenta principalVenta) {
        this.principalVenta = principalVenta;
    }

    public TablaProductosListados getTablaProductosListados() {
        return tablaProductosListados;
    }

    public void setTablaProductosListados(TablaProductosListados tablaProductosListados) {
        this.tablaProductosListados = tablaProductosListados;
    }

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }

    public TablaProductosDisponibles getTablaProductosDisponibles() {
        return tablaProductosDisponibles;
    }

    public void setTablaProductosDisponibles(TablaProductosDisponibles tablaProductosDisponibles) {
        this.tablaProductosDisponibles = tablaProductosDisponibles;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGraficaProductosListados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaGraficaProductosDisponibles = new javax.swing.JTable();
        btnQuitar = new principal.MaterialButton();
        btnBuscarCliente = new principal.MaterialButton();
        rSDateChooser = new rojeru_san.componentes.RSDateChooser();
        radButonConsumidorFinal = new javax.swing.JRadioButton();
        lblSumaTotal = new javax.swing.JLabel();
        lblInfoSuma = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaGraficaCliente = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelar = new principal.MaterialButton();
        btnGuardarCambios = new principal.MaterialButton();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new principal.MaterialButton();
        panelPrincipalTop = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        boxTipoVenta = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), java.awt.Color.gray, new java.awt.Color(102, 102, 102), java.awt.Color.gray));
        panel.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tablaGraficaProductosListados.setBackground(new java.awt.Color(255, 255, 255));
        tablaGraficaProductosListados.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGraficaProductosListados.setForeground(new java.awt.Color(102, 0, 0));
        tablaGraficaProductosListados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "CANTIDAD", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaGraficaProductosListados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaGraficaProductosListados.setDoubleBuffered(true);
        tablaGraficaProductosListados.setRowHeight(40);
        tablaGraficaProductosListados.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tablaGraficaProductosListados.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGraficaProductosListados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaGraficaProductosListados.setShowHorizontalLines(false);
        tablaGraficaProductosListados.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaGraficaProductosListados);

        tablaGraficaProductosDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        tablaGraficaProductosDisponibles.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGraficaProductosDisponibles.setForeground(new java.awt.Color(102, 0, 0));
        tablaGraficaProductosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "DESCRIPCION", "PRECIO UNITARIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaGraficaProductosDisponibles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaGraficaProductosDisponibles.setDoubleBuffered(true);
        tablaGraficaProductosDisponibles.setRowHeight(40);
        tablaGraficaProductosDisponibles.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tablaGraficaProductosDisponibles.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGraficaProductosDisponibles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaGraficaProductosDisponibles.setShowHorizontalLines(false);
        tablaGraficaProductosDisponibles.setShowVerticalLines(false);
        tablaGraficaProductosDisponibles.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaGraficaProductosDisponibles);

        btnQuitar.setBackground(new java.awt.Color(0,0,0,60));
        btnQuitar.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitar.setText("QUITAR");
        btnQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        btnBuscarCliente.setBackground(new java.awt.Color(0,0,0,60));
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("BUSCAR CLIENTE");
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        rSDateChooser.setForeground(new java.awt.Color(255, 255, 255));
        rSDateChooser.setColorBackground(new java.awt.Color(153, 0, 0));
        rSDateChooser.setColorButtonHover(new java.awt.Color(153, 0, 0));
        rSDateChooser.setColorForeground(new java.awt.Color(0, 0, 0));
        rSDateChooser.setPlaceholder("Seleccionar fecha pedido");

        radButonConsumidorFinal.setText("CONSUMIDOR FINAL");
        radButonConsumidorFinal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radButonConsumidorFinalItemStateChanged(evt);
            }
        });
        radButonConsumidorFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radButonConsumidorFinalActionPerformed(evt);
            }
        });

        lblInfoSuma.setForeground(new java.awt.Color(0, 0, 0));
        lblInfoSuma.setText("SUMA TOTAL:");

        tablaGraficaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tablaGraficaCliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGraficaCliente.setForeground(new java.awt.Color(102, 0, 0));
        tablaGraficaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "TELÉFONO", "DIRECCIÓN"
            }
        ));
        tablaGraficaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaGraficaCliente.setDoubleBuffered(true);
        tablaGraficaCliente.setEnabled(false);
        tablaGraficaCliente.setRowHeight(40);
        tablaGraficaCliente.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tablaGraficaCliente.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGraficaCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaGraficaCliente.setShowHorizontalLines(false);
        tablaGraficaCliente.setShowVerticalLines(false);
        tablaGraficaCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablaGraficaCliente);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

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

        btnGuardarCambios.setBackground(new java.awt.Color(0, 0, 0,60));
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setText("GUARDAR CAMBIOS");
        btnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCambios.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGuardarCambios.setMaximumSize(new java.awt.Dimension(170, 35));
        btnGuardarCambios.setMinimumSize(new java.awt.Dimension(170, 35));
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        txtCantidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(0,0,0,60));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblInfoSuma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSumaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                        .addComponent(txtCantidad))
                                    .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rSDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radButonConsumidorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1033, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSumaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radButonConsumidorFinal)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelPrincipalTop.setBackground(new java.awt.Color(0, 0, 0, 60));
        panelPrincipalTop.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EDITAR VENTA");

        boxTipoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoVentaActionPerformed(evt);
            }
        });
        boxTipoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                boxTipoVentaKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELECCIONAR TIPO DE VENTA:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_file_80px.png"))); // NOI18N

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel_60px.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTipoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxTipoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PRODUCTOS DISPONIBLES");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("LISTA PRODUCTOS");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(392, 392, 392))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelPrincipalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public JComboBox<String> getBoxTipoVenta() {
        return boxTipoVenta;
    }

    public void setBoxTipoVenta(JComboBox<String> boxTipoVenta) {
        this.boxTipoVenta = boxTipoVenta;
    }

    public JTable getTablaBuscarProducto() {
        return tablaGraficaProductosDisponibles;
    }

    public void setTablaBuscarProducto(JTable tablaBuscarProducto) {
        this.tablaGraficaProductosDisponibles = tablaBuscarProducto;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTable getTablaListarProductos() {
        return tablaGraficaProductosListados;
    }

    public void setTablaListarProductos(JTable tablaListarProductos) {
        this.tablaGraficaProductosListados = tablaListarProductos;
    }

    public JRadioButton getRadButonConsumidorFinal() {
        return radButonConsumidorFinal;
    }

    public void setRadButonConsumidorFinal(JRadioButton radButonConsumidorFinal) {
        this.radButonConsumidorFinal = radButonConsumidorFinal;
    }

    public MaterialButton getBtnBuscarCliente() {
        return btnBuscarCliente;
    }

    public void setBtnBuscarCliente(MaterialButton btnBuscarCliente) {
        this.btnBuscarCliente = btnBuscarCliente;
    }

    public JLabel getLblPrecioTotal() {
        return lblSumaTotal;
    }

    public void setLblPrecioTotal(JLabel lblPrecioTotal) {
        this.lblSumaTotal = lblPrecioTotal;
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    private void boxTipoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoVentaActionPerformed
        operacionesSecundariasVenta.tipoVentaSeleccionada(boxTipoVenta.getSelectedItem().toString());
    }//GEN-LAST:event_boxTipoVentaActionPerformed

    private void boxTipoVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxTipoVentaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoVentaKeyReleased

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (tablaProductosDisponibles.verificarFilaSeleccionada()) {
            tablaProductosListados.setPrincipalVenta(principalVenta);
            tablaProductosListados.setTablaProductosDisponibles(tablaProductosDisponibles);
            if (tablaProductosListados.verificarValor()) {
                tablaProductosListados.ejecutarAgregarProducto();
                operacionesSecundariasVenta.obtenerPrecioTotal();
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased

    }//GEN-LAST:event_txtCantidadKeyReleased

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed

        if (operacionesSecundariasVenta.validarListaProductos()) {
            if (operacionesSecundariasVenta.validarTablaCliente()) {
                if (operacionesSecundariasVenta.validarFecha()) {
                    abm.setFormularioEditarVenta(this);
                    abm.setListaProductosListados(tablaProductosListados.getListaProductosListados());
                    abm.setPrincipalCliente(principalCliente);
                    abm.setPrincipalVenta(principalVenta);
                    abm.setListaProductosEliminar(listaProductosEliminar);
                    abm.ejecutarEditar();
                    principalVenta.getTablaVenta().setPrincipalVenta(principalVenta);
                    principalVenta.getTablaVenta().setEstadoConsulta(0);
                    principalVenta.getTablaVenta().ejecutarRellenarTabla();
                }
            }
        }

    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JOptionPane jop = new JOptionPane();
        if (jop.showConfirmDialog(jop, "¿SEGURO QUE DESEA CANCELAR LA ACCION?", "",
                jop.OK_CANCEL_OPTION) == jop.OK_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void radButonConsumidorFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radButonConsumidorFinalActionPerformed
        operacionesSecundariasVenta.tipoConsumidorFinalEnabled();
        setCambiarCliente(true);
    }//GEN-LAST:event_radButonConsumidorFinalActionPerformed

    private void radButonConsumidorFinalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radButonConsumidorFinalItemStateChanged

    }//GEN-LAST:event_radButonConsumidorFinalItemStateChanged

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        tablaProductosListados.setPrincipalVenta(principalVenta);
        tablaProductosListados.setTablaProductosListados(this.tablaGraficaProductosListados);
        if (tablaProductosListados.verificarFilaSeleccionada()) {
            tablaProductosListados.quitarProducto();
            operacionesSecundariasVenta.obtenerPrecioTotal();
        }
    }//GEN-LAST:event_btnQuitarActionPerformed
   
    int x, y;
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }

    public RSDateChooser getrSDateChooser() {
        return rSDateChooser;
    }

    public void setrSDateChooser(RSDateChooser rSDateChooser) {
        this.rSDateChooser = rSDateChooser;
    }

    public MaterialButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(MaterialButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public MaterialButton getBtnQuitar() {
        return btnQuitar;
    }

    public void setBtnQuitar(MaterialButton btnQuitar) {
        this.btnQuitar = btnQuitar;
    }



    public JTable getTablaGraficaProductosDisponibles() {
        return tablaGraficaProductosDisponibles;
    }

    public void setTablaGraficaProductosDisponibles(JTable tablaGraficaProductosDisponibles) {
        this.tablaGraficaProductosDisponibles = tablaGraficaProductosDisponibles;
    }

    public JTable getTablaGraficaProductosListados() {
        return tablaGraficaProductosListados;
    }

    public void setTablaGraficaProductosListados(JTable tablaGraficaProductosListados) {
        this.tablaGraficaProductosListados = tablaGraficaProductosListados;
    }

    public JTable getTablaGraficaCliente() {
        return tablaGraficaCliente;
    }

    public void setTablaGraficaCliente(JTable tablaGraficaCliente) {
        this.tablaGraficaCliente = tablaGraficaCliente;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoVenta;
    private principal.MaterialButton btnAgregar;
    private principal.MaterialButton btnBuscarCliente;
    public static principal.MaterialButton btnCancelar;
    public static principal.MaterialButton btnGuardarCambios;
    private principal.MaterialButton btnQuitar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblInfoSuma;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblSumaTotal;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelPrincipalTop;
    private rojeru_san.componentes.RSDateChooser rSDateChooser;
    private javax.swing.JRadioButton radButonConsumidorFinal;
    private javax.swing.JTable tablaGraficaCliente;
    private javax.swing.JTable tablaGraficaProductosDisponibles;
    private javax.swing.JTable tablaGraficaProductosListados;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
