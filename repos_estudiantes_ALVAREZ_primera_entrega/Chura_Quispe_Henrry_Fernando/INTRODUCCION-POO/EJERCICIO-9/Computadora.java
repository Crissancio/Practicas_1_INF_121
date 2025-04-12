package inf121;
//9. Realiza la abstracción de una Computadora
public class Computadora {
	   boolean encendidoOapagado;
       String marca;
       String procesador;
       int memoriaRam;
       int almacenamiento; 
       
public Computadora(boolean encendidoOapagado, String marca, String procesador,int memoriaRam, int almacenamiento) {
	this.encendidoOapagado=encendidoOapagado;
	this.marca=marca;
	this.procesador=procesador;
	this.memoriaRam=memoriaRam;
	this.almacenamiento=almacenamiento;
}
      //a) Muestra los componentes principales de la computadora 
	public void muestraComponente() {
		System.out.println("la marca es "+marca+" con un procesador "+procesador+"  una memoria Ram de "+memoriaRam+" gb "
				+ "y un almacenamiento de "+almacenamiento+" Gb");	
	}
//b) Muestra el estado de la computadora (encendido o apagado)
	public boolean muestraEstadoCompu() {
	
		if(encendidoOapagado) {
			System.out.println("la maquina esta encendida");
			return true;
		}else {
			System.out.println("la maquina esta apagada");
			return false;
		}
	}
	
	public static void main(String[] args) {
		////c) Crea una instancia y simula encender y apagar la computadora.
		Computadora com = new Computadora(false,"HP","AMDA",16 ,120);
		com.muestraComponente();
		com.muestraEstadoCompu();
	}
}
