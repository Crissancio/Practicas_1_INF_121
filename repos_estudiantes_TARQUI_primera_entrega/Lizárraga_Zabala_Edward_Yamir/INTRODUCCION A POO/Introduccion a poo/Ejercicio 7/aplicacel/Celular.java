
package aplicacel;

public class Celular {
    public Aplicacion[] aplicaciones;
    public int cantidadApps;
    public int espacioDisponible;
    public double bateria;

    public Celular() {
        aplicaciones = new Aplicacion[20];
        cantidadApps = 0;
        espacioDisponible = 1024;
        bateria = 100.0;
    }

    public void instalarApp(String nombre, int pesoMB) {
        if (cantidadApps >= 20) {
            System.out.println("No puedes instalar mas aplicaciones.");
        } else if (pesoMB > espacioDisponible) {
            System.out.println("No hay suficiente espacio para instalar " + nombre);
        } else {
            aplicaciones[cantidadApps++] = new Aplicacion(nombre, pesoMB);
            espacioDisponible -= pesoMB;
            System.out.println(" " + nombre + " instalada. Espacio restante: " + espacioDisponible + "MB");
        }
    }
    public void mostrarEspacioDisponible() {
            System.out.println("Espacio disponible: " + espacioDisponible + "MB");
    }

    public void usarApp(String nombre, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado. Sin bateria.");
            return;
        }

        Aplicacion app = null;
        for (int i = 0; i < cantidadApps; i++) {
            if (aplicaciones[i].nombre.equals(nombre)) {
                app = aplicaciones[i];
                break;
            }
        }

        if (app == null) {
            System.out.println("Aplicación " + nombre + " no encontrada.");
            return;
        }

        double consumoPor10Min = (app.pesoMB > 250) ? 5.0 : (app.pesoMB > 100) ? 2.0 : 1.0;
        double consumoTotal = consumoPor10Min * (minutos / 10.0);

        if (bateria - consumoTotal <= 0) {
            bateria = 0;
            System.out.println("Bateria agotada usando " + nombre);
        } else {
            bateria -= consumoTotal;
            System.out.printf("Usaste %s por %d minutos. Bateria restante: %.1f%%\n", nombre, minutos, bateria);
        }
    }

    public void mostrarBateria() {
        System.out.printf("Bateria actual: %.1f%%\n", bateria);
    }
}

