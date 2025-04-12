package MInecraft;
//9. Para los bloques del juego Minecraft se usará los siguientes objetos:
public class Main {

	public static void main(String[] args) {
//a) Crear e instanciar al menos 2 bloques de cada tipo
		BloqueCofre cof1 = new BloqueCofre(20,30,"Madera");
		BloqueCofre cof2 = new BloqueCofre(20,40,"Roble");
		BloqueTnT tnt1 = new BloqueTnT(" explosivo",60);
		BloqueTnT tnt2 = new BloqueTnT("explosivo",90);
		BloqueHorno horno1 = new BloqueHorno("plomo",60);
		BloqueHorno horno2 = new BloqueHorno("negro",70 );
		
		
		System.out.println("-----------------------COFRE1----------------------------");
		cof1.accion();
		cof1.colocar(" el cofre  se puso en el piso ");
		cof1.romper();
		System.out.println("-----------------------COFRE2----------------------------");
		cof2.accion();
		cof2.colocar("  el cofre se puso en la pared ");
		cof2.romper();
		System.out.println("-----------------------TNT1----------------------------");
		tnt1.accion();
		tnt1.colocar("la TNT  se puso en la arena");
		tnt1.romper();
		System.out.println("-----------------------TNT2----------------------------");
		tnt2.accion();
		tnt2.colocar(" La TNT se puso en tierra");
		tnt2.romper();
		System.out.println("-----------------------HORNO1----------------------------");
		horno1.accion();
		horno1.colocar("el horno se puso en la pared ");
		horno1.romper();
		System.out.println("-----------------------HORNO2----------------------------");
		horno2.accion();
		horno2.colocar("el horno se puso sobre otro horno ");
		horno2.romper();
	}

}
