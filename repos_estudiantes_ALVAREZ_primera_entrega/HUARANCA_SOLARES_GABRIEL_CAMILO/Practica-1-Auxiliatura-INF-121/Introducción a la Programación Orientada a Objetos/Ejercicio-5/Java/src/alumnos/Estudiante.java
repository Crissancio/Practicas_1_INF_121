package alumnos;

public class Estudiante {
	public String nombre;
	public int nota_1;
	public int nota_2;
	
	public Estudiante(String nombre,int nota_1,int nota_2) {
		this.nombre=nombre;
		this.nota_1=nota_1;
		this.nota_2=nota_2;
	}
	
	public float promediando() {
		float promedio=0;
		promedio=(this.nota_1+this.nota_2)/2;
		return promedio;
	}
	
	public String muestraEstudiante() {
		return "Estudiante: "+this.nombre;
	}
	
	public String aproboureprobo() {
		if(promediando()>=6) {
			return "Aprobado";
		}
		else {
			return "Reprobado";
		}
	}
	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("Lista de Algunos Estudiantes");
		System.out.println("-----------------------");
		Estudiante e1 = new Estudiante("Dayra",7,9);
		System.out.println(e1.muestraEstudiante());
		System.out.println("Nota 1: "+e1.nota_1+" pts");
		System.out.println("Nota 2: "+e1.nota_2+" pts");
		System.out.println("Promedio: "+e1.promediando()+" pts");
		System.out.println(e1.aproboureprobo());
		System.out.println("-----------------------");
		Estudiante e2 = new Estudiante("Joel",3,7);
		System.out.println(e2.muestraEstudiante());
		System.out.println("Nota 1: "+e2.nota_1+" pts");
		System.out.println("Nota 2: "+e2.nota_2+" pts");
		System.out.println("Promedio: "+e2.promediando()+" pts");
		System.out.println(e2.aproboureprobo());
		System.out.println("-----------------------");
		Estudiante e3 = new Estudiante("Ramiro",5,7);
		System.out.println(e3.muestraEstudiante());
		System.out.println("Nota 1: "+e3.nota_1+" pts");
		System.out.println("Nota 2: "+e3.nota_2+" pts");
		System.out.println("Promedio: "+e3.promediando()+" pts");
		System.out.println(e3.aproboureprobo());
		System.out.println("-----------------------");
	}

}
