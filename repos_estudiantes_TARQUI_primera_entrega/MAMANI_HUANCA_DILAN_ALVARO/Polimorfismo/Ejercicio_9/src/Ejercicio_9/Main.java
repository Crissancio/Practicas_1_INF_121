package Ejercicio_9;

public class Main {

	public static void main(String[] args) {
		//A) Instanciamos cada clase, con 2 Objetos cada Uno
		//BloqueCofre
		//System.out.println("<COFRE>");
        BloqueCofre cofre1 = new BloqueCofre(30, 100, "Madera");
        BloqueCofre cofre2 = new BloqueCofre(50, 200, "Hierro");
        
        //BloqueTnt
        //System.out.println("<BLOQUE TNT>");
        BloqueTnt tnt1 = new BloqueTnt("Explosiva", 80);
        BloqueTnt tnt2 = new BloqueTnt("Mega", 150);

        //BloqueHorno
        //System.out.println("<HORNO>");
        BloqueHorno horno1 = new BloqueHorno("Gris", 5);
        BloqueHorno horno2 = new BloqueHorno("Negro", 10);
        
        //b) Creamos el Metodo accion()
        System.out.println("Accionamos el Cofre!");
        cofre1.accion();
        System.out.println("Accionamos la TNT!");
        tnt1.accion();
        System.out.println("Accionamos El Horno!");
        horno1.accion();    
        
        //c) Creamos el Metodo colocar()
        System.out.println("COLOCAMOS EN: ");
        System.out.println("<Cofre>");
        cofre1.colocar();
        cofre2.colocar("Mesa");
        System.out.println("<TNT>");
        tnt1.colocar();
        tnt2.colocar("Piedra");
        System.out.println("<HORNO>");
        horno1.colocar();
        horno2.colocar("Pared");
        
        //d)Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
        //distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
        System.out.println("ROMPEMOS LOS BLOQUES...");
        cofre1.romper();
        tnt1.romper();
        horno1.romper();
	}
}
