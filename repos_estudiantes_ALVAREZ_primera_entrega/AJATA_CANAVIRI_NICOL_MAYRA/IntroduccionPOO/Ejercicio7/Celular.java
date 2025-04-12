package IntroduccionPOO.Ejercicio7;

public class Celular {
    String[] nombresApps = new String[20];
    int[] tamaniosApps = new int[20];
    int cantidadApps = 0;
    int espacioDisponible = 1024; 
    double bateria = 100.0;

    public void instalarAplicacion(String nombre, int tamanio) {
        if (cantidadApps >= 20) {
            System.out.println("No se puede instalar mas aplicaciones. Limite alcanzado.");
        } else if (tamanio > espacioDisponible) {
            System.out.println("No hay suficiente espacio para instalar '" + nombre + "'.");
        } else {
            nombresApps[cantidadApps] = nombre;
            tamaniosApps[cantidadApps] = tamanio;
            cantidadApps++;
            espacioDisponible -= tamanio;
            System.out.println("Aplicacion '" + nombre + "' instalada. Espacio restante: " + espacioDisponible + " MB.");
        }
    }

    public void usarAplicacion(String nombre, int minutosUso) {
        if (bateria <= 0) {
            System.out.println("Celular apagado. Sin bateria.");
            return;
        }

        int indice = -1;
        for (int i = 0; i < cantidadApps; i++) {
            if (nombresApps[i].equalsIgnoreCase(nombre)) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("La aplicacion '" + nombre + "' no esta instalada.");
            return;
        }

        int peso = tamaniosApps[indice];
        double consumoPor10Min;

        if (peso > 250) {
            consumoPor10Min = 5.0;
        } else if (peso > 100) {
            consumoPor10Min = 2.0;
        } else {
            consumoPor10Min = 1.0;
        }

        double consumoTotal = (minutosUso / 10.0) * consumoPor10Min;

        if (bateria - consumoTotal <= 0) {
            bateria = 0;
            System.out.println("Usaste '" + nombre + "' y la bateria se agoto. Celular apagado.");
        } else {
            bateria -= consumoTotal;
            System.out.println("Usaste '" + nombre + "' por " + minutosUso + " minutos. Bateria actual: " + bateria + "%");
        }
    }

    public void mostrarBateria() {
        if (bateria <= 0) {
            System.out.println("Celular apagado. Sin bateria.");
        } else {
            System.out.println("Bateria restante: " + bateria + "%");
        }
    }

    // main
    public static void main(String[] args) {
        Celular miCelular = new Celular();

        miCelular.instalarAplicacion("WhatsApp", 80);
        miCelular.instalarAplicacion("Facebook", 200);
        miCelular.instalarAplicacion("Ludo", 300);

        miCelular.usarAplicacion("WhatsApp", 30);  
        miCelular.usarAplicacion("Facebook", 20);    
        miCelular.usarAplicacion("Ludo", 40);  

        miCelular.mostrarBateria(); 

        miCelular.usarAplicacion("Ludo", 500); 
        miCelular.mostrarBateria(); 
    }
}


