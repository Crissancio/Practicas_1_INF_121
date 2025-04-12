package POLIMORFISMO.EJERCICIO9;

public class Main {
	public static void main(String[] args) {
        BloqueCofre cofre1 = new BloqueCofre(20, 100, "Madera");
        cofre1.accion();
        cofre1.colocar();
        cofre1.colocar("Horno");
        cofre1.romper();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        BloqueCofre cofre2 = new BloqueCofre(50, 200, "Hierro");
        cofre2.accion();
        cofre2.colocar();
        cofre2.colocar("Cofre de madera");
        cofre2.romper();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        BloqueTnt tnt1 = new BloqueTnt("Explosiva", 100);
        tnt1.accion();
        tnt1.colocar();
        tnt1.colocar("los cofres");
        tnt1.romper();
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        BloqueTnt tnt2 = new BloqueTnt("MegaTNT", 250);
        tnt2.accion();
        tnt2.colocar();
        tnt2.colocar("pared");
        tnt2.romper();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        BloqueHorno horno1 = new BloqueHorno("Negro", 64);
        horno1.accion();
        horno1.colocar();
        horno1.colocar("la mesa de crafteo");
        horno1.romper();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        BloqueHorno horno2 = new BloqueHorno("Rojo", 50);
        horno2.accion();
        horno2.colocar();
        horno2.colocar("la cama");
        horno2.romper();
    }
}