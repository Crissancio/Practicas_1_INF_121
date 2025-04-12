package restaurante;

public class Restaurante{
    public static void main(String[] args) {
        Cocinero c1 = new Cocinero("Juan", 2000, 10, 20);

        Mesero m1 = new Mesero("Carlos", 1500, 5, 15, 200);
        Mesero m2 = new Mesero("Ana", 1400, 8, 20, 150);

        Administrativo a1 = new Administrativo("Lucia", 1800, "Contadora");
        Administrativo a2 = new Administrativo("Pedro", 1800, "Gerente");

        c1.mostrar();
        m1.mostrar();
        m2.mostrar();
        a1.mostrar();
        a2.mostrar();

        System.out.println("== Empleados con sueldoMes = 1800 ==");
        c1.mostrar(1800);
        m1.mostrar(1800);
        m2.mostrar(1800);
        a1.mostrar(1800);
        a2.mostrar(1800);
    }
}
