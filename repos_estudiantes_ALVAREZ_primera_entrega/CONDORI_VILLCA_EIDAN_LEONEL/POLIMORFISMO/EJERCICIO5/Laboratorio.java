package POLIMORFISMO.EJERCICIO5;
public class Laboratorio {
    private String nombre;
    private int capacidad,nroMesas,nroSillas;

    public Laboratorio(String nombre, int capacidad, int mesas, int sillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = mesas;
        this.nroSillas = sillas;
    }

    public void mostrar() {
        System.out.println("Laboratorio: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Mesas: " + nroMesas);
        System.out.println("Sillas: " + nroSillas);
        System.out.println("-----------------------------");
    }

    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }

    public int cantidadMuebles(boolean cantidad) {
        if (cantidad) {
            System.out.println("Detalle: Mesas(" + nroMesas + ") + Sillas(" + nroSillas + ")");
        }
        return cantidadMuebles();
    }
}
