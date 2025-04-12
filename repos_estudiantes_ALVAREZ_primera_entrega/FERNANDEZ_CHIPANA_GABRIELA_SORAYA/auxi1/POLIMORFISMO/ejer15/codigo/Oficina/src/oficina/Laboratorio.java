/*Se hace referencia a algunos de los diferentes ambientes de la Universidad
mediante las siguientes clases:
a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
b) Crear un método mostrar() para mostrar los datos de cada objeto
c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
muebles dentro de cada ambiente*/
package oficina;
public class Laboratorio {
     private String  nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;
    public Laboratorio(String nombre,int capacidad,int nroMesas,int nroSillas){
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.nroMesas=nroMesas;
        this.nroSillas=nroSillas;
    }
   public void mostrar(){
            System.out.println("e aula es: "+nombre+" de capacidad,"+capacidad+" con numero de mesas "+nroMesas+" y cantidad de sillas"+nroSillas);
}
      public void cantidadMuebles(){
        int canmuebles=0;
        canmuebles=this.nroSillas+this.nroMesas;
        System.out.println("cantidad de muebles total: "+canmuebles);
    }
}
