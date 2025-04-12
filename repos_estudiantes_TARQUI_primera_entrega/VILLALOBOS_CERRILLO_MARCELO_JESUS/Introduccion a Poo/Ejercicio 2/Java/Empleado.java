public class Empleado {
    private String nombre;
    private double sueldo;
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public double sueldoAnual() {
        return sueldo * 12;
    }
    public void aplicarAumento() {
        sueldo = sueldo * 1.10;
    }
