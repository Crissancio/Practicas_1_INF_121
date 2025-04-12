package estudiantesjava;

public class Principal {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", 7.5, 8.0);
        Estudiante e2 = new Estudiante("Maria", 5.0, 6.0);
        Estudiante e3 = new Estudiante("Pedro", 4.5, 5.5);

        e1.mostrarResultado();
        e2.mostrarResultado();
        e3.mostrarResultado();
    }
}
