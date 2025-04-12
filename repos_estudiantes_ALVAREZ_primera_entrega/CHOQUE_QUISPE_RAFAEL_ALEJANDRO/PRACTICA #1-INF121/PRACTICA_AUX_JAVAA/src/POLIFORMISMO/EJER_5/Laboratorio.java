/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_5;

/**
 *
 *@author Trabajo
 */
public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int molMesas; 
    private int moSillas; 

    public Laboratorio(String nombre, int capacidad, int molMesas, int moSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.molMesas = molMesas;
        this.moSillas = moSillas;
    }
    public void mostrar() {
        System.out.println("Laboratorio " + nombre + ":");
        System.out.println("  Capacidad: " + capacidad);
        System.out.println("  Mesas: " + molMesas);
        System.out.println("  Sillas: " + moSillas);
    }

    public int cantidadMuebles() {
        return molMesas + moSillas;
    }

    public int cantidadMuebles(int pesoMesa, int pesoSilla) {
        return (molMesas * pesoMesa) + (moSillas * pesoSilla);
    }
}