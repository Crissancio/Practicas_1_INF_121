
package Ejercicios.Ejercicio_5;


public class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }

   public void mostrar(){
        System.out.println("El numero de sillas es: "+nroSillas);
        System.out.println("El numero de escritorios es: "+nroEscritorios);
        System.out.println("El numero de estanterias es: "+nroEstanterias);
    }
   
   public void cantidadMuebles(int nroSillas,int nroEscritorios,int nroEstanterias){
       int totMuebles=nroSillas+nroEstanterias+nroEscritorios;
       System.out.println("El numero de muebles de la Oficina es: "+totMuebles);
   }
    
}
