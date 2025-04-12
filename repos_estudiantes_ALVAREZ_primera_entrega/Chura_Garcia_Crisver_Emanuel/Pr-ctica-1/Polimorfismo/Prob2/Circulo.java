//2. Sean las siguientes clases que hacen referencia a diferentes tipos de figura:
public class Circulo {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    // b) Implementar un método mostrar() en cada clase para imprimir sus
    // dimensiones y área.
    public void mostrar() {
        double area = Math.PI * (radio * radio);
        System.out.println("Dimencion del circulo con radio: " + radio + ", de área: " + area);
    }
}
