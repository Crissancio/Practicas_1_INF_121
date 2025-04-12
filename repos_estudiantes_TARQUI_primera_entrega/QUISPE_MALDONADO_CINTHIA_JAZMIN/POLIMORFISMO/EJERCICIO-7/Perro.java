/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author CINTHIA
 */
public class Perro {
    private String nombre , raza;
    private int edad;
    public Perro(String nombre ,int edad,String raza){
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;
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
            System.out.println("Guau Guau Guau Guau");
        
    }
    public void moverse(){
        System.out.println("el perro corre y salta");
        
    }
}
