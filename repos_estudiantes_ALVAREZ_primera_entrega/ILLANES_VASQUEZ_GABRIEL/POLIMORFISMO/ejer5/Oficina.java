
package ejercicio2_5;

public class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;

    public Oficina(int sillas, int escritorios, int estanterias) {
        this.nroSillas = sillas;
        this.nroEscritorios = escritorios;
        this.nroEstanterias = estanterias;
    }

    public void mostrar() {
        System.out.println("Oficina = Sillas: " + nroSillas + ", Escritorios: " + nroEscritorios + ", Estanterías: " + nroEstanterias);
    }

    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }

    public void cantidadMuebles(String tipo) {
        System.out.println("Total muebles Oficina: " + cantidadMuebles());
    }
}

