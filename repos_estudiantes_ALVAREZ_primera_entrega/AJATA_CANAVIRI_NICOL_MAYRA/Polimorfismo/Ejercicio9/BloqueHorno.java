package Polimorfismo.Ejercicio9;

public class BloqueHorno extends Bloque {
    String color;
    int capacidadComida;

    public BloqueHorno(String tipo, String color, int capacidadComida) {
        super(tipo);
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    @Override
    public void accion() {
        System.out.println("Usando el horno para cocinar. Capacidad de comida: " + capacidadComida);
    }

    @Override
    public void romper() {
        System.out.println("Se rompio el horno. Ya no podras cocinar aqui");
    }
}
