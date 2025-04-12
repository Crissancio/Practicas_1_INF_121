//3.Un restaurante organiza a su personal mediante las siguientes clases:
public class Administrativo {
    private String nombre;
    private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public void SueldoTotal() {
        System.out.println("Sueldo total: " + sueldoMes);
    }

    public void SueldoMes(float X) {
        if (sueldoMes == X && cargo.equals("Jefe")) {
            System.out.println("Santos bacalaos!! es el Jefe: " + nombre + "; Su sueldo al mes es de: " + sueldoMes);

        } else {
            if (sueldoMes == X) {
                System.out.println("Empleado: " + nombre + " de cargo: " + cargo + "; Sueldo al mes: " + sueldoMes);
            }
        }
    }
}
