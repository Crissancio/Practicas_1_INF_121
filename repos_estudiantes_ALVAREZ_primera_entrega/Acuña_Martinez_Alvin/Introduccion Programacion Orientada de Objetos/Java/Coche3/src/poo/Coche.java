package poo;

public class Coche {
    public String marca;
    public String modelo;
    public int velocidad;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    // a) Método acelerar
    public void acelerar() {
        velocidad += 10;
    }

    // b) Método frenar
    public void frenar() {
        velocidad -= 5;
        if (velocidad < 0) velocidad = 0;
    }

    // c) Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h");
    }

    // d-e) Crear coches y mostrar resultados
    public static void main(String[] args) {
        Coche coche1 = new Coche("Nissan", "GTR");
        Coche coche2 = new Coche("Chevrolet", "Camaro");

        coche1.acelerar();  // velocidad = 10
        coche1.acelerar();  // velocidad = 20
        coche1.frenar();    // velocidad = 15

        coche2.acelerar();  // velocidad = 10
        coche2.frenar();    // velocidad = 5
        coche2.acelerar();  // velocidad = 15

        coche1.mostrarDatos();
        coche2.mostrarDatos();
    }
}
