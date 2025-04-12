package IntroPOO;

public class Celular {
    private int espacio; // Espacio total en MB
    private int bateria; // Porcentaje de batería
    private Aplicacion[] aplicaciones; // Vector de aplicaciones
    private int numeroAplicaciones; // Contador de aplicaciones instaladas

    public Celular() {
        this.espacio = 1024; // Inicializamos el espacio total
        this.bateria = 100;  // Inicializamos la batería al 100%
        this.aplicaciones = new Aplicacion[20]; // Creamos el arreglo de aplicaciones con capacidad para 20
        this.numeroAplicaciones = 0; // Inicializamos el contador de aplicaciones instaladas
    }

    public void instalarAplicacion(Aplicacion app) {
        if (numeroAplicaciones < aplicaciones.length && espacio >= app.getTamano()) {
            aplicaciones[numeroAplicaciones] = app; // Asignamos la aplicación al arreglo
            numeroAplicaciones++; // Incrementamos el contador
            espacio -= app.getTamano(); // Reducimos el espacio disponible
            System.out.println("Aplicación '" + app.getNombre() + "' instalada con éxito. Espacio restante: " + espacio + " MB.");
        } else {
            System.out.println("No se puede instalar la aplicación. Espacio insuficiente o límite de aplicaciones alcanzado.");
        }
    }

    public void utilizarAplicacion(String nombre, int tiempoMinutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado. No queda batería.");
            return;
        }

        for (int i = 0; i < numeroAplicaciones; i++) {
            if (aplicaciones[i] != null && aplicaciones[i].getNombre().equals(nombre)) {
                int consumo = 0;
                if (aplicaciones[i].getTamano() > 250) {
                    consumo = 5 * (tiempoMinutos / 10);
                } else if (aplicaciones[i].getTamano() > 100) {
                    consumo = 2 * (tiempoMinutos / 10);
                } else {
                    consumo = 1 * (tiempoMinutos / 10);
                }

                if (consumo > bateria) {
                    System.out.println("La batería no es suficiente para usar '" + nombre + "' por " + tiempoMinutos + " minutos.");
                    return;
                }

                bateria -= consumo;
                System.out.println("Usaste '" + nombre + "' por " + tiempoMinutos + " minutos. Batería restante: " + bateria + "%.");
                return;
            }
        }

        System.out.println("La aplicación '" + nombre + "' no está instalada.");
    }

    public void mostrarBateria() {
        System.out.println("Batería restante: " + bateria + "%.");
    }

    public void mostrarEspacio() {
        System.out.println("Espacio restante: " + espacio + " MB.");
    }

    public static void main(String[] args) {
        Celular celular = new Celular();

        Aplicacion app1 = new Aplicacion("WhatsApp", 150);
        Aplicacion app2 = new Aplicacion("Facebook", 300);
        Aplicacion app3 = new Aplicacion("Juego Ligero", 90);

        celular.instalarAplicacion(app1);
        celular.instalarAplicacion(app2);
        celular.instalarAplicacion(app3);

        celular.utilizarAplicacion("WhatsApp", 30);
        celular.utilizarAplicacion("Facebook", 20);
        celular.utilizarAplicacion("Juego Ligero", 10);

        celular.mostrarBateria();
        celular.mostrarEspacio();
        celular.utilizarAplicacion("Facebook", 60);
    }
}
