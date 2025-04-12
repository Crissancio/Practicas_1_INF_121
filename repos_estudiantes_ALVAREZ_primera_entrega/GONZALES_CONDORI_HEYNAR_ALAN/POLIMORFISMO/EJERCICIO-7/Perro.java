
package Ejercicios.Ejercicio_7;


public class Perro {
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    
     public void hacerSonido(){
        System.out.println("El Perro hace: !!!!Gua Guau");
    }
     
    public void moverse(){
        System.out.println("El nombre es: "+nombre+" el esta CAMINANDO");
    }
}
