package restaurante;

public class Cocinero {
	private  String nombre;
	private int sueldoMes;
	private int horasExtras;
	private float sueldoHora;
	
	public Cocinero(String nombre, int sueldoMes,int horasExtras,float sueldoHora) {
		this.nombre=nombre;
		this.sueldoMes=sueldoMes;
		this.horasExtras=horasExtras;
		this.sueldoHora=sueldoHora;
		
	}
	  public String getNombre() {
	        return nombre;
	    }

	    public int getSueldoMes() {
	        return sueldoMes;
	    }
	    //b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
	    //sumándole las horas extra, considerando el sueldo por hora y la propina
	    //en caso de los meseros.
	public void  sueldoTotal() {
		double sueldot=sueldoMes + (horasExtras * sueldoHora);
		System.out.println("el sueldo total del cocinero  "+nombre+" es "+sueldot);
		
	}
	

}
