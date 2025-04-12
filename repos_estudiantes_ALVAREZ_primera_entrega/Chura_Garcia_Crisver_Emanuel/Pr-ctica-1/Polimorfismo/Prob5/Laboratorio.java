//5. Se hace referencia a algunos de los diferentes ambientes de la Universidad mediante las siguientes clases:
public class Laboratorio {
    private String nombre;
    private int capacidad, nroMesas, nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }

    // b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar() {
        if (nroSillas == 0 && nroMesas == 0) {
            System.out.println("Laboratorio sin muebles");
        } else {
            if (nroSillas == 0) {
                if (capacidad == 0) {
                    System.out
                            .println("El laboratorio: " + nombre + " no cuenta con sillas pero cuenta con: " + nroMesas
                                    + " mesas disponibles aunque el ambiente ya no cuenta con capacidad disponible");

                } else {
                    System.out
                            .println("El laboratorio: " + nombre + " no cuenta con sillas pero cuenta con: " + nroMesas
                                    + " mesas disponibles y con una capacidad de: " + capacidad + " estudiantes");
                }
            } else {
                if (nroMesas == 0) {
                    if (capacidad == 0) {
                        System.out.println(
                                "El laboratorio: " + nombre + " no cuenta con mesas pero cuenta con: " + nroSillas
                                        + " sillas disponibles aunque el ambiente ya no cuenta con capacidad disponible");
                    } else {
                        System.out.println(
                                "El laboratorio: " + nombre + " no cuenta con mesas pero cuenta con: " + nroSillas
                                        + " sillas disponibles y con una capacidad de: " + capacidad + " estudiantes");
                    }
                } else {
                    if (capacidad == 0) {
                        System.out.println("El laboratorio: " + nombre + " cuenta con: " + nroMesas + " mesas y "
                                + nroSillas + " sillas aunque este no cuente con capacidad disponible");
                    } else {
                        System.out.println(
                                "El laboratorio: " + nombre + " cuenta con: " + nroMesas + " mesas, " + nroSillas
                                        + " sillas y con una capacidad de: " + capacidad + " de estudiantes");
                    }
                }
            }
        }

    }

    public void cantidadMuebles() {
        int cantmub = nroMesas + nroSillas;
        if (cantmub == 0) {
            System.out.println("El laboratorio: " + nombre + " no cuenta con muebles");
        } else {
            System.out.println("El laboratorio: " + nombre + " cuenta con un total de: " + cantmub + " muebles");
        }
    }
}
