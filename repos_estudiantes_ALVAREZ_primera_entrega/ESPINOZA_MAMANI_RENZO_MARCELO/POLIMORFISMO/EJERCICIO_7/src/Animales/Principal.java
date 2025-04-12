package Animales;

public class Principal {
	public static void main(String[] args) {
        // a) Instanciar los animales
        Perro perro = new Perro("Rex", 3, "Pastor Alemán");
        Gato gato = new Gato("Misi", "Negro");
        Pajaro pajaro = new Pajaro("Piolín", "Canario");

        // b) Hacer sonidos (métodos sobrecargados)
        System.out.println("=== SONIDOS DE ANIMALES ===");
        perro.hacerSonido();
        perro.hacerSonido(3);
        
        gato.hacerSonido();
        gato.hacerSonido(true);
        
        pajaro.hacerSonido();
        pajaro.hacerSonido("Trino trino lalala");

        // c) Mostrar movimiento
        System.out.println("\n=== MOVIMIENTO DE ANIMALES ===");
        perro.moverse();
        gato.moverse();
        pajaro.moverse();
    }
}
