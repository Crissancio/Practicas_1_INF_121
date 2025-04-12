package Ejercicio3;

public class Mesero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;
    private float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora,float propina){
        this.nombre=nombre;
        this.sueldoMes=sueldoMes;
        this.horasExtra=horasExtra;
        this.sueldoHora=sueldoHora;
        this.propina=propina;
    }
    //b)Sobrecargar el método SueldoTotal para mostrar el sueldo total,
    //sumándole las horas extra, considerando el sueldo por hora y la propina
    //en caso de los meseros.
    
    public void sueldoTotal(){
        float total= sueldoMes+(horasExtra*sueldoHora)+propina;
        System.out.println("El sueldo del mesero " + nombre + " es: " + total);
    }
    public void sueldoTotal(int horasExtra, float sueldoPorHora, float propina) {
        float total = sueldoMes + (horasExtra * sueldoPorHora) + propina;
        System.out.println("El sueldo del mesero " + nombre + " es: " + total);
    } 
    //c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
    //SueldoMes igual a X.
    public void mostrar(int x) {
        if(sueldoMes==x) {
            System.out.println("Mesero "+nombre+" Tiene un sueldo igual a "+x);
            
        }
    }
    
    public void mostrar(int x, String mensaje) {
        if(sueldoMes==x) {
            System.out.println("Mesero "+nombre+" Tiene un sueldo igual a "+x+". " + mensaje);
            
        }
    }
    
    
}
