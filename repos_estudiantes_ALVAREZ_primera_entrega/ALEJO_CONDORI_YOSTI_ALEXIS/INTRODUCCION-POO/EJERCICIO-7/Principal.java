package Ejercicio4;

public class Principal {

	public static void main(String[] args) {
		Celular C= new Celular();
		System.out.println();
		C.instalarAplicacion("WhatsApp", 30);
		C.instalarAplicacion("Tiktok", 300);
		C.instalarAplicacion("Facebook", 150);		
		C.usarAplicacion("WhatsApp", 30);
		C.usarAplicacion("Tiktok", 60);
		C.usarAplicacion("Facebook", 40);		
		C.mostrarBateria();
		C.usarAplicacion("Tiktok", 100);
		C.usarAplicacion("WhatsApp", 100);
	}

}
