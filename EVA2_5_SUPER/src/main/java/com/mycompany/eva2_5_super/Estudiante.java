/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_super;

/**
 *
 * @author 
 */ //         hija       de      padre
//             subclase    de superclase
public class Estudiante extends Persona {
private String noControl;
private String carrera;

    public Estudiante() {
        super();//llamada al constructor de la super clase
        noControl = "_____";
        carrera = "____";  
    }
    //regl de herencia: simpre llamar a al contructor de la superclase
    //simpre tiene que ser la primera instruccion del constructor
    public Estudiante(String nombre, String apellidoMaterno, String apellidoPaterno, int edad, char genero, String noControl, String carrera){
    super(nombre, apellidoMaterno, apellidoPaterno, edad, genero);
    this.noControl = noControl;
    this.carrera = carrera;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
@Override
  public void imprimirDatos(){
      super.imprimirDatos();
  System.out.println("No de control" + noControl);
  System.out.println("carrera" + carrera);
  
  }
}
