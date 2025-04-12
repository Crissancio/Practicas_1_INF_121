public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.sumar(3, 5));
        System.out.println(c.restar(10, 4));
        System.out.println(c.multiplicar(2, 6));
        System.out.println(c.dividir(8, 2));
        System.out.println(c.promedio(4, 6, 8));
        c.cuadratica(1, -5, 6);
    }
}