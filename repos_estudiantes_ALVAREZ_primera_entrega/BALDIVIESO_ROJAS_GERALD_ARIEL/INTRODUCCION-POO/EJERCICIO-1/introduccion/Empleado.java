package introduccion;

class Empleado {
	String nombre;
	int edad;
	String ciudad;
	public Empleado(String nombre, int edad, String ciudad) {
		this.nombre = nombre;
		this.edad =edad;
		this.ciudad = ciudad;
	}
	public String toString() {
		return "hola, soy "+nombre+", de "+ciudad;
		
	}
	public String esMayor() {
		if(edad > 17) {
			return ""+nombre+" es mayor de edad";
		}
		return ""+nombre+" es menor de edad";
	}
	public static void main(String[]args) {
		Empleado x = new Empleado("pepe", 78, "la paz");
		Empleado y = new Empleado("rome", 78, "Oruro");
		Empleado z = new Empleado("polo", 78, "Sucre");
		
		System.out.println(x.toString());
		System.out.println(x.esMayor());
		System.out.println("-----------------------");
		System.out.println(y.toString());
		System.out.println(y.esMayor());
		System.out.println("-------------------");
		System.out.println(z.toString());
		System.out.println(z.esMayor());
	}
}
