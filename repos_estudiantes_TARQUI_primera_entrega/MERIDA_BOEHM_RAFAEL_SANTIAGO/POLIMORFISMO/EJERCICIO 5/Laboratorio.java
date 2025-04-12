package EJERCICIO5;

public class Laboratorio {
    public String nombre;
    public int capacidad;
    public int nroMesas;
    public int nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }

    public int cantidadMuebles() {
        return this.nroMesas + this.nroSillas;
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Laboratorio -> Nombre: " + this.nombre + ", Capacidad: " + this.capacidad + ", Mesas: " + this.nroMesas + 
               ", Sillas: " + this.nroSillas + ", Total Muebles: " + this.cantidadMuebles();
    }
}

