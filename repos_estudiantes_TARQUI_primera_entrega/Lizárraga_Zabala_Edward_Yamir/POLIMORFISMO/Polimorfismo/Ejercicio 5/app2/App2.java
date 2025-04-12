
package app2;

public class App2 {
    public static void main(String[] args) {
        // a) Instanciar objetos
        Oficina of1 = new Oficina(4, 2, 1);
        Oficina of2 = new Oficina(6, 3, 2);

        Aula aula1 = new Aula("Aula 101", 30, 30);
        Aula aula2 = new Aula("Aula 202", 40, 40);

        Laboratorio lab = new Laboratorio("Lab. Computo", 25, 12, 25);

        // b) Mostrar información
        of1.mostrar();
        System.out.println("Total muebles: " + of1.cantidadMuebles() + "\n");

        of2.mostrar();
        System.out.println("Total muebles: " + of2.cantidadMuebles() + "\n");

        aula1.mostrar();
        System.out.println("Total muebles: " + aula1.cantidadMuebles() + "\n");

        aula2.mostrar();
        System.out.println("Total muebles: " + aula2.cantidadMuebles() + "\n");

        lab.mostrar();
        System.out.println("Total muebles: " + lab.cantidadMuebles() + "\n");
    }
}

