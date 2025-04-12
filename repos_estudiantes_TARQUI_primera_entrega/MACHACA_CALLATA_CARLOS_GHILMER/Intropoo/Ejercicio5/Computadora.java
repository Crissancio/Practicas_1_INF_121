
/*  9. Realiza la abstracción de una Computadora
a) Muestra los componentes principales de la computadora
b) Muestra el estado de la computadora (encendido o apagado)
c) Crea una instancia y simula encender y apagar la computadora. */





package Intropoo.Ejercicio5;

public class Computadora {
    String microprocesador;
    String placamadre;
    int ram;
    int almacenamiento;
    String tarjetadevideo;
    String fuente;
    String discossd;
    String gabinete;
    boolean encendida;

    public Computadora(String microprocesador, String placamadre, int ram, int almacenamiento, String tarjetadevideo, String fuente, String discossd, String gabinete) {
        this.microprocesador = microprocesador;
        this.placamadre = placamadre;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tarjetadevideo = tarjetadevideo;
        this.fuente = fuente;
        this.discossd = discossd;
        this.gabinete = gabinete;
        this.encendida = false;

    }

    public void mostrarComponentes() {
        System.out.println("Microprocesador: " + microprocesador);
        System.out.println("Placa madre: " + placamadre);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Tarjeta de video: " + tarjetadevideo);
        System.out.println("Fuente: " + fuente);
        System.out.println("Disco SSD: " + discossd);
        System.out.println("Gabinete: " + gabinete);

    }

    public void mostrarEstado() {
        
        if (encendida) {
            System.out.println("La computadora está encendida.");
        } else {
            System.out.println("La computadora está apagada.");
            
        }

    }

    public void encenderApagar() {
        encendida = !encendida;
        mostrarEstado();
    }

    
    public static void main(String[] args) {
        Computadora com1 = new Computadora("Intel Core i7 de 13th", "Asus Prime", 16, 500, "Nvidia RTX 3060", "EVGA 600W", "Kingston 240GB", "Corsair Carbide 275R");
        // a) mostrar componentes
        com1.mostrarComponentes();
        // b) encender/apagar
        com1.encenderApagar(); // encender
    //    com1.encenderApagar(); // apagar
        // c) mostrar estado
        com1.mostrarEstado();
        
    }
    
}
    

