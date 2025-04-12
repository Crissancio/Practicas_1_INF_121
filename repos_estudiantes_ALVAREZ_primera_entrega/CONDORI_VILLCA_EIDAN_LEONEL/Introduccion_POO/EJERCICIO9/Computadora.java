package EJERCICIO9;
//9. Realiza la abstracción de una Computadora
//a) Muestra los componentes principales de la computadora
//b) Muestra el estado de la computadora (encendido o apagado)
//c) Crea una instancia y simula encender y apagar la computadora.
public class Computadora {

    private String procesador,tarjetaGrafica;
    private int memoriaRAM, almacenamiento;
    private boolean encendida;
    public Computadora(String procesador, String tarjetaGrafica, int memoriaRAM, int almacenamiento) {
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.encendida = false;
    }
    public void Componentes() {
        System.out.println("Procesador: " + procesador);
        System.out.println("Tarjeta Gráfica: " + tarjetaGrafica);
        System.out.println("Memoria RAM: " + memoriaRAM + " Gb");
        System.out.println("Almacenamiento: " + almacenamiento + " Gb");
        
    }
    public void Estado() {
        if (encendida) {
            System.out.println("La computadora está ENCENDIDA.");
        } else {
            System.out.println("La computadora está APAGADA.");
        }
    }
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La computadora se ha encendido.");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("La computadora se ha apagado.");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }
    public static void main(String[] args) {
        Computadora PC = new Computadora("Intel Core i5", "ASUS Dual GeForce RTX 4060", 8, 256);

        System.out.println("--Componentes de la computadora ");
        PC.Componentes();

        System.out.println("\n--Estado inicial");
        PC.Estado();

        System.out.println("\n--Encendiendo la computadora ");
        PC.encender();
        PC.Estado();

        System.out.println("\n Apagando la computadora ");
        PC.apagar();
        PC.Estado();
    }
}
