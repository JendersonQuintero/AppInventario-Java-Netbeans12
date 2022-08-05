/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcionalidad;

/**
 *
 * @author Jenderson
 */
public class FuncionesInventario {
    
    // Instaciamos objeto para validar los datos de inicio
    Validaciones vl = new Validaciones();
    
    // Instaciamos objeto de GuardarDatos
    GuardarDatos gDatos;
    
    // Varible para almacenar usuario conectado
    String usuario;
    
    public FuncionesInventario(String usuario, GuardarDatos gD) {
        this.gDatos = gD;
        this.usuario = usuario;
    }
    
    public String[] productosUsuario() {
        String[] todosProductos = gDatos.cargarProductos();
        String productosTexto = "";
        
        if (todosProductos != null) {
            for (String datos : todosProductos) {
                String[] datosProductos = datos.split(",");
            
                if (datosProductos[0].equals(usuario)) {
                    productosTexto += datos + "\n";
                }
            }
            if (productosTexto.equals("")) {
                return null;
            } else {
                String[] productos = productosTexto.split("\n");
                return productos;
            }
        }
        return null;
    }

    
    
    
}
