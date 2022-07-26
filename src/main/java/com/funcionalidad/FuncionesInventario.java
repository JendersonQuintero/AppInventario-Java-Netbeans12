/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcionalidad;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    String[] productosUsuario;
    
    public FuncionesInventario(String usuario, GuardarDatos gD) {
        this.gDatos = gD;
        this.usuario = usuario;
        
        this.productosUsuario = productosUsuario();
    }
    
    private void agregarProducto(Object[] producto) {
        gDatos.registrarProducto(producto);
    }
    
    private String extraerProductos() {
        String[] datosViejos = gDatos.cargarProductos();
        String datosLimpios = "";
        for (String datos : datosViejos) {
            String[] datosProducto = datos.split(",");
            
            if (!datosProducto[0].equals(this.usuario)) {
                datosLimpios += datos + "\n";
            }
        }
        return datosLimpios;
    }
    
    
    private String[] productosUsuario() {
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
    
    private void actualizarCantidad(String[] cambiosProductos) {
        String[] productosUser = productosUsuario();
        String[] datosCambio;
        String productosCambiados = "";
        String productoTemp;
        String datosFinales = "";
        boolean completado = true;
        boolean encontrado = false;
        int cantidadActual;
        int cantidadInicial;
        int nuevaCantidad;
        int suma;
        for (String producto : cambiosProductos) { // Producto, cantidad, movimiento: Entrada | Salida, fecha
            datosCambio = producto.split(",");
            nuevaCantidad = Integer.parseInt(datosCambio[1]);
            
            for (String datos : productosUser) {
                String[] datosProducto = datos.split(",");
            
                if (datosProducto[2].equals(datosCambio[0])) {
                    cantidadInicial = Integer.parseInt(datosProducto[4]);
                    cantidadActual = Integer.parseInt(datosProducto[5]);
                    if (datosCambio[2].equals("Entrada")) {
                        suma = cantidadActual + nuevaCantidad;
                    } else {
                        if (cantidadActual >= nuevaCantidad) {
                            suma = cantidadActual - nuevaCantidad;
                        } else {
                            JOptionPane.showMessageDialog(null, "No puede quitar más de la cantidad actual", "Error en cantidad", 0);
                            completado = false;
                            break;
                        }
                    }
                    
                    if ((suma) >= cantidadInicial) {
                        productoTemp = this.usuario + "," + datosCambio[3] + "," + datosProducto[2] + "," + datosProducto[3] + "," + String.valueOf(suma) + "," + String.valueOf(suma);
                    } else {
                        productoTemp = this.usuario + "," + datosCambio[3] + "," + datosProducto[2] + "," + datosProducto[3] + "," + String.valueOf(cantidadInicial) + "," + String.valueOf(suma);
                    }
                    productosCambiados += productoTemp + "\n";
                }
            }
            if (!completado) {
                break;
            }
        }
        String[] productoCambiado = productosCambiados.split("\n");
        for (String dato : productosUser) {
            String[] datosProducto = dato.split(",");
            
            for (String linea : productoCambiado) {
                String[] datosLinea = linea.split(",");
                
                if (datosProducto[2].equals(datosLinea[2])) {
                    datosFinales += linea + "\n";
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                datosFinales += dato + "\n";
            } else {
                encontrado = false;
            }
        }
        if (completado) {
            datosFinales += extraerProductos();
            reescribirProductos(datosFinales);
        }
    }
    
    public void reescribirProductos(String dataNueva) {
        gDatos.reescribirTxt(dataNueva, "Productos");
    }
    
    public boolean cargarCambios(DefaultTableModel tD) {
        String[] cambios;
        String datosCambios = "";
        
        String producto;
        String cantidad;
        String movimiento;
        String fecha;
        
        if (tD.getRowCount() >= 1) {
            for (int i = 0; i < tD.getRowCount(); i++) {
                producto = String.valueOf(tD.getValueAt(i, 1));
                cantidad = String.valueOf(tD.getValueAt(i, 3));
                movimiento = String.valueOf(tD.getValueAt(i, 2));
                fecha = String.valueOf(tD.getValueAt(i, 0));
                
                datosCambios += producto + "," + cantidad + "," + movimiento + "," + fecha + "\n";
            }
            cambios = datosCambios.split("\n");
            actualizarCantidad(cambios);
            this.productosUsuario = productosUsuario();
            JOptionPane.showMessageDialog(null, "Inventario actualizado con éxito", "Cambios Registrados", 1);
            return true;
        }
        JOptionPane.showMessageDialog(null, "Debe agregar cambios antes de guardar", "No ha agregado cambios", 0);
        return false;
    }
    
    public void cargarOpcionesProductos(JComboBox listaNombre) {
        String[] productos = productosUsuario();
        
        for (String producto : productos) {
            String[] datosProducto = producto.split(",");
            
            listaNombre.addItem(datosProducto[2]);
        }
    }
    
    public void revisarRepetidos(DefaultTableModel tD, Object[] productoGuardado) {
        String productoNuevo = String.valueOf(productoGuardado[1]);
        String productoViejo;
        boolean agregar = true;
        if (tD.getRowCount() <= 0) {
            tD.addRow(productoGuardado);
        } else if (tD.getRowCount() > 0) {
            for (int i = 0; i < tD.getRowCount(); i++) {
                productoViejo = String.valueOf(tD.getValueAt(i, 1));
                
                if (productoViejo.equals(productoNuevo)) {
                    agregar = false;
                    JOptionPane.showMessageDialog(null, "No se pueden agregar productos repetidos", "Error al agregar", 0);
                }
            }
            if (agregar) {
                tD.addRow(productoGuardado);
            }
        }
    }
    
    public void eliminarProducto(String producto) {
        String[] datosViejos = gDatos.cargarProductos();
        String datosNuevos = "";
        for (String datos : datosViejos) {
            String[] datosProducto = datos.split(",");
            
            if (!datosProducto[0].equals(this.usuario) && !datosProducto[2].equals(producto)) { // Se agregan todos excepto el producto eliminado
                datosNuevos += datos + "\n";
            }
        }
        reescribirProductos(datosNuevos);
        this.productosUsuario = productosUsuario();
    }
    
    public void agregarProductos(DefaultTableModel tD) {
        String producto;
        String cantidad;
        String categoria;
        String fecha;
        Object [] productoCargado = new Object[6];
        
        for (int i = 0; i < tD.getRowCount(); i++) {
            producto = String.valueOf(tD.getValueAt(i, 1));
            cantidad = String.valueOf(tD.getValueAt(i, 3));
            categoria = String.valueOf(tD.getValueAt(i, 2));
            fecha = String.valueOf(tD.getValueAt(i, 0));
                
            productoCargado[0] = this.usuario;
            productoCargado[1] = fecha;
            productoCargado[2] = producto;
            productoCargado[3] = categoria;
            productoCargado[4] = cantidad;
            productoCargado[5] = cantidad;
            
            agregarProducto(productoCargado);         
        }
    }
    
    public String[] getProductosUsuario() {
        return productosUsuario;
    }
    
    
    
    
    
    
}
