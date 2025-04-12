/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_3;

/**
 *
 * @author Trabajo
 */
public class Mesero {
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

    public float calcularSueldo() {
        return sueldoMes + (horasExtra * sueldoHora * 1.5f) + propina;
    }

    public boolean calcularSueldo(float x) {
        return Math.abs(this.calcularSueldo() - x) < 0.01f;
    }
}
