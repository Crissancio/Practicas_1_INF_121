/* Ejercicio5 polimorfismo: Se hace referencia a algunos de los diferentes ambientes de la Universidad 
   mediante las siguientes clases: Oficina,Aula y Laboratorio
   a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
   b) Crear un método mostrar() para mostrar los datos de cada objeto
   c) Sobrecargar el método cantidadMuebles(), para conocer el número total de muebles dentro de cada ambiente
 */
public class Main {
    public static void main(String[] args) {
        // a) Instanciando 2 Oficina, 2 Aulas y 1 Laboratorio
        Oficina o1 = new Oficina(1, 4, 9);
        Oficina o2 = new Oficina(7, 2, 1);
        Aula a1 = new Aula("A1", 100, 2);
        Aula a2 = new Aula("A2", 40, 2);
        Laboratorio l1 = new Laboratorio("LabBasico", 20, 10, 20);
        // b)Metodos mostrar() sobrecargados para mostrar los datos de cada objeto
        o1.mostrar();
        o2.mostrar();
        a1.mostrar();
        a2.mostrar();
        l1.mostrar();
        // c)metodo cantidadMuebles() sobrecargados para conocer el número total de muebles dentro de cada ambiente.
        System.out.println("\nel total de muebles: ");
        System.out.println("oficina: " + o1.cantidadMuebles() + " muebles");
        System.out.println("A1: " + a1.cantidadMuebles() + " muebles");
        System.out.println("LabBasico: " + l1.cantidadMuebles() + " muebles");
        System.out.println("\nel total de muebles");
        System.out.println(o1.cantidadMuebles("mostrando todo el mobiliario"));
        System.out.println(a1.cantidadMuebles("Aula"));
        System.out.println(l1.cantidadMuebles(true));
    }
}