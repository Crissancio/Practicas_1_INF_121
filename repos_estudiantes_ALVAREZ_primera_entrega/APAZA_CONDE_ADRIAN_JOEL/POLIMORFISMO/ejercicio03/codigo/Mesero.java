class Mesero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;
    private float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }
// b) Sobrecargar el método SueldoTotal para mostrar el sueldo total, sumándole las horas extra, considerando el sueldo por hora y la propina en caso de los meseros.
    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    public void sueldoTotal(int x) {
        if (sueldoMes == x) {
            System.out.println("el mesero " + nombre + " tiene sueldo mes igual a " + x);
        }
    }
// c) Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.
    public void mostrarSueldo() {
        System.out.println("el mesero " + nombre + " tiene un sueldo total de: " + sueldoTotal());
    }
}

