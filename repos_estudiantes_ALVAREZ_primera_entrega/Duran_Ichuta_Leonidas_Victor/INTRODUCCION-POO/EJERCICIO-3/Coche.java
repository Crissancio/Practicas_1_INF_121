/*3. Crea una clase Coche con marca, modelo y velocidad
a) Agrega un método acelerar () que aumente la velocidad en 10
b) Agrega un método frenar () que disminuya la velocidad en 5
c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades
 */
package coche;

public class Coche {
private String marca;
private String modelo;
private double velocidad;

    public Coche(String marca, String modelo, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public void acelerar(){
        velocidad = (velocidad + 10);
        System.out.println("Acelerando coche");
    }
    public void frenar(){
        velocidad = (velocidad - 5);
        System.out.println("Frenando coche");
    }
    public void velocidadFinal(){
        System.out.println("La velocidad es: " + velocidad);
    }
    public static void main(String[] args) {
    Coche coche1 = new Coche("nissan","2020", 0);
    System.out.println("velocidad inicial de " + coche1.marca + " " + coche1.modelo + " es " + coche1.velocidad);
    coche1.acelerar();
    coche1.frenar();
    coche1.velocidadFinal();
    Coche coche2 = new Coche("toyota","2020", 30);
    System.out.println("velocidad inicial de " + coche2.marca + " " + coche2.modelo + " es " + coche2.velocidad);
    coche2.acelerar();
    coche2.frenar();
    coche2.velocidadFinal();
    }
}
