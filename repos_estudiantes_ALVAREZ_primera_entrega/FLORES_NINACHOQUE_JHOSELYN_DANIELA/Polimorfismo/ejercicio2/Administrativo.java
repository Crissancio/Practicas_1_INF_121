package ejercicio2;

public class Administrativo extends Empleado{
	private String cargo;

	public Administrativo(String nombre, int sueldoMes, String cargo) {
		super(nombre, sueldoMes);
		this.cargo = cargo;
	}
	public void mostrar() {
        System.out.println("Administrativo:");
        super.mostrar();
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo total: " + sueldoTotal());
        System.out.println("--------------------");
    }
}
