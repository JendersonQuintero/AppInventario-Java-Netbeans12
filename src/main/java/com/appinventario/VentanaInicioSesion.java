package com.appinventario;


import com.funcionalidad.FuncionesInventario;
import com.funcionalidad.FuncionesSesion;
import com.funcionalidad.GuardarDatos;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jenderson
 */
public class VentanaInicioSesion extends javax.swing.JFrame {
    // Instancia de Ventana de Inventario, Funciones de sesión
    GuardarDatos gDatos;
    VentanaInventario vI;
    FuncionesSesion fS;
    FuncionesInventario fI;
    
    // Variable de Inicio de Sesión y de usuario conectado
    public boolean conectado = false;
    public String usuarioConectado;

    // Variables para configurar posición de ventana
    int xMouse, yMouse;
    
    // Apartado de modificación de Tabla de Usuarios
    DefaultTableModel usuarios;
    Object [] usuarioGuardado = new Object[1];
    Object [] usuarioCargado = new Object[3];
    
    // Variable para almacenar a Todos los Usuarios
    String[] todosUsuarios;
    
    /**
     * Creates new form VentanaInicioSesion
     * @param gD
     * @param funSe
     */
    public VentanaInicioSesion(GuardarDatos gD, FuncionesSesion funSe) {
        initComponents();
        
        // Tabla de usuarios
        usuarios = (DefaultTableModel) tablaUsuarios.getModel();
        
        // Asociar instancia de GuardarDatos con constante gDatos y FuncionesSesion
        this.gDatos = gD;
        this.fS = funSe;
        
        // Cargamos los datos guardados
        todosUsuarios = gDatos.cargarUsuarios();
        
        if (todosUsuarios != null) {
            for (String usuarioSelect : todosUsuarios) {
                String[] datosUsuario = usuarioSelect.split(",");
                usuarioGuardado[0] = datosUsuario[0];
                usuarios.addRow(usuarioGuardado);
            }
        }
    }
    
