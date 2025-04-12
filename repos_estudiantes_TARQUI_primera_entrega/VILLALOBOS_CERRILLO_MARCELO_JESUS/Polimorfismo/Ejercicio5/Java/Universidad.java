class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;
    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }
    public void cantidadDeMuebles() {
        System.out.println("La cantidad de muebles es de: " + (nroSillas + nroEscritorios + nroEstanterias));
    }
    public void mostrar() {
        System.out.println("La cantidad de sillas es: " + nroSillas + ", la cantidad de escritorios es de: " + nroEscritorios + ", la cantidad de estanterías es: " + nroEstanterias);
    }
}
class Aula {
    private String nombre;
    private int capacidad;
    private int nroPupitres;
    public Aula(String nombre, int capacidad, int nroPupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = nroPupitres;
    }
    public void cantidadDeMuebles() {
        System.out.println("La cantidad de muebles es de: " + nroPupitres);
    }
    public void mostrar() {
        System.out.println("El aula se llama: " + nombre + ", la capacidad es para: " + capacidad +  ", la cantidad de pupitres es: " + nroPupitres);
    }
}
class Laboratorio {
    private String nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;
    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }
    public void cantidadDeMuebles() {
        System.out.println("La cantidad de muebles es de: " + (nroMesas + nroSillas));
    }
    public void mostrar() {
        System.out.println("El laboratorio se llama: " + nombre +  ", la capacidad es de: " + capacidad + ", la cantidad de mesas es: " + nroMesas + ", y la cantidad de sillas es de: " + nroSillas);
    }
}