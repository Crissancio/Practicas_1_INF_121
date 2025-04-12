/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER3;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    class Cocinero {
        String nombre;
        int sueldoMes;
        int horasExtra;
        float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public float sueldoTotal() {
        return sueldoMes + horasExtra * sueldoHora;
    }

    public void mostrar(int x) {
        if (sueldoMes == x)
            System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cocinero:" + "\nnombre: " + nombre +"\nsueldoTotal: " + sueldoTotal();
    }
}

class Mesero {
    String nombre;
    int sueldoMes;
    int horasExtra;
    float sueldoHora;
    float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    public void mostrar(int x) {
        if (sueldoMes == x)
            System.out.println(this);
    }

    @Override
    public String toString() {
        return "Mesero:" + "\nnombre: " + nombre + "\nsueldoTotal: " + sueldoTotal();
    }
}

class Administrativo {
    String nombre;
    float sueldoMes;
    String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float sueldoTotal() {
        return sueldoMes;
    }

    public void mostrar(int x) {
        if ((int)sueldoMes == x)
            System.out.println(this);
    }

    @Override
    public String toString() {
        return "Administrativo: " + "nombre: " + nombre +"\nsueldoTotal: " + sueldoTotal();
    }
}


        Cocinero c = new Cocinero("Luis", 1000, 10, 15.5f);
        Mesero m1 = new Mesero("Ana", 900, 8, 12.5f, 50);
        Mesero m2 = new Mesero("Carlos", 900, 5, 10.0f, 40);
        Administrativo a1 = new Administrativo("Maria", 1000, "Contadora");
        Administrativo a2 = new Administrativo("Juan", 950, "Jefe");

        c.mostrar(1000);
        m1.mostrar(900);
        m2.mostrar(900);
        a1.mostrar(1000);
        a2.mostrar(1000);
    }
}