    public VentanaInicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackgroung = new javax.swing.JPanel();
        jPanelRegistro = new javax.swing.JPanel();
        jSeparatorCorreo = new javax.swing.JSeparator();
        jSeparatorUsuario = new javax.swing.JSeparator();
        jSeparatorContraseña = new javax.swing.JSeparator();
        jLabelRegistro = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        inputCorreo = new javax.swing.JTextField();
        inputUsuario = new javax.swing.JTextField();
        inputClave = new javax.swing.JPasswordField();
        btnEnviar = new javax.swing.JPanel();
        labelEnviar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        labelSalir = new javax.swing.JLabel();
        jLabelNameApp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnIniciar = new javax.swing.JPanel();
        labelIniciar = new javax.swing.JLabel();
        panelDesplazar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBackgroung.setBackground(new java.awt.Color(0, 163, 255));
        jPanelBackgroung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jPanelRegistro.setPreferredSize(new java.awt.Dimension(240, 500));
        jPanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelRegistro.add(jSeparatorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 168, -1));
        jPanelRegistro.add(jSeparatorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 168, 10));
        jPanelRegistro.add(jSeparatorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 168, 10));

        jLabelRegistro.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistro.setText("REGISTRATE");
        jLabelRegistro.setPreferredSize(new java.awt.Dimension(200, 14));
        jPanelRegistro.add(jLabelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 29, 190, 56));

        jLabelContrasena.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabelContrasena.setForeground(new java.awt.Color(0, 0, 0));
        jLabelContrasena.setText("Contraseña");
        jPanelRegistro.add(jLabelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, -1));

        jLabelCorreo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCorreo.setText("Correo");
        jPanelRegistro.add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 50, -1));

        jLabelUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsuario.setText("Usuario");
        jPanelRegistro.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, -1));

        inputCorreo.setBackground(new java.awt.Color(255, 255, 255));
        inputCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        inputCorreo.setForeground(new java.awt.Color(153, 153, 153));
        inputCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputCorreo.setText("Ingrese su correo electrónico");
        inputCorreo.setToolTipText("<html>\nEl correo debe tener la siguiente estructura:\n<br>\n<strong>correo@ejemplo.com</strong>\n</html>");
        inputCorreo.setBorder(null);
        inputCorreo.setPreferredSize(new java.awt.Dimension(128, 26));
        inputCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputCorreoMousePressed(evt);
            }
        });
        jPanelRegistro.add(inputCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 168, 30));

        inputUsuario.setBackground(new java.awt.Color(255, 255, 255));
        inputUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        inputUsuario.setForeground(new java.awt.Color(153, 153, 153));
        inputUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputUsuario.setText("Ingrese su usuario");
        inputUsuario.setToolTipText("<html>\n<p>El usuario solo puede contener:</p>\n<ul>\n<li>Letras</li>\n<li>Números</li>\n</ul>\n<p>No puede contener <strong>ESPACIOS EN BLANCO</strong></p>\n</html>");
        inputUsuario.setBorder(null);
        inputUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputUsuarioMousePressed(evt);
            }
        });
        jPanelRegistro.add(inputUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 168, 30));

        inputClave.setBackground(new java.awt.Color(255, 255, 255));
        inputClave.setForeground(new java.awt.Color(153, 153, 153));
        inputClave.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputClave.setText("123456789012");
        inputClave.setToolTipText("<html>\n<p><strong>La contraseña debe contener</strong></p>\n<ul>\n<li>Al menos una letra mayúscula</li>\n<li>Al menos una letra minúscula</li>\n<li>Al menos un número</li>\n<li>Al menos un caracter especial</li>\n<li>Mínimo 8 caracteres</li>\n<li>Máximo 15 caracteres</li>\n</ul>\n</html>");
        inputClave.setBorder(null);
        inputClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputClaveMousePressed(evt);
            }
        });
        jPanelRegistro.add(inputClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 168, 30));

        btnEnviar.setBackground(new java.awt.Color(0, 163, 255));
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });

        labelEnviar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        labelEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnviar.setText("Enviar");
        labelEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEnviar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnEnviarLayout = new javax.swing.GroupLayout(btnEnviar);
        btnEnviar.setLayout(btnEnviarLayout);
        btnEnviarLayout.setHorizontalGroup(
            btnEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEnviarLayout.createSequentialGroup()
                .addComponent(labelEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnEnviarLayout.setVerticalGroup(
            btnEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanelRegistro.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jPanelBackgroung.add(jPanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));
        jPanelRegistro.getAccessibleContext().setAccessibleName("jPanelRegistro");

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setPreferredSize(new java.awt.Dimension(30, 30));
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

        labelSalir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        labelSalir.setForeground(new java.awt.Color(255, 255, 255));
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setText("X");

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelBackgroung.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 30, 30));

        jLabelNameApp.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNameApp.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabelNameApp.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNameApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNameApp.setText("CHECK YOUR STOCK");
        jPanelBackgroung.add(jLabelNameApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 370, 140));

        jScrollPane1.setBackground(new java.awt.Color(0, 163, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tablaUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        tablaUsuarios.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        tablaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuarios Registrados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.setSelectionBackground(new java.awt.Color(0, 110, 255));
        tablaUsuarios.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaUsuarios);

        jPanelBackgroung.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 180, 190));

        btnIniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
        });

        labelIniciar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        labelIniciar.setForeground(new java.awt.Color(0, 163, 255));
        labelIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIniciar.setText("Iniciar");
        labelIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelIniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnIniciarLayout = new javax.swing.GroupLayout(btnIniciar);
        btnIniciar.setLayout(btnIniciarLayout);
        btnIniciarLayout.setHorizontalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIniciarLayout.createSequentialGroup()
                .addComponent(labelIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnIniciarLayout.setVerticalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanelBackgroung.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        getContentPane().add(jPanelBackgroung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        getContentPane().add(panelDesplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnSalirMouseExited

    private void panelDesplazarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelDesplazarMousePressed

    private void panelDesplazarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesplazarMouseDragged
        int xPositionMouse = evt.getXOnScreen();
        int yPositionMouse = evt.getYOnScreen();
        this.setLocation(xPositionMouse-xMouse, yPositionMouse-yMouse);
    }//GEN-LAST:event_panelDesplazarMouseDragged

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(new Color(0,110,255));
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(new Color(0,163,255));
    }//GEN-LAST:event_btnEnviarMouseExited

    private void inputUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUsuarioMousePressed
        if (inputUsuario.getText().equals("Ingrese su usuario")) {
            inputUsuario.setText("");
            inputUsuario.setForeground(Color.BLACK);
        }
        
        if (inputCorreo.getText().isEmpty()) {
            inputCorreo.setText("Ingrese su correo electrónico");
            inputCorreo.setForeground(new Color(153,153,153));
        }
        
        if (String.valueOf(inputClave.getPassword()).isEmpty()) {
            inputClave.setText("123456789012");
            inputClave.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_inputUsuarioMousePressed

    private void inputCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputCorreoMousePressed
        if (inputCorreo.getText().equals("Ingrese su correo electrónico")) {
            inputCorreo.setText("");
            inputCorreo.setForeground(Color.BLACK);
        }
        
        if (inputUsuario.getText().isEmpty()) {
            inputUsuario.setText("Ingrese su usuario");
            inputUsuario.setForeground(new Color(153,153,153));
        }
        
        if (String.valueOf(inputClave.getPassword()).isEmpty()) {
            inputClave.setText("123456789012");
            inputClave.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_inputCorreoMousePressed

    private void inputClaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputClaveMousePressed
        if (String.valueOf(inputClave.getPassword()).equals("123456789012")) {
            inputClave.setText("");
            inputClave.setForeground(Color.BLACK);
        }

        if (inputUsuario.getText().isEmpty()) {
            inputUsuario.setText("Ingrese su usuario");
            inputUsuario.setForeground(new Color(153,153,153));
        }
        
        if (inputCorreo.getText().isEmpty()) {
            inputCorreo.setText("Ingrese su correo electrónico");
            inputCorreo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_inputClaveMousePressed

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        if (fS.validarRegistroUsuario(inputUsuario.getText(), inputCorreo.getText(), String.valueOf(inputClave.getPassword()))) {
            
            // Se registra y valida el usuario
            if (fS.registrarUsuario(inputUsuario.getText(), inputCorreo.getText(), String.valueOf(inputClave.getPassword()))) {
                // Activamos la ventana de inventario
                this.conectado = fS.isConectado();
                this.usuarioConectado = fS.getUsuario();
                fI = new FuncionesInventario(this.usuarioConectado, this.gDatos);
                vI = new VentanaInventario(this.usuarioConectado, this.conectado, this.fI, this.fS, this);
                fS.cambiarVentanas(conectado, this, vI);
                JOptionPane.showMessageDialog(null, "¡Usuario creado exitosamente!", "Registro exitoso", 1);

                // Se agrega el usuario a la tabla de usuarios registrados
                usuarioGuardado[0] = inputUsuario.getText();
                usuarios.addRow(usuarioGuardado);
            }
        }
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        int filaSeleccionada = tablaUsuarios.getSelectedRow();
        if (filaSeleccionada >= 0) {
            usuarioConectado = String.valueOf(tablaUsuarios.getValueAt(filaSeleccionada, 0));
            JPanel panel = new JPanel();
            JPasswordField passf = new JPasswordField(16);
            JLabel label = new JLabel("Ingrese la contraseña correspondiente al usuario: " + usuarioConectado);
            panel.add(label);
            panel.add(passf);
            String[] opciones = {"OK", "Cancelar"};
            int okCxl = JOptionPane.showOptionDialog(null, panel, "Ingrese la contraseña", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (okCxl == JOptionPane.OK_OPTION) {
                String clave = String.valueOf(passf.getPassword());
                if (this.fS.iniciarSesion(usuarioConectado, clave)) {
                    this.conectado = fS.isConectado();
                    fI = new FuncionesInventario(this.usuarioConectado, this.gDatos);
                    vI = new VentanaInventario(this.usuarioConectado, this.conectado, this.fI, this.fS, this);
                    fS.cambiarVentanas(conectado, this, vI);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un usuario", "Debe seleccionar un usuario", 0);
        }
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setBackground(new Color(153,153,153));
        labelIniciar.setForeground(new Color(255,255,255));
        
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new Color(255,255,255));
        labelIniciar.setForeground(new Color(0,163,255));
    }//GEN-LAST:event_btnIniciarMouseExited

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
            java.util.logging.Logger.getLogger(VentanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEnviar;
    private javax.swing.JPanel btnIniciar;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPasswordField inputClave;
    private javax.swing.JTextField inputCorreo;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelNameApp;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelBackgroung;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorContraseña;
    private javax.swing.JSeparator jSeparatorCorreo;
    private javax.swing.JSeparator jSeparatorUsuario;
    private javax.swing.JLabel labelEnviar;
    private javax.swing.JLabel labelIniciar;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JPanel panelDesplazar;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
