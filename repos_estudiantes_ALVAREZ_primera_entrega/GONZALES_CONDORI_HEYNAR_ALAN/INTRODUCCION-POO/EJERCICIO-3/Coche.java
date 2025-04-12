/* 
3. Crea una clase Coche con marca, modelo y velocidad
a)	Agrega un método acelerar () que aumente la velocidad en 10
b)	Agrega un método frenar () que disminuya la velocidad en 5
c)	Crea dos coches, aceléralos, frénalos y muestra sus velocidades
*/
package Ejercicios;


public class Coche {
    private String marca;
    private String modelo;
    private float velocidad;

    public Coche(String marca, String modelo, float velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad=0;
    }
    
    public void acelerar(){
        velocidad+=10;
        System.out.println(modelo+" Esta acereando a: "+ velocidad+" Kmt/h");
    }
    public void frenar(){
        velocidad-=5;
        System.out.println(modelo+" Esta freando a: "+velocidad+" kmt/h");
    }
    
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "COROLLA 2025", 0);
        Coche coche2 = new Coche("Nissan", "FRONTIER", 0);
        
        coche1.acelerar();
        coche1.frenar();
        coche2.acelerar();
        coche2.frenar();
    }
}
