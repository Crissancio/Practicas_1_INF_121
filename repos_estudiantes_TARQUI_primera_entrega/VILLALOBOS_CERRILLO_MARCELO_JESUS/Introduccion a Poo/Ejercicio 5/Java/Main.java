public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Luna", 7, 8);
        Estudiante e2 = new Estudiante("Mario", 5, 4);
        Estudiante e3 = new Estudiante("Julia", 6, 6);
        System.out.println(e1.nombre + ": " + e1.promedio() + " Aprobó: " + e1.aprobo());
        System.out.println(e2.nombre + ": " + e2.promedio() + " Aprobó: " + e2.aprobo());
        System.out.println(e3.nombre + ": " + e3.promedio() + " Aprobó: " + e3.aprobo());
    }
}

