package IntroduccionPOO.Ejercicio3;

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
        this.velocidad += 10;
        System.out.println("El coche " + this.marca + " " + this.modelo + " ha acelerado. Velocidad: " + this.velocidad);
    }

    public void frenar() {
        if (this.velocidad >= 5) {
            this.velocidad -= 5;
            System.out.println("El coche " + this.marca + " " + this.modelo + " ha frenado. Velocidad: " + this.velocidad);
        } else {
            this.velocidad = 0;
            System.out.println("El coche " + this.marca + " " + this.modelo + " ha frenado hasta detenerse. Velocidad: " + this.velocidad);
        }
    }

    //main
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Toyota", "Corolla", 0);
        Coche coche2 = new Coche("Ford", "Focus", 20);

        System.out.println("Velocidad inicial del coche 1: " + coche1.velocidad);
        System.out.println("Velocidad inicial del coche 2: " + coche2.velocidad);

        coche1.acelerar();
        coche1.acelerar();
        coche2.frenar();
        coche1.frenar();
        coche2.acelerar();

        System.out.println("Velocidad final del coche 1: " + coche1.velocidad);
        System.out.println("Velocidad final del coche 2: " + coche2.velocidad);
    }
}
