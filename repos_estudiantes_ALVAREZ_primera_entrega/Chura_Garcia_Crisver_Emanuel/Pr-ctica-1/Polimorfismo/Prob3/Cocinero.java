//3.Un restaurante organiza a su personal mediante las siguientes clases:
public class Cocinero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora){
        this.nombre=nombre;
        this.sueldoMes=sueldoMes;
        this.horasExtra=horasExtra;
        this.sueldoHora=sueldoHora;
    }

    public void SueldoTotal() {
        float sueldototal = sueldoMes + (horasExtra * sueldoHora);
        System.out.println("Sueldo total más horas extra considerando el sueldo por hora: " + sueldototal);
    }

    public void SueldoMes(float X) {
        if (sueldoMes == X) {
            System.out.println("Empleado: " + nombre + "; Sueldo al mes: " + sueldoMes);
        }
    }
}