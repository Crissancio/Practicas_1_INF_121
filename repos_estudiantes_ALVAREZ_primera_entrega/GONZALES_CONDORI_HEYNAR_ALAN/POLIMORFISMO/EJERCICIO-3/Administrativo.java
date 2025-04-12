
package Ejercicios.ejercicio_3;


public class Administrativo {
    private String nombre;
    private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }
    public Administrativo(String nombre , String cargo){
        this.nombre = nombre;
        this.cargo = cargo;
    
    }
    
    public void sueldoTotal(int sueldoMes){
        float sueldoTotal =sueldoMes;
       
        System.out.println("El sueldo total de "+nombre+" es de "+sueldoTotal+ " y su cargo es "+cargo);
    }
    
}
