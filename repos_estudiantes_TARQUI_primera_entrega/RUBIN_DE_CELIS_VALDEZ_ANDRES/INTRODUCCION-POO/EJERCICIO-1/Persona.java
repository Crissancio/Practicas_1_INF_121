public class Persona 
{
    String Nombre;
    int Edad;
    String Ciudad;
    public Persona(String nombre, int edad, String ciudad) 
    {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Ciudad = ciudad;
    }
    public void saludar() 
    {
        System.out.println("Hola, soy " + Nombre + " de " + Ciudad);
    }
    public boolean esMayorDeEdad() 
    {
        return Edad >= 18;
    }
    public static void main(String[] args) 
    {
        Persona p1 = new Persona("Juan", 25, "Madrid");
        Persona p2 = new Persona("Ana", 17, "Barcelona");
        Persona p3 = new Persona("Carlos", 30, "Valencia");
        p1.saludar();
        p2.saludar();
        p3.saludar();
        System.out.println(p1.Nombre + " es mayor de edad: " + p1.esMayorDeEdad());
        System.out.println(p2.Nombre + " es mayor de edad: " + p2.esMayorDeEdad());
        System.out.println(p3.Nombre + " es mayor de edad: " + p3.esMayorDeEdad());
    }
}
