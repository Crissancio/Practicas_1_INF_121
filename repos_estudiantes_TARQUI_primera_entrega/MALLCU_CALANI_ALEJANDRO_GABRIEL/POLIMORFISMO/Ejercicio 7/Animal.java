/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animal;

/**
 *
 * @author USUARIO
 */
class Animal {
    public String hacerSonido() {
        return "Este animal hace un sonido.";
    }

    public String moverse() {
        return "Este animal se mueve de alguna manera.";
    }
}

class Perro extends Animal {
    @Override
    public String hacerSonido() {
        return "Guau guau";
    }

    @Override
    public String moverse() {
        return "Corre";
    }
}

class Gato extends Animal {
    @Override
    public String hacerSonido() {
        return "Miau miau";
    }

    @Override
    public String moverse() {
        return "Salta";
    }
}

class Pajaro extends Animal {
    @Override
    public String hacerSonido() {
        return "Pío pío";
    }

    @Override
    public String moverse() {
        return "Vuela";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal pajaro = new Pajaro();

        Animal[] animales = {perro, gato, pajaro};
        for (Animal animal : animales) {
            System.out.println("Sonido: " + animal.hacerSonido());
            System.out.println("Movimiento: " + animal.moverse());
        }
    }
}
