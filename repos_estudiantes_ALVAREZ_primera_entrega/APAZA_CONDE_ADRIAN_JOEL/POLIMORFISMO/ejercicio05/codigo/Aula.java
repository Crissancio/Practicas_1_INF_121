class Aula {
    private String nombre;
    private int capacidad;
    private int nropupitres;

    public Aula(String nombre, int capacidad, int nropupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nropupitres = nropupitres;
    }
    // b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar() {
        System.out.println("el aula " + this.nombre + ":");
        System.out.println("una capacidad de: " + this.capacidad);
        System.out.println("nro de pupitres de: " + this.nropupitres);
    }
    // c) Sobrecargar el método cantidadMuebles(), para conocer el número total de muebles dentro de cada ambiente
    public int cantidadMuebles() {
        return this.capacidad + this.nropupitres;
    }
    public String cantidadMuebles(String prefijo) {
        int total = this.cantidadMuebles();
        return " tiene un " +prefijo+ " de " + this.nombre + ":  con  " + total + " muebles";
    }
}

