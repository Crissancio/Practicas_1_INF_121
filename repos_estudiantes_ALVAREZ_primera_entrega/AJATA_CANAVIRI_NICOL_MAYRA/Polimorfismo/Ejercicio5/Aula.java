package Polimorfismo.Ejercicio5;

public class Aula {
    String nombre;
    int capacidad;
    int nropupitres;

    public Aula(String nombre, int capacidad, int nropupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nropupitres = nropupitres;
    }

    public void mostrar() {
        System.out.println("Aula - Nombre: " + nombre + ", Capacidad: " + capacidad + ", Pupitres: " + nropupitres);
    }

    public int cantidadMuebles() {
        return nropupitres;
    }

    public int cantidadMuebles(int nroSillasAdicionales) {
        return nropupitres + nroSillasAdicionales;
    }
}
