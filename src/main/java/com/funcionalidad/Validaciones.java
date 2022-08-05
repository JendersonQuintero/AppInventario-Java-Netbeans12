package com.funcionalidad;

import java.util.regex.Pattern;


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
    
    
    public boolean inputValido(String tipo, String dato) {
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
    
    
    
    
    
    
    
    
}
