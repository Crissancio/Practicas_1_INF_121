package polimorfismo;
class Oficina{
	private int nrosillas;
	private int nroescritorios;
	private int nroestanterias;
	public Oficina(int nrosi,int nroes,int nroest) {
		this.nrosillas=nrosi;
		this.nroescritorios=nroes;
		this.nroescritorios=nroes;
	}
	public void mostrar() {
		System.out.println("oficina: nrosillas="+nrosillas+ " ,nroescritorios="+nroescritorios+ " ,nroestanterias="+nroestanterias);
	}
	public int cantidadmuebles() {
		return nrosillas+nroescritorios+nroestanterias;
	}
}
class Aula{
	private String nombre;
	private int capacidad;
	private int nropupitres;
	public Aula(String n,int c,int np) {
		this.nombre=n;
		this.capacidad=c;
		this.nropupitres=np;
	}
	public void mostrar() {
		System.out.println("aula: nombre="+nombre+ " ,capacidad="+capacidad+ " ,pupitres="+nropupitres);
	}
	public int cantidadmuebles() {
		return nropupitres;
	}
}
class Laboratorio{
	private String nombre;
	private int capacidad;
	private int nromesas;
	private int nrosillas;
	public Laboratorio(String n,int c,int nrom,int nrosi) {
		this.nombre=n;
		this.capacidad=c;
		this.nromesas=nrom;
		this.nrosillas=nrosi;
	}
	public void mostrar() {
		System.out.println("aula: nombre="+nombre+ " ,capacidad="+capacidad+ " ,nromesas="+nromesas+" ,nrosillas:"+nrosillas);
	}
	public int cantidadmuebles() {
		return nrosillas+nromesas;
	}
}
public class ejercicio5{
	public static void main(String[] args) {
		Oficina o=new Oficina(10,5,5);
		Aula a=new Aula("aula 101",30,20);
		Laboratorio lab=new Laboratorio("lab A",15,6,12);
		o.mostrar();
		System.out.println("total de muebles:"+o.cantidadmuebles());
		a.mostrar();
		System.out.println("total de muebles:"+a.cantidadmuebles());
		lab.mostrar();
		System.out.println("total de muebles:"+lab.cantidadmuebles());
	}

}
