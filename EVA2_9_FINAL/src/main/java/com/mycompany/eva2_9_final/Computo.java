/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_final;

/**
 *
 * @author 
 */
public final class Computo extends Electronica {
    private int ram;
    private String discoDuro;
    private String procesador;

    public Computo() {
        this.ram = 0;
        this.discoDuro = "----";
        this.procesador = "-----";
    }

    public Computo(int ram, String discoDuro, String procesador) {
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
    }

    public Computo(int ram, String discoDuro, String procesador, String marca, boolean garantia) {
        super(marca, garantia);
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
    }

    public Computo(int ram, String discoDuro, String procesador, String marca, boolean garantia, String nombre, double precio) {
        super(marca, garantia, nombre, precio);
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    @Override
    public String toString (){
        String cade= super.toString() + "\n" ;
        cade += "Ram: "+ ram + "\n" +
                "Disco Duro: " + discoDuro+ "\n" +
                "Procesador: " + procesador ;
       return cade;
    }
    
}
