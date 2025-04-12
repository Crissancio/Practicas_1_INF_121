package Ejercicio5;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }
    //b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Numero de mesas: " + nroMesas);
        System.out.println("Numero de sillas: " + nroSillas);
    }
    //c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
    //muebles dentro de cada ambiente
    public void cantidadMuebles() {
    	int m=nroMesas+nroSillas;
    	System.out.println("Cantidad de muebles Laboratorio "+nombre+" es: "+m);
    	
    }
    public void cantidadMuebles(int nroArmarios) {
        int total = nroMesas + nroSillas+nroArmarios;
        System.out.println("Cantidad de muebles en el laboratorio " + nombre + " (incluyendo armarios) es: " + total);
    }

    
}
