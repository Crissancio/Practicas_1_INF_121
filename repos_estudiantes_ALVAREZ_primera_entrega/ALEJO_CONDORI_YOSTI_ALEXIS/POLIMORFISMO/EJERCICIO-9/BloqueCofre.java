package Ejercicio9;

public class BloqueCofre {
    private int capacidad;
    private int resistencia;
    private String tipo;
    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }
    public void accion() {
        System.out.println("Abriste cofre de tipo "+tipo+". Capacidad: "+capacidad+
                           ", Resistencia: "+resistencia+".");
    }
    public void colocar() {
        System.out.println("Cofre colocado en el suelo");
    }

    public void colocar(String orientacion) {
        System.out.println("Cofre colocado en "+orientacion);
    }
    public void romper() {
        System.out.println("Rompiste cofre de tipo "+tipo+". Se perdieron los objetos.");
    }
}
