class Agua {
    private String nombre;
    private int puntosdevida;
    private int nivel;
    public Agua(String nombre, int puntosdevida, int nivel) {
        this.nombre = nombre;
        this.puntosdevida = puntosdevida;
        this.nivel = nivel;
    }
    public void recibirAtaque(int daño) {
        puntosdevida -= daño;
    }
    public void recibirAtaque() {
        puntosdevida -= 5;
    }
    public void atacar() {
        System.out.println(nombre + " lanza un ataque de burbuja");
    }
}
class Fuego {
    private String nombre;
    private int puntosdevida;
    private int nivel;
    private int quemadura;
    public Fuego(String nombre, int puntosdevida, int nivel, int quemadura) {
        this.nombre = nombre;
        this.puntosdevida = puntosdevida;
        this.nivel = nivel;
        this.quemadura = quemadura;
    }
    public void recibirAtaque(int daño) {
        puntosdevida -= daño;
    }
    public void recibirAtaque() {
        puntosdevida -= 5;
    }
    public void atacar() {
        System.out.println(nombre + " lanza una llamarada");
    }
    public void atacar(String ataque) {
        System.out.println(nombre + " usa " + ataque);
    }
}
class Planta {
    private String nombre;
    private int puntosdevida;
    private int nivel;
    public Planta(String nombre, int puntosdevida, int nivel) {
        this.nombre = nombre;
        this.puntosdevida = puntosdevida;
        this.nivel = nivel;
    }
    public void recibirAtaque(int daño) {
        puntosdevida -= daño;
    }

    public void recibirAtaque() {
        puntosdevida -= 5;
    }
    public void atacar() {
        System.out.println(nombre + " usa látigo cepa");
    }
}