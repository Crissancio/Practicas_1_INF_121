
package ejercicio2_5;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;

    public Laboratorio(String nombre, int capacidad, int mesas, int sillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = mesas;
        this.nroSillas = sillas;
    }

    public void mostrar() {
        System.out.println("Laboratorio = Nombre: " + nombre + ", Capacidad: " + capacidad + ", Mesas: " + nroMesas + ", Sillas: " + nroSillas);
    }

    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }

    public void cantidadMuebles(String tipo) {
        System.out.println("Total muebles Laboratorio: " + cantidadMuebles());
    }
}
