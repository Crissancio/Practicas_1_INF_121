package Polimorfismo;

class Oficina {
    int nroSillas;
    int nroEscritorios;
    int nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }

    public void mostrar() {
        System.out.println("Oficina [nroSillas=" + nroSillas + ", nroEscritorios=" + nroEscritorios + ", nroEstanterias=" + nroEstanterias + "]");
    }

    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }
}

class Aula {
    String nombre;
    int capacidad;
    int nroPupitres;

    public Aula(String nombre, int capacidad, int nroPupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = nroPupitres;
    }

    public void mostrar() {
        System.out.println("Aula [nombre=" + nombre + ", capacidad=" + capacidad + ", nroPupitres=" + nroPupitres + "]");
    }

    public int cantidadMuebles() {
        return nroPupitres;
    }
}

class Laboratorio {
    String nombre;
    int capacidad;
    int nroMesas;
    int nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }

    public void mostrar() {
        System.out.println("Laboratorio [nombre=" + nombre + ", capacidad=" + capacidad + ", nroMesas=" + nroMesas + ", nroSillas=" + nroSillas + "]");
    }

    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }
}

public class Universidad {
    public static void main(String[] args) {

        Oficina oficina1 = new Oficina(5, 3, 2);
        Oficina oficina2 = new Oficina(10, 6, 4);
        Aula aula1 = new Aula("Aula 101", 30, 30);
        Aula aula2 = new Aula("Aula 102", 50, 50);
        Laboratorio laboratorio = new Laboratorio("Lab Computación", 20, 10, 15);

        System.out.println("--- Datos de las Oficinas ---");
        oficina1.mostrar();
        oficina2.mostrar();

        System.out.println("\n--- Datos de las Aulas ---");
        aula1.mostrar();
        aula2.mostrar();

        System.out.println("\n--- Datos del Laboratorio ---");
        laboratorio.mostrar();

        System.out.println("\n--- Cantidad de muebles ---");
        System.out.println("Oficina 1: " + oficina1.cantidadMuebles() + " muebles");
        System.out.println("Oficina 2: " + oficina2.cantidadMuebles() + " muebles");
        System.out.println("Aula 1: " + aula1.cantidadMuebles() + " muebles");
        System.out.println("Aula 2: " + aula2.cantidadMuebles() + " muebles");
        System.out.println("Laboratorio: " + laboratorio.cantidadMuebles() + " muebles");
    }
}