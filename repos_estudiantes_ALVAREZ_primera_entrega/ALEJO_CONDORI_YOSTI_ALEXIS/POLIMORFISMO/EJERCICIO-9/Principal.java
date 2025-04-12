package Ejercicio9;

public class Principal {
	public static void main(String[] args) {
        BloqueCofre c1 = new BloqueCofre(30, 10, "Madera");
        BloqueCofre c2 = new BloqueCofre(50, 20, "Hierro");
        BloqueTnt t1 = new BloqueTnt("Clásica", 100);
        BloqueTnt t2 = new BloqueTnt("Mega", 200);
        BloqueHorno h1 = new BloqueHorno("Rojo", 3);
        BloqueHorno h2 = new BloqueHorno("Negro", 5);
        c1.accion();
        c1.colocar();
        c1.colocar("en la pared");
        c1.romper();
        System.out.println();
        c2.accion();
        c2.colocar();
        c2.colocar("en una mesa");
        c2.romper();
        System.out.println();
        t1.accion();
        t1.colocar();
        t1.colocar("en la pared");
        t1.romper();
        System.out.println();
        t2.accion();
        t2.colocar();
        t2.colocar("en el suelo");
        t2.romper();
        System.out.println();
        h1.accion();
        h1.colocar();
        h1.colocar("en la pared");
        h1.romper();
        System.out.println();
        h2.accion();
        h2.colocar();
        h2.colocar("en el suelo");
        h2.romper();
	}
}
