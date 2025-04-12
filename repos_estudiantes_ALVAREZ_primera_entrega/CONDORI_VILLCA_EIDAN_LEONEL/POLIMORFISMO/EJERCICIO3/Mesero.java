package POLIMORFISMO.EJERCICIO3;
public class Mesero {
	private String nombre;
	private int sueldoMes,horasExtra;
	private float sueldoHora,propina;
	public Mesero(String nombre,int sueldoMes,int horasExtra,float sueldoHora ,float propina) {
		this.nombre = nombre;
		this.sueldoMes = sueldoMes;
		this.horasExtra = horasExtra;
		this.sueldoHora = sueldoHora;
		this.propina = propina;
	}
	public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    public void mostrar() {
        System.out.println("Mesero: " + nombre + " - Sueldo Total: $" + sueldoTotal());
    }

    public void mostrar(int sueldo) {
        if (sueldoMes == sueldo) {
            mostrar();
        }
    }
}
