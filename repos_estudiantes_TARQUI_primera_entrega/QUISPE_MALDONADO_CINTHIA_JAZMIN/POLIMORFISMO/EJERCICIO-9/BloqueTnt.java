/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minecraft;

/**
 *
 * @author CINTHIA
 */
public class BloqueTnt {
    private String tipo;
    private int dano;
    public BloqueTnt(String tipo, int dano){
        this.tipo=tipo;
        this.dano=dano;
    }
    public void acccion(){
        System.out.println("--------- BLOQUE TNT -------- ");
        System.out.println("Es el explosivo del Creeper");
        System.out.println("son muy daninos como "+dano);
        System.out.println("pueden ser de tipo "+tipo);
        
    }
    public void colocar(String lugar){
        System.out.println("colocar el bloque en :"+lugar);
    }
    public void colocar(int x,int y){
        System.out.println("colocar el bloque en las coordenadas: "+x+","+y);
    }
    public void romper(){
        System.out.println("HO NOOO!!!! \n CUIDADO VA A EXPLOTARRRRR!!!!!!!!!");
    }
}
