
package ejercicio2_5;

public class Aula {
    private String nombre;
    private int capacidad;
    private int nroPupitres;

    public Aula(String nombre, int capacidad, int pupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = pupitres;
    }

    public void mostrar() {
        System.out.println("Aula = Nombre: " + nombre + ", Capacidad: " + capacidad + ", Pupitres: " + nroPupitres);
    }

    public int cantidadMuebles() {
        return nroPupitres;
    }

    public void cantidadMuebles(String tipo) {
        System.out.println("Total muebles Aula: " + cantidadMuebles());
    }
}
