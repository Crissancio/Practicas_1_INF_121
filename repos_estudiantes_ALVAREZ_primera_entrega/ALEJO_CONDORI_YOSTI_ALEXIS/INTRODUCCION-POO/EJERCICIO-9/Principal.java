package Ejercicio5;

public class Principal {
	public static void main(String[] args) {
	Computadora cpu= new Computadora("Victus","16GB","1TB");
	cpu.mostrarComponentes();
	cpu.mostrarEstado();
	cpu.enceder();
	cpu.apagar();
	}
}
