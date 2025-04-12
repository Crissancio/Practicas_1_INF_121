package computadorajava;

public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de computadora
        computadora miComputadora = new computadora("AMD Ryzen 5", 16, 1024, "Radeon RX 6600");

        // Mostrar componentes
        miComputadora.mostrarComponentes();

        // Mostrar estado actual
        miComputadora.mostrarEstado();

        // Encender computadora
        miComputadora.encender();
        miComputadora.mostrarEstado();

        // Apagar computadora
        miComputadora.apagar();
        miComputadora.mostrarEstado();
    }
}
