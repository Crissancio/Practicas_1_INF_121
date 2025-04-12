package ejercicio4;

public class Celular {
	private int apps = 20;
    private int espacio = 1024; // En MB
    private String[] aplicaciones;
    private int[] tamanosApps; // En MB
    private int espacioUsado;
    private int bateria;
    private int cantidadApps;

    public Celular() {
        aplicaciones = new String[apps];
        tamanosApps = new int[apps];
        bateria = 100;
        espacioUsado = 0;
        cantidadApps = 0;
    }

    
    public boolean instalarApp(String nombreApp, int tamano) {
        if (cantidadApps >= apps) {
            System.out.println("No hay espacio para más aplicaciones (límite de " + apps + " apps)");
            return false;
        }
        
        if (espacioUsado + tamano > espacio) {
            System.out.println("Espacio insuficiente. Necesitas " + (tamano - (espacio - espacioUsado)) + " MB más");
            return false;
        }
        
        aplicaciones[cantidadApps] = nombreApp;
        tamanosApps[cantidadApps] = tamano;
        cantidadApps++;
        espacioUsado += tamano;
        System.out.println(nombreApp + " instalada correctamente");
        return true;
    }

    
    public void usarApp(String nombreApp, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado. No se puede usar aplicaciones");
            return;
        }
        
        int indice = -1;
        for (int i = 0; i < cantidadApps; i++) {
            if (aplicaciones[i].equals(nombreApp)) {
                indice = i;
                break;
            }
        }
        
        if (indice == -1) {
            System.out.println("Aplicación no encontrada");
            return;
        }
        
        int tamanoApp = tamanosApps[indice];
        int consumoPorBloque = 1;
        
        if (tamanoApp > 250) {
            consumoPorBloque = 5;
        } else if (tamanoApp > 100) {
            consumoPorBloque = 2;
        }
        
        int bloques10min = minutos / 10;
        int consumoTotal = consumoPorBloque * bloques10min;
        
        bateria = Math.max(0, bateria - consumoTotal);
        System.out.println("Usando " + nombreApp + " durante " + minutos + " minutos");
        
        if (bateria <= 0) {
            System.out.println("¡Batería agotada! Celular apagado");
        }
    }

    public void mostrarBateria() {
        System.out.println("Batería restante: " + bateria + "%");
    }
    
    public void verificarEstado() {
        if (bateria <= 0) {
            System.out.println("Celular apagado. Conecte el cargador");
        }
    } 
}
