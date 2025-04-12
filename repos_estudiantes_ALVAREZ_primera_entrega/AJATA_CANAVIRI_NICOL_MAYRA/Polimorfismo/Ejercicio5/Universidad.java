package Polimorfismo.Ejercicio5;

public class Universidad {
    public static void main(String[] args) {
       
        Oficina oficina1 = new Oficina(2, 2, 3);
        Oficina oficina2 = new Oficina(1, 1, 2);

        Aula aula1 = new Aula("Aula 101", 30, 30);
        Aula aula2 = new Aula("Aula 102", 100, 100);

        Laboratorio laboratorio1 = new Laboratorio("Lab Quimica", 20, 10, 20);

        System.out.println("Datos de los ambientes:");
        oficina1.mostrar();
        oficina2.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        laboratorio1.mostrar();

        System.out.println("\nCantidad de muebles por ambiente:");
        System.out.println("Oficina 1: " + oficina1.cantidadMuebles());
        System.out.println("Oficina 2: " + oficina2.cantidadMuebles());
        System.out.println("Aula 1: " + aula1.cantidadMuebles());
        System.out.println("Aula 2 (con sillas adicionales): " + aula2.cantidadMuebles(5)); 
        System.out.println("Laboratorio 1: " + laboratorio1.cantidadMuebles());
    }
}
