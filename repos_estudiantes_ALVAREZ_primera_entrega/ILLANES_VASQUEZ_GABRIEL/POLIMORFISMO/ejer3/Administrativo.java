
package Ejercicio3;

public class Administrativo {
    private String nombre;
    private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public void mostrar(){
        System.out.println("nombre: " + nombre + "sueldoM: " + sueldoMes + "cargo: " +cargo );
    }
    public float sueldoTotal() {
        return sueldoMes;
    }

  
    public void sueldoTotal(int x) {
        if (sueldoMes == x) {
            System.out.println("Administrativo: " + nombre + " tiene sueldo igual a " + x);
        }
    }
}

