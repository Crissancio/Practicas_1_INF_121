/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author CINTHIA
 */
public class Gato {
    private String nombre,color;
    public Gato(String nombre,String color){
     this.nombre=nombre;
     this.color=color;
    }
    public void hacerSonido(String tipo,int cantidad,String sonido){
        System.out.println("El sonido de "+nombre+" es :");
        for (int i=0; i<cantidad; i++){
            System.out.println(sonido);
        }
    }
    public void hacerSonido(String sonido){
        System.out.println("El sonido de "+nombre+" es :");
            System.out.println(sonido);
        
    }
    public void hacerSonido(){
        System.out.println("El sonido de "+nombre+" es :");
            System.out.println("Miau Miau Miau");
        
    }
    public void moverse(){
        System.out.println("el gato corre y salta");
        
    }
}
