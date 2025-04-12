/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_3;

/**
 *
 * @author Trabajo
 */
public class Administrativo {
    String nombre;
    float sueldoMes;
    String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float calcularSueldo() {
        return sueldoMes;
    }

    public boolean calcularSueldo(float x) {
        return Math.abs(this.calcularSueldo() - x) < 0.01f;
    }
}
