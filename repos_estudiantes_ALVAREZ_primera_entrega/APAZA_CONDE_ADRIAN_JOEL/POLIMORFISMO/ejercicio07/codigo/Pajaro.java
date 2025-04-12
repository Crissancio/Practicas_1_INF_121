class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    // b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
    public void hacerSonido() {
        System.out.println("el pajaro "+this.nombre + " dice gurgur ");
    }
    public void hacerSonido(int y) {
        System.out.print("el pajaro "+this.nombre + " dice ");
        for(int i = 0; i < y; i++) {
            System.out.print("gur");
        }
    }
    // c) Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).
    public void moverse() {
        System.out.println("el pájaro "+this.nombre+ " vuela");
    }
    public void mostrar() {
        System.out.println("el pajaro: " + this.nombre + " de tipo: " + this.tipo);
    }
}

