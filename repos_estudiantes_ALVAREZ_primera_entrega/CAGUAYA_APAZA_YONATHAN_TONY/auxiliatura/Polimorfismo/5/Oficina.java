package universidad;
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
        System.out.println("Oficina");
        System.out.println("Sillas: " + nroSillas);
        System.out.println("Escritorios: " + nroEscritorios);
        System.out.println("Estanterias: " + nroEstanterias);
        System.out.println("Total muebles: " + cantidadMuebles());
        System.out.println("------------------------");
    }

    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }
}
