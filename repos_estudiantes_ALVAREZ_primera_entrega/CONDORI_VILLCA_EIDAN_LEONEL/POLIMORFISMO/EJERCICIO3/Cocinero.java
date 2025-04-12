package POLIMORFISMO.EJERCICIO3;
public class Cocinero {
	private String nombre;
	private int sueldoMes,horasExtra;
	private float sueldoHora;
	public Cocinero(String nombre,int sueldoMes,int horasExtra,float sueldoHora) {
		this.nombre = nombre;
		this.sueldoMes = sueldoMes;
		this.horasExtra = horasExtra;
		this.sueldoHora = sueldoHora;
	}
	public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }

    public void mostrar() {
        System.out.println("Cocinero: " + nombre + " - Sueldo Total: $" + sueldoTotal());
    }

    public void mostrar(int sueldo) {
        if (sueldoMes == sueldo) {
            mostrar();
        }
    }

}

