//2. Sean las siguientes clases que hacen referencia a diferentes tipos de figura:
public class Main {
    public static void main(String[] args) {
        // a) Instanciar 1 Cuadrado, 1 Rectángulo y 1 Círculo
        Cuadrado cuadrado = new Cuadrado(7);
        Rectangulo rectangulo = new Rectangulo(5, 8);
        Circulo circulo = new Circulo(21);
        // c)Sobrecargar el método Área para mostrar el área de todas las figuras.
        cuadrado.mostrar();
        rectangulo.mostrar();
        circulo.mostrar();
    }
}
