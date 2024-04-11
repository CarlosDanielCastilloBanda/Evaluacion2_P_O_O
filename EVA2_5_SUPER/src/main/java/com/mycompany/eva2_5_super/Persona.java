/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_super;

/**
 *
 * @author 
 */
public class Persona {
  private String nombre;
  private String apellidoMaterno;
  private String apellidoPaterno;
  private int edad;
  private char genero;
    
  //constructores
    public Persona() {
     this.nombre = "ninguno";
        this.apellidoMaterno ="ningun apellido materno ";
        this.apellidoPaterno = "ningun apellido paterno ";
        this.edad = 0;
        this.genero ='-';   
    }

    public Persona(String nombre, String apellidoMaterno, String apellidoPaterno, int edad, char genero) {
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.edad = edad;
        this.genero = genero;
    }
     
    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombe) {
        this.nombre = nombe;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    //imprimirDatos
  public void imprimirDatos(){
  System.out.println("Nombre completo: "+ nombre +" "+ "apellidoMaterno" + " "+ "apellidoPaterno");
  System.out.println("Edad: "+ edad);
  System.out.println("Genero: "+ genero);
  
  }    
}
