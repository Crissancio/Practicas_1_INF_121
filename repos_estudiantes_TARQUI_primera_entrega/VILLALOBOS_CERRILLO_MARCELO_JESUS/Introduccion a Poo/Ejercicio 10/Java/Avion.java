public class Avion {
    private int pasajeros;
    private int combustible;
    private String horaVuelo;
    public Avion() {
        pasajeros = 0;
        combustible = 100000;
        horaVuelo = "10:00";
    }
    public void subirPasajeros(int cantidad) {
        pasajeros += cantidad;
    }
    public void verificarCombustible(int distancia) {
        int necesario = distancia * 12;

        if (necesario > combustible) {
            System.out.println("No hay suficiente combustible");
        } else {
            combustible -= necesario;
        }
    }
    public void retrasarVuelo() {
        horaVuelo = "13:00";
        System.out.println("El vuelo fue retrasado 3 horas");
    }
}