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
public class FuncionesConfiguracion {
    
    GuardarDatos gD;
    String usuario;
    
    public FuncionesConfiguracion(String usuario, GuardarDatos gDatos) {
        this.gD = gDatos;
        this.usuario = usuario;
    }
}
