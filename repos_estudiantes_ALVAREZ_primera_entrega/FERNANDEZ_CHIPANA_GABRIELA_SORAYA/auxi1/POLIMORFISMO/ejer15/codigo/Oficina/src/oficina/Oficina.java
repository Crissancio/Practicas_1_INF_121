/*Se hace referencia a algunos de los diferentes ambientes de la Universidad
mediante las siguientes clases:
a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
b) Crear un método mostrar() para mostrar los datos de cada objeto
c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
muebles dentro de cada ambiente*/
package oficina;
public class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;
    public Oficina(int nroSillas,int nroEscritorio,int nroEstanterias){
        this.nroSillas=nroSillas;
        this.nroEscritorios=nroEscritorio;
        this.nroEstanterias=nroEstanterias;
    }
    public void mostrar(){
            System.out.println("la oficina tine "+nroSillas+" sillas,"+nroEscritorios+" escritorios y "+nroEstanterias+" estanterias");
}
       public void cantidadMuebles(){
        int canmuebles=0;
        canmuebles=this.nroSillas+this.nroEstanterias+this.nroEscritorios;
        System.out.println("cantidad de muebles total de la oficina es: "+canmuebles);
    }
}