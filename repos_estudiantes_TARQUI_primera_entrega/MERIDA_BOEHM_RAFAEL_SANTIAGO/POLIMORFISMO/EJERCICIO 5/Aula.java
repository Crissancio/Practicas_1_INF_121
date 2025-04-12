package EJERCICIO5;

public class Aula {
    public String nombre;
    public int capacidad;
    public int nroPupitres;

    public Aula(String nombre, int capacidad, int nroPupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = nroPupitres;
    }

    public int cantidadMuebles() {
        return this.nroPupitres;
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Aula -> Nombre: " + this.nombre + ", Capacidad: " + this.capacidad + ", Pupitres: " + this.nroPupitres +
               ", Total Muebles: " + this.cantidadMuebles();
    }
}
