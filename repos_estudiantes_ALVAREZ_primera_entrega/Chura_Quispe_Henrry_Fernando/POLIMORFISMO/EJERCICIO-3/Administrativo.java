package restaurante;

public class Administrativo {
	private String nombre;
	private float sueldoMes;
	private String cargo;
	
	
	public Administrativo(String nombre, float sueldoMes,String cargo) {
		this.nombre=nombre;
		this.sueldoMes=sueldoMes;
		this.cargo=cargo;
		
	}
	   public String getNombre() {
	        return nombre;
	    }

	    public float getSueldoMes() {
	        return sueldoMes;
	    }
	    public String getCargo() {
	    	return cargo;
	    }
	    //b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
	    //sumándole las horas extra, considerando el sueldo por hora y la propina
	    //en caso de los meseros.
	public void sueldoTotal() {
		System.out.println("el sueldo total del administrativo "+nombre+" es "+sueldoMes);
	}
}
