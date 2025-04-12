import java.util.ArrayList;
public class Aplicacion {
    private String nombre;
    private int peso;
    public Aplicacion(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPeso() {
        return peso;
    }
}
public class Celular {
    private ArrayList<Aplicacion> apps = new ArrayList<>();
    private int espacio = 1024;
    private double bateria = 100;
    public void instalar(Aplicacion app) {
        if (apps.size() < 20 && app.getPeso() <= espacio) {
            apps.add(app);
            espacio -= app.getPeso();
        } else {
            System.out.println("No se puede instalar");
        }
    }
    public void usar(String nombre, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado");
            return;
        }
        for (Aplicacion app : apps) {
            if (app.getNombre().equals(nombre)) {
                double gasto;
                if (app.getPeso() > 250) {
                    gasto = 5;
                } else if (app.getPeso() > 100) {
                    gasto = 2;
                } else {
                    gasto = 1;
                }
                double total = (minutos / 10.0) * gasto;
                bateria -= total;
                if (bateria <= 0) {
                    bateria = 0;
                    System.out.println("Celular apagado");
                }
                return;
            }
        }
    }
    public void mostrar() {
        System.out.println("Batería restante: " + bateria + "%");
    }
}