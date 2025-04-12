/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER1;

/**
 *
 * @author LENOVO
 */
public class VideoJuego {
    String nombre;
    String plataforma;
    int cantJugadores;

    public VideoJuego(String nombre) {
        this.nombre = nombre;
        this.plataforma = "online";
        this.cantJugadores = 0;
    }

    public VideoJuego(String nombre, String plataforma, int cantJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantJugadores = cantJugadores;
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    public void agreJugadores() {
        this.cantJugadores += 1;
    }

    public void agregarJugadores(int cantidad) {
        this.cantJugadores += cantidad;
    }

    @Override
    public String toString() {
        return "Videojuego: " + "\nNombre: " + nombre + "\nPlataforma: " + plataforma +"\nCantidad de Jugadores: " + cantJugadores;
    }  
}
