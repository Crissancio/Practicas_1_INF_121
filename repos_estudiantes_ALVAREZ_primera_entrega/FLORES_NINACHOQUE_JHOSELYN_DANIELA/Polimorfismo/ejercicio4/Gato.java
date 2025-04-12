package ejercicio4;

public class Gato extends Animal{
	private String color;

	public Gato(String nombre, String color) {
		super(nombre);
		this.color = color;
	}
	public void hacerSonido() {
        System.out.println(nombre + " maulla");
    }

    public void moverse() {
        System.out.println(nombre + " salta.");
    }

}
