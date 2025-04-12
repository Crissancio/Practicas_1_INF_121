package IntroduccionPOO.Ejercicio9;

public class Computadora {
    String procesador;
    String memoriaRam;
    String almacenamiento;
    String tarjetaGrafica;
    String placaMadre;
    String fuentePoder;
    boolean encendida;

    public Computadora() {
        this.procesador = "Intel Core i5";   
        this.memoriaRam = "8GB";           
        this.almacenamiento = "500GB SSD";  
        this.tarjetaGrafica = "NVIDIA GeForce GTX 1650"; 
        this.placaMadre = "ASUS Prime B450"; 
        this.fuentePoder = "500W";        
        this.encendida = false;
    }

    public void mostrarComponentes() {
        System.out.println("Componentes de la computadora:");
        System.out.println("  Procesador: " + this.procesador);
        System.out.println("  Memoria RAM: " + this.memoriaRam);
        System.out.println("  Almacenamiento: " + this.almacenamiento);
        System.out.println("  Tarjeta Grafica: " + this.tarjetaGrafica);
        System.out.println("  Placa Madre: " + this.placaMadre);
        System.out.println("  Fuente de Poder: " + this.fuentePoder);
    }


    public void mostrarEstado() {
        if (this.encendida) {
            System.out.println("La computadora esta encendida");
        } else {
            System.out.println("La computadora esta apagada");
        }
    }

    public void encender() {
        if (!this.encendida) {
            System.out.println("Encendiendo la computadora...");
            this.encendida = true;
        } else {
            System.out.println("La computadora ya esta encendida");
        }
    }

    public void apagar() {
        if (this.encendida) {
            System.out.println("Apagando la computadora...");
            this.encendida = false;
        } else {
            System.out.println("La computadora ya esta apagada");
        }
    }

    public static void main(String[] args) {
        
        Computadora miComputadora = new Computadora();

        miComputadora.mostrarComponentes();
        miComputadora.mostrarEstado();

        miComputadora.encender();
        miComputadora.mostrarEstado();

        miComputadora.apagar();
        miComputadora.mostrarEstado();

        miComputadora.apagar(); 
        miComputadora.encender(); 
    }
}