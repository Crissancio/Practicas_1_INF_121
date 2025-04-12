package EJERCICIO5;

public class mainEj5 {

	public static void main(String[] args) {
        Oficina o1 = new Oficina(5, 3, 2);
        Oficina o2 = new Oficina(4, 2, 1);

        Aula a1 = new Aula("Aula A", 30, 30);
        Aula a2 = new Aula("Aula B", 40, 40);

        Laboratorio lab = new Laboratorio("Lab Computación", 25, 12, 25);

        o1.mostrar();
        o2.mostrar();
        System.out.println("----------------------------");

        a1.mostrar();
        a2.mostrar();
        System.out.println("----------------------------");

        lab.mostrar();
        System.out.println("----------------------------");
    }

}
