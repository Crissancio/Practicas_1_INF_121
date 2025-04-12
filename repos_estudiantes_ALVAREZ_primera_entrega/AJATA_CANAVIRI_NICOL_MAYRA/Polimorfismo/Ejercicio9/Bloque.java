package Polimorfismo.Ejercicio9;

public abstract class Bloque {
    String tipo;

    public Bloque(String tipo) {
        this.tipo = tipo;
    }

    public abstract void accion();

    public void colocar() {
        System.out.println("Colocando " + tipo + " en el suelo");
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando " + tipo + " en la " + orientacion);
    }

    public abstract void romper();
}

