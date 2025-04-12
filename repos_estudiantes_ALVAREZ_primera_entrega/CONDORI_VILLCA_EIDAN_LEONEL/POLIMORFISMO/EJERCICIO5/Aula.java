package POLIMORFISMO.EJERCICIO5;

public class Aula {
    private String nombre;
    private int capacidad,nroPupitres;

    public Aula(String nombre, int capacidad, int pupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = pupitres;
    }

    public void mostrar() {
        System.out.println("Aula: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pupitres: " + nroPupitres);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public int cantidadMuebles() {
        return nroPupitres;
    }

    public int cantidadMuebles(boolean cantidad) {
        if (cantidad) {
            System.out.println("Detalle: Pupitres(" + nroPupitres + ")");
        }
        return cantidadMuebles();
    }
}