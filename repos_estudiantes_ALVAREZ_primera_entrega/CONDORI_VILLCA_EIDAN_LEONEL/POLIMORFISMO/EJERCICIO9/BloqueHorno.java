package POLIMORFISMO.EJERCICIO9;
public class BloqueHorno {
	private String color;
	private int capacidadComida;
	public BloqueHorno(String color,int capacidadComida) {
		this.color = color;
		this.capacidadComida = capacidadComida;
	}
	public void accion() {
		System.out.print("El Horno puede cocinar asta "+ capacidadComida +" items\n");
	}
	public void colocar(){
		System.out.println("El Horno de color " + color +" se ha colocado en la pared uno ensima de otro");
		
	}
	public void colocar(String lugar) {
		System.out.println("Al lado de "+ lugar);
	}
	public void romper() {
		System.out.println("Se ha roto el Horno y solo se puedo cocinar 24 pollos de 64 ");
	}
}

