class BloqueCofre {
    private int capacidad;
    private int resistencia;
    private String tipo;
    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }
    public void accionar() {
        System.out.println("Se abre el cofre.");
    }
    public void romper() {
        System.out.println("El cofre se rompió y soltó objetos.");
    }
    public void colocar(String colocar) {
        System.out.println("el bloque se puso en " + colocar);
    }
}
class BloqueTnt {
    private String tipo;
    private int daño;
    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }
    public void accionar() {
        System.out.println("La TNT se encendió.");
    }
    public void romper() {
        System.out.println("¡BOOM! La TNT explotó.");
    }
    public void colocar(String colocar) {
        System.out.println("el bloque se puso en " + colocar);
    }
}
class BloqueHorno {
    private String color;
    private int capacidadDeComida;
    public BloqueHorno(String color, int capacidadDeComida) {
        this.color = color;
        this.capacidadDeComida = capacidadDeComida;
    }
    public void accionar() {
        System.out.println("El horno se enciende para cocinar.");
    }
    public void romper() {
        System.out.println("El horno se rompió.");
    }
    public void colocar(String colocar) {
        System.out.println("el bloque se puso en " + colocar);
    }
}