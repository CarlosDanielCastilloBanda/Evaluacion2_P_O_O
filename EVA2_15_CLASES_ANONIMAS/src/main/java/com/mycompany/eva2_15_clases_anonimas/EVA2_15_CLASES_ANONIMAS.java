/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_15_clases_anonimas;

/**
 *
 * @author nacho
 */
public class EVA2_15_CLASES_ANONIMAS {

    public static void main(String[] args) {
        
       // Prueba prueba = new Pruwba[(); ---> no se puede intercambiar
       //no se pueden objetos de interfaces 
       //usando polimorfismo:
       //estamos creando una clase sin nombre  que implementa los metosodos de la interfaz 
       // la asignamos a un identificador de tipo prueba 
       //relacion por herencia 
        Prueba prueba = new Prueba() {
            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo!!");
            }
        };
        prueba.mostrarMensaje();
        
        
        ClaseAbstracta prueba2 = new ClaseAbstracta() {
            @Override
            public void otroMensaje() {
                System.out.println("Ahora con clase abstracta");
            }
        };
        prueba2.otroMensaje();
        
        
    }
    interface Prueba{
        public void mostrarMensaje();
        
    }
}
abstract class ClaseAbstracta{
    public abstract void otroMensaje();
    
    
    public void mensaje(){
        System.out.println("Hola mundo!!!");
    }
}

