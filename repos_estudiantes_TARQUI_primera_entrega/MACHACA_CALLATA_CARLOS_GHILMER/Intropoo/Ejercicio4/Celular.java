/*  7. Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio
a) Crea un método para instalar una nueva aplicación
b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más
de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan
más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza
un 1% cada 10 minutos de uso)
c) Muestra el porcentaje de batería restante
d) Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el
mensaje de celular apagado */




package Intropoo.Ejercicio4;

public class Celular {
    private String aplicacion;
    private int bateria;
    int memoria;
    double minutos;
    private int espacioDisponible = 1024;
    private int aplicacionesInstaladas = 0;
    private int maxAplicaciones = 20;

    public Celular(String aplicacion, int bateria, int memoria, double minutos) {
        this.aplicacion = aplicacion;
        this.bateria = bateria;
        this.memoria = memoria;
        this.minutos = minutos;
    }

    // a) metodo instalar aplicacion
    public void instalarAplicacion(String nombreAplicacion, int tamanoMb) {
        if (aplicacionesInstaladas < maxAplicaciones && espacioDisponible >= tamanoMb) {
            aplicacionesInstaladas++;
            espacioDisponible -= tamanoMb;
            System.out.println("Se instaló la aplicación: " + nombreAplicacion);
        } else {
            System.out.println("No se puede instalar la aplicación: " + nombreAplicacion + ". Espacio insuficiente o límite de aplicaciones alcanzado.");
        }
    }

    // b) utilizarAplicacion
    public void utilizarAplicacion(int tamanoMb, int minutosUso) {
        if (bateria <= 0) {
            System.out.println("Celular apagado");
            return;
        }

        int consumoBateria = 0;
        if (tamanoMb > 100) {
            consumoBateria = (minutosUso / 10) * 2;
        } else if (tamanoMb > 250) {
            consumoBateria = (minutosUso / 10) * 5;
        } else {
            consumoBateria = (minutosUso / 10) * 1;
        }

        bateria -= consumoBateria;
        if (bateria < 0) {
            bateria = 0;
        }

        System.out.println("Se utilizó la aplicación " + aplicacion + " por " + minutosUso + " minutos. Batería restante: " + bateria + "%");

      
    }

    // c) mostrar porcentaje de batería restante
    public void mostrarBateria() {
        System.out.println("Batería restante: " + bateria + "%");
    }

    public static void main(String[] args) {
        Celular c1 = new Celular("Facebook", 50, 100, 20);
        Celular c2 = new Celular("Instagram", 60, 250, 40);
        Celular c3 = new Celular("Whatsapp", 0, 230, 0);

        c1.instalarAplicacion("Facebook", 100);
        c2.instalarAplicacion("Instagram", 250);
        c3.instalarAplicacion("Whatsapp", 230);

        
        c1.utilizarAplicacion(100, 20);
        c2.utilizarAplicacion(250, 40);
        c3.utilizarAplicacion(230, 0);

        // c) Mostrar bateria restante
        c1.mostrarBateria();
        c2.mostrarBateria();
        c3.mostrarBateria();
    }
}
