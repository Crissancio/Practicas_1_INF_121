class BloqueCofre {
    private int capacidad;
    private int resistencia;
    private String tipo;
    
    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }
    // b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
    public void accion() {
        System.out.println("el cofre de " + tipo + " se abre con capacidad para " + capacidad + " objetos");
    }
    // c) Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
    public void colocar() {
        System.out.println("colocando al suelo");
    }
    public void colocar(String n) {
        System.out.println("colocado al " + n);
    }
    // d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
    public void romper() {
        System.out.println("rompiendo el cofre");
    }
}

