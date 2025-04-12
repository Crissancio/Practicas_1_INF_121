class Perro {
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    // b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
    public void hacerSonido() {
        System.out.println("el perro "+this.nombre+ " dice guau guau");
    }

    public void hacerSonido(int n) {
        System.out.print("el perro "+this.nombre+ " dice ");
        for(int i = 0; i < n; i++) {
            System.out.print("guau");
        }
    }
    // c) Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).
        public void moverse() {
        System.out.println("el perro "+this.nombre+ " corre");
    }
    
    public void mostrar() {
        System.out.println("el perro " + this.nombre + " tiene una edad de " + this.edad + " de  raza: " + this.raza);
    }
}

