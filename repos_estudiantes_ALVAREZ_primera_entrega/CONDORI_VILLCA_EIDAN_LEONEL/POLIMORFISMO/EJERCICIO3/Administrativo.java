package POLIMORFISMO.EJERCICIO3;
public class Administrativo {
	private String nombre,cargo;
    private float sueldoMes;

    public Administrativo(String nombre, String cargo, float sueldoMes) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldoMes = sueldoMes;
        
    }

    public float sueldoTotal() {
        return sueldoMes;
    }

    public void mostrar() {
        System.out.println("Administrativo: " + nombre + " (" + cargo + ") - Sueldo Total: $" + sueldoTotal());
    }

    public void mostrar(int sueldo) {
        if ((int)sueldoMes == sueldo) {
            mostrar();
        }
    }
}

