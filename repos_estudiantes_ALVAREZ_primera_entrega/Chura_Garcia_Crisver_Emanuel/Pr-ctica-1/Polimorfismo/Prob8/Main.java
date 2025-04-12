//8. Para la reserva de habitaciones se guía por las siguientes clases
public class Main {
    public static void main(String[] args) {
        // a) Instanciar 1 objeto de cada tipo de habitación
        HabitacionSimple hab1 = new HabitacionSimple(777, 25, 3, 2);
        HabitacionDoble hab2 = new HabitacionDoble(1825, 50, 4, 10, 2);
        Suite hab3 = new Suite(789, 150, 0, 5, 3);
        // b) Implementa el método calcularCosto(int noches), sobrescribiéndolo en
        // HabitacionSimple, HabitacionDoble y Suite, aplicando distintos costos por
        // noche.
        hab1.calcularCosto(5);
        hab2.calcularCosto(9);
        hab3.calcularCosto(1);
        // c) Sobrecarga el método reservar() permitiendo reservar con diferentes
        // parámetros (por número de noches o incluyendo el número de personas).
        hab1.reservar(5);
        hab2.reservar(4);
        hab3.reservar(7);

        hab1.reservar(1, 2);
        hab2.reservar(3, 50);
        hab3.reservar(5, 1);
    }
}
