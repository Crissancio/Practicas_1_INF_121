package ejercicio2;

public class Mesero extends Empleado{
	private int horasExtra;
    private float sueldoHora;
    private float propina;
	public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
		super(nombre, sueldoMes);
		this.horasExtra = horasExtra;
		this.sueldoHora = sueldoHora;
		this.propina = propina;
	}
	public int sueldoTotal() {
        return (int)(sueldoMes + (horasExtra * sueldoHora) + propina);
    } 
	public void mostrar() {
        System.out.println("Mesero:");
        super.mostrar();
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Sueldo por hora: " + sueldoHora);
        System.out.println("Propina: " + propina);
        System.out.println("Sueldo total: " + sueldoTotal());
        System.out.println("--------------------");
    }
}
