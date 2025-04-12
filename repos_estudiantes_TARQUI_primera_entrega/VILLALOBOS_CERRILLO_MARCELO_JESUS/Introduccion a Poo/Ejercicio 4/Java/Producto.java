public class Producto {
    private String nombre;
    private double precio;
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void aplicarDescuento() {
        if ((int)precio % 2 == 0) {
            precio = precio * 0.90;
        } else {
            precio = precio * 0.85;
        }
    }
}