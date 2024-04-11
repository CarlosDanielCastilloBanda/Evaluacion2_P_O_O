/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_vehiculo;

/**
 *
 * @author nacho
 */
public class EVA2_3_VEHICULO {

    public static void main(String[] args) {
    Vehiculo carro1 = new Vehiculo();
        carro1.imprimirDatos();
        //
        Vehiculo carro2 = new Vehiculo("Ford", "Mustang", "rojo", 1997);
        carro2.setMarca("panasonic");
        carro2.setModelo("lujo");
        carro2.setColor("rojo");
        carro2.setAño(1999);
        carro2.imprimirDatos();   
    }
    
}
