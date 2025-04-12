/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER7;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Perro p = new Perro("Firulais");
        Gato g = new Gato("Michi");
        Pajaro pj = new Pajaro("Piolin");

        p.hacerSonido();
        p.hacerSonido(3);
        p.moverse();

        g.hacerSonido();
        g.hacerSonido(2);
        g.moverse();

        pj.hacerSonido();
        pj.hacerSonido(1);
        pj.moverse();
    }
}

class Perro {
    String nombre;

    Perro(String nombre) {
        this.nombre = nombre;
    }

    void hacerSonido() {
        System.out.println(nombre + " dice: Guau!");
    }

    void hacerSonido(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.print("guau! ");
        }
        System.out.println();
    }

    void moverse() {
        System.out.println(nombre + " corre rapidamente.");
    }
}

class Gato {
    String nombre;

    Gato(String nombre) {
        this.nombre = nombre;
    }

    void hacerSonido() {
        System.out.println(nombre + " dice: miau!");
    }

    void hacerSonido(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.print("Miau! ");
        }
        System.out.println();
    }

    void moverse() {
        System.out.println(nombre + " salta con agilidad.");
    }
}

class Pajaro {
    String nombre;

    Pajaro(String nombre) {
        this.nombre = nombre;
    }

    void hacerSonido() {
        System.out.println(nombre + " dice: pio!");
    }

    void hacerSonido(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.print("pio! ");
        }
        System.out.println();
    }

    void moverse() {
        System.out.println(nombre + " vuela alto en el cielo.");
    }
}
