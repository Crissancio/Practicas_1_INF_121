package universidad;
public class Aula {
    private String nombre;
    private int capacidad;
    private int nroPupitres;

    public Aula(String nombre, int capacidad, int nroPupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = nroPupitres;
    }

    public void mostrar() {
        System.out.println("Aula: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pupitres: " + nroPupitres);
        System.out.println("Total muebles: " + cantidadMuebles());
        System.out.println("------------------------");
    }

    public int cantidadMuebles() {
        return nroPupitres;
    }
}
