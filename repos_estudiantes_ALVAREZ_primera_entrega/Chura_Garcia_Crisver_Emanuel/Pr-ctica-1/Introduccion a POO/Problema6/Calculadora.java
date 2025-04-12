//6. Crea una clase Calculadora con operaciones básicas
public class Calculadora {
    // a) Agrega métodos para realizar las operaciones básicas
    public float Suma(float a, float b) {
        return a + b;
    }

    public float Resta(float a, float b) {
        return a - b;
    }

    public float Multiplicacion(float a, float b) {
        return a * b;
    }

    public float Division(float a, float b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        } else {
            return a / b;
        }
    }

    // b) Agrega un método para calcular el promedio de tres números
    public float Promedio(float a, float b, float c) {
        return (a + b + c) / 3;
    }

    // c) Agrega un método para calcular las soluciones de una ecuación cuadrática
    public void Ecuacion_cuadratica(float a, float b, float c) {
        if (a != 0) {
            if (Math.sqrt(b * b + 4 * a * c) > 0) {
                double dis1 = (((-1) * b) + Math.sqrt(b * b + 4 * a * c)) / (2 * a);
                double dis2 = (((-1) * b) - Math.sqrt(b * b + 4 * a * c)) / (2 * a);

                System.out.println("X_1: " + dis1 + " , X_2: " + dis2);
            } else {
                System.out.println("No existen soluciones reales");
            }
        } else {
            System.out.println("Valores infinitos");
        }
    }

    public static void main(String[] args) {
        //d) Realiza operaciones con los métodos y muestra los resultados
        Calculadora calc = new Calculadora();
        float a = 10.00f;
        float b = 8.00f;
        float c = 20.05f;
        System.out.println("Suma: " + calc.Suma(a, b));
        System.out.println("Resta: " + calc.Resta(a, b));
        System.out.println("Multiplicación: " + calc.Multiplicacion(a, b));
        System.out.println("División: " + calc.Division(a, b));
        System.out.println("Promedio: " + calc.Promedio(a, b, c));
        System.out.println("Ecuación cuadratica: ");
        calc.Ecuacion_cuadratica(a, b, c);
    }
}