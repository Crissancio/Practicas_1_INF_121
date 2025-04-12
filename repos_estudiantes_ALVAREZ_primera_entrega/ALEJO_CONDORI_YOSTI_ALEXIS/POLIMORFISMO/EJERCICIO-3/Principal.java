package Ejercicio3;

public class Principal {
	public static void main(String[] args) {
	        Cocinero c = new Cocinero("Carlos ",1500,10,20.5f);
	        Mesero m1 = new Mesero("Ana ",2000,5, 15.0f,100f);
	        Mesero m2 = new Mesero("Luis ",1300,8,16.0f, 50f);
	        Administrativo a1 = new Administrativo("María",2000f, "Contadora");
	        Administrativo a2 = new Administrativo("Pedro",1000f, "RRHH");
	        System.out.println("=== Sueldo Total ===");
	        System.out.println("Cocinero base: "+c.SueldoTotal());
	        System.out.println("Cocinero con extras: " +
	            c.SueldoTotal(c.getHorasExtra(),c.getSueldoHora()));
	        System.out.println("Mesero1 base: "+m1.SueldoTotal());
	        System.out.println("Mesero1 con extras: " +
	            m1.SueldoTotal(m1.getHorasExtra(),m1.getSueldoHora(),m1.getPropina()));
	        System.out.println("Mesero2 base: "+m2.SueldoTotal());
	        System.out.println("Mesero2 con extras: " +
	            m2.SueldoTotal(m2.getHorasExtra(),m2.getSueldoHora(),m2.getPropina()));
	        System.out.println("Admin1 base: "+ a1.SueldoTotal());
	        System.out.println("Admin2 base: "+ a2.SueldoTotal());
	        System.out.println("\n=== SueldoMes == 2000 ===");
	        c.mostrar(2000f);
	        m1.mostrar(2000f);
	        m2.mostrar(2000f);
	        a1.mostrar(2000f);
	        a2.mostrar(2000f);
	    }
}
