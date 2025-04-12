package ejercicio5;

public class Principal {
	public static void main(String[] args) {
		Computadora c1 = new Computadora("Intel i7", 16, 512);
        c1.mostrarEstado();
        c1.encender();
        c1.mostrarEstado();
        c1.apagar();
        c1.mostrarEstado();
	}
}
