public class Main {
    public static void main(String[] args) {
        Cocinero c1 = new Cocinero("Mario", 3100, 5, (float) 18.5);
        Mesero m1 = new Mesero("Luigi", 2200, 5, (float) 15.7,(float)  5.3);
        Mesero m2 = new Mesero("Luigi", 2100, 5, (float) 15.3, (float) 2.8);
        Administrativo a1 = new Administrativo("Marcelo", 7500, "Gerente");
        Administrativo a2 = new Administrativo("Jesus", 9500, "Gerente General");
        c1.mostrar();
        m1.mostrar();
        m2.mostrar();
        a1.mostrar();
        a2.mostrar();
    }
}
