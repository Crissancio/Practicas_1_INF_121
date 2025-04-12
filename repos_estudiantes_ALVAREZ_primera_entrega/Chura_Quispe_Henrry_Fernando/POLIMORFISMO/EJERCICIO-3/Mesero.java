package restaurante;

public class Mesero {
	private String nombre;
	private int sueldoMes;
	private int horasExtras;
	private float sueldoHora;
	private float propina;
	
	public Mesero(String nombre,int sueldoMes,int horasExtras,float sueldoHora,float propina) {
		this.nombre=nombre;
		this.sueldoMes=sueldoMes;
		this.horasExtras=horasExtras;
		this.sueldoHora=sueldoHora;
		this.propina=propina;
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
	public void sueldoTotal() {
		double sueldot=sueldoMes+horasExtras+sueldoHora+propina;
		System.out.println("el sueldo total  del mesero "+nombre+" es "+sueldot);
	}
}
