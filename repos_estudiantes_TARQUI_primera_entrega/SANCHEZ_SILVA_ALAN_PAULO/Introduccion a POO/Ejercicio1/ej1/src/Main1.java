public class Main1 {
    public static void main(String[] args) throws Exception {
        //Instanciando las clases
        Persona persona1 = new Persona("Pedro" , 17 , "Santa Cruz");
        Persona persona2= new Persona("Helen" , 19 , "Cochabamba");
        Persona persona3 = new Persona("Luis" , 33 , "Sucre");

        //Mostrando saludos
        
        persona1.saludo();
        persona2.saludo();
        persona3.saludo();
    }
}
