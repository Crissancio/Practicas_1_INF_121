public class Main{
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 25, "Lima");
        Persona p2 = new Persona("Luis", 17, "Bogotá");
        Persona p3 = new Persona("Carlos", 30, "Madrid");

        p1.saludo();
        p2.saludo();
        p3.saludo();

        System.out.println(p1.esMayorDeEdad());
        System.out.println(p2.esMayorDeEdad());
        System.out.println(p3.esMayorDeEdad());
    }
}