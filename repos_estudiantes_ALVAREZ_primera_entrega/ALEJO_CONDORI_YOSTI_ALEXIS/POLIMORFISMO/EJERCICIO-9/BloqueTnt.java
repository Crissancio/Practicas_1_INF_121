package Ejercicio9;

public class BloqueTnt {
    private String tipo;
    private int daño;
    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }
    public void accion() {
        System.out.println("Encendiste TNT tipo "+tipo+". Daño: "+daño+ ".");
    }
    public void colocar() {
        System.out.println("TNT colocada en el suelo");
    }
    public void colocar(String orientacion) {
        System.out.println("TNT colocada en " + orientacion);
    }
    public void romper() {
        System.out.println("¡Explotó la TNT tipo "+tipo+"! Daño causado: "+daño+".");
    }
}
