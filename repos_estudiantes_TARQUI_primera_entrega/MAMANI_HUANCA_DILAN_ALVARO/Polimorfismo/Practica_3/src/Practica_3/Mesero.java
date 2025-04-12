package Practica_3;

public class Mesero {
	private String nombre;
	private int sueldoMes;
	private int horasExtra;
	private float sueldoHora;
	private float propina;
	
	//Constructor con Parametros
	public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }
	//Sobrecarga de Metodos
    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    public boolean sueldoTotal(float x) {
        return sueldoTotal() == x;
    }
    public String getNombre() {
		return nombre;
	}
}
