
package com.appinventario;

import com.funcionalidad.FuncionesInventario;
import com.funcionalidad.Validaciones;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jenderson
 */
public class VentanaMovimiento extends javax.swing.JFrame {
    
    // Variables
    int xMouse, yMouse;
    int filaSeleccionada;
    String usuario;
    FuncionesInventario fI;
    VentanaInventario vI;
    Validaciones val;
    String textTemp = "";
    String conteoTemp = "";
    
    
    // Apartado para crear tabla de cambios de productos
    DefaultTableModel tablaCambios;
    Object [] productoGuardado = new Object[4];
    Object [] productoCargado = new Object[6];
    
    public VentanaMovimiento(String usuario, FuncionesInventario fInventario, Validaciones v, VentanaInventario vI) {
        initComponents();
        
        this.usuario = usuario;
        this.fI = fInventario;
        this.vI = vI;
        this.val = v;
        tablaCambios = (DefaultTableModel) tablaCambiosProductos.getModel();
        
        fI.cargarOpcionesProductos(inputNombre);
        
        
    }
    
    public VentanaMovimiento() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelDesplazar = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCambiosProductos = new javax.swing.JTable();
        inputFecha = new com.toedter.calendar.JDateChooser();
        inputMovimiento = new javax.swing.JComboBox<>();
        inputCantidad = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JPanel();
        labelEliminar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        labelGuardar = new javax.swing.JLabel();
        inputNombre = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JPanel();
        labelAgregar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(650, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 163, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRA EL CAMBIO EN TUS PRODUCTOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 490, 66));

        panelDesplazar.setBackground(new java.awt.Color(0, 163, 255));
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

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
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

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelDesplazarLayout = new javax.swing.GroupLayout(panelDesplazar);
        panelDesplazar.setLayout(panelDesplazarLayout);
        panelDesplazarLayout.setHorizontalGroup(
            panelDesplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDesplazarLayout.createSequentialGroup()
                .addContainerGap(620, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelDesplazarLayout.setVerticalGroup(
            panelDesplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesplazarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelDesplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        tablaCambiosProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Nombre", "Movimiento", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tablaCambiosProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 550, 240));

        inputFecha.setBackground(new java.awt.Color(255, 255, 255));
        inputFecha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(inputFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 30));

        inputMovimiento.setBackground(new java.awt.Color(255, 255, 255));
        inputMovimiento.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        inputMovimiento.setForeground(new java.awt.Color(0, 0, 0));
        inputMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Salida" }));
        jPanel1.add(inputMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, 30));

        inputCantidad.setBackground(new java.awt.Color(255, 255, 255));
        inputCantidad.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        inputCantidad.setForeground(new java.awt.Color(0, 0, 0));
        inputCantidad.setText("Cantidad");
        inputCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputCantidadMousePressed(evt);
            }
        });
        jPanel1.add(inputCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 70, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setToolTipText("Elimina el elemento seleccionado de la lista de cambios");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });

        labelEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        labelEliminar.setForeground(new java.awt.Color(0, 163, 255));
        labelEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEliminar.setText("Eliminar");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 80, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Cantidad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 70, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Fecha:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 100, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Movimiento:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 100, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setForeground(new java.awt.Color(0, 163, 255));
        btnGuardar.setToolTipText("Guarda todos los cambios que están en la lista de cambios");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });

        labelGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        labelGuardar.setForeground(new java.awt.Color(0, 163, 255));
        labelGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGuardar.setText("Guardar");

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 80, 30));

        inputNombre.setBackground(new java.awt.Color(255, 255, 255));
        inputNombre.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        inputNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(inputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 160, 30));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setToolTipText("Agregue un elmento a la tabla de cambios");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });

        labelAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        labelAgregar.setForeground(new java.awt.Color(0, 163, 255));
        labelAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAgregar.setText("Agregar");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 80, 30));

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
    
    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void panelDesplazarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelDesplazarMousePressed

    private void panelDesplazarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazarMouseDragged
        int xPositionMouse = evt.getXOnScreen();
        int yPositionMouse = evt.getYOnScreen();
        this.setLocation(xPositionMouse-xMouse, yPositionMouse-yMouse);
    }//GEN-LAST:event_panelDesplazarMouseDragged

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (tablaCambiosProductos.getSelectedRow() != -1) {
            tablaCambios.removeRow(tablaCambiosProductos.getSelectedRow());
            JOptionPane.showMessageDialog(null, "¡Producto eliminado con éxito!", "Producto Eliminado", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto antes de eliminar", "No ha seleccionado un producto", 1);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if (fI.cargarCambios(tablaCambios)) {
            
            vI.Actualizar();
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(153,153,153));
        labelEliminar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(255,255,255));
        labelEliminar.setForeground(new Color(0,163,255));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(153,153,153));
        labelGuardar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(255,255,255));
        labelGuardar.setForeground(new Color(0,163,255));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(153,153,153));
        labelAgregar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(255,255,255));
        labelAgregar.setForeground(new Color(0,163,255));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

        if (val.validarFecha(inputFecha.getDate())) {
            if (val.validarCantidad(inputCantidad.getText())) {
                java.sql.Date fecha = new java.sql.Date(inputFecha.getDate().getTime());
                productoGuardado[0] = fecha;
                productoGuardado[1] = inputNombre.getSelectedItem();
                productoGuardado[2] = inputMovimiento.getSelectedItem();
                productoGuardado[3] = inputCantidad.getText();

                fI.revisarRepetidos(tablaCambios, productoGuardado);
            }
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void inputCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputCantidadMousePressed
        inputCantidad.setText("");
    }//GEN-LAST:event_inputCantidadMousePressed

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
            java.util.logging.Logger.getLogger(VentanaMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMovimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JTextField inputCantidad;
    private com.toedter.calendar.JDateChooser inputFecha;
    private javax.swing.JComboBox<String> inputMovimiento;
    private javax.swing.JComboBox<String> inputNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgregar;
    private javax.swing.JLabel labelEliminar;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JPanel panelDesplazar;
    private javax.swing.JTable tablaCambiosProductos;
    // End of variables declaration//GEN-END:variables
}
