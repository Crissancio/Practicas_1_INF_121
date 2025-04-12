
package Ejercicios.ejercicio_3;

public class Mesero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;
    private float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }
    public Mesero(String nombre){
        this.nombre = nombre;
    
    }
    
     public void sueldoTotal(int sueldoMes,int horasExtra,float sueldoHora,float propina){
        float sueldoTotal= sueldoMes+horasExtra+sueldoHora+propina;
         System.out.println("EL sueldo de " +nombre+" es de "+sueldoTotal);
    }
}
