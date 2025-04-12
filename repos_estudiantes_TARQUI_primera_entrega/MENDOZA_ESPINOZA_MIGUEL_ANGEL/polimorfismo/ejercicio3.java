package polimorfismo;
class Cocinero{
	private String nombre;
	private int sueldomes;
	private int horasextras;
	private int sueldohora;
	public Cocinero(String n,int sm,int hex,int sh) {
		this.nombre=n;
		this.sueldomes=sm;
		this.horasextras=hex;
		this.sueldohora=sh;
	}
	public void mostrar() {
		int sueldototal=sueldomes+(horasextras*sueldohora);
		System.out.println("cocinero: " +nombre+ ",sueldototal:" +sueldototal);
	}
}
class Mesero{
	private String nombre;
	private int sueldomes;
	private int horasextras;
	private int sueldohora;
	private float propina;
	public Mesero(String n,int sm,int hex,int sh,float p) {
		this.nombre=n;
		this.sueldomes=sm;
		this.horasextras=hex;
		this.sueldohora=sh;
		this.propina=p;
	}
	public void mostrar() {
		float sueldototal=sueldomes + (horasextras*sueldohora) + propina;
		System.out.println("mesero: " +nombre+ ",sueldototal:" +sueldototal);
	}
}
class Administrativo{
	private String nombre;
	private int sueldomes;
	private String cargo;
	public Administrativo(String n,int sm,String c) {
		this.nombre=n;
		this.sueldomes=sm;
		this.cargo=c;
	}
	public void mostrar() {
		System.out.println("administrativo: "+nombre +"cargo:" +cargo+ "sueldo:" +sueldomes);
	}
}
public class ejercicio3{
	public static void main(String[] args) {
		Cocinero c1=new Cocinero("pedro",2500,10,50);
		Mesero m1=new Mesero("juan",1800,10,5,200);
		Mesero m2=new Mesero("carlos",1900,5,6,150);
		Administrativo ad1=new Administrativo("ana",3000,"gerente");
		Administrativo ad2=new Administrativo("luis",2800,"supervisor");
		c1.mostrar();
		m1.mostrar();
		m2.mostrar();
		ad1.mostrar();
		ad2.mostrar();
	}
}