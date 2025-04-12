import java.util.*;

class Aplicacion {
    String nombre;
    int tamano;

    public Aplicacion(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }
}

public class Celular {
    List<Aplicacion> aplicaciones = new ArrayList<>();
    int espacioDisponible = 1024;
    double bateria = 100;

    public void instalar(String nombre, int tamano) {
        if (aplicaciones.size() < 20 && tamano <= espacioDisponible) {
            aplicaciones.add(new Aplicacion(nombre, tamano));
            espacioDisponible -= tamano;
            System.out.println("Aplicación " + nombre + " instalada.");
        } else {
            System.out.println("No se pudo instalar la aplicación.");
        }
    }

    public void usar(String nombre, int minutos) {
        for (Aplicacion app : aplicaciones) {
            if (app.nombre.equals(nombre)) {
                double consumo = app.tamano > 250 ? 0.05 : (app.tamano > 100 ? 0.02 : 0.01);
                double gasto = (minutos / 10.0) * (consumo * 100);
                if (bateria > gasto) {
                    bateria -= gasto;
                    System.out.println("Usando " + nombre + " por " + minutos + " minutos.");
                } else {
                    bateria = 0;
                    System.out.println("Celular apagado.");
                }
                return;
            }
        }
        System.out.println("Aplicación no encontrada.");
    }

    public void mostrarBateria() {
        System.out.printf("Batería restante: %.2f%%\n", bateria);
    }

    public static void main(String[] args) {
        Celular cel = new Celular();
        cel.instalar("Juego Pesado", 300);
        cel.instalar("WhatsApp", 90);
        cel.usar("Juego Pesado", 20);
        cel.usar("WhatsApp", 30);
        cel.mostrarBateria();
    }
}
