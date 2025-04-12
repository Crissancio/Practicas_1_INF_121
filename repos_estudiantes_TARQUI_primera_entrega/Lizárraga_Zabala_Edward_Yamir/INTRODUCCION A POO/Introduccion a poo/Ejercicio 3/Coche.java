
package coche;

public class Coche {
    public String marca;
    public String modelo;
    public int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println(marca + " " + modelo + " acelero. Velocidad actual: " + velocidad + " km/h");
    }

    public void frenar() {
        velocidad -= 5;
        if (velocidad < 0) velocidad = 0;
        System.out.println(marca + " " + modelo + " freno. Velocidad actual: " + velocidad + " km/h");
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");

        coche1.acelerar();
        coche1.frenar();

        coche2.acelerar();
        coche2.acelerar();
        coche2.frenar();
    }
}

