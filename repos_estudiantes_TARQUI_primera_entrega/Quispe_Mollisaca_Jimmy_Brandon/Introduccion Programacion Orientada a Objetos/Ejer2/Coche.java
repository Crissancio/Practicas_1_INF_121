package IntroPOO;

public class Coche {
	
	private 
	String marca;
	String modelo;
	int velocidad;
	
	public Coche(String marca, String modelo, int velocidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	
	
	public  void acelerar(int a) {
		this.velocidad += a;
	}
	
	public void frenar(int f) {
		if(velocidad >= f) {
			this.velocidad -= f;	
		}
		else {
			this.velocidad=0;
		}
	}
	public void mostrarVelocidad() {
        System.out.println("Velocidad del coche (" + marca + " " + modelo + "): " + velocidad + " km/h");
    }
	
	public static void main(String[] args) {
		Coche coche1 = new Coche("Toyota", "Corolla", 30);
        Coche coche2 = new Coche("Ford", "Focus", 50);

        coche1.acelerar(10);
        coche2.acelerar(10);

        coche1.frenar(5);
        coche2.frenar(5);
        
        System.out.println("--------Coches--------");

        coche1.mostrarVelocidad();
        coche2.mostrarVelocidad();

	}

}
