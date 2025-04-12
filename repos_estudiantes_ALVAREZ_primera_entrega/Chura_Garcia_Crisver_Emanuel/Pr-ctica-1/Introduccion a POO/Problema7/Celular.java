public class Celular {
    private static final int ESPACIO_TOTAL = 1024; // MB
    private static final int MAX_APLICACIONES = 20;
    private Aplicacion[] aplicaciones;
    private int espacioDisponible;
    private int nivelBateria;

    public Celular() {
        aplicaciones = new Aplicacion[MAX_APLICACIONES];
        espacioDisponible = ESPACIO_TOTAL;
        nivelBateria = 100;
    }

    public void instalarAplicacion(String nombre, int tamano) {
        if (espacioDisponible < tamano) {
            System.out.println("No hay suficiente espacio para instalar " + nombre);
            return;
        }

        for (int i = 0; i < aplicaciones.length; i++) {
            if (aplicaciones[i] == null) {
                aplicaciones[i] = new Aplicacion(nombre, tamano);
                espacioDisponible -= tamano;
                System.out.println("Aplicación instalada: " + nombre);
                return;
            }
        }

        System.out.println("Límite de aplicaciones alcanzado.");
    }

    public void usarAplicacion(String nombre, int minutos) {
        for (Aplicacion app : aplicaciones) {
            if (app != null && app.getNombre().equals(nombre)) {
                int consumoBateria = app.calcularConsumo(minutos);
                if (nivelBateria <= 0) {
                    System.out.println("Celular apagado. Carga la batería.");
                    return;
                }
                nivelBateria -= consumoBateria;
                if (nivelBateria < 0)
                    nivelBateria = 0;
                System.out.println("Usando " + nombre + ". Batería restante: " + nivelBateria + "%");
                return;
            }
        }
        System.out.println("Aplicación no encontrada.");
    }

    public void mostrarBateria() {
        System.out.println("Batería restante: " + nivelBateria + "%");
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

        public int calcularConsumo(int minutos) {
            if (tamano > 250) {
                return (minutos / 10) * 5; // 5% cada 10 minutos
            } else if (tamano > 100) {
                return (minutos / 10) * 2; // 2% cada 10 minutos
            } else {
                return (minutos / 10); // 1% cada 10 minutos
            }
        }
    }

    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.instalarAplicacion("Google", 150);
        celular.instalarAplicacion("Youtibe", 250);
        celular.instalarAplicacion("Facebook", 126);
        celular.mostrarBateria();
        celular.usarAplicacion("Facebook", 126);
        celular.mostrarBateria();
    }
}