/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

/**
 *
 * @author Fabricio
 */
/*
 * ENUNCIADO:
 * 3. Un restaurante organiza a su personal mediante las siguientes clases:
 * a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
 * b) Sobrecargar el método SueldoTotal para mostrar el sueldo total, sumándole
 *    las horas extra, considerando el sueldo por hora y la propina en caso de
 *    los meseros.
 */

abstract class Empleado {
    protected String nombre;
    protected double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSueldoTotal();
}

class Cocinero extends Empleado {
    private int horasExtra;
    private double pagoPorHora;

    public Cocinero(String nombre, double sueldoBase, int horasExtra, double pagoPorHora) {
        super(nombre, sueldoBase);
        this.horasExtra = horasExtra;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSueldoTotal() {
        return sueldoBase + (horasExtra * pagoPorHora);
    }
}

class Mesero extends Empleado {
    private double propina;

    public Mesero(String nombre, double sueldoBase, double propina) {
        super(nombre, sueldoBase);
        this.propina = propina;
    }

    @Override
    public double calcularSueldoTotal() {
        return sueldoBase + propina;
    }
}

class Administrativo extends Empleado {
    private int horasExtra;
    private double pagoPorHora;

    public Administrativo(String nombre, double sueldoBase, int horasExtra, double pagoPorHora) {
        super(nombre, sueldoBase);
        this.horasExtra = horasExtra;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSueldoTotal() {
        return sueldoBase + (horasExtra * pagoPorHora);
    }
}
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cocinero chef = new Cocinero("Pedro", 2000, 10, 15);
        Mesero mesero1 = new Mesero("Ana", 1500, 300);
        Mesero mesero2 = new Mesero("Luis", 1600, 250);
        Administrativo admin1 = new Administrativo("Carlos", 1800, 5, 20);
        Administrativo admin2 = new Administrativo("Laura", 1900, 8, 22);

        System.out.println("Sueldo del cocinero: $" + chef.calcularSueldoTotal());
        System.out.println("Sueldo del mesero 1: $" + mesero1.calcularSueldoTotal());
        System.out.println("Sueldo del mesero 2: $" + mesero2.calcularSueldoTotal());
        System.out.println("Sueldo del administrativo 1: $" + admin1.calcularSueldoTotal());
        System.out.println("Sueldo del administrativo 2: $" + admin2.calcularSueldoTotal());
    }
    
}
