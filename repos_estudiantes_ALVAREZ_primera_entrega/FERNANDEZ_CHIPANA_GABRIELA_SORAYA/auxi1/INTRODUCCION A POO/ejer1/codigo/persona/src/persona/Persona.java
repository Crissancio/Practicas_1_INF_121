
package persona;
//Crea una clase Persona con nombre, edad y ciudad
//a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
//b) Crea tres personas y muestra su saludo
//c) Agrega un método para verificar si es mayor de edad
public class Persona {
    public
    String nombre;
    int edad;
    String ciudad;
    public Persona( String nombre,int edad, String ciudad){
        this.nombre=nombre;
        this.edad=edad;
        this.ciudad=ciudad;
    }
    public void saludo(){
        System.out.println("hola soy "+nombre+" de "+ciudad);
    }
    public void verificar(){
        if(edad>=18){
            System.out.println(nombre+ " es mayor de edad");
        }
        else{
            System.out.println(nombre +" es menor de edad");
        }
    }
    
    public static void main(String[] args) {
      Persona p =new Persona("gabriela",20,"el alto");
      Persona p1 =new Persona("soraya",17,"chuquisaca");
      Persona p2 =new Persona("ruddy",18,"pando");
      p.saludo();
      p1.saludo();
      p2.saludo();
      p.verificar();
      p1.verificar();
      p2.verificar();
    }
    
}
