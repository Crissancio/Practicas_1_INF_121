 /* Ejercicio1 introduccion a POO: Crea una clase Persona con nombre, edad y ciudad
        a) Agrega un método para mostrar el saludo: "Hola, soy (nombre) de {ciudad}"
        b) Crea tres personas y muestra su saludo
        c) Agrega un método para verificar si es mayor de edad
        */
class Main {
    public static void main(String[] args) {
        // b) creamos tres personas mostrando su saludo del insiso a
        Persona a = new Persona("Adrian", 22, "La Paz");
        Persona b = new Persona("Andrea", 21, "La Paz");
        Persona c = new Persona("Angel", 19, "Santa Cruz");
        
        // a) mostrando saludo de cada persona
        a.saludo();
        b.saludo();
        c.saludo();
        
        // c) verificando si son mayores de edad
        a.verificandoEdad();
        b.verificandoEdad();
        c.verificandoEdad();
    }
}