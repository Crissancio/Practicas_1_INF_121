/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minecraft;

/**
 *
 * @author CINTHIA
 */
public class BloqueCofre {
    private int capacidad,resistencia;
    private String tipo;
    public BloqueCofre(int capacidad, int resistencia, String tipo){
        this.capacidad=capacidad;
        this.resistencia=resistencia;
        this.tipo=tipo;
    }
    public void acccion(){
        System.out.println("--------- BLOQUE COFRE -------- ");
        System.out.println("Puedes guardar tus objetos aqui");
        System.out.println("puedes poner objetos pero no mas de "+capacidad);
        System.out.println("tienen una resistencia de "+ resistencia);
        System.out.println("puedeser de muchos tipos como "+ tipo);
        
    }
    public void colocar(String lugar){
        System.out.println("colocar el bloque en :"+lugar);
    }
    public void colocar(int x,int y){
        System.out.println("colocar el bloque en las coordenadas: "+x+","+y);
    }
    public void romper(){
        System.out.println("ho NO rompiste tu Bloque Cofre!!!!!!! \n Donde guardaras tus objetos T-T");
    }
}
