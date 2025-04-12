/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER5;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Oficina o1 = new Oficina(5, 3, 2);
        Oficina o2 = new Oficina(4, 4, 3);

        Aula a1 = new Aula("Aula 1", 30, 30);
        Aula a2 = new Aula("Aula 2", 25, 25);

        Laboratorio lab = new Laboratorio("Lab 1", 20, 10, 20);

        o1.mostrar();
        o2.mostrar();
        a1.mostrar();
        a2.mostrar();
        lab.mostrar();
    }
}

class Oficina {
    int nroSillas, nroEscritorios, nroEstanterias;

    Oficina(int sillas, int escritorios, int estanterias) {
        nroSillas = sillas;
        nroEscritorios = escritorios;
        nroEstanterias = estanterias;
    }

    void mostrar() {
        System.out.println("Oficina -> Sillas: " + nroSillas + "\nEscritorios: " + nroEscritorios + "\nEstanteras: " + nroEstanterias);
    }

    int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }

    int cantidadMuebles(int extra) {
        return cantidadMuebles() + extra;
    }
}

class Aula {
    String nombre;
    int capacidad, nroPupitres;

    Aula(String nombre, int capacidad, int pupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = pupitres;
    }

    void mostrar() {
        System.out.println("Aula: " + nombre + "\nCapacidad: " + capacidad + "\nPupitres: " + nroPupitres);
    }

    int cantidadMuebles() {
        return nroPupitres;
    }

    int cantidadMuebles(int extra) {
        return nroPupitres + extra;
    }
}

class Laboratorio {
    String nombre;
    int capacidad, nroMesas, nroSillas;

    Laboratorio(String nombre, int capacidad, int mesas, int sillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = mesas;
        this.nroSillas = sillas;
    }

    void mostrar() {
        System.out.println("Laboratorio: " + nombre + "\nCapacidad: " + capacidad + "\nMesas: " + nroMesas + "\nSillas: " + nroSillas);
    }

    int cantidadMuebles() {
        return nroMesas + nroSillas;
    }

    int cantidadMuebles(int extra) {
        return cantidadMuebles() + extra;
    }
}
