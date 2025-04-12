package Ejercicio2;

public class Coche {
	public String marca;
	public String modelo;
	public int velocidad;
	public Coche(String marca, String modelo, int velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	public void Acelerar() {
		velocidad+= 10;
	}
	public void Frenar() {
		velocidad -= 5;
		if(velocidad<0) {
			velocidad=0;
		}
	}
	public void mostrarVelocidades() {
		System.out.println("El coche "+marca+" del modelo "+modelo+" tiene una velocidad de "+velocidad+"km/h");
	}
}
