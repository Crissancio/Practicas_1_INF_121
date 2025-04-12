package Animales;

public class Animal {

	public static void main(String[] args) {
		//a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
		Perro dog = new Perro("guau guau ", "  correr trotar y galopar   ");
		Gato cat = new Gato(" miau miau ", "caminar ,correr , saltar ,girar y rodar");
		Pajaro bird = new Pajaro(" pio pio ", "volar caminar y saltar");
		
		
		System.out.println("---------------------PERRO--------------------------");
		dog.hacerSonido();
		dog.moverse();
		System.out.println("---------------------GATO--------------------------");
		cat.hacerSonido();
		cat.moverse();
		System.out.println("---------------------PAJARO--------------------------");
		bird.hacerSonido();
		bird.moverse();
	
		
	}

}
