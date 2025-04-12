//2. Crea una clase Empleado con nombre y sueldo
public class Empleado {
    private String nombre;
    private float sueldo;

    public Empleado(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // a) Agrega un método para calcular el sueldo anual
    public void Calcular_Sueldo() {
        System.out.println("El sueldo mensual de: " + sueldo + " , anualmente es de: " + sueldo * 12);
    }

    // b) Agrega un método para aplicar un aumento del 10%
    public void Aplicar_Aumento() {
        float incremento = sueldo + (sueldo * (10f / 100f));
        System.out.println(
                "El sueldo mensual incrementado al 10% es de: " + incremento + " , anualmente es de: "
                        + incremento * 12);
    }

    public static void main(String[] args) {
        System.out.println("Programa Java");
        // c) Crea dos empleados y muestra sus sueldos antes y después del aumento
        Empleado empleado1 = new Empleado("Erick", 1500.99f);
        Empleado empleado2 = new Empleado("Andres", 1800.99f);

        System.out.println("Antes del aumento");
        empleado1.Calcular_Sueldo();
        empleado2.Calcular_Sueldo();
        System.out.println("Despues del aumento");
        empleado1.Aplicar_Aumento();
        empleado2.Aplicar_Aumento();
    }
}