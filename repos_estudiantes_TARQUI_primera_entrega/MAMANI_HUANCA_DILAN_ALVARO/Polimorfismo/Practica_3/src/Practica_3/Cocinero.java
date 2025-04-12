package Practica_3;

public class Cocinero {
	private String nombre;
	private int sueldoMes;
	private int horasExtra;
	private float sueldoHora;
	
	//Constructor por Parametros
	public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }
	//Sobrecarga de Metodos
    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }

    public boolean sueldoTotal(float x) {
        return sueldoTotal() == x;
    }
	public String getNombre() {
		return nombre;
	}
}
