
package Ejercicios.Ejercicio_5;

public class Aula {
    private String nombre;
    private int capacidad;
    private int nroPupitres;

    public Aula(String nombre, int capacidad, int nroPupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = nroPupitres;
    }
    
    public void mostrar(){
        System.out.println("El nombre del aula es: "+nombre);
        System.out.println("La capacidad es: "+capacidad);
        System.out.println("El numero de pupitres es: "+nroPupitres);
    }
    
    public void cantidadMuebles(int nroPupitres){
       System.out.println("El numero de muebles del aula es: "+nroPupitres);
    }
}
