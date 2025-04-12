public class Estudiante {
    String nombre;
    double nota_1;
    double nota_2;
    public Estudiante(String nombre, double nota_1, double nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }
    public double promedio() {
        return (nota_1 + nota_2) / 2;
    }
    public boolean aprobo() {
        return promedio() >= 6;
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Rolando", 10, 9);
        Estudiante estudiante2 = new Estudiante("Paola", 5, 3);
        Estudiante estudiante3 = new Estudiante("Nadir", 6, 6);
        Estudiante[] estudiantes = {estudiante1, estudiante2, estudiante3};

        for (Estudiante estudiante : estudiantes) {
            double promedio = estudiante.promedio();
            String estado = estudiante.aprobo() ? "Aprobó" : "Reprobó";
            System.out.printf("%s\nPromedio: %.1f ---> %s\n", estudiante.nombre, promedio, estado);
        }
    }
}
