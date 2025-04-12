package Ejercicio3;

public class Cocinero {
	private String nombre;
	private int sueldoMes;
	private int horasExtra;
	private float sueldoHora;
	public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
		this.nombre = nombre;
		this.sueldoMes = sueldoMes;
		this.horasExtra = horasExtra;
		this.sueldoHora = sueldoHora;
	}
	public float SueldoTotal() {
		return sueldoMes;
	}
	public float SueldoTotal(int horasExtra, float sueldoHora) {
		return sueldoMes + horasExtra * sueldoHora ;	
	}
	public void mostrar(float x) {
		if(sueldoMes ==x) {
		System.out.println(nombre+" tiene sueldo igual a "+x);
		}
	}
	public String getNombre() {
		return nombre;
	}

	public int getSueldoMes() {
		return sueldoMes;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public float getSueldoHora() {
		return sueldoHora;
	}	
}
