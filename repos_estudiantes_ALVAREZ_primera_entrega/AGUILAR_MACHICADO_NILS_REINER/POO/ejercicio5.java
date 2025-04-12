public class Estudiante {
    String nombre;
    double nota1, nota2;

    public Estudiante(String nombre, double nota1, double nota2){
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double promedio(){
        return (nota1 + nota2) / 2;
    }

    public boolean aprobo(){
        return promedio() >= 6;
    }

    public static void main(String[] args){
        Estudiante e1 = new Estudiante("Carlos", 7, 8);
        Estudiante e2 = new Estudiante("Elena", 6, 5);
        Estudiante e3 = new Estudiante("Luis", 9, 9);

        Estudiante[] estudiantes = {e1, e2, e3};
        for (Estudiante e : estudiantes){
            System.out.println(e.nombre + " tiene promedio " + e.promedio() + " - Aprobó: " + e.aprobo());
        }
    }
}

