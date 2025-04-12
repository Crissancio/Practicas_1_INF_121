/*  3. Crea una clase Coche con marca, modelo y velocidad
a) Agrega un método acelerar () que aumente la velocidad en 10
b) Agrega un método frenar () que disminuya la velocidad en 5
c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades */





package Intropoo.Ejercicio2;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
  
    // a) metodo acelerar
    public void acelerar() {
        velocidad += 10;
        System.out.println(marca + " " + modelo + " acelero en: " + velocidad + " km/h");
        
    }
    // b) metodo frenar 
    public void frenar() {
         velocidad -= 5;          
        System.out.println(marca + " " + modelo + " freno en: " + velocidad + " km/h");
   
    }

    public void mostrarVelocidad() {
        System.out.println("La velocidad de " + marca + " " + modelo + " es de " + velocidad + " km/h");
    }

    public static void main(String[] args ){
        Coche c1 = new Coche("BMW","audi",50);
        Coche c2 = new Coche("Ford","Deveste",80);
        System.out.println("------ LA VELOCIDAD QUE VA ------");
        c1.mostrarVelocidad();
        c2.mostrarVelocidad();
      
        System.out.println("------ Coche1 ------");
        c1.acelerar();
        c1.frenar();
        System.out.println("------ Coche2 ------");
        c2.acelerar();
        c2.frenar();
    }
    
}


