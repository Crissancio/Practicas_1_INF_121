package Ejercicio5;

public class Aula {
    private String nombre;
    private int Capacidad;
    private int nroPupitres;

    public Aula(String nombre, int Capacidad, int nroPupitres) {
        this.nombre = nombre;
        this.Capacidad = Capacidad;
        this.nroPupitres = nroPupitres;
    }
    //b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + Capacidad);
        System.out.println("Numero de pupitres: " + nroPupitres);
    }
    //c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
    //muebles dentro de cada ambiente
    public void cantidadMuebles() {
    	int m=nroPupitres;
    	System.out.println("Cantidad de muebles Aula "+nombre+" es: "+m);
    	
    }
    public void cantidadMuebles(int nroSillas) {
        int total = nroPupitres + nroSillas;
        System.out.println("Cantidad muebles en el Aula " + nombre + " (incluyendo sillas) es: " + total);
    }

    
}
