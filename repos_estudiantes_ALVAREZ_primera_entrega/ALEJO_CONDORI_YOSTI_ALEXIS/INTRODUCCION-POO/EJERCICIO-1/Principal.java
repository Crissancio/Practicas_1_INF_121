package Ejercicio1;

public class Principal {
    public static void main(String arg[]){
        Persona p1= new Persona("Juan",25,"Potosi");
        Persona p2= new Persona("Alex",17,"La Paz"); 
        Persona p3= new Persona("Rihana",19,"Oruro");
        p1.Saludad();
        p2.Saludad();
        p3.Saludad();
        System.out.println(p1.nombre+" Es mayor de edad? "+p1.EsMayorDeEdad());
        System.out.println(p2.nombre+" Es mayor de edad? "+p2.EsMayorDeEdad());
        System.out.println(p3.nombre+" Es mayor de edad? "+p3.EsMayorDeEdad());
        
    }
}
