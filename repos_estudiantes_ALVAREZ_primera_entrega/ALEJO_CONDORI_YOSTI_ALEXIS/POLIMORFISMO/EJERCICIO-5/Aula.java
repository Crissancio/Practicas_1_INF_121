package Ejercicio5;

public class Aula {
    private String nombre;
    private int capacidad;
    private int nropupitres;
    public Aula(String nombre, int capacidad, int nroPupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nropupitres = nroPupitres;
    }
    public void mostrar() {
        System.out.println("Aula: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pupitres: " + nropupitres);
    }
    public int cantidadMuebles() {
        return nropupitres;
    }
    public void cantidadMuebles(boolean mostrarTexto) {
        if (mostrarTexto) {
            System.out.println(nombre+" total pupitres en aula: "+nropupitres);
        }
    }
}
