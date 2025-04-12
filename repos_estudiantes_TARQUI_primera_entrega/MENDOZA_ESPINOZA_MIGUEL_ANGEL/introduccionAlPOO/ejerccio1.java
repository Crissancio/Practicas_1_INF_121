package introduccionAlPOO;
class Persona{
	public String nombre;
	public int edad;
	public String ciudad;
	public Persona(String n,int e,String c) {
		this.nombre=n;
		this.edad=e;
		this.ciudad=c;
	}	
	public String saludo() {
		return "hola soy "+nombre+"de"+ciudad;
	}
	public boolean esMayorEdad() {
		return edad>=18;
	}
	public static void main(String[] args) {
		Persona p1=new Persona("miguel",20,"la paz");
		Persona p2=new Persona("ana",17,"cochabamba");
		Persona p3=new Persona("carlos",25,"santa cruz");
		System.out.println(p1.saludo());
		System.out.println(p2.saludo());
		System.out.println(p3.saludo());
		System.out.println(p1.nombre + "es mayor de edad:"+p1.esMayorEdad());
		System.out.println(p2.nombre + "es mayor de edad:"+p2.esMayorEdad());
		System.out.println(p3.nombre + "es mayor de edad:"+p3.esMayorEdad());
	}
}
