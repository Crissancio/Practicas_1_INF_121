package ejercicio;

public class Administrativo {
	private String nombre;
	private int sueldoMes;
	private String cargo;
	
	public Administrativo(String nombre, int sueldoMes, String cargo ){
		this.nombre = nombre;
		this.sueldoMes = sueldoMes;
		this.cargo = cargo;
	
		
	}
	public float sueldoTotal(){
		return this.sueldoMes;
		
		
	}

}
