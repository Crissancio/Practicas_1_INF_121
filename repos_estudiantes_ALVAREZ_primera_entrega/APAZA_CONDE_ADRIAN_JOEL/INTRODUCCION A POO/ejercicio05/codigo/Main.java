/* Ejercicio5 introduccion a POO: Crea una clase Estudiante con nombre, nota_1, nota_2
        a) Agrega un método para calcular el promedio
        b) Agrega un método para verificar si aprobó (promedio >=6)
        c) Crea tres estudiantes, muestra sus promedios y si aprobaron
   */
class Main {
    public static void main(String[] args) {
        // c)  creamos 3 estudiantes
        Estudiante e1 = new Estudiante("Adrian", 10, 10);
        Estudiante e2 = new Estudiante("Victor", 10, 5);
        Estudiante e3 = new Estudiante("Ariel", 20, 20);
       
        // a) calculamos el promedio
        // b) verificamos la aprobación
        e1.verificaAprobacion(); 
        e2.verificaAprobacion();
        e3.verificaAprobacion();
    }
}