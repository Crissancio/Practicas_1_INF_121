/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer5;

/**
 *
 * @author HP-RYZEN 5
 */
public class Estudiante {
    private String nom;
    private int not1;
    private int not2;

    public Estudiante(String nom, int not1, int not2) {
        this.nom = nom;
        this.not1 = not1;
        this.not2 = not2;
    }
    
    public float promedio(){
        int prom = (not1 + not2)/2;
        return prom;
         
    }
    
    public String verificar(){
        if(promedio()>= 6)
            return "aprobado";
        else
            return "reprobado";

    }
    public void mostrar(){
        System.out.println("nombre: " + nom +" "+ "promedio: "+ promedio()+"  "+ "este estudiante: "+ verificar());
    }
    
}
