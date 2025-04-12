
package Ejercicios.Ejercicio_7;

public class Gato {
    private String nombre;
    private String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    
    
     public void hacerSonido(){
        System.out.println("El Gato hace: !!!!Miau Miau");
    }
     
    public void moverse(){
        System.out.println("El nombre es: "+nombre+" el esta CORRIENDO");
    }
}
