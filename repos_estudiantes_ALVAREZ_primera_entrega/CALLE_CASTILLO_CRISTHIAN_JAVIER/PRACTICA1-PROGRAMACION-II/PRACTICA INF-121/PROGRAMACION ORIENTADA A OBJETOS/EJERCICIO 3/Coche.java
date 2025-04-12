public class Coche {
    String marca;
    String modelo;
    int velocidad;

    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public void acelerar() {
        velocidad += 10;
    }

    public void frenar() {
        velocidad -= 5;
    }

    public void mostrarVelocidad() {
        System.out.println(marca + " " + modelo + " va a " + velocidad + " km/h");
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 0);
        Coche coche2 = new Coche("Ford", "Fiesta", 20);

        coche1.acelerar();
        coche1.acelerar();
        coche1.frenar();
        coche1.mostrarVelocidad();

        coche2.frenar();
        coche2.acelerar();
        coche2.mostrarVelocidad();
    }
}

