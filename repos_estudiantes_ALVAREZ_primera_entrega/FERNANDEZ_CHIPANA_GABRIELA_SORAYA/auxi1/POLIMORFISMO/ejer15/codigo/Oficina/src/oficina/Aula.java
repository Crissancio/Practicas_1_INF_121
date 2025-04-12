/*Se hace referencia a algunos de los diferentes ambientes de la Universidad
mediante las siguientes clases:
a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
b) Crear un método mostrar() para mostrar los datos de cada objeto
c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
muebles dentro de cada ambiente*/
package oficina;
public class Aula {
    private String  nombre;
    private int capacidad;
    private int nropupitres;
    public Aula(String nombre,int capacidad,int nropupitres){
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.nropupitres=nropupitres;
    }
    public void mostrar(){
            System.out.println("e aula es: "+nombre+" de capacidad,"+capacidad+" con pupitres "+nropupitres+" estanterias");
}
    public void cantidadMuebles(){
        int canmuebles=0;
        canmuebles=this.nropupitres;
        System.out.println("cantidad de muebles total del aulas es: "+canmuebles);
    }
    }

