package Ejercicio3;

public class Administrativo {
	private String nombre;
	private float sueldoMes;
	private String cargo;
	public Administrativo(String nombre, float sueldoMes, String cargo) {
		this.nombre = nombre;
		this.sueldoMes = sueldoMes;
		this.cargo = cargo;
	}
	public float SueldoTotal() {
		return sueldoMes;
	}
	public void mostrar(float x) {
		if(sueldoMes ==x) {
		System.out.println(nombre+" tiene sueldo igual a "+x);
		}
	}
	public String getNombre() {
		return nombre;
	}
	public float getSueldoMes() {
		return sueldoMes;
	}
	public String getCargo() {
		return cargo;
	}
}
