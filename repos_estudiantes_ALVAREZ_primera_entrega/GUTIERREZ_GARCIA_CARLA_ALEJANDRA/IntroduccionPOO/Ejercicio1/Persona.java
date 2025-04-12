public class Persona{
    //Crea una clase Persona con nombre, edad y ciudad
    public String nombre,ciudad;
    public int edad;

    public Persona(String nombre, int edad,String ciudad){
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    //a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
    public void Saludo(){
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }
    //c) Agrega un método para verificar si es mayor de edad
    public void verificarMayorEdad(){
        if(this.edad>=18){
            System.out.println("Mayor de edad");
        }
        else{
            System.out.println("Menor de edad");
        }
    }
    public static void main(String[] args) {
        //b) Crea tres personas y muestra su saludo
        Persona p1= new Persona("Carol",18,"La Paz");
        Persona p2= new Persona("Maria",22,"Cochabamba");
        Persona p3= new Persona("Juan",15,"Chuquisaca");
        p1.Saludo();
        p2.Saludo();
        p3.Saludo();
        p1.verificarMayorEdad();
        p2.verificarMayorEdad();
        p3.verificarMayorEdad();
    }
}