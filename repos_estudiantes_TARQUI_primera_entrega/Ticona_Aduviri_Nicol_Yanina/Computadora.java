/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer9;

/**
 *
 * @author HP-RYZEN 5
 */
public class Computadora {
    private boolean estado;
    private String componente[];
    private int nrocomp;

    public Computadora() {
        this.estado = false;
        this.componente = new String[50];
        this.nrocomp = 5;
        componente[0] = "mouse";
        componente[1] = "monitor";
        componente[2] = "bocinas";
        componente[3] = "impresora";
        componente[4] = "teclado";
         
    }
    
    public void mostrarcomp(){
        if(estado){
            for (int i = 0; i < nrocomp; i++) {
                System.out.println("componente nro: "+(i+1)+": "+componente[i]);              
            }
        }else{
            System.out.println("la computadara esta apagada");
        }
    }
    
    public void encender(){
        estado = true;
        System.out.println("la computadora esta encendida");
    }
    
    public void apagar(){
        estado = false;
        System.out.println("la computadora esta apagada");
    }
    
}
