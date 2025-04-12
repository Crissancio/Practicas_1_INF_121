class Ambiente {
    protected String nombre;
    protected String tipo;
    protected int muebles;

    public Ambiente(String nombre, String tipo, int muebles) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.muebles = muebles;
    }

    public void mostrar() {
        System.out.println(tipo + " - " + nombre + ", Muebles: " + muebles);
    }

    public int cantidadMuebles() {
        return muebles;
    }
}

class Oficina extends Ambiente {
    public Oficina(String nombre, int escritorios) {
        super(nombre, "Oficina", escritorios);
    }
}

class Aula extends Ambiente {
    public Aula(String nombre, int pupitres) {
        super(nombre, "Aula", pupitres);
    }
}

class Laboratorio extends Ambiente {
    public Laboratorio(String nombre, int mesasTrabajo, int computadoras) {
        super(nombre, "Laboratorio", mesasTrabajo + computadoras);
    }
}

public class Universidad {
    public static void main(String[] args) {
        Ambiente[] ambientes = {
            new Oficina("Oficina A", 4),
            new Oficina("Oficina B", 5),
            new Aula("Aula 101", 30),
            new Aula("Aula 102", 35),
            new Laboratorio("Lab Sistemas", 10, 20)
        };

        for (Ambiente amb : ambientes) {
            amb.mostrar();
            System.out.println("Cantidad de muebles: " + amb.cantidadMuebles());
            System.out.println();
        }
    }
}
