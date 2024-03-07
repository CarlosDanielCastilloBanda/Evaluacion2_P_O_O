/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_sobrecarga_metodos;

/**
 *
 * @author nacho
 */
public class EVA2_1_SOBRECARGA_METODOS {

    public static void main(String[] args) {
    System.out.println("la suma de 5 + 4 = " + sumar(4,5));
    System.out.println("la suma de 3.1 + 2.5 = " + sumar(3.1,2.5));
    System.out.println("la suma de hola + mundo = " + sumar("hola ","mundo"));
    sumar();
    //sumar:metodo sobrecargado, mismo nombre para 
    //3 diferentes metodos
    }
    public static int sumar(int numero1, int numero2){
    return numero1 + numero2;
    }
    public static double sumar(double numero1, double numero2){
    return numero1 + numero2;
    }
    public static String sumar(String numero1, String numero2){
    return numero1 + numero2;
    }
    
    public static void sumar(){
    System.out.println("Metodo que no hace nada!!!");
    }
    public static int sumar(int numero1, int numero2, int numero3){
    return numero1 + numero2 + numero3;
    }
}
