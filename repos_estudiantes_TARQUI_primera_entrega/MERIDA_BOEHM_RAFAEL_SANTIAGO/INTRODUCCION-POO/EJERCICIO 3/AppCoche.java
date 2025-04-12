package Ejercicio_3;

public class AppCoche {

	public static void main(String[] args) {
		Coche c1 = new Coche("Toyota", "Celica");
        Coche c2 = new Coche("Ford", "Fiesta");

        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        c2.acelerar();
        c2.frenar();
        c2.frenar();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

}
