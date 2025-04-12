/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celular;

/**
 *
 * @author USUARIO
 */
import java.util.HashMap;

public class Celular {
    private int espacioTotal;
    private int espacioDisponible;
    private int bateria;
    private HashMap<String, Integer> aplicaciones;

    // Constructor
    public Celular(int espacioTotal, int bateria) {
        this.espacioTotal = espacioTotal;
        this.espacioDisponible = espacioTotal;
        this.bateria = bateria;
        this.aplicaciones = new HashMap<>();
    }

    // Método para instalar aplicaciones
    public String instalarAplicacion(String nombre, int tamaño) {
        if (tamaño > espacioDisponible) {
            return "No hay suficiente espacio para instalar " + nombre + ".";
        }
        aplicaciones.put(nombre, tamaño);
        espacioDisponible -= tamaño;
        return "Aplicación " + nombre + " instalada con éxito.";
    }

    // Método para utilizar aplicaciones
    public String utilizarAplicacion(String nombre, int minutos) {
        if (!aplicaciones.containsKey(nombre)) {
            return "La aplicación " + nombre + " no está instalada.";
        }
        int tamaño = aplicaciones.get(nombre);
        double consumo;

        if (tamaño > 250) {
            consumo = (5.0 * minutos) / 10;
        } else if (tamaño > 100) {
            consumo = (2.0 * minutos) / 10;
        } else {
            consumo = (1.0 * minutos) / 10;
        }

        if (bateria - consumo <= 0) {
            bateria = 0;
            return "Celular apagado por batería agotada.";
        }
        bateria -= consumo;
        return "Usaste " + nombre + " por " + minutos + " minutos. Batería restante: " + bateria + "%.";
    }

    // Método para mostrar el porcentaje de batería
    public String mostrarBateria() {
        return "Batería restante: " + bateria + "%";
    }

    // Pruebas de la clase
    public static void main(String[] args) {
        Celular celular = new Celular(1024, 100);

        System.out.println(celular.instalarAplicacion("WhatsApp", 50));
        System.out.println(celular.instalarAplicacion("YouTube", 300));
        System.out.println(celular.utilizarAplicacion("YouTube", 20));
        System.out.println(celular.mostrarBateria());
        System.out.println(celular.utilizarAplicacion("WhatsApp", 50));
        System.out.println(celular.utilizarAplicacion("Spotify", 40)); // Aplicación no instalada
    }
}
