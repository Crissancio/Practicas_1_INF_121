public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Pedro", 1000);
        Empleado e2 = new Empleado("Sofía", 1200);
        System.out.println(e1.sueldo);
        System.out.println(e2.sueldo);
        e1.aplicarAumento();
        e2.aplicarAumento();
        System.out.println(e1.sueldo);
        System.out.println(e2.sueldo);
    }
}