/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minecraft;

/**
 *
 * @author CINTHIA
 */
public class BloqueHorno {
     private String color;
    private int capacidadComida;
    public BloqueHorno(String color, int capacidadComida){
        this.color=color;
        this.capacidadComida=capacidadComida;
    }
    public void acccion(){
            System.out.println("--------- BLOQUE HORNO -------- ");
        System.out.println("Aqui puedes fundir o cocinar objetos o bloques");
        System.out.println("puedes tener distintos colores como "+color);
        System.out.println("si lo tienes puedes sobrevivir ya q puedes tener de comida "+capacidadComida);
        
        
    }
    public void colocar(String lugar){
        System.out.println("colocar el bloque en :"+lugar);
    }
    public void colocar(int x,int y){
        System.out.println("colocar el bloque en las coordenadas: "+x+","+y);
    }
    public void romper(){
        System.out.println("Rompiste tu Bloque Horno \n donde calentaras tu comida \n donde fundiras tus metales ");
    }
}
