package Ejercicio9;

public class BloqueTnt {
    private String tipo;
    private int danio;

    public BloqueTnt(String tipo, int danio) {
        this.tipo = tipo;
        this.danio = danio;
    }


    public void accion() {
        System.out.println("El bloque TNT de tipo " + tipo + " tiene un daño de " + danio);
    }
    //c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
    //orientaciones (por ejemplo, en el suelo o en la pared).
    public void colocar(String orientacion) {
        System.out.println("El Bloque TNT se coloca en la " + orientacion);
    }

    public void colocar(String orientacion, int altura) {
        System.out.println("El Bloque TNT se coloca en la " + orientacion + " a una altura de " + altura + " bloques");
    }
    //d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
    //distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
    public void romper() {
        System.out.println("El bloque TNT de tipo " + tipo + " se rompe y explota todo T.T.");
    }
    
}
