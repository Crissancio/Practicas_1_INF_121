class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    public void acelerar() {
        this.velocidad += 10;
        System.out.println(this.marca + " " + this.modelo + " acelerando... " + this.velocidad + " km/h");
    }
    public void frenar() {
        this.velocidad = Math.max(0, this.velocidad - 5);
        System.out.println(this.marca + " " + this.modelo + " frenando... " + this.velocidad + " km/h");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }
}

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 160);
        Coche coche2 = new Coche("Mitsubishi", "Montero", 100);

        coche1.acelerar();
        coche2.acelerar();
        coche1.frenar();
        coche2.frenar();
    }
}
