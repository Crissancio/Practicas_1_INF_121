package ejer2;

class Estudiante {
	String nombre;
	int nota_1;
	int nota_2;
	
	public Estudiante(String nombre, int nota_1, int nota_2) {
		this.nombre = nombre;
		this.nota_1 = nota_1;
		this.nota_2 = nota_2;
	}
	public long Promedio() {
		return (this.nota_1 + this.nota_2)/2;
	}
	public String Aprobo() {
		if(Promedio() >= 6) {
			return "aprobo";
		}
		return "no aprobo";
	}
	public String toString() {
		return "Estudiante: " +this.nombre+" Promedio: "+Promedio()+" Aprobacion: "+Aprobo();
	}
	public static void main(String[] args) {
		Estudiante x = new Estudiante("pepe", 3, 4);
		Estudiante y = new Estudiante("lopo", 9, 7);
		Estudiante z = new Estudiante("ucio", 1, 3);
		
		System.out.println(x.toString());
		System.out.println(y.toString());
		System.out.println(z.toString());
	}
}
