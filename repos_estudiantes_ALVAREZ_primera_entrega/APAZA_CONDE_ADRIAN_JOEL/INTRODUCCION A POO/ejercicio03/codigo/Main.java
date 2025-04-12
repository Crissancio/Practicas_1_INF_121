// Ejercicio3 introduccion a POO: Crea una clase Coche con marca,modelo y velocidad
        // a) Método acelerar() que aumenta velocidad en 10
        // b) Método frenar() que reduce velocidad en 5
        // Crea dos coches, aceléralos, frénalos y muestra sus velocidades
class Main {
    public static void main(String[] args) {
        // Crea dos coches, aceléralos, frénalos y muestra sus velocidades
        Coche x = new Coche("xxx", "yyy");
        Coche y = new Coche("toyota", "corolla");
        // a) aumentando la velocidad
        x.acelerar();  
        x.acelerar();  
        // b) frendado la velocidad 
        x.frenar();    
        
        y.acelerar();  
        y.frenar();    
        y.frenar();    
    }
}