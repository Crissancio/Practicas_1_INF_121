package EJERCICIO5;

public class Oficina {
    public int nroSillas;
    public int nroEscritorios;
    public int nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }

    public int cantidadMuebles() {
        return this.nroSillas + this.nroEscritorios + this.nroEstanterias;
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Oficina -> Sillas: " + this.nroSillas + ", Escritorios: " + this.nroEscritorios + ", Estanterías: " + this.nroEstanterias +
               ", Total Muebles: " + this.cantidadMuebles();
    }
}

