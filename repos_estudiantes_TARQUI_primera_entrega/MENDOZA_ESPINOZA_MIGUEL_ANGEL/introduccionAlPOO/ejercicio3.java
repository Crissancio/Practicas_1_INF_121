package introduccionAlPOO;  
class Coche{
	public String marca;
	public String modelo;
	public int velocidad;
	public Coche(String m,String mo,int v) {
		this.marca=m;
		this.modelo=mo;
		this.velocidad=0;
	}
	public void acelerar() {
		velocidad += 10;
	}
	public void frenar() {
		velocidad = Math.max(0,velocidad,-5);
	}
	public void mostrarVelocidad() {
		System.out.println(marca+" "+modelo+"tiene una velocidad de"+velocidad+"km/m");
	}
	public static void main(String[] args) {
		 Coche c1=new Coche("toyora","carrg",34);
		 Coche c2=new Coche("nissan","tiida",80);
		 c1.acelerar();
		 c1.acelerar();
		 c2.acelerar();
		 c1.frenar();
		 c2.frenar();
		 c1.mostrarVelocidad();
		 c2.mostrarVelocidad();
	}
}
