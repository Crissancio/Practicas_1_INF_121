//5. Se hace referencia a algunos de los diferentes ambientes de la Universidad mediante las siguientes clases:
public class Aula {
    private String nombre;
    private int capacidad, nropupitres;

    public Aula(String nombre, int capacidad, int nropupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nropupitres = nropupitres;
    }

    // b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar() {
        if (nropupitres == 0) {
            System.out.println(
                    "Aula: " + nombre + " con una capacidad de: " + capacidad + " estudiantes no cuenta con pupitres");
        } else {
            System.out.println(
                    "Aula: " + nombre + " con una capacidad de: " + capacidad + " estudiantes y: " + nropupitres
                            + " pupitres");
        }
    }

    public void cantidadMuebles() {
        if (nropupitres == 0) {
            System.out.println("Aula: " + nombre + " sin muebles a disposición");
        } else {
            System.out
                    .println("Aula: " + nombre + " cuenta con un total de: " + nropupitres + " muebles a disposición");
        }
    }
}
