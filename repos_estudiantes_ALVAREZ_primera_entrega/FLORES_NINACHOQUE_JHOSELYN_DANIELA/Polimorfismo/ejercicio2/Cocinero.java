package ejercicio2;
public class Cocinero extends Empleado {
	private int horasExtra;
	private float sueldoHora;
	public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
		super(nombre, sueldoMes);
		this.horasExtra = horasExtra;
		this.sueldoHora = sueldoHora;
	} 
	public int sueldoTotal() {
        return (int)(sueldoMes + (horasExtra * sueldoHora));
    }
	public void mostrar() {
        System.out.println("Cocinero:");
        super.mostrar();
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Sueldo por hora: " + sueldoHora);
        System.out.println("Sueldo total: " + sueldoTotal());
        System.out.println("--------------------");
    }
}
