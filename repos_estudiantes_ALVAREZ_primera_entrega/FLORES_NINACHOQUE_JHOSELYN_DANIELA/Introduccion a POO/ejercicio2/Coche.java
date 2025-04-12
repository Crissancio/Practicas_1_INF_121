package ejercicio2;

public class Coche {
	public String marca,modelo;
	public int velocidad;
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = 0;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	public void acelerar() {
		 velocidad += 10;
	}
	public void frenar() {
		// TODO Auto-generated method stub
		velocidad-=5;
		if (velocidad<0) {
			velocidad=0;	
		}	
	}
	
}
