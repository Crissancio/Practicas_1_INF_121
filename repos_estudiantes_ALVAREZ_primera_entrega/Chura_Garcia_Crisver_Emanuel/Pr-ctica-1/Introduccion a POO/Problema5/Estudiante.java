//5. Crea una clase Estudiante con nombre, nota_1, nota_2
public class Estudiante {
    private String nombre;
    private int nota_1;
    private int nota_2;

    public Estudiante(String nombre, int nota_1, int nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }

    // a) Agrega un método para calcular el promedio
    public int Promedio() {
        return ((nota_1 + nota_2) / 2);
    }

    // b) Agrega un método para verificar si aprobó (promedio &gt;=6)
    public void Verificar() {
        if (Promedio() >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado; lo que no te mata te hace mas fuerte");
        }
    }

    public static void main(String[] args) {
        // c) Crea tres estudiantes, muestra sus promedios y si aprobaron
        Estudiante est1 = new Estudiante("Crismar", 8, 7);
        Estudiante est2 = new Estudiante("Samuel", 7, 9);
        Estudiante est3 = new Estudiante("Crisver", 6, 5);

        System.out.println("Promedios:");
        System.out.println(est1.Promedio());
        System.out.println(est2.Promedio());
        System.out.println(est3.Promedio());

        System.out.println("Verificación de notas:");
        est1.Verificar();
        est2.Verificar();
        est3.Verificar();

    }
}