class Administrativo {
    private String nombre;
    private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }
// b) Sobrecargar el método SueldoTotal para mostrar el sueldo total, sumándole las horas extra, considerando el sueldo por hora y la propina en caso de los meseros.
    public float sueldoTotal() {
        return sueldoMes;
    }

    public void sueldoTotal(int x) {
        if (sueldoMes == x) {
            System.out.println("el/la administrador/a " + nombre + " tiene sueldo mes igual a " + x);
        }
    }
//c) Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.
    public void mostrarSueldo() {
        System.out.println("el/la administrador/a " + nombre + " (" + cargo + ") tiene un sueldo total de: " + sueldoTotal());
    }
}

