package Ejercicio5;
public class AppUniversidad {

    public static void main(String[] args){
        
        //a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
        Oficina ofi1=new Oficina (5,3,2);
        Oficina ofi2=new Oficina (10,5,4);
        Aula aula1=new Aula("Aula 1",30,20);
        Aula aula2=new Aula("Aula 2",40,25);
        Laboratorio lab1=new Laboratorio("Labo 1",20,10,15);

        //b) Crear un método mostrar() para mostrar los datos de cada objeto
        System.out.println("-------I N C I S O     B-------");
        ofi1.mostrar();
        ofi2.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        lab1.mostrar();

        //c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
        //muebles dentro de cada ambiente
        System.out.println("-------I N C I S O     C-------");
        ofi1.cantidadMuebles();
        ofi1.cantidadMuebles(2);
        ofi2.cantidadMuebles();
        ofi2.cantidadMuebles(3);
        aula1.cantidadMuebles();
        aula1.cantidadMuebles(5);
        aula2.cantidadMuebles();
        aula2.cantidadMuebles(10);
        lab1.cantidadMuebles(3);
        lab1.cantidadMuebles();
    }}