/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_5;

/**
 *
 * @author Trabajo
 */
public class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }

    public void mostrar() {
        System.out.println("Oficina:");
        System.out.println("  Sillas: " + nroSillas);
        System.out.println("  Escritorios: " + nroEscritorios);
        System.out.println("  Estanterias: " + nroEstanterias);
    }
    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }
    public int cantidadMuebles(int pesoEscritorio, int pesoEstanteria) {
        return nroSillas + (nroEscritorios * pesoEscritorio) + (nroEstanterias * pesoEstanteria);
    }
}
