public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private String ciudad;

    //Constructor
    public Persona(String n , int e , String ciu){
        this.nombre = n;
        this.edad = e;
        this.ciudad = ciu;
    }
    
    //Metodos
    public void saludo(){
        System.out.println("Hola, soy "+this.nombre + "de"+ this.ciudad);
    }
    public void esMayorDeEdad(){
        if(this.edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es menor de edad");
        }
    }
}
