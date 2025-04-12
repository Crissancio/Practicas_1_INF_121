package AmbienteUniversidad;

public class Laboratorio {
	private String nombre;
	private int capacidad;
	private int nroMesas;
	private int nroSillas;
	
	
	public Laboratorio(String nombre,int capacidad,int nroMesas,int nroSillas) {
		this.nombre=nombre;
		this.capacidad=capacidad;
		this.nroMesas=nroMesas;
		this.nroSillas=nroSillas;	
	}
	//b) Crear un método mostrar() para mostrar los datos de cada objeto
	public void mostrar() {
		System.out.println("\nel nombre es del laboratorio es  "+nombre+"\n con una capacidad de"+capacidad+" \n numrero de mesas " +nroMesas+"\n y el numero de sillas"+nroSillas);
	}
	//c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
	//muebles dentro de cada ambiente
	public int canMuebles() {
		return nroMesas+nroSillas;
	}
	}
				
				
				
				
