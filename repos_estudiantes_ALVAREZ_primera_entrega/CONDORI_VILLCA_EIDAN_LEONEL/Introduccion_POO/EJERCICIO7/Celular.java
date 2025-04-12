package EJERCICIO7;
//Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio
//a) Crea un método para instalar una nueva aplicación
//b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más
//de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan
//más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza
//un 1% cada 10 minutos de uso)
//c) Muestra el porcentaje de batería restante
//d) Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el
//mensaje de celular apagado
public class Celular {
    private Aplicacion[] aplicaciones = new Aplicacion[20];
    private int cantidadApps = 0;
    private int espacioDisponible = 1024; 
    private double bateria = 100.0;

    public boolean instalarAplicacion(String nombre, int tamanoMb) {
        if (cantidadApps < 20 && espacioDisponible >= tamanoMb) {
            aplicaciones[cantidadApps++] = new Aplicacion(nombre, tamanoMb);
            espacioDisponible -= tamanoMb;
            System.out.println("Aplicación '" + nombre + "' instalada.");
            return true;
        } else {
            System.out.println("No se pudo instalar '" + nombre + "'. Espacio insuficiente o límite de apps alcanzado.");
            return false;
        }
    }
    public void usarAplicacion(String nombre, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado.");
            return;
        }

        Aplicacion app = buscarAplicacion(nombre);
        if (app == null) {
            System.out.println("Aplicación no encontrada.");
            return;
        }

        int tamano = app.getTamano();
        double consumoPor10Min = 1.0;

        if (tamano > 250) {
            consumoPor10Min = 5.0;
        } else if (tamano > 100) {
            consumoPor10Min = 2.0;
        }

        double consumo = (minutos / 10.0) * consumoPor10Min;
        bateria -= consumo;

        if (bateria <= 0) {
            bateria = 0;
            System.out.println("Batería agotada durante el uso. Celular apagado.");
        } else {
            System.out.println("Usando '" + nombre + "' por " + minutos + " minutos. Batería actual: " + bateria + "%");
        }
    }
    public void mostrarBateria() {
        if (bateria <= 0) {
            System.out.println("Celular apagado.");
        } else {
            System.out.println("Batería restante: " + bateria + "%");
        }
    }
    private Aplicacion buscarAplicacion(String nombre) {
        for (int i = 0; i < cantidadApps; i++) {
            if (aplicaciones[i].getNombre().equalsIgnoreCase(nombre)) {
                return aplicaciones[i];
            }
        }
        return null;
    }
    private class Aplicacion {
        private String nombre;
        private int tamano;

        public Aplicacion(String nombre, int tamano) {
            this.nombre = nombre;
            this.tamano = tamano;
        }

        public String getNombre() {
            return nombre;
        }

        public int getTamano() {
            return tamano;
        }
    }
    public static void main(String[] args) {
        Celular miCelular = new Celular();
        miCelular.instalarAplicacion("WhatsApp", 90);
        miCelular.instalarAplicacion("Instagram", 150);
        miCelular.instalarAplicacion("JuegoPesado", 300);

        miCelular.usarAplicacion("Instagram", 30);
        miCelular.mostrarBateria();
        miCelular.usarAplicacion("WhatsApp", 100);
        miCelular.mostrarBateria();
        miCelular.usarAplicacion("blood strike", 60);
        miCelular.mostrarBateria();
    }
}
