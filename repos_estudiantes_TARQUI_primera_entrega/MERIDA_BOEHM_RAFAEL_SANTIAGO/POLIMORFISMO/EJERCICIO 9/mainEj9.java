package EJERCICIO9;

public class mainEj9 {

	public static void main(String[] args) {
        //2 bloques de cada tipo
        BloqueCofre cofre1 = new BloqueCofre(20, 100, "Hierro");
        BloqueCofre cofre2 = new BloqueCofre(40, 150, "Diamante");
        
        BloqueTnt tnt1 = new BloqueTnt("TNT roja", 80);
        BloqueTnt tnt2 = new BloqueTnt("TNT verde", 90);

        BloqueHorno horno1 = new BloqueHorno("Negro", 10);
        BloqueHorno horno2 = new BloqueHorno("Gris", 15);
        System.out.println("----------------------------------");

        cofre1.accion();
        tnt1.accion();
        horno1.accion();
        System.out.println("----------------------------------");

        // Colocar bloques
        cofre1.colocar();
        tnt1.colocar("pared");
        System.out.println("----------------------------------");

        // Romper bloques
        cofre1.romper();
        tnt1.romper();
        horno1.romper();
        System.out.println("----------------------------------");

        System.out.println(cofre1);
        System.out.println(tnt2);
        System.out.println(horno2);
        System.out.println("----------------------------------");

    }
	
}
