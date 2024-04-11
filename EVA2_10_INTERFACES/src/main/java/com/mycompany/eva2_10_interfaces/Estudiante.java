/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_10_interfaces;

/**
 *
 * @author
 */
public class Estudiante extends Persona implements Datos, GenerarFecha {
    private String noControl;

    public Estudiante() {
        super();
        this.noControl = "----";
    }

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public Estudiante(String noControl, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    @Override
    public void imprimirDatos() {
       System.out.println("Nombre: " + getNombre() );
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad()); 
        System.out.println("Calcular año : " + calcularAnnioNac());
    }

    @Override
    public String generNombreCompleto() {
        return getNombre() + " " +getApellidos();
    }

    @Override
    public int calcularAnnioNac() {
      return 2024 - getEdad();  
    }

}
