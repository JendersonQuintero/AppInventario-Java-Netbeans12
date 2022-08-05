package com.appinventario;

import com.funcionalidad.FuncionesSesion;
import com.funcionalidad.GuardarDatos;


/**
 *
 * @author Jenderson
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializar base de datos
        GuardarDatos gD = new GuardarDatos();
        
        // Inicializar Funciones de Sesión
        FuncionesSesion fS = new FuncionesSesion(gD);
        
        // Se inicia y activa la ventana de Login
        VentanaInicioSesion vInit = new VentanaInicioSesion(gD, fS);
        vInit.setVisible(true);

//        FuncionesInventario fI = new FuncionesInventario("Norangel", gD);
//        
//        String[] prod = gD.cargarProductos();
//        String[] prodUser = fI.productosUsuario();
//        
//        System.out.println(prodUser[0]);
    }
    
}
