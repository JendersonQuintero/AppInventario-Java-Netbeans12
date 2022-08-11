package com.funcionalidad;

import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author Jenderson
 */
public class Validaciones {
    
    // Patrón de validación de Correo
    String regxCorreo = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    Pattern patternCorreo = Pattern.compile(regxCorreo);
    
    // Patrón de validación de Usuario
    String regxUsuario = "[a-z,A-Z,á-ú,0-9]{6,15}";
    Pattern patternUsuario = Pattern.compile(regxUsuario);
    
    // Patrón de validación de Contraseña
    String regxClave = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,15}$";
    Pattern patternClave = Pattern.compile(regxClave);
    
    // Patrón para validar campos de texto
    String regxTexto = "([a-z,A-Z,á-ú,0-9\\s]){3,25}[^\\s]";
    Pattern patternTexto = Pattern.compile(regxTexto);
    
    
    private boolean validarCantidad(String cantidad) {
        if (!cantidad.equals("")) {
            try {
                Integer.parseInt(cantidad);
            } catch (NumberFormatException e) {
                return false;
            }
            if (Integer.parseInt(cantidad) <= 0) {
                return false;
            } else {
                return true;
            } 
        }
        return false;
    }
    
    private boolean validarFecha(Date fecha) {
        if (fecha != null) {
            return true;
        }
        return false;
    }
    
    private boolean validarTextField(String dato) {
        return patternTexto.matcher(dato).matches();
    }
    
    public boolean validacionesRegistro(String tipo, String dato) {
        switch (tipo) {
            case "Correo":
                return patternCorreo.matcher(dato).matches();
            case "Usuario":
                return patternUsuario.matcher(dato).matches();
            case "Clave":
                return patternClave.matcher(dato).matches();
            default:
                return false;
        }
    }
    
    public boolean validarCambiarProducto(Date fecha, String cantidad) {
        if (validarFecha(fecha) && validarCantidad(cantidad)) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Verifique los datos ingresados, deje el mouse sobre el campo para saber más", "Error en los datos",0);
        return false;
    }
    
    public boolean validarAgregarProducto(Date fecha, String nombre, String categoria, String cantidad) {
        if (validarFecha(fecha) && validarTextField(nombre) && validarTextField(categoria) && validarCantidad(cantidad)) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Verifique los datos ingresados, deje el mouse sobre el campo para saber más", "Error en los datos",0);
        return false;
    }
    
    
    
    
    
    
    
    
    
    
}
