//5. Se hace referencia a algunos de los diferentes ambientes de la Universidad mediante las siguientes clases:
public class Main {
    public static void main(String[] args) {
        // a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
        Oficina of1 = new Oficina(0, 15, 4);
        Oficina of2 = new Oficina(4, 0, 12);
        Aula aula1 = new Aula("PB-A2", 100, 50);
        Aula aula2 = new Aula("A3-P3", 50, 0);
        Laboratorio lab1 = new Laboratorio("Lasin-2", 0, 15, 50);

        of1.mostrar();
        of2.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        lab1.mostrar();
        // c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
        // muebles dentro de cada ambiente
        of1.cantidadMuebles();
        of2.cantidadMuebles();
        aula1.cantidadMuebles();
        aula2.cantidadMuebles();
        lab1.cantidadMuebles();

    }
}
