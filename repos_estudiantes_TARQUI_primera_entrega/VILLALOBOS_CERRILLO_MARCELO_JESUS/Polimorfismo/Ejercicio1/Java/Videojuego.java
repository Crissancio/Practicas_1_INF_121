class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1;
    }
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    public void mostrar() {
        System.out.println("Videojuego: " + nombre + ", Plataforma: " + plataforma + ", Cantidad de jugadores: " + cantidadJugadores);
    }
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
        System.out.println("Cantidad de jugadores actualizada: " + cantidadJugadores);
    }
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
        System.out.println("Cantidad de jugadores actualizada: " + cantidadJugadores);
    }
}
