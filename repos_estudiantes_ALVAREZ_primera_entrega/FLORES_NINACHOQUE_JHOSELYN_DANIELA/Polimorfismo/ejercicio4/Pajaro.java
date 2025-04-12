package ejercicio4;

public class Pajaro extends Animal {
	private String tipo;

	public Pajaro(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}
	public void hacerSonido() {
        System.out.println(nombre + " trina");
    }
    public void moverse() {
        System.out.println(nombre + " vuela.");
    }
}
