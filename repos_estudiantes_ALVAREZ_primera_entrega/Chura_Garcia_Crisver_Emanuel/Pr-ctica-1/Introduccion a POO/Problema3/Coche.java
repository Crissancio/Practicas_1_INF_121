//3. Crea una clase Coche con marca, modelo y velocidad
public class Coche {
    private String marca;
    private String modelo;
    private float velocidad;

    public Coche(String marca, String modelo, float velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    // a) Agrega un método acelerar () que aumente la velocidad en 10
    public void acelerar() {
        float acelera = velocidad + 10.0f;
        System.out.println(modelo + " acelera a: " + acelera + " km/h");
    }

    // b) Agrega un método frenar () que disminuya la velocidad en 5
    public void frenar() {
        float frena = velocidad -= 5;
        System.out.println(modelo + " frena a: " + frena + " km/h");
    }

    public static void main(String[] args) {
        // c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades
        Coche coche1 = new Coche("BMW", "M3 GTR", 260.00f);
        Coche coche2 = new Coche("DMC", "DeLorean DMC-12 Deportivo", 88.00f);

        coche1.acelerar();
        coche1.frenar();
        coche2.acelerar();
        coche2.frenar();
    }
}