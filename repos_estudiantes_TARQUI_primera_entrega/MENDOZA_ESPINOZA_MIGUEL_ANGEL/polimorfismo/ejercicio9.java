package polimorfismo;
class BloqueCofre{
	private int capacidad;
	private int resistencia;
	private String tipo;
	public BloqueCofre(int c,int r,String t) {
		this.capacidad=c;
		this.resistencia=r;
		this.tipo=t;
	}
	public void accion() {
		System.out.println("el cofre de tipo:" +tipo+ "se abre y se almacena en capacidad" +capacidad+ "items");
	}
	public void colocar() {
		System.out.println("el cofre se coloca enm le suelo");
	}
	public void romper() {
		System.out.println("el cfre se rompe y sus objetos cael al suelo!");
	}
}
class BloqueTnt{
	private String tipo;
	private int dano;
	public BloqueTnt(String t,int d) {
		this.tipo=t;
		this.dano=d;
	}
	public void accion() {
		System.out.println("el Bloque TNT de tipo:" +tipo+ "esta lista para explotar con un dano" +dano);
	}
	public void colocar() {
		System.out.println("la TNT se coloca en le suelo");
	}
	public void romper() {
		System.out.println("el cfre se rompe sin explotar!");
	}
}
class BloqueHorno{
	private String color;
	private int capacidadcomida;
	public BloqueHorno(String c,int cc) {
		this.color=c;
		this.capacidadcomida=cc;
	}
	public void accion() {
		System.out.println("el horno de color:" +color+ "puede cocinar hasta " +capacidadcomida+ " comidas");
	}
	public void colocar() {
		System.out.println("el horno se coloca en le suelo");
	}
	public void romper() {
		System.out.println("el horno se rompe y deja caer sus materiales!");
	}
}
public class ejercicio9 {
	public static void main(String[] args) {
		BloqueCofre c1=new BloqueCofre(27,10,"madera");
		BloqueCofre c2=new BloqueCofre(54,14,"hierro");
		BloqueTnt t1=new BloqueTnt("normal",20);
		BloqueTnt t2=new BloqueTnt("mega",50);
		BloqueHorno h1=new BloqueHorno("azul",5);
		BloqueHorno h2=new BloqueHorno("gris",10);
		c1.accion();
		c2.accion();
		c1.colocar();
		c2.colocar();
		c1.romper();
		System.out.println("-----------------");
		t1.accion();
		t2.accion();
		t1.colocar();
		t2.colocar();
		t1.romper();
		System.out.println("-----------------");
		h1.accion();
		h2.accion();
		h1.colocar();
		h2.colocar();
		h1.romper();
	}
}
