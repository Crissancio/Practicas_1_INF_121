
package ejercicio7;



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
        this.velocidad += 10; 
        System.out.println("El coche " + marca + " " + modelo + " aceleró: " + velocidad + " km/h");
    }

    public void frenar() {
        if (this.velocidad >= 5) {
            this.velocidad -= 5; 
        } else {
            this.velocidad = 0; 
        }
        System.out.println("El coche " + marca + " " + modelo + " frenó: " + velocidad + " km/h");
    }

    public static void main(String[] args) {

        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Ford", "Fiesta");

        c1.acelerar();
        c1.frenar();

        c2.acelerar();
        c2.acelerar();
        c2.frenar();

        System.out.println("Velocidad final del " + c1.marca + " " + c1.modelo + ": " + c1.velocidad + " km/h");
        System.out.println("Velocidad final del " + c2.marca + " " + c2.modelo + ": " + c2.velocidad + " km/h");
    }
}

