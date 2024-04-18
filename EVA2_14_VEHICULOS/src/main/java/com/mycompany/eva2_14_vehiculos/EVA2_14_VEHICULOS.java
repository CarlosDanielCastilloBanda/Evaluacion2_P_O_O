/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_vehiculos;

/**
 *
 *
 */
public class EVA2_14_VEHICULOS {

    public static void main(String[] args) {
   Vehiculo flota[] = new Vehiculo[10];
   flota[0] = new Automovil(4,0);
   flota[1] = new Automovil(4,0);
   flota[2] = new Automovil(4,0);
   flota[3] = new Automovil(4,0);
   flota[4] = new Automovil(4,0);
   flota[5] = new Motocicleta(125,0);
   flota[6] = new Motocicleta(200,0);
   flota[7] = new Motocicleta(400,0);
   flota[8] = new Motocicleta(600,0);
   flota[9] = new Motocicleta(1000,0);
   //---------------------------------------------
           Automovil auto = (Automovil) flota[0];
           System.out.println("Numero de puertas: " + auto.getNopuertas());
           Motocicleta moto = (Motocicleta) flota [6];
           System.out.println("Capacidad (CC): " + moto.getCapacidad());
           
           //si no sabemos que tipo de objeto esta almacenado usamos istanceof
           
           if(flota[1] instanceof Automovil){
               auto = (Automovil) flota[1];
               System.out.println("Numero de puertas: " + auto.getNopuertas());
           }
           //vamos a modificar la velocidad de los vehiculos;
           acelerar(auto, 50);
           acelerar(auto, 50);
           System.out.println("Velocidad " + auto.getVelocidad());
           acelerar(auto, 100);
           System.out.println("Velocidad " + moto.getVelocidad());
           acelerar(moto, -30);
           System.out.println("Velocidad " + moto.getVelocidad());
           acelerar(flota[2], 70);
           System.out.println("Velocidad " + flota[2].getVelocidad());
    }
    public static void acelerar(Vehiculo vehiculo, int ajuste){
   

}
    
}



