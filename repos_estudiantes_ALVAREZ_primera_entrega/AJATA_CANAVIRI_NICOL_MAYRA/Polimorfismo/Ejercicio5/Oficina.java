package Polimorfismo.Ejercicio5;

public class Oficina {
    int nroSillas;
    int nroEscritorios;
    int nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }

    public void mostrar() {
        System.out.println("Oficina - Sillas: " + nroSillas + ", Escritorios: " + nroEscritorios + ", Estanterias: " + nroEstanterias);
    }

    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }
}