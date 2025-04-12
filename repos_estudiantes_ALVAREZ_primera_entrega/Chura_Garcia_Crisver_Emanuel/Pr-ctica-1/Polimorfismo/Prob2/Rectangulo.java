//2. Sean las siguientes clases que hacen referencia a diferentes tipos de figura:
public class Rectangulo {
    private int altura;
    private int base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    // b) Implementar un método mostrar() en cada clase para imprimir sus
    // dimensiones y área.
    public void mostrar() {
        int area = base * altura;
        System.out.println(
                "Dimencion del rectangulo: base: " + base + ", altura: " + altura + ". Su área es de: " + area);
    }
}
