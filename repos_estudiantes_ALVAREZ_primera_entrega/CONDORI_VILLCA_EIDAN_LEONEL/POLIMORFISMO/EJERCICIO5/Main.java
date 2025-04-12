package POLIMORFISMO.EJERCICIO5;
//Se hace referencia a algunos de los diferentes ambientes de la Universidad
//mediante las siguientes clases:
//a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
//b) Crear un método mostrar() para mostrar los datos de cada objeto
//c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
//muebles dentro de cada ambiente
public class Main {
	public static void main(String[] args) {
        Oficina o1 = new Oficina(3, 2, 1);
        Oficina o2 = new Oficina(4, 3, 2);

        Aula a1 = new Aula("Aula 101", 30, 30);
        Aula a2 = new Aula("Aula 102", 25, 25);

        Laboratorio lab = new Laboratorio("Lab Computo", 20, 10, 20);

        // b) Mostrar datos
        o1.mostrar();
        o2.mostrar();
        a1.mostrar();
        a2.mostrar();
        lab.mostrar();

        // c) Mostrar cantidad de muebles con detalle
        System.out.println("Total muebles de la Oficina 1: " + o1.cantidadMuebles());
        System.out.println("Total muebles de la Oficina 2: " + o2.cantidadMuebles());
        System.out.println("Total muebles del Aula 1: " + a1.cantidadMuebles());
        System.out.println("Total muebles del Aula 2: " + a2.cantidadMuebles());
        System.out.println("Total muebles laboratorio: " + lab.cantidadMuebles());
    }
}



