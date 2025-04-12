package Ejercicio3;

public class Mesero {
	private String nombre;
	public int sueldoMes;
	public int horasExtra;
	public float sueldoHora;
	public float propina;
	public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
		this.nombre = nombre;
		this.sueldoMes = sueldoMes;
		this.horasExtra = horasExtra;
		this.sueldoHora = sueldoHora;
		this.propina = propina;
	}
	public float SueldoTotal() {
		return sueldoMes;
	}
	public float SueldoTotal(int horasExtra, float sueldoHora, float propina) {
		return sueldoMes + horasExtra * sueldoHora + propina;
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
	public float getPropina() {
		return propina;
	}
	
}
