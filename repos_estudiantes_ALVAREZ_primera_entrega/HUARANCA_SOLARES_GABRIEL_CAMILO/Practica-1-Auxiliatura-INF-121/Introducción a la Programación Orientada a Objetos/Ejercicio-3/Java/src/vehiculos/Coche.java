package vehiculos;

public class Coche {
	private String marca;
	private String modelo;
	private float velocidad;
	
	public Coche(String marca,String modelo,float velocidad) {
		this.marca=marca;
		this.modelo=modelo;
		this.velocidad=velocidad;
	}
	
	public float acelerar() {
		return this.velocidad=this.velocidad+10;
	}
	
	public float frenar() {
		if(this.velocidad>=5) {
			return this.velocidad=this.velocidad-5;
		}
		else {
			return this.velocidad=0;
		}
	}
	
	public String muestracochesvelocidades() {
		return "Marca: "+this.marca+" | "+"Modelo: "+this.modelo+" | "+"Velocidad: "+this.velocidad+" km/h";
	}
	public static void main(String[] args) {
		Coche car1 = new Coche("Lamborghini","Aventador LP 700-4 Ultimae",300);
		Coche car2 = new Coche("Porsche","718 Cayman GT4 RS",249);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Introducción a POO:");
		System.out.println("Exercise 3: ");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Coches");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(car1.muestracochesvelocidades());
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Acelerando: "+car1.acelerar()+" km/h");
		System.out.println("Desacelerando: "+car1.frenar()+" km/h");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(car2.muestracochesvelocidades());
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Acelerando: "+car2.acelerar()+" km/h");
		System.out.println("Desacelerando: "+car2.frenar()+" km/h");
		System.out.println("---------------------------------------------------------------------------");
	}

}
