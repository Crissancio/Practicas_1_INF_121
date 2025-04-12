package AmbienteUniversidad;

public class Main {
//a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
	public static void main(String[] args) {
		Oficina ofi1 = new Oficina(23,20,10);
		Oficina ofi2 = new Oficina(20,23,10);
		Aula alu1 = new Aula("3ro-A ",20,20);
		Aula alu2 =new Aula("4to-B",30,30);
		Laboratorio lab = new Laboratorio("lab-133",30,30,30);
		

		
		ofi1.mostar();
		ofi2.mostar();
		alu1.mostrar();
		alu2.mostrar();
		lab.mostrar();
		
	
		
		System.out.println("-----------------------------------------");
		  
	        System.out.println("Total muebles en oficina 1 es  " + ofi1.canMuebles() + "\n");

	        System.out.println("Total muebles en la oficina 2  " + ofi2.canMuebles() + "\n");

	   
	        System.out.println("Total muebles en el aula 1 " + alu1.canMuebles() + "\n");

	  
	        System.out.println("Total muebles en el aula 2 " + alu2.canMuebles() + "\n");

	 
	        System.out.println("Total muebles en el laboratorio " + lab.canMuebles() + "\n");
	}
	
	

}
