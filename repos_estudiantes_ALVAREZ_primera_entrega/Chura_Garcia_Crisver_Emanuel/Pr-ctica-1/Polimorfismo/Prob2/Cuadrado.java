//2. Sean las siguientes clases que hacen referencia a diferentes tipos de figura:
public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // b) Implementar un método mostrar() en cada clase para imprimir sus
    // dimensiones y área.
    public void mostrar() {
        int area = lado * lado;
        System.out.println("Dimención del cuadrado: " + lado + ", su área es: " + area);
    }
}