package Minceraft;

public class Principal {
	public static void main(String[] args) {
        // a) Instanciar 2 bloques de cada tipo
        BloqueCofre cofre1 = new BloqueCofre(27, 10, "Roble");
        BloqueCofre cofre2 = new BloqueCofre(54, 15, "End");
        
        BloqueTnt tnt1 = new BloqueTnt("Normal", 10);
        BloqueTnt tnt2 = new BloqueTnt("Super", 25);
        
        BloqueHorno horno1 = new BloqueHorno("Negro", 64);
        BloqueHorno horno2 = new BloqueHorno("Blanco", 5);

        // b) Probar método accion()
        System.out.println("=== ACCIONES DE BLOQUES ===");
        cofre1.accion();
        tnt1.accion();
        horno1.accion();

        // c) Probar método colocar() sobrecargado
        System.out.println("\n=== COLOCAR BLOQUES ===");
        cofre2.colocar();
        cofre2.colocar("el suelo");
        
        tnt2.colocar();
        tnt2.colocar("el techo");
        
        horno2.colocar();
        horno2.colocar("una esquina");

        // d) Probar método romper()
        System.out.println("\n=== ROMPER BLOQUES ===");
        cofre1.romper();
        tnt1.romper();
        horno1.romper();
    }
}
