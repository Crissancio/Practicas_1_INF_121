//3.Un restaurante organiza a su personal mediante las siguientes clases:
public class Mesero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;
    private int propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, int propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public void SueldoTotal() {
        float sueldototal = sueldoMes + (sueldoHora * (horasExtra + propina));
        System.out.println("Sueldo total más horas extra considerando el sueldo por hora mas propina: " + sueldototal);
    }

    public void SueldoMes(float X) {
        if (sueldoMes == X) {
            System.out.println("Empleado: " + nombre + "; Sueldo al mes: " + sueldoMes);
        }
    }
}
