package ejercicio4;

public class Principal {
	public static void main(String[] args) {
		Perro pe1 = new Perro("Peluchin",2,"caniche");
        Gato g1 = new Gato("Pelusa","blanco");
        Pajaro pa1 = new Pajaro("Pio","abc");

        Animal[] animales = {pe1, g1, pa1};

        for (Animal a : animales) {
            a.hacerSonido();
            a.moverse();
            System.out.println();
        }
	}
}
