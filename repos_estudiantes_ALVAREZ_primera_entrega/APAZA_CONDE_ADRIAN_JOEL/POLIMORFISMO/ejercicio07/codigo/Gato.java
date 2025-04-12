class Gato {
    private String nombre;
    private String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    // b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
    public void hacerSonido() {
        System.out.println(" el gato "+this.nombre+ " dice miau miau");
    }
    public void hacerSonido(int x) {
        System.out.print("el gato "+this.nombre+ " dice ");
        for(int i = 0; i < x; i++) {
            System.out.print("miau");
        }
    }
    // c) Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).
    public void moverse() {
        System.out.println("el gato "+this.nombre + " salta");
    }
    public void mostrar() {
        System.out.println("el gato " + this.nombre + " es de color " + this.color);
    }
}

    


    