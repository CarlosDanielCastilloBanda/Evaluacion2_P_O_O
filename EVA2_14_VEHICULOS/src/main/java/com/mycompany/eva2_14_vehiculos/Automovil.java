/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_14_vehiculos;

/**
 *
 * 
 */
public class Automovil  extends Vehiculo{
    private int Nopuertas;

    public Automovil() {
        super();
        Nopuertas = 0;
    }

    public Automovil(int Nopuertas) {
        this.Nopuertas = Nopuertas;
    }

    public Automovil(int Nopuertas, int velocidad) {
        super(velocidad);
        this.Nopuertas = Nopuertas;
    }

    public int getNopuertas() {
        return Nopuertas;
    }

    public void setNopuertas(int Nopuertas) {
        this.Nopuertas = Nopuertas;
    }
    
    
}
