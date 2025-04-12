/*
5. Crea una clase Estudiante con nombre, nota_1, nota_2
a)	Agrega un método para calcular el promedio
b)	Agrega un método para verificar si aprobó (promedio >=6)
c)	Crea tres estudiantes, muestra sus promedios y si aprobaron

*/
package Ejercicios;


public class Estudiante {
    private String nombre;
    private float nota_1;
    private float nota_2;

    public Estudiante(String nombre, float nota_1, float nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }
    
    public float promedio(){
        float promedio=0;
        promedio = (nota_1+nota_2)/2;
        return promedio;
       
    }
    public void aprobado(){
        
        if (promedio()>=6) {
            System.out.println("El promedio de "+nombre+" fue de "+promedio());
            System.out.println(nombre+" esta aprovado!!!!");
        }else{
            System.out.println("El promedio de "+nombre+" fue de "+promedio());
            System.out.println(nombre+" esta reprovado");
        }
    }
    
    public static void main(String[] args) {
        Estudiante estudiante1=new Estudiante("Alan",3,2);
        Estudiante estudiante2= new Estudiante("Carla", 2,4);
        Estudiante estudiante3= new Estudiante("Daniela", 8,4);
        
        estudiante1.promedio();
        estudiante2.promedio();
        estudiante3.promedio();
        
        estudiante1.aprobado();
        estudiante2.aprobado();
        estudiante3.aprobado();
        
    }
}
