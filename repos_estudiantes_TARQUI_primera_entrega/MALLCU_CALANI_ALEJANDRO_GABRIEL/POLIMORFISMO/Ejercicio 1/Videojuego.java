/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.videojuego;

/**
 *
 * @author USUARIO
 */
public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    // Constructor vacío
    public Videojuego() {
        this.nombre = "Sin Nombre";
        this.plataforma = "Desconocida";
        this.cantidadJugadores = 0;
    }

    // Constructor con parámetros básicos
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1; // Por defecto, al menos un jugador
    }

    // Constructor con todos los parámetros
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    // Método mostrar()
    public String mostrar() {
        return "Nombre: " + nombre + ", Plataforma: " + plataforma + ", Jugadores: " + cantidadJugadores;
    }

    // Sobrecargar agregarJugadores() para añadir un solo jugador
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
    }

    // Sobrecargar agregarJugadores() para añadir una cantidad específica de jugadores
    public void agregarJugadores(int jugadores) {
        this.cantidadJugadores += jugadores;
    }

    public static void main(String[] args) {
        // Instanciar al menos 2 videojuegos
        Videojuego juego1 = new Videojuego("Minecraft", "PC");
        Videojuego juego2 = new Videojuego("FIFA 23", "PS5", 4);

        // Mostrar los detalles de los videojuegos
        System.out.println(juego1.mostrar());
        System.out.println(juego2.mostrar());

        // Probar las sobrecargas de agregarJugadores()
        juego1.agregarJugadores();
        System.out.println("Después de agregar un jugador: " + juego1.mostrar());

        juego2.agregarJugadores(3);
        System.out.println("Después de agregar 3 jugadores: " + juego2.mostrar());
    }
}
