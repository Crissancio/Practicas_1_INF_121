
package Ejercicios.Ejercicio_5;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }
    
    public void mostrar(){
        System.out.println("El nombre del laboratorio es: "+nombre);
        System.out.println("L a capicidad es: "+capacidad);
        System.out.println("El numero de mesas es: "+nroMesas);
        System.out.println("El numero de sillas es: "+nroSillas);
    }
    
     public void cantidadMuebles(int nroMesas,int nroSillas){
         int totMuebles=nroSillas+nroMesas;
       System.out.println("El numero de muebles del Laboratorio es: "+totMuebles);
    }
}
