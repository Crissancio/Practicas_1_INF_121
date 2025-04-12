package Polimorfismo.Ejercicio9;

public class BloqueTnt extends Bloque {
    int danio;

    public BloqueTnt(String tipo, int danio) {
        super(tipo);
        this.danio = danio;
    }

    @Override
    public void accion() {
        System.out.println("La TNT esta activada. Daño: " + danio);
    }

    @Override
    public void romper() {
        System.out.println("Boom! Se Rompio la TNT y exploto");
    }
}
