package ejercicio3;

public class Principal {
	public static void main(String[] args) {
		Oficina o1 = new Oficina("Dirección", 5);
        Oficina o2 = new Oficina("Secretaría", 3);
        Aula a1 = new Aula("PB-A1", 50);
        Aula a2 = new Aula("SS-A2", 30);
        Laboratorio l1 = new Laboratorio("P3-L4", "INFORMATICA");

        o1.cantidadMuebles(10);
        o2.cantidadMuebles(8);
        a1.cantidadMuebles(25);
        a2.cantidadMuebles(20);
        l1.cantidadMuebles(15);

        Ambiente[] ambientes = {o1, o2, a1, a2, l1};
        for (Ambiente a : ambientes) {
            a.mostrar();
            System.out.println("------------");
        }
	}
}
