/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_has_a;

/**
 *
 * @author 
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad; 
    private Direccion direccion;//PERSONA HAS a DIRECCION, direccion es componente de persona 

    public Persona() {
      this.nombre = "-------";
        this.apellidos = "---------";
        this.edad = 0;
        this.direccion = new Direccion();  
    }

    public Persona(String nombre, String apellidos, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString (){
    String cade ="Nombre: "+ nombre + "\n" + "Apellidos: "+ apellidos + "\n"
            +"Edad: "+ edad+ "\n"+ "Direccion: "+ direccion;
            return cade;
            
    }    
}
