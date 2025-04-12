/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computadora;

/**
 *
 * @author Fabricio
 */
/*
 * ENUNCIADO:
 * 9. Realiza la abstracción de una Computadora
 * a) Muestra los componentes principales de la computadora
 * b) Muestra el estado de la computadora (encendido o apagado)
 * c) Crea una instancia y simula encender y apagar la computadora.
 */
public class Computadora {
    private String estado;
    private String[] componentes = {"CPU", "RAM", "Disco Duro", "Tarjeta Grafica"};

    public Computadora() {
        this.estado = "Apagada";
    }

    public void encender() {
        this.estado = "Encendida";
        System.out.println("La computadora se ha encendido.");
    }

    public void apagar() {
        this.estado = "Apagada";
        System.out.println("La computadora se ha apagado.");
    }

    public void mostrarComponentes() {
        System.out.println("Componentes principales:");
        for (String componente : componentes) {
            System.out.println("- " + componente);
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado: " + estado);
    }

    public static void main(String[] args) {
        Computadora pc = new Computadora();
        pc.mostrarComponentes();
        pc.mostrarEstado();

        pc.encender();
        pc.mostrarEstado();

        pc.apagar();
        pc.mostrarEstado();
    }
}