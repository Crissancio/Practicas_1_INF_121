public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Pan", 10);
        Producto p2 = new Producto("Leche", 15);
        Producto p3 = new Producto("Queso", 20);
        p1.aplicarDescuento();
        p2.aplicarDescuento();
        p3.aplicarDescuento();
        System.out.println(p1.precio);
        System.out.println(p2.precio);
        System.out.println(p3.precio);
        Producto a = new Producto("Jugo", 12);
        Producto b = new Producto("Galletas", 13);
        Producto c = new Producto("Café", 22);
        Producto d = new Producto("Arroz", 19);
        a.aplicarDescuento();
        b.aplicarDescuento();
        c.aplicarDescuento();
        d.aplicarDescuento();
        double total = a.precio + b.precio + c.precio + d.precio;
        System.out.println("Suma total: " + total);
    }
}