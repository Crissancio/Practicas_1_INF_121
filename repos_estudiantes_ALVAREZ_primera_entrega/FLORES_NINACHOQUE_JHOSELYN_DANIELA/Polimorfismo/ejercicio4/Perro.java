package ejercicio4;

public class Perro extends Animal {
	private int edad;
	private String raza;
	public Perro(String nombre, int edad, String raza) {
		super(nombre);
		this.edad = edad;
		this.raza = raza;
	}
	public void hacerSonido() {
        System.out.println(nombre + " ladra");
    }
    public void moverse() {
        System.out.println(nombre + " corre.");
    }
}
