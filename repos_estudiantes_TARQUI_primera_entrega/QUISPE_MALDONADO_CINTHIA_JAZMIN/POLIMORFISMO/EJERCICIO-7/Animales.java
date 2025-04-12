/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

/**
 *
 * @author CINTHIA
 */
public class Animales {
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p1=new Perro("Toby",4,"Labrador");
        Gato g1=new Gato("Pelusa","Negro");
        Pajaro pa1=new Pajaro("Chivi","Gorrion"); 
        p1.hacerSonido();
        g1.hacerSonido("Miiauuu");
        pa1.hacerSonido(5, "Gurruuu");
        p1.moverse();
        g1.moverse();
        pa1.moverse();
        
    }
    
}
