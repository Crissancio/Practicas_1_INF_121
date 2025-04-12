/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER5;

/**
 *
 * @author LENOVO
 */
public class Estudiante {
     private String nombre;
    private double nota1;
    private double nota2;

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcProm() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprobo() {
        return calcProm() >= 6;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nPromedio: " + calcProm() + "\nAprobo: " + aprobo();
    }
}
