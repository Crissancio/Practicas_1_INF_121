package EJERCICIO3;
//Crea una clase Coche con marca, modelo y velocidad
//a) Agrega un método acelerar () que aumente la velocidad en 10
//b) Agrega un método frenar () que disminuya la velocidad en 5
//c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades
public class Coche {
	private String marca;
	private int modelo,velocidad;
	public Coche(String marca, int modelo,int velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	public int acelerar() {
		return velocidad + 10;
	}
	public int frenar() {
		return velocidad - 5;
	}
	public static void main(String[] args) {
		Coche coche1 = new Coche("TOYOTA",2011,100);
		Coche coche2 = new Coche("Supra",2010,120);
		coche1.acelerar();
		System.out.print("Su velocidad del "+coche1.marca +" despues de acelerar es: " + coche1.acelerar());
		coche1.frenar();
		System.out.print("\nSu velocidad del "+coche1.marca +" despues de frenar es: " +coche1.frenar());
		coche2.acelerar();
		System.out.print("\nSu velocidad del "+coche2.marca +" despues de acelerar es: " +coche2.acelerar());
		coche2.frenar();
		System.out.print("\nSu velocidad del "+coche2.marca +" despues de frenar es: " +coche2.frenar());
		}

}
