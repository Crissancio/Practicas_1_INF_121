public class Main {
    public static void main(String[] args) {
        Avion a = new Avion();
        a.subirPasajeros(100);
        a.verificarCombustible(500);
        a.retrasarVuelo();
        System.out.println("Nueva hora de vuelo: " + a.horaVuelo);
    }
}