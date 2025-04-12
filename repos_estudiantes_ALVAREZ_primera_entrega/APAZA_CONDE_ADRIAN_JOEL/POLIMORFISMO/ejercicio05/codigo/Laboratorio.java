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
    // b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar() {
        System.out.println("el laboratorio " + this.nombre + " tiene:");
        System.out.println("una capacidad de: " + this.capacidad);
        System.out.println("nro de mesas de: " + this.nroMesas);
        System.out.println("nro de sillas de: " + this.nroSillas);
    }
    // c) Sobrecargar el método cantidadMuebles(), para conocer el número total de muebles dentro de cada ambiente
    public int cantidadMuebles() {
        return this.nroMesas + this.nroSillas;
    }
    public String cantidadMuebles(boolean a) {
        return "tiene un total muebles: " + this.cantidadMuebles();
    }
}

