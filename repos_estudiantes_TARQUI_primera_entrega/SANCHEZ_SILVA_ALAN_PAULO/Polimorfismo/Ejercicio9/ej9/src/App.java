public class App {
    public static void main(String[] args) throws Exception {
    //Instanciando objetos
    BloqueCofre bloque_cofre_1 = new BloqueCofre(30, 6, "madera");
    BloqueCofre bloque_cofre_2 = new BloqueCofre(35, 20, "madera");

    BloqueTnt bloque_tnt_1 = new BloqueTnt("Normal", 30);
    BloqueTnt bloque_tnt_2 = new BloqueTnt("Potente", 150);

    BloqueHorno bloque_horno_1 = new BloqueHorno("Negro", 5);
    BloqueHorno bloque_horno_2 = new BloqueHorno("Negro", 4);

    //Llamando a los métodos
    System.out.println("------------------Métodos-----------------");
    System.out.println("-----Bloque-Cofre----");
    bloque_cofre_1.accion();
    bloque_cofre_1.colocar("piso");
    bloque_cofre_1.romper();

    System.out.println();

    bloque_cofre_2.accion();
    bloque_cofre_2.colocar("pared");
    bloque_cofre_2.romper();
    System.out.println("-----Bloque-TNT-----");
    bloque_tnt_1.accion();
    bloque_tnt_1.colocar("pared");
    bloque_tnt_1.romper();

    System.out.println();

    bloque_tnt_2.accion();
    bloque_tnt_2.colocar("techo");
    bloque_tnt_2.romper();
    System.out.println("-----Bloque-Horno-----");
    bloque_horno_1.accion();
    bloque_horno_1.colocar("piso");
    bloque_horno_1.romper();

    System.out.println();

    bloque_horno_2.accion();
    bloque_horno_2.colocar("pared");
    bloque_horno_2.romper();
    }
}
