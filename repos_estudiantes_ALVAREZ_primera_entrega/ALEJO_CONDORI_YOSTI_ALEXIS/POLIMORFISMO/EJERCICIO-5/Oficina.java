package Ejercicio5;

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
        System.out.println("Sillas: " + nroSillas);
        System.out.println("Escritorios: " + nroEscritorios);
        System.out.println("Estanterías: " + nroEstanterias);
    }
    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }

    public void cantidadMuebles(String detalle) {
        System.out.println(detalle + ": " + cantidadMuebles());
    }
}
