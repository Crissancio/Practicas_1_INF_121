
package Ejercicios;

import java.util.ArrayList;


public class Celular {
    
    private ArrayList<Aplicacion> aplicaciones;
    private int espacioDisponible;  // en MB
    private int bateria;           // en porcentaje (0 - 100)

    public Celular() {
        aplicaciones = new ArrayList<>();
        espacioDisponible = 1024;   // Espacio total de 1024MB
        bateria = 100;              // Batería al 100% al inicio
    }

    // Método para instalar una nueva aplicación
    public void instalarAplicacion(String nombre, int tamano) {
        if (aplicaciones.size() < 20 && tamano <= espacioDisponible) {
            Aplicacion nuevaAplicacion = new Aplicacion(nombre, tamano);
            aplicaciones.add(nuevaAplicacion);
            espacioDisponible -= tamano; // Se resta el espacio utilizado por la aplicación
            System.out.println("Aplicación instalada: " + nombre);
        } else {
            System.out.println("No se puede instalar la aplicación. Espacio insuficiente o límite de aplicaciones alcanzado.");
        }
    }

    // Método para utilizar una aplicación
    public void utilizarAplicacion(String nombre, int minutosUso) {
        if (bateria <= 0) {
            System.out.println("Celular apagado. La batería está agotada.");
            return;
        }

        Aplicacion app = buscarAplicacion(nombre);
        if (app != null) {
            // Calcular el consumo de batería basado en el tamaño de la aplicación
            int consumoBateria = calcularConsumoBateria(app.getTamano(), minutosUso);
            bateria -= consumoBateria;

            if (bateria <= 0) {
                bateria = 0;
                System.out.println("Celular apagado. La batería está agotada.");
            } else {
                System.out.println("Usando la aplicación " + nombre + " por " + minutosUso + " minutos.");
                System.out.println("Batería restante: " + bateria + "%");
            }
        } else {
            System.out.println("Aplicación no encontrada.");
        }
    }

    // Método para calcular el consumo de batería en función del tamaño de la aplicación y el tiempo de uso
    private int calcularConsumoBateria(int tamano, int minutosUso) {
        int consumoPor10Minutos;

        if (tamano > 250) {
            consumoPor10Minutos = 5;  // 5% cada 10 minutos para aplicaciones mayores a 250MB
        } else if (tamano > 100) {
            consumoPor10Minutos = 2;  // 2% cada 10 minutos para aplicaciones mayores a 100MB
        } else {
            consumoPor10Minutos = 1;  // 1% cada 10 minutos para aplicaciones menores a 100MB
        }

        // Calcular el consumo total basado en el tiempo de uso
        int tiempoUso10Min = minutosUso / 10;
        return consumoPor10Minutos * tiempoUso10Min;
    }

    // Método para buscar una aplicación por nombre
    private Aplicacion buscarAplicacion(String nombre) {
        for (Aplicacion app : aplicaciones) {
            if (app.getNombre().equals(nombre)) {
                return app;
            }
        }
        return null;
    }

    // Mostrar el porcentaje de batería restante
    public void mostrarBateria() {
        System.out.println("Batería restante: " + bateria + "%");
    }

    // Clase interna Aplicacion
    private class Aplicacion {
        private String nombre;
        private int tamano;  // en MB

        public Aplicacion(String nombre, int tamano) {
            this.nombre = nombre;
            this.tamano = tamano;
        }

        public String getNombre() {
            return nombre;
        }

        public int getTamano() {
            return tamano;
        }
    }

  
    public static void main(String[] args) {
        Celular celular = new Celular();

       
        celular.instalarAplicacion("Facebook", 150);  // Tamaño 150MB
        celular.instalarAplicacion("Instagram", 300); // Tamaño 300MB
        celular.instalarAplicacion("WhatsApp", 50);   // Tamaño 50MB

        // Usar algunas aplicaciones
        celular.utilizarAplicacion("Facebook", 30);   // 30 minutos de uso
        celular.utilizarAplicacion("Instagram", 50);  // 20 minutos de uso
        celular.utilizarAplicacion("WhatsApp", 10);   // 10 minutos de uso

        //  batería restante
        celular.mostrarBateria();

        // Intentar usar el celular después de que la batería se haya agotado
        celular.utilizarAplicacion("Instagram", 20);  // 20 minutos de uso con batería agotada
    }
}

