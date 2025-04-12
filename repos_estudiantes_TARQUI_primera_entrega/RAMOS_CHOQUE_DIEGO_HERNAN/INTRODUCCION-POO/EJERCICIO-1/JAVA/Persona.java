//inciso (b)
public class Persona{
    //atributos
    private String nombre;
    private int edad ;
    private  String ciudad;
    //metodos
    public Persona(String nombre, int edad, String ciudad){
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    public String saludar(){
        return String.format("Hola soy %s y vivo en la ciudad de %s. ",this.nombre,this.ciudad);
    }
    public String mayordeEdad(){
        if(this.edad >= 18){
            return this.nombre + " es mayor de edad";

        }
        return  this.nombre + " no es mayor de edad";
    }
    public static void main(String[] args) {
        Persona persona1 = new Persona("Diego",19,"La Paz");
        Persona persona2 = new Persona("Hernan",13,"Lima");
        Persona persona3 = new Persona("Cris",14,"Tokio");
        System.out.println(persona1.saludar());
        System.out.println(persona2.saludar());
        System.out.println(persona3.saludar());

        System.out.println(persona1.mayordeEdad());
        System.out.println(persona2.mayordeEdad());
        System.out.println(persona3.mayordeEdad());
    }
}
