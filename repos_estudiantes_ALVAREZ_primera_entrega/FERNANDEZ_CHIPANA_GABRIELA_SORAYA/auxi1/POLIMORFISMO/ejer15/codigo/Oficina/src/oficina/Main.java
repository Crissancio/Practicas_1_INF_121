/*Se hace referencia a algunos de los diferentes ambientes de la Universidad
mediante las siguientes clases:
a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
b) Crear un método mostrar() para mostrar los datos de cada objeto
c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
muebles dentro de cada ambiente*/
package oficina;
public class Main {
    public static void main(String[] args) {
        Oficina oficina=new Oficina(3,5,2);
        Oficina oficina1=new Oficina(4,4,1);
        Aula aula=new Aula("A1",50,25);
        Aula aula1=new Aula("A2",30,15);
        Laboratorio laboratorio=new Laboratorio("Lab1",20,10,20);
        oficina.mostrar();
        oficina.cantidadMuebles();
        oficina1.mostrar();
        oficina1.cantidadMuebles();
        aula.mostrar();
        aula.cantidadMuebles();
        aula1.mostrar();
        aula1.cantidadMuebles();
        laboratorio.mostrar();
        laboratorio.cantidadMuebles();
    }
    
}
