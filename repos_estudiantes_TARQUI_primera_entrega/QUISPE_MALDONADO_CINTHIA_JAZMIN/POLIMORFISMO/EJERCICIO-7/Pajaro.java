/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author CINTHIA
 */
public class Pajaro {
   private String nombre ,tipo;
   public Pajaro(String nombre,String tipo){
       this.nombre=nombre;
       this.tipo=tipo;
   }
   public void hacerSonido(int cantidad,String sonido){
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
            System.out.println("pio Pio Pio Pio");
        
    }
    public void moverse(){
        System.out.println("el pajaro vuela");
        
    }
}
