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
        System.out.println("Oficina:");
        System.out.println("Sillas: " + nroSillas);
        System.out.println("Escritorios: " + nroEscritorios);
        System.out.println("Estanterías: " + nroEstanterias);
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
        System.out.println("Aula:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pupitres: " + nroPupitres);
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
        System.out.println("Laboratorio:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Mesas: " + nroMesas);
        System.out.println("Sillas: " + nroSillas);
    }

    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }
}

public class Universidad {
    public static void main(String[] args) {
        Oficina o1 = new Oficina(6, 4, 4);
        Oficina o2 = new Oficina(3, 3, 2);
        Aula a1 = new Aula("INF121", 95, 95);
        Aula a2 = new Aula("INF-133", 65, 65);
        Laboratorio l1 = new Laboratorio("LASIN 1", 40, 35, 50);

        o1.mostrar();
        System.out.println("Total muebles: " + o1.cantidadMuebles() + "\n");

        o2.mostrar();
        System.out.println("Total muebles: " + o2.cantidadMuebles() + "\n");

        a1.mostrar();
        System.out.println("Total muebles: " + a1.cantidadMuebles() + "\n");

        a2.mostrar();
        System.out.println("Total muebles: " + a2.cantidadMuebles() + "\n");

        l1.mostrar();
        System.out.println("Total muebles: " + l1.cantidadMuebles() + "\n");
    }
}
