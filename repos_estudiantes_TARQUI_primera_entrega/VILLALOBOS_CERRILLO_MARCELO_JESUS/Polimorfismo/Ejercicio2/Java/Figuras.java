class Cuadrado {
    private int lado;
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    public int area() {
        return lado * lado;
    }
    public void mostrar() {
        System.out.println("Cuadrado: " + lado);
        System.out.println("El area es: " + area());
    }
}
class Rectangulo {
    private int base;
    private int altura;
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int area() {
        return base * altura;
    }
    public void mostrar() {
        System.out.println("Rectángulo: " + base + " " + altura);
        System.out.println("El area es: " + area());
    }
}
class Circulo {
    private int radio;
    public Circulo(int radio) {
        this.radio = radio;
    }
    public double area() {
        return Math.PI * radio * radio;
    }

    public void mostrar() {
        System.out.printf("Círculo: " + radio + "\n");
        System.out.printf("El area es: " + area());
    }
}