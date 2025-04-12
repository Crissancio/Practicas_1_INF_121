package polimorfismo;
class Perro{
	private String nombre;
	private int edad;
	private String raza;
	public Perro(String n,int e,String r) {
		this.nombre=n;
		this.edad=e;
		this.raza=r;
	}
	public void hacersonido() {
		System.out.println(nombre+" de " +edad+ " (perro) hace : !gauuu!");
	}
	public void moverse() {
		System.out.println(nombre+ "de " +edad+ " corre");
	}
}
class Gato{
	private String nombre;
	private String color;
	public Gato(String n,String c) {
		this.nombre=n;
		this.color=c;
	}
	public void hacersonido() {
		System.out.println(nombre+" de color:" +color+ " (gato) hace : !miauu!");
	}
	public void moverse() {
		System.out.println(nombre+ "de color:" +color+ " salta");
	}
}
class Pajaro{
	private String nombre;
	private String color;
	public Pajaro(String n,String c) {
		this.nombre=n;
		this.color=c;
	}
	public void hacersonido() {
		System.out.println(nombre+" de color:" +color+ " (pajaro) hace : !pio pio!");
	}
	public void moverse() {
		System.out.println(nombre+ "de color:" +color+ " vuela");
	}
}
public class ejercicio7 {
	public static void main(String[] args) {
		Perro p=new Perro("rexx",14,"labrador");
		Gato g=new Gato("waufi","negro");
		Pajaro pa=new Pajaro("pepillo","blanco");
		p.hacersonido();
		p.moverse();
		g.hacersonido();
		g.moverse();
		pa.hacersonido();
		pa.moverse();
	}
}
