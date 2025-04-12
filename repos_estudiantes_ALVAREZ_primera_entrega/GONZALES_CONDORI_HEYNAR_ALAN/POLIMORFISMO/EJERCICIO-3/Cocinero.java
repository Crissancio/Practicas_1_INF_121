
package Ejercicios.ejercicio_3;


public class Cocinero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;

    
    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }
    public Cocinero(String nombre){
        this.nombre = nombre;
    
    }
    
     public void sueldoTotal(int sueldoMes,int horasExtra,float sueldoHora){
        float sueldoTotal=sueldoMes+horasExtra+sueldoHora;
        System.out.println("el sueldo total de "+nombre+" es de "+sueldoTotal);
    }
}
