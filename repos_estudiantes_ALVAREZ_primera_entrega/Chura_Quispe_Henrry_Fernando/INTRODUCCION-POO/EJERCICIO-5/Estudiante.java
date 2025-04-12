package inf121;

public class Estudiante {

	  String nombre;
	  float nota_1;
	  float nota_2;
	
	
public Estudiante(String nombre,float nota_1, float nota_2) {
	this.nombre=nombre;
	this.nota_1=nota_1;
	this.nota_2=nota_2;
}
	public float promedio() {
		return (nota_1 + nota_2)/2;
	}
	
	
	public boolean aprobo () {
		float prom=promedio();
		if (  prom >= 6) {
	  System.out.println("\nEl estudiante "+nombre+" aprobo con un promedio de "+ prom  );
	  return true;
		}else {
			System.out.println("\nEl estudiante "+nombre+" reprobo con un promedio de "+ prom);
			return false;
		}
	
			
	}
	
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("fulano",7,9);
		Estudiante e2 = new Estudiante("pepe",3,4);
		Estudiante e3 = new Estudiante("mario",4,7);
	
		e1.aprobo();
		e2.aprobo();
		e3.aprobo();
		

	}

}

