package Universidad;

public class Laboratorio {
	 private String nombre;
	    private int capacidad;
	    private int nroMesas;
	    private int nroSillas;

	    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
	        this.nombre = nombre;
	        this.capacidad = capacidad;
	        this.nroMesas = nroMesas;
	        this.nroSillas = nroSillas;
	    }

	    public void mostrar() {
	        System.out.println("\n--- Laboratorio ---");
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Capacidad: " + capacidad);
	        System.out.println("Número de mesas: " + nroMesas);
	        System.out.println("Número de sillas: " + nroSillas);
	    }

	    public int cantidadMuebles() {
	        return nroMesas + nroSillas;
	    }

	    public int cantidadMuebles(boolean soloMesas) {
	        if (soloMesas) {
	            return nroMesas;
	        } else {
	            return cantidadMuebles();
	        }
	    }
}
