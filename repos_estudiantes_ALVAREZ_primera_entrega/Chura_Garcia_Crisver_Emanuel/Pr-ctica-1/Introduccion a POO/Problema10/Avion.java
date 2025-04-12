public class Avion {
    private int capPasajeros;
    private float cantCombustible;
    private int horaDeVuelo;

    public Avion(int capPasajeros, float cantCombustible, int horaDeVuelo) {
        this.capPasajeros = capPasajeros;
        this.cantCombustible = cantCombustible;
        this.horaDeVuelo = horaDeVuelo;
    }

    public void subirPasajeros(int X) {
        if (X == 0) {
            System.out.println("Por favor ingrese una cantidad de pasajeros");
        } else {
            if (X == capPasajeros) {
                System.out.println("Se subieron: " + X + " pasajeros, capacidad completa");
            } else {
                int capDis = X - capPasajeros;
                if (X > capPasajeros) {
                    if (capDis > 0) {
                        System.out.println(
                                "Capacidad insuficiente, deben de esperar otro avión los: " + (Math.abs(capDis))
                                        + " pasajeros restantes");
                    } else {
                        System.out.println("Capacidad insuficiente, solo queda espcaio para " + (Math.abs(capDis))
                                + " pasajeros más");
                    }
                } else {
                    System.out.println("Se subieron: " + X + " pasajeros; capacidad disponible: " + (capPasajeros - X)
                            + " pasajeros de: " + capPasajeros);
                }
            }
        }
    }

    public void verifComb(float kilometrosDeViaje) {
        float totalComb = cantCombustible - (kilometrosDeViaje * 12);
        if (totalComb <= 0) {
            System.out.println("No queda combustible");
        } else {
            System.out.println("Queda: " + totalComb + " ltrs. de combustible restante");
        }
    }

    public void retrasoVuelo() {
        int retraso = horaDeVuelo + 3;
        System.out.println("El vuelo retrasado de: " + horaDeVuelo + " horas, partirá ahora en: " + retraso + " horas");
    }

    public static void main(String[] args) {
        Avion avion1 = new Avion(56, 500.05f, 8);
        Avion avion2 = new Avion(33, 451.56f, 7);
        Avion avion3 = new Avion(12, 325.48f, 12);
        avion1.subirPasajeros(56);
        avion2.subirPasajeros(12);
        avion3.subirPasajeros(54);
        avion1.verifComb(35.2f);
        avion2.verifComb(200.1f);
        avion3.verifComb(2.0f);
        avion1.retrasoVuelo();
    }
}