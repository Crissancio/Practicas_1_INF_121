package CocheJava;

public class Principal {
	 public static void main(String[] args) {
	        Coche c1 = new Coche("Nissan", "Altima",20);
	        Coche c2 = new Coche("Toyota", "Corolla",10);
	        System.out.println("Marca: " + c1.getMarca() + ", Modelo: " + c1.getModelo() + ", Velocidad: " + c1.getVelocidad());
	        System.out.println("Marca: " + c2.getMarca() + ", Modelo: " + c2.getModelo() + ", Velocidad: " + c2.getVelocidad());
	    }
}
