/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_sobrecarga_constructores;

/**
 *
 * @author nacho
 */
public class EVA2_2_SOBRECARGA_CONSTRUCTORES {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        perso1.imprimirDatos();
        //
        Persona person2 = new Persona("pedro", "paramo", 70);
        person2.setNombre("juan");
        person2.setApellidos("rulfo");
        person2.setEdad(80);
        person2.imprimirDatos();
        
    }
}
