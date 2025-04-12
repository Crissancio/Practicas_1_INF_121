/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_1;

/**
 *
 * @author Trabajo
 */
public class Videojuego {
    private String titulo;
    private String genero;
    private int jugadores;
    public Videojuego(String titulo) {
        this.titulo = titulo;
        this.jugadores = 1;
    }
    public Videojuego(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.jugadores = 1;
    }

    public Videojuego(String titulo, String genero, int jugadores) {
        this.titulo = titulo;
        this.genero = genero;
        this.jugadores = jugadores;
    }

    public void mostrar() {
        System.out.println("Titulo: " + titulo);
        if(genero != null) {
            System.out.println("Genero: " + genero);
        }
        System.out.println("Jugadores: " + jugadores);
    }
    public void agregarJugadores() {
        this.jugadores += 1;
    }

    public void agregarJugadores(int cantidad) {
        this.jugadores += cantidad;
    }
}
