public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    public int restar(int a, int b) {
        return a - b;
    }
    public int multiplicar(int a, int b) {
        return a * b;
    }
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }
    public double promedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    public void cuadratica(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("No tiene solución real");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Soluciones: " + x1 + " y " + x2);
        }
    }
}