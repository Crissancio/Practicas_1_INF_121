class Estudiante {
    private String nombre;
    private int nota_1;
    private int nota_2;
    public Estudiante(String nombre, int nota_1, int nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }
   // a) Agrega un método para calcular el promedio
    public float promedio() {
        return (nota_1 + nota_2) / 2;
    }
   // b) Agrega un método para verificar si aprobó (promedio >=6)
    public void verificaAprobacion() {
        float promedio = promedio();
        System.out.print("el estudiante "+ nombre + " tiene un promedio de " + promedio);
        if (promedio>= 6) {
            System.out.println(" aprobado ");
        } else {
            System.out.println(" reprobado ");
        }
    }
}

