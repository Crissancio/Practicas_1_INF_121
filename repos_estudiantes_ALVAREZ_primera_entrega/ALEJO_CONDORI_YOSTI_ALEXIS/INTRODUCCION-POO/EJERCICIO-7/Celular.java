package Ejercicio4;

public class Celular {
	public String[] aplicaciones = new String[20];
	int[] pesos = new int[20];
	int cantidadApp =0;
	int espacioDisponible = 1024;
	double bateria= 100;
	public void instalarAplicacion (String nombre, int peso) {
		if(cantidadApp <20 && espacioDisponible>=peso) {
			aplicaciones[cantidadApp]=nombre;
			pesos[cantidadApp]=peso;
			espacioDisponible -= peso;
			cantidadApp++;
			System.out.println("Aplicacion "+nombre+" instalada");
		}else {
		System.out.println("no se puede instalar");
		}
		}
	public void usarAplicacion(String nombre, int minutos) {
		for(int i=0; i<cantidadApp ;i++) {
			if(aplicaciones[i].equals(nombre)) {
				int peso=pesos[i];
				double consumo=0;
				
				if(peso>250) {
					consumo=0.5 *minutos;
				}else if(peso>100) {
					consumo=0.2 *minutos;
				}else {
					consumo= 0.1*minutos;
				}
				if( bateria - consumo<=0) {
					bateria=0;
					System.out.println("Celular apagado");
				}else {
					bateria -=consumo;
					System.out.println("Usando "+nombre+" por "+consumo+"% cada 10 minutos");
				}
				return;
			}
		}
		System.out.println("No encontrada");
	}
	public void mostrarBateria() {
		System.out.println("Batería: "+bateria+"%");
	}
}
