package AmbienteUniversidad;

public class Aula {
	private String nombre;
	private int capacidad;
	private int nroPupitres;
	
	public Aula(String nombre,int capacidad,int nroPupitres) {
		this.nombre=nombre;
		this.capacidad=capacidad;
		this.nroPupitres=nroPupitres;
		
	}
	//b) Crear un método mostrar() para mostrar los datos de cada objeto
	public void mostrar() {
		System.out.println("\n nombre de la aula "+nombre+"\n con una capacidad de "+capacidad+" \n y un numero de pupitres de  "+nroPupitres);
	}
	//c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
	//muebles dentro de cada ambiente
	public int canMuebles() {
		return capacidad+nroPupitres;
	}
}
