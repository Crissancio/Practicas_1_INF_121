
package ejercicio2_5;

public class Main {
    public static void main(String[] args) {
        Oficina of1 = new Oficina(4, 2, 1);
        Oficina of2 = new Oficina(6, 3, 2);

        Aula a1 = new Aula("A-101", 30, 30);
        Aula a2 = new Aula("A-102", 25, 25);

        Laboratorio lab = new Laboratorio("Lab-Quimica", 20, 10, 20);

        of1.mostrar();
        of2.mostrar();
        a1.mostrar();
        a2.mostrar();
        lab.mostrar();

        of1.cantidadMuebles("total");
        of2.cantidadMuebles("total");
        a1.cantidadMuebles("total");
        a2.cantidadMuebles("total");
        lab.cantidadMuebles("total");
    }
}
