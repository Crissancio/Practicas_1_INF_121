class BloqueHorno {
    private String color;
    private int capacidadComida;
    
    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }
    // b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
    public void accion() {
        System.out.println("el horno de " + color + " esta cocinando con una capacidad de " + capacidadComida + " alimentos");
    }
    // c) Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
    public void colocar() {
        System.out.println("colocado al suelo");
    }
    public void colocar(String a) {
        System.out.println("colocado al " + a);
    }
    // d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
    public void romper() {
        System.out.println("rompiendo el horno.");
    }
}