package IntroPOO;

public class Estudiante {
	private
	String nombre;
	int nota1;
	int nota2;
	

	public Estudiante(String nombre, int nota1, int nota2) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public int Promedio() {
		return (this.nota1 + this.nota2)/2;		
	}
	
	public void veriAprob() {
		if(Promedio()>=6) {
			System.out.println("Aprobo");
		}
		else {
			System.out.println("Reprobo");
		}
	}
	
 
	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("Ana", 7, 8);
        Estudiante estudiante2 = new Estudiante("Luis", 5, 6);
        Estudiante estudiante3 = new Estudiante("Carlos", 4, 5);
        
        System.out.println(estudiante1.nombre + " tiene un promedio de " + estudiante1.Promedio() + " y: "  );
        estudiante1.veriAprob();
        
        System.out.println(estudiante2.nombre + " tiene un promedio de " + estudiante2.Promedio() + " y: " );
        estudiante2.veriAprob();
            
        System.out.println(estudiante3.nombre + " tiene un promedio de " + estudiante3.Promedio() + " y: " );
        estudiante3.veriAprob();

	}

}
