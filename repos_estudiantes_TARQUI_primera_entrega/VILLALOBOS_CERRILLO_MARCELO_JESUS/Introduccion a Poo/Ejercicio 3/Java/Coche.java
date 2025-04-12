public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    public void acelerar() {
        velocidad = velocidad + 10;
    }
    public void frenar() {
        velocidad = velocidad - 5;
    }