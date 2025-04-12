package POLIMORFISMO.EJERCICIO9;
public class BloqueTnt {
	private String tipo;
	private int daño;
	public BloqueTnt(String tipo,int daño) {
		this.tipo = tipo;
		this.daño = daño;	
	}
	public void accion() {
		System.out.print("La TNT "+ tipo+" puede hacer " + daño + " de daño\n");
	}
	public void colocar(){
		System.out.println("La TNT "+tipo+" se ha colocado en el suelo");
		
	}
	public void colocar(String lugar) {
		System.out.println("Al lado de "+ lugar);
	}
	public void romper() {
		System.out.println("La TNT se rompio y se evito el daño en la zona");
	}
}
