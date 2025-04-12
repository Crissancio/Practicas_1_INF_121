package Ejercicio3;

public class Administrativo {
    private String nombre;
    private int sueldoMes;
    private String cargo;

    public Administrativo(String nombre, int sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo=cargo;
    }
    //b)Sobrecargar el método SueldoTotal para mostrar el sueldo total,
    //sumándole las horas extra, considerando el sueldo por hora y la propina
    //en caso de los meseros.
    public void sueldoTotal(){
        float total= sueldoMes;
        System.out.println("El sueldo del administrativo " + nombre +"con cargo en :"+cargo+ " es: " + total);
    }
    public void sueldoTotal(int horasExtra, float sueldoPorHora) {
        float total = sueldoMes + (horasExtra * sueldoPorHora);
        System.out.println("El sueldo del administrativo " + nombre + " con cargo en: " + cargo + 
                           "  es: " + total);
    }
    //c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
    //SueldoMes igual a X.
    public void mostrar(int x) {
        if(sueldoMes==x) {
            System.out.println("Administrativo "+nombre+" Tiene un sueldo igual a "+x);
            
        }
    }
    public void mostrar(int x, String mensaje) {
        if (sueldoMes == x) {
            System.out.println("Administrativo " + nombre + " tiene un sueldo igual a " + x + ". " + mensaje);
        }
    }
    
    
}
