/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_clases_abstractas;

/**
 *
 * @author
 */
public class Circulo extends Figura {
    private double radio;
    private final double pi = Math.PI;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
// Método para calcular el área del círculo
    @Override
    public double CalcularArea() {
        return (pi * radio * radio); 
    }

    @Override
    public double CalcularPerimetro() {
        return (pi * radio);
    }
   
    
}
