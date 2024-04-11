/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_has_a;

/**
 *
 * @author
 */
public class EVA2_11_HAS_A {

    public static void main(String[] args) {
        Direccion direc = new Direccion ("paro","17", "pecos", "18530", "chihuahua","chihuahua");
        Persona person = new Persona ("lorenzo","sarte",18,direc);
        System.out.println(person);
    }   
}
