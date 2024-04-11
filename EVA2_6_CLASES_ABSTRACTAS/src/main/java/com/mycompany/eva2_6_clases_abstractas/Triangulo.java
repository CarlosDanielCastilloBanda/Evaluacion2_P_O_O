/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_clases_abstractas;

/**
 *
 * @author
 */
public class Triangulo extends Figura {
     //dos atributos base y altura, constructores get y set 
    
    private double base;
    private double altura;

    public Triangulo() {
      this.base = 0;
        this.altura = 0;  
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
      return (base * altura)  / 2;
    }
private double calcularHip(){
    //teorema de pitagoras
    return Math.sqrt(Math.pow(base,2)+ Math.pow(altura, 2));
}
    @Override
    public double CalcularPerimetro() {
        return base + altura + calcularHip();
    }
    
}
