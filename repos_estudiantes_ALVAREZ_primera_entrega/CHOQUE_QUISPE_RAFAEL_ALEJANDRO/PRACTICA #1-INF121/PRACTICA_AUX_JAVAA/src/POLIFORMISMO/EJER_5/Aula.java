/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_5;

/**
 *
 * @author Trabajo
 */
public class Aula {
    private String nombre;
    private int capacidad;
    private int propugüres; 

    public Aula(String nombre, int capacidad, int propugüres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.propugüres = propugüres;
    }
    public void mostrar() {
        System.out.println("Aula " + nombre + ":");
        System.out.println("  Capacidad: " + capacidad);
        System.out.println("  Propugres: " + propugüres); 
    }
    public int cantidadMuebles() {
        return propugüres;
    }
    public int cantidadMuebles(int mueblesPorPersona) {
        return propugüres + (capacidad * mueblesPorPersona);
    }
}
