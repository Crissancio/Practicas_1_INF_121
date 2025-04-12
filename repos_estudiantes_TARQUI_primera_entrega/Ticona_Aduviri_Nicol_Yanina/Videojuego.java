/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author HP-RYZEN 5
 */
public class Videojuego {
    private String nom;
    private String plataforma;
    private int cantjugadores;

    public Videojuego() {
        this.nom = "minecraft";
        this.plataforma = "computadora";
        this.cantjugadores = 4;
    }

    public Videojuego(String nom, String plataforma, int jugadores) {
        this.nom = nom;
        this.plataforma = plataforma;
        cantjugadores = jugadores;
    }
    
    
    public void mostrar(){
        System.out.println("nombre: "+nom+" "+"plataforma: "+plataforma+" "+"cantjugadores: "+cantjugadores);
    }
    public void agregarjugadores(){
        cantjugadores = cantjugadores + 1;
        System.out.println(cantjugadores);
        
    }
    public void agregarjugadores(int jugadores){
        cantjugadores = cantjugadores + jugadores;
        System.out.println(cantjugadores);
  
    }
}
