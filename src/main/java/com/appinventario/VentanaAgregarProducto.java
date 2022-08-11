package com.appinventario;

import com.funcionalidad.FuncionesInventario;
import com.funcionalidad.Validaciones;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jenderson
 */
public class VentanaAgregarProducto extends javax.swing.JFrame {

    int xMouse, yMouse;
    int filaSeleccionada;
    String usuario;
    FuncionesInventario fI;
    VentanaInventario vI;
    Validaciones val;
    
    DefaultTableModel tablaAgregados;

    public VentanaAgregarProducto(String usuario, FuncionesInventario fInventario, Validaciones v, VentanaInventario vI) {
        initComponents();
        
        this.usuario = usuario;
        this.fI = fInventario;
        this.val = v;
        this.vI = vI;
        tablaAgregados = (DefaultTableModel) tablaProductos.getModel();
    }
    
    public VentanaAgregarProducto() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackgraund = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        labelSalir = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        panelDesplazar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JPanel();
        labelAgregar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        labelEliminar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        labelGuardar = new javax.swing.JLabel();
        inputFecha = new com.toedter.calendar.JDateChooser();
        inputCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        inputCategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panelBackgraund.setBackground(new java.awt.Color(0, 163, 255));
        panelBackgraund.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        labelSalir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelSalir.setForeground(new java.awt.Color(255, 255, 255));
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setText("X");

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBackgraund.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 30, 30));

        labelTitulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Agrega Nuevos Productos");
        panelBackgraund.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 60));

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

        javax.swing.GroupLayout panelDesplazarLayout = new javax.swing.GroupLayout(panelDesplazar);
        panelDesplazar.setLayout(panelDesplazarLayout);
        panelDesplazarLayout.setHorizontalGroup(
            panelDesplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        panelDesplazarLayout.setVerticalGroup(
            panelDesplazarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panelBackgraund.add(panelDesplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Nombre", "Categoría", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
        }

        panelBackgraund.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 570, 270));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelAgregar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        labelAgregar.setForeground(new java.awt.Color(0, 163, 255));
        labelAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAgregar.setText("Agregar");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addComponent(labelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addComponent(labelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelBackgraund.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 80, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelEliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        labelEliminar.setForeground(new java.awt.Color(0, 163, 255));
        labelEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEliminar.setText("Eliminar");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBackgraund.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 80, 30));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        labelGuardar.setForeground(new java.awt.Color(0, 163, 255));
        labelGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGuardar.setText("Guardar");

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBackgraund.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, 30));

        inputFecha.setBackground(new java.awt.Color(255, 255, 255));
        inputFecha.setForeground(new java.awt.Color(0, 0, 0));
        panelBackgraund.add(inputFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        inputCantidad.setBackground(new java.awt.Color(255, 255, 255));
        inputCantidad.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        inputCantidad.setForeground(new java.awt.Color(122, 122, 122));
        inputCantidad.setText(" Cantidad");
        inputCantidad.setBorder(null);
        panelBackgraund.add(inputCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 60, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Cantidad:");
        panelBackgraund.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 70, -1));

        inputNombre.setBackground(new java.awt.Color(255, 255, 255));
        inputNombre.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        inputNombre.setForeground(new java.awt.Color(122, 122, 122));
        inputNombre.setText("  Ingrese el nombre");
        inputNombre.setBorder(null);
        panelBackgraund.add(inputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, 30));

        inputCategoria.setBackground(new java.awt.Color(255, 255, 255));
        inputCategoria.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        inputCategoria.setForeground(new java.awt.Color(122, 122, 122));
        inputCategoria.setText("  Ingrese la categoría");
        inputCategoria.setBorder(null);
        panelBackgraund.add(inputCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 150, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Fecha:");
        panelBackgraund.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nombre:");
        panelBackgraund.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 80, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Categoría:");
        panelBackgraund.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgraund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgraund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelDesplazarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelDesplazarMousePressed

    private void panelDesplazarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazarMouseDragged
        int xMouseEnPantalla = evt.getXOnScreen();
        int yMouseEnPantalla = evt.getYOnScreen();
        this.setLocation(xMouseEnPantalla - xMouse, yMouseEnPantalla - yMouse);
    }//GEN-LAST:event_panelDesplazarMouseDragged

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        if (tablaProductos.getRowCount() >= 1) {
            int eleccion = JOptionPane.showConfirmDialog(null, "¿Quiere cerrar la ventana? Perderá todos los productos agregados", "No ha guardado los productos", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            if (eleccion == 0) {
                this.setVisible(false);
                inputCantidad.setText(" Cantidad");
                inputCantidad.setForeground(new Color(122,122,122));
                inputFecha.setDate(null);
                inputNombre.setText("  Ingrese el nombre");
                inputNombre.setForeground(new Color(122,122,122));
                inputCategoria.setText("  Ingrese la categoría");
                inputCategoria.setForeground(new Color(122,122,122));
                tablaAgregados.getDataVector().removeAllElements();
                tablaProductos.updateUI();
            }
        } else {
            this.setVisible(false);
            inputCantidad.setText(" Cantidad");
            inputCantidad.setForeground(new Color(122,122,122));
            inputFecha.setDate(null);
            inputNombre.setText("  Ingrese el nombre");
            inputNombre.setForeground(new Color(122,122,122));
            inputCategoria.setText("  Ingrese la categoría");
            inputCategoria.setForeground(new Color(122,122,122));
        }
    }//GEN-LAST:event_btnSalirMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JTextField inputCantidad;
    private javax.swing.JTextField inputCategoria;
    private com.toedter.calendar.JDateChooser inputFecha;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgregar;
    private javax.swing.JLabel labelEliminar;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelBackgraund;
    private javax.swing.JPanel panelDesplazar;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
