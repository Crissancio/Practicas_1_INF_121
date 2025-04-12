package Polimorfismo.Ejercicio9;

public class BloqueCofre extends Bloque {
    int capacidad;
    int resistencia;

    public BloqueCofre(String tipo, int capacidad, int resistencia) {
        super(tipo);
        this.capacidad = capacidad;
        this.resistencia = resistencia;
    }

    @Override
    public void accion() {
        System.out.println("Abriendo el cofre. Capacidad: " + capacidad);
    }

    @Override
    public void romper() {
        System.out.println("Rompiste un cofre, se cae todo su contenido");
    }
}
