package Ejercicio3;

public class Cocinero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora){
        this.nombre=nombre;
        this.sueldoMes= sueldoMes;
        this.horasExtra=horasExtra;
        this.sueldoHora=sueldoHora;
    }
    //b)Sobrecargar el método SueldoTotal para mostrar el sueldo total,
    //sumándole las horas extra, considerando el sueldo por hora y la propina
    //en caso de los meseros.
    
    public void sueldoTotal(){
        float total= sueldoMes+(horasExtra*sueldoHora);
        System.out.println("El sueldo del cocinero " + nombre + " es: " + total);
    }
    public void sueldoTotal(int horasExtra, float sueldoPorHora) {
        float total = sueldoMes + (horasExtra * sueldoPorHora);
        System.out.println("El sueldo del cocinero " + nombre + " es: " + total);
    }
    //c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
    //SueldoMes igual a X.
    
    public void mostrar(int x) {
        if(sueldoMes==x) {
            System.out.println("Cocinero "+nombre+" Tiene un sueldo igual a "+x);
            
        }
    }
    public void mostrar(int x, String mensaje) {
        if(sueldoMes==x) {
            System.out.println("Cocinero "+nombre+" Tiene un sueldo igual a "+x+". " + mensaje);
            
        }
    }

   
}
