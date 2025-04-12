/*
5.Se hace referencia a algunos de los diferentes ambientes de la Universidad mediante las siguientes clases:

    a)Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
    b)Crear un método mostrar() para mostrar los datos de cada objeto
    c)Sobrecargar el método cantidadMuebles(), para conocer el número total de muebles dentro de cada ambiente

*/
package Ejercicios.Ejercicio_5;


public class Main {
    public static void main(String[] args) {
        Oficina oficina1 = new Oficina(1,2,3);
        Oficina oficina2 = new Oficina(4,5,6);
        
        System.out.println("DATOS DE LA OFICINA 1");
        oficina1.mostrar();
        System.out.println("---------------------");
        System.out.println("DATOS DE LA OFICINA 2");
        oficina2.mostrar();
        
        Aula aula1 = new Aula("A", 1, 2);
        Aula aula2 = new Aula("B", 3, 4);
        
        System.out.println("---------------------");
        System.out.println("DATOS DEL AULA 1");
        aula1.mostrar();
        System.out.println("---------------------");
        System.out.println("DATOS DEL AULA 2");
        aula2.mostrar();
        System.out.println("---------------------");
        Laboratorio labo1 = new Laboratorio("C", 1, 2, 3);
        System.out.println("DATOS DEL LABORATORIO 1");
        
        labo1.mostrar();
        System.out.println("---------------------");
        System.out.println("OFICINA 1");
        oficina1.cantidadMuebles(1, 2, 3);
        System.out.println("----------------------");
        System.out.println("OFICINA 2");
        oficina2.cantidadMuebles(4, 5, 6);
        System.out.println("-----------------------");
        System.out.println("AULA 1 ES");
        aula1.cantidadMuebles(2);
        System.out.println("------------------------");
        System.out.println("AULA 2 ES");
        aula2.cantidadMuebles(4);
        System.out.println("------------------------");
        System.out.println("LABORATORIO 1");
        labo1.cantidadMuebles(2, 3);
    }
}
