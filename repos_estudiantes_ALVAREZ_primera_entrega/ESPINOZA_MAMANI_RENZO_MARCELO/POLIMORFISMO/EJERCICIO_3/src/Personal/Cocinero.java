package Personal;

public class Cocinero {
	 	private String nombre;
	 	private int sueldoMes;
	 	private int horasExtra;
	 	private float sueldoHora;

	    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
	        this.nombre = nombre;
	        this.sueldoMes = sueldoMes;
	        this.horasExtra = horasExtra;
	        this.sueldoHora = sueldoHora;
	    }

	    public float sueldoTotal() {
	        return sueldoMes + (horasExtra * sueldoHora);
	    }

	    public void mostrarSiSueldoIgual(float x) {
	        if (sueldoMes == x) {
	            System.out.println(nombre + " (Cocinero) tiene sueldoMes = " + x);
	        }
	   }
}
