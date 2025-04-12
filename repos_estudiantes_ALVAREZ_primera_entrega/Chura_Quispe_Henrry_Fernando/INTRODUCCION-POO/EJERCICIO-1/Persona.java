package inf121;

public class Persona {
    String nombre;
    int edad;
    String  ciudad;
    
    public Persona(String nombre,int edad, String ciudad) {
    	this.nombre=nombre;
    	this.edad=edad;
    	this.ciudad=ciudad;
    	
    }
    
    public void saludo() {
    	System.out.println("Hola soy "+nombre+" de  "+ciudad);
    	
    }
    public boolean mayorEdad() {
    	if (edad>18) {
    		System.out.println(nombre+" es mayor de edad");
    	}
    	else {
    		System.out.println(nombre+" no es mayor de edad");
    	}
    	return true;
    }

public static void main(String[] arg) {
    
	Persona uno = new Persona("fulanito",13,"mexico");
	Persona dos = new Persona("pepe",23,"peru");
	Persona tres = new Persona("jostin",54,"bolivia");
	
	
	uno.saludo();
	dos.saludo();
	tres.saludo();
	
	uno.mayorEdad();
	dos.mayorEdad();
	tres.mayorEdad();
	
}
}