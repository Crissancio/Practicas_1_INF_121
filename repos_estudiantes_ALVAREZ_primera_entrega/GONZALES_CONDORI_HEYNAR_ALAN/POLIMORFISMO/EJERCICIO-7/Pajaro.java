
package Ejercicios.Ejercicio_7;


public class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    
    
    public void hacerSonido(){
        System.out.println("El pajaro hace: !!!!Pio Pio");
    }
    
    public void moverse(){
        System.out.println("El nombre es: "+nombre+" el esta VOLANDO");
    }
}
