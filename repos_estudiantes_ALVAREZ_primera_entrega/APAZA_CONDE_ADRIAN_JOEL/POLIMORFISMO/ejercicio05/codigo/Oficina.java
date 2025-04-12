class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }
     // b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar() {
        System.out.println("la oficina tiene:");
        System.out.println("nro de sillas: " + this.nroSillas);
        System.out.println("nro de escritorios: " + this.nroEscritorios);
        System.out.println("nro de estanterías: " + this.nroEstanterias);
    }
     // c) Sobrecargar el método cantidadMuebles(), para conocer el número total de muebles dentro de cada ambiente
    public int cantidadMuebles() {
        return this.nroSillas + this.nroEscritorios + this.nroEstanterias;
    }

    public String cantidadMuebles(String descripcion) {
        int total = this.cantidadMuebles();
        return "la oficina tiene una cantidad de " + total + " muebles en total " + descripcion;
    }
}

