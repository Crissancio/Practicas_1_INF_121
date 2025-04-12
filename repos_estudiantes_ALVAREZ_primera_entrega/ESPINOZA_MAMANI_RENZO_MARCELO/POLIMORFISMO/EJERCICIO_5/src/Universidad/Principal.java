package Universidad;

public class Principal {
	 public static void main(String[] args) {
	        // a) Instanciar los objetos
	        Oficina oficina1 = new Oficina(5, 3, 2);
	        Oficina oficina2 = new Oficina(8, 4, 3);
	        Aula aula1 = new Aula("Aula 101", 30, 30);
	        Aula aula2 = new Aula("Aula 202", 25, 25);
	        Laboratorio laboratorio1 = new Laboratorio("Lab. Computación", 20, 10, 20);

	        // b) Mostrar los datos de cada objeto
	        System.out.println("=== MOSTRANDO DATOS DE LOS AMBIENTES ===");
	        oficina1.mostrar();
	        oficina2.mostrar();
	        aula1.mostrar();
	        aula2.mostrar();
	        laboratorio1.mostrar();

	        // c) Mostrar cantidad de muebles (métodos sobrecargados)
	        System.out.println("\n=== CANTIDAD DE MUEBLES ===");
	        System.out.println("Oficina 1 - Total muebles: " + oficina1.cantidadMuebles());
	        System.out.println("Oficina 1 - Sin estanterías: " + oficina1.cantidadMuebles(false));
	        
	        System.out.println("\nAula 1 - Pupitres: " + aula1.cantidadMuebles());
	        System.out.println("Aula 1 - Pupitres + sillas: " + aula1.cantidadMuebles(true));
	        
	        System.out.println("\nLaboratorio - Total muebles: " + laboratorio1.cantidadMuebles());
	        System.out.println("Laboratorio - Solo mesas: " + laboratorio1.cantidadMuebles(true));
	    }
}
