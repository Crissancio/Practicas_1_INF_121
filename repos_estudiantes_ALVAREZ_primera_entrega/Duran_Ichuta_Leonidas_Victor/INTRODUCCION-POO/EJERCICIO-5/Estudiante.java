/*
5. Crea una clase Estudiante con nombre, nota_1, nota_2
a) Agrega un método para calcular el promedio
b) Agrega un método para verificar si aprobó (promedio >=6)
c) Crea tres estudiantes, muestra sus promedios y si aprobaron
 */
package estudiante;
    
public class Estudiante {
private String nombre;
private double nota_1;
private double nota_2;

    public Estudiante(String nombre, double nota_1, double nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }
public double promedio(){
    return (nota_1 + nota_2) / 2;
}    
public String aprobo(){
    if(promedio() >= 6){
        return "Aprobo";
    }
    else{
        return "Reprobo";
    }
}     
public void resultado(){
    System.out.println("Estudiante: " + nombre);
    System.out.println("Promedio: " + promedio());
    System.out.println("Estado: " + aprobo());
} 
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Pablo", 2 ,6);
        est1.resultado();
        Estudiante est2 = new Estudiante("Juan", 6 ,6);
        est2.resultado();
        Estudiante est3 = new Estudiante("Maria", 3 ,2);
        est3.resultado();
    }
}
