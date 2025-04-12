package Universidad;

public class Aula {
	private String nombre;
    private int capacidad;
    private int pupitres;

    public Aula(String nombre, int capacidad, int pupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pupitres = pupitres;
    }

    public void mostrar() {
        System.out.println("\n--- Aula ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pupitres: " + pupitres);
    }

    public int cantidadMuebles() {
        return pupitres;
    }

    public int cantidadMuebles(boolean incluirSillasImplicitas) {
        if (incluirSillasImplicitas) {
            return pupitres + capacidad; // Asumiendo que cada pupitre tiene una silla
        } else {
            return cantidadMuebles();
        }
    }
}
