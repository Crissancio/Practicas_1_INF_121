class BloqueTNT {
   private String tipo;
    private int daño;
    
    public BloqueTNT(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }
    // b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
    public void accion() {
        System.out.println("TNT de " + tipo + " está explotando con un daño de " + daño);
    }
    // c) Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
    public void colocar() {
        System.out.println("colocada al suelo");
    }
    public void colocar(String x) {
        System.out.println("colocada al " + x);
    }
    // d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
    public void romper() {
        System.out.println("¡boom! daño con " + daño + " puntos de daño");
    }
}

