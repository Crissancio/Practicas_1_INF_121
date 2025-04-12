//4. Crea una clase Producto con nombre, y precio
public class Producto {
    private String nombre;
    private float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // a) Agrega un método para aplicar un descuento del 10% si su precio es par,
    // caso contrario del 15%
    public float Descuento() {
        if (precio % 2 == 0) {
            System.out.println("Sea aplica descuento del 10%");
            return precio - (precio * (10.00f / 100.00f));
        } else {
            System.out.println("Sea aplica descuento del 15%");
            return precio - (precio * (15.00f / 100.00f));
        }
    }

    public static void main(String[] args) {
        // b) Crea tres productos, aplica descuentos y muestra los precios
        Producto prod1 = new Producto("Lata de atún", 24.00f);
        Producto prod2 = new Producto("Mochila de viaje", 30.55f);
        Producto prod3 = new Producto("Videojuego", 79.99f);

        System.out.println(prod1.Descuento());
        System.out.println(prod2.Descuento());
        System.out.println(prod3.Descuento());

        // c) Crea cuatro productos, aplica descuentos y muestra la suma de sus precios
        Producto prod4 = new Producto("Laptop", 1800.00f);
        Producto prod5 = new Producto("Sandia", 25.00f);
        Producto prod6 = new Producto("Refresco", 10.00f);
        Producto prod7 = new Producto("Galletas", 17.00f);

        float total = prod4.Descuento() + prod5.Descuento() + prod6.Descuento() + prod7.Descuento();

        System.out.println("La suma de los precios es de: " + total);
    }
}