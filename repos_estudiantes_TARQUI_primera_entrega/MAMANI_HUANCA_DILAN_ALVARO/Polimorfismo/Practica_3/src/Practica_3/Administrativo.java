package Practica_3;

public class Administrativo {
	private String nombre;
	private float sueldoMes;
	private String cargo;
	
	//Constructor por Parametros
	public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }
	//Sobrecarga de metodos
    public float sueldoTotal() {
        return sueldoMes;
    }

    public boolean sueldoTotal(float x) {
        return sueldoTotal() == x;
    }
    public String getNombre() {
		return nombre;
    }
}
