package Ejercicio_7;

public class Celular {
    public int bateria;
    public int espacioDisponible;
    public int appsInstaladas;

    public Celular() {
        this.bateria = 100;
        this.espacioDisponible = 1024;
        this.appsInstaladas = 0;
    }

    public void instalarApp(int tamano) {
        if (this.appsInstaladas < 20 && this.espacioDisponible >= tamano) {
            this.espacioDisponible -= tamano;
            this.appsInstaladas++;
            System.out.println("App instalada. Tamaño: " + tamano + "Mb");
        } else {
            System.out.println("No se pudo instalar. Espacio lleno o máximo de apps alcanzado.");
        }
    }

    public void usarApp(int tamano, int minutos) {
        if (this.bateria <= 0) {
            System.out.println("Celular apagado");
            return;
        }

        int consumo = 0;

        if (tamano > 250) {
            consumo = (minutos / 10) * 5;
        } else if (tamano > 100) {
            consumo = (minutos / 10) * 2;
        } else {
            consumo = (minutos / 10) * 1;
        }

        if (this.bateria - consumo <= 0) {
            this.bateria = 0;
            System.out.println("Celular apagado");
        } else {
            this.bateria -= consumo;
            System.out.println("Aplicación usada por " + minutos + " minutos. Batería consumida: " + consumo + "%");
        }
    }

    public String toString() {
        return "Celular - Batería: " + this.bateria + "%, Espacio disponible: " + this.espacioDisponible + "Mb, Apps instaladas: " + this.appsInstaladas;
    }
}
