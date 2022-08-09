package com.funcionalidad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


/**
 *
 * @author Jenderson
 */
public class GuardarDatos {
    
    // Creación de archivos para almacenar la información
    String dirUsuarios = "Datos\\Usuarios.txt";
    String dirProductos = "Datos\\Productos.txt";
    String dirConfiguracion = "Datos\\Configuracion.txt";
    File txtUsuarios = new File(dirUsuarios);
    File txtProductos = new File(dirProductos);
    File txtConfiguracion = new File(dirConfiguracion);
    
    
    /**
     * Constructor de los txt
     */
    public GuardarDatos() {
        try {
            if (txtUsuarios.exists()) {
            } else {
                txtUsuarios.createNewFile();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        
        try {
            if (txtProductos.exists()) {
            } else {
                txtProductos.createNewFile();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        
        try {
            if (txtConfiguracion.exists()) {
            } else {
                txtConfiguracion.createNewFile();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    
    public void registrarUsuario(Object[] dato) {
        try {
            FileWriter fW = new FileWriter(txtUsuarios, true);
            
            fW.write(String.valueOf(dato[0])); // Usuario
            fW.write(",");
            fW.write(String.valueOf(dato[1])); // Correo
            fW.write(",");
            fW.write(String.valueOf(dato[2])); // Contraseña
            fW.write("\n");
            fW.close();
            
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public void registrarProducto(Object[] dato) {
        try {
            FileWriter fW = new FileWriter(txtProductos, true);
            
            fW.write(String.valueOf(dato[0])); // Usuario
            fW.write(",");
            fW.write(String.valueOf(dato[1])); // Fecha
            fW.write(",");
            fW.write(String.valueOf(dato[2])); // Nombre
            fW.write(",");
            fW.write(String.valueOf(dato[3])); // Categoría
            fW.write(",");
            fW.write(String.valueOf(dato[4])); // Cantidad Inicial
            fW.write(",");
            fW.write(String.valueOf(dato[5])); // Cantidad Final
            fW.write("\n");
            fW.close();
            
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public String[] cargarUsuarios() {
        String texto = "";
        String[] usuarios;
        try {
            BufferedReader bF = new BufferedReader(new FileReader(txtUsuarios));
            String temp = "";
            String bfRead;
            while ((bfRead = bF.readLine()) != null) {
                temp += bfRead + "\n";
            }
            texto = temp;
        } catch (IOException e) {
            System.err.println(e);
        }
        usuarios = texto.split("\n");
        
        if (usuarios[0].equals("")) {
            return null;
        }
        return usuarios;
        
    }
    
    public String[] cargarProductos() {
        String texto = "";
        String[] productos;
        try {
            BufferedReader bF = new BufferedReader(new FileReader(txtProductos));
            String temp = "";
            String bfRead;
            while ((bfRead = bF.readLine()) != null) {
                temp += bfRead + "\n";
            }
            texto = temp;
        } catch (IOException e) {
            System.err.println(e);
        }
        productos = texto.split("\n");
        
        if (productos[0].equals("")) {
            return null;
        }
        return productos;
    }
    
    public void limpiarTxt(String eleccion) {
        File elegido;
        switch (eleccion) {
            case "Productos":
                elegido = txtProductos;
                break;
            case "Usuarios":
                elegido = txtUsuarios;
                break;
            case "Configuracion":
                elegido = txtConfiguracion;
                break;
            default:
                elegido = txtProductos;
        }
        try{
            PrintWriter p = new PrintWriter(elegido);
            p.print("");
        } catch(FileNotFoundException e){  
            System.err.println(e);
        }
    }
    
    public void reescribirTxt(String nuevaData, String eleccion) {
        File elegido;
        switch (eleccion) {
            case "Productos":
                elegido = txtProductos;
                break;
            case "Usuarios":
                elegido = txtUsuarios;
                break;
            case "Configuracion":
                elegido = txtConfiguracion;
                break;
            default:
                elegido = txtProductos;
        }
        limpiarTxt(eleccion);
        try (BufferedWriter escribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(elegido, true)))) {
            escribe.write(nuevaData);
            escribe.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        
    }
    
    public boolean existeUsuario(String usuario) {
        String[] todosUsuarios = cargarUsuarios();
        
        for (String dato : todosUsuarios) {
            String[] datosUsuario = dato.split(",");
            
            if (datosUsuario[0].equals(usuario)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean existeProducto(String producto) {
        String[] todosProductos = cargarProductos();
        
        for (String dato : todosProductos) {
            String[] datosProducto = dato.split(",");
            
            if (datosProducto[2].equals(producto)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean ingresarSistema(String usuario, String clave) {
        String[] todosUsuarios = cargarUsuarios();
        
        for (String dato : todosUsuarios) {
            String[] datosUsuario = dato.split(",");
            
            if (datosUsuario[0].equals(usuario) & datosUsuario[2].equals(clave)) {
                return true;
            }
        }
        return false;
    }
}
