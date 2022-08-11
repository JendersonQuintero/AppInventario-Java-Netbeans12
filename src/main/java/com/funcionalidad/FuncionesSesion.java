/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcionalidad;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Jenderson
 */
public class FuncionesSesion {
    
    // Instaciamos objeto para validar los datos de inicio
    Validaciones vl = new Validaciones();
    
    // Variables de control de sesion
    boolean conectado;
    String usuario;
    
    // Instaciamos objeto de GuardarDatos
    GuardarDatos gDatos;
    
    public FuncionesSesion(GuardarDatos gD) {
        this.gDatos = gD;
    }
    
    public boolean validarRegistroUsuario(String usuario, String correo, String clave) {
        // Validacion de datos ingresados por el usuario
        if (vl.validacionesRegistro("Correo", correo) & vl.validacionesRegistro("Usuario", usuario) & vl.validacionesRegistro("Clave", clave)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Verifique los datos ingresados, revise los TIPS dejando el cursor sobre el campo", "Error en los datos", 0);
            return false;
        }
    }

    
    public boolean registrarUsuario(String usuario, String correo, String clave) {
        if (gDatos.existeUsuario(usuario)) {
            JOptionPane.showMessageDialog(null, "¡El usuario que ingresaste ya ha sido creado! por favor utiliza otro", "Usuario repetido", 0);
            return false;
        } else {
            // Registro de usuario en la base de datos local
            gDatos.registrarUsuario(new Object[]{usuario,correo,clave});
            setConectado(true);
            setUsuario(usuario);
            return true;
        }
    }
    
    public boolean iniciarSesion(String usuario, String clave) {
        if (gDatos.ingresarSistema(usuario, clave)) {
            JOptionPane.showMessageDialog(null, "¡Iniciaste sesión con éxito!", "Inicio exitoso", 1);
            setConectado(true);
            setUsuario(usuario);
            return true;
        }
        JOptionPane.showMessageDialog(null, "¡Contraseña incorrecta! Por favor verifiquela e intente de nuevo", "Error en la contraseña", 0);
        return false;
    }
    
    public void cambiarVentanas(boolean estado, JFrame ventanaInicio, JFrame ventanaInventario) {
        if (estado) {
            ventanaInicio.setVisible(!estado);
            ventanaInventario.setVisible(estado);
        } else {
            ventanaInicio.setVisible(!estado);
            ventanaInventario.setVisible(estado);
        }
    }

    public boolean isConectado() {
        return conectado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
