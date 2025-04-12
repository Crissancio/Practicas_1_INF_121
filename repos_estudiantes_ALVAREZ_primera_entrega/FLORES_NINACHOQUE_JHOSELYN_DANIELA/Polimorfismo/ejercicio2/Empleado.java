package ejercicio2;
public class Empleado {
	protected String nombre;
    protected int sueldoMes;
	public Empleado(String nombre, int sueldoMes) {
		this.nombre = nombre;
		this.sueldoMes = sueldoMes;
	}
	public int sueldoTotal() {
        return sueldoMes;
    }

    public boolean sueldoIgualA(int x) {
        return this.sueldoMes == x;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + sueldoMes);
    }	 	 
}
