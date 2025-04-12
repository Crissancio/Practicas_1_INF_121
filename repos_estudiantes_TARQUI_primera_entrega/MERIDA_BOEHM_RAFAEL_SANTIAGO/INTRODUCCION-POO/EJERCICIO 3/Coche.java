package Ejercicio_3;

public class Coche {
	public String marca;
    public String modelo;
    public int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 20;
    }

    public void acelerar() {
        this.velocidad += 15;
    }

    public void frenar() {
        this.velocidad -= 5;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }

    public String toString() {
        return "Coche: " + this.marca + " " + this.modelo + ", Velocidad: " + this.velocidad + " km/h";
    }
}
