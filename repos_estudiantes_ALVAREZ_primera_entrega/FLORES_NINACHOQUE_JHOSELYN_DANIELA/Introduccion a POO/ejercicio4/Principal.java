package ejercicio4;

public class Principal {
	public static void main(String[] args) {
		Celular c1 = new Celular();
        
        c1.instalarApp("WhatsApp", 80);
        c1.instalarApp("Juego Pesado", 300);
        
        c1.mostrarBateria();
        
        c1.usarApp("WhatsApp", 25);
        c1.mostrarBateria();
        
        c1.usarApp("Juego Pesado", 60);
        c1.mostrarBateria();
        
        c1.usarApp("Juego Pesado", 200); // Esto agotará la batería
        c1.verificarEstado();
	}
}
