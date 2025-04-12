public class Main {
    public static void main(String[] args) {
        HabitacionSimple h1 = new HabitacionSimple(101, 50, 3, 2);
        HabitacionDoble h2 = new HabitacionDoble(202, 80, 2, 4, 2);
        Suite h3 = new Suite(303, 150, 1, 6, 3);

        h1.reservar(3);
        h2.reservar(2, 2);
        h3.reservar(1);

        System.out.println("Costo Simple: " + h1.calcularCosto(3));
        System.out.println("Costo Doble: " + h2.calcularCosto(2));
        System.out.println("Costo Suite: " + h3.calcularCosto(1));
    }
}