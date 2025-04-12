/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minecraft;

/**
 *
 * @author CINTHIA
 */
public class Minecraft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BloqueCofre bc1=new BloqueCofre(56,485,"diamante"); 
        BloqueCofre bc2=new BloqueCofre(20,150,"madera"); 
        BloqueTnt bt1=new BloqueTnt("Explisivo",50);
        BloqueTnt bt2=new BloqueTnt("Mortal",156);
        BloqueHorno bh1=new BloqueHorno("Morado",26);
        BloqueHorno bh2=new BloqueHorno("Azul",74);
        bc1.acccion();
        bc2.acccion();
        bt1.acccion();
        bt2.acccion();
        bh1.acccion();
        bh2.acccion();
        System.out.println("--------------");
        bc1.colocar("Suelo");
        bc2.colocar(45, 2);
        System.out.println("--------------");
        bc2.romper();
        bt1.romper();
        bh2.romper();
        
       
    }
    
}
