
package Ejercicio3;


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
    public void mostrar(){
        System.out.println("nombre: " + nombre + "sueldoM: " + sueldoMes + "hExtra: " + horasExtra + "sueldoH: " + sueldoHora );
    }
    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }

    public void sueldoTotal(int x) {
        if (sueldoMes == x) {
            System.out.println("Cocinero: " + nombre + " tiene sueldo igual a " + x);
        }
    }
}

