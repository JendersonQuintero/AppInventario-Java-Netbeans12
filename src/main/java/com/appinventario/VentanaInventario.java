
package com.appinventario;

import com.funcionalidad.FuncionesInventario;
import com.funcionalidad.FuncionesSesion;
import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jenderson
 */
public class VentanaInventario extends javax.swing.JFrame {
    // Variables de control de sesion
    boolean conectado;
    String usuario;
    
    // Instancia para venta de inicio de sesion
    VentanaInicioSesion vS;
    
    // Instancia para Funciones del inventario y sesión
    FuncionesInventario fI;
    FuncionesSesion fS;
    
    // Apartado para tabla de productos
    DefaultTableModel productos;
    Object [] productoGuardado = new Object[5];
    Object [] productoCargado = new Object[6];
    
    
    // Variables para localizar el mouse
    int xMouse, yMouse;
    
    public VentanaInventario(String usuario, boolean estado, FuncionesInventario fInventario, FuncionesSesion fSesion, VentanaInicioSesion vSesion) {
        initComponents();
        this.vS = vSesion;
        this.fS = fSesion;
        this.usuario = fS.getUsuario();
        productos = (DefaultTableModel) tablaProductos.getModel();
        this.fI = fInventario;
        
        String[] productosGuardados = this.fI.productosUsuario();
        
        if (productosGuardados != null) {
            for (String p : productosGuardados) {
                String[] productoCargar = p.split(",");
                productoGuardado[0] = productoCargar[1];
                productoGuardado[1] = productoCargar[2];
                productoGuardado[2] = productoCargar[3];
                productoGuardado[3] = productoCargar[4];
                productoGuardado[4] = productoCargar[5];
                
                productos.addRow(productoGuardado);
            }
        }
    }
    
    public VentanaInventario() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        btnMovimiento = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        panelDesplazar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        opcionBusqueda = new javax.swing.JComboBox<>();
        inputBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        panelOpciones.setBackground(new java.awt.Color(0, 163, 255));
        panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMovimiento.setBackground(new java.awt.Color(0, 163, 255));
        btnMovimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMovimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMovimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMovimientoMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registrar movimiento");

        javax.swing.GroupLayout btnMovimientoLayout = new javax.swing.GroupLayout(btnMovimiento);
        btnMovimiento.setLayout(btnMovimientoLayout);
        btnMovimientoLayout.setHorizontalGroup(
            btnMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnMovimientoLayout.setVerticalGroup(
            btnMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelOpciones.add(btnMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        btnAgregar.setBackground(new java.awt.Color(0, 163, 255));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar producto");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelOpciones.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 30));

        btnActualizar.setBackground(new java.awt.Color(0, 163, 255));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Actualizar producto");

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelOpciones.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 30));

        btnEliminar.setBackground(new java.awt.Color(0, 163, 255));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Eliminar producto");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelOpciones.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 30));

        btnCerrarSesion.setBackground(new java.awt.Color(0, 163, 255));
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cerrar Sesión");

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelOpciones.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 240, 30));

        btnConfiguracion.setBackground(new java.awt.Color(0, 163, 255));
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Configuración");

        javax.swing.GroupLayout btnConfiguracionLayout = new javax.swing.GroupLayout(btnConfiguracion);
        btnConfiguracion.setLayout(btnConfiguracionLayout);
        btnConfiguracionLayout.setHorizontalGroup(
            btnConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        btnConfiguracionLayout.setVerticalGroup(
            btnConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelOpciones.add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 240, 30));

        background.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 550));

        labelTitulo.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("TODOS MIS PRODUCTOS");
        background.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 380, 50));

        panelDesplazar.setBackground(new java.awt.Color(204, 204, 204));
        panelDesplazar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelDesplazarMouseDragged(evt);
            }
        });
        panelDesplazar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelDesplazarMousePressed(evt);
            }
        });
        panelDesplazar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(panelDesplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Nombre", "Categoría", "Cantidad Inicial", "Cantidad Actual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaProductos.setSelectionBackground(new java.awt.Color(0, 110, 255));
        tablaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaProductos);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 610, 350));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Filtra productos:");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, 30));

        opcionBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        opcionBusqueda.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        opcionBusqueda.setForeground(new java.awt.Color(153, 153, 153));
        opcionBusqueda.setMaximumRowCount(5);
        opcionBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Higiene", "Viveres", "Panaderia", "Limpieza", "Comida" }));
        opcionBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionBusquedaActionPerformed(evt);
            }
        });
        background.add(opcionBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 110, -1));

        inputBuscar.setBackground(new java.awt.Color(255, 255, 255));
        inputBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        inputBuscar.setForeground(new java.awt.Color(153, 153, 153));
        inputBuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputBuscar.setText("Ingrese su busqueda");
        inputBuscar.setBorder(null);
        inputBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputBuscarMousePressed(evt);
            }
        });
        background.add(inputBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 150, 30));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 130, 10));

        btnBuscar.setBackground(new java.awt.Color(0, 163, 255));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Buscar");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        background.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 70, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionBusquedaActionPerformed

    private void panelDesplazarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelDesplazarMousePressed

    private void panelDesplazarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazarMouseDragged
        int xPositionMouse = evt.getXOnScreen();
        int yPositionMouse = evt.getYOnScreen();
        this.setLocation(xPositionMouse-xMouse, yPositionMouse-yMouse);
    }//GEN-LAST:event_panelDesplazarMouseDragged

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(0,110,255));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(0,163,255));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnMovimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMovimientoMouseEntered
        btnMovimiento.setBackground(new Color(0,110,255));
    }//GEN-LAST:event_btnMovimientoMouseEntered

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(0,110,255));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        btnActualizar.setBackground(new Color(0,110,255));
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(0,110,255));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setBackground(new Color(0,110,255));
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnMovimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMovimientoMouseExited
        btnMovimiento.setBackground(new Color(0,163,255));
    }//GEN-LAST:event_btnMovimientoMouseExited

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(0,163,255));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        btnActualizar.setBackground(new Color(0,163,255));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(0,163,255));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setBackground(new Color(0,163,255));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnConfiguracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseEntered
        btnConfiguracion.setBackground(new Color(0,110,255));
    }//GEN-LAST:event_btnConfiguracionMouseEntered

    private void btnConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseExited
        btnConfiguracion.setBackground(new Color(0,163,255));
    }//GEN-LAST:event_btnConfiguracionMouseExited

    private void inputBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputBuscarMousePressed
        if (inputBuscar.getText().equals("Ingrese su busqueda")) {
            inputBuscar.setText("");
            inputBuscar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_inputBuscarMousePressed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        if (inputBuscar.getText().equals("Ingrese su busqueda") || inputBuscar.getText().isEmpty()) {
            showMessageDialog(null, "Por favor ingrese una busqueda", "Error al buscar", 0);
        }else {
            inputBuscar.setText("Ingrese su busqueda");
            inputBuscar.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        fS.setConectado(false);
        conectado = fS.isConectado();
        fS.setUsuario("");
        fS.cambiarVentanas(conectado, vS, this);
        JOptionPane.showMessageDialog(null, "¡Cierre de sesión exitoso!", "Sesión finalizada", 1);
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnActualizar;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnConfiguracion;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnMovimiento;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JComboBox<String> opcionBusqueda;
    private javax.swing.JPanel panelDesplazar;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
