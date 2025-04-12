public class VideoJuego 
{
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    
    public VideoJuego()
    {
        this.nombre = "call of duty";
        this.plataforma = "PC";
        this.cantidadJugadores = 500;
    }
    
    public VideoJuego(String nombre, String plataforma, int cantidadJugadores)
    {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    
    public void mostrar() 
    {
        System.out.println("Nombre: " + nombre + ", Plataforma: " + plataforma + ", Jugadores: " + cantidadJugadores);
    }
    
    public void agregarJugadores() 
    {
        this.cantidadJugadores += 1;
    }
    
    public void agregarJugadores(int cantidad) 
    {
        this.cantidadJugadores += cantidad;
    }
 
    public static void main(String[] args) 
    {
        VideoJuego videojuego1 = new VideoJuego();
        VideoJuego videojuego2 = new VideoJuego("Cyberpunk 2077", "PC", 1000);

        System.out.println("Detalles iniciales de los videojuegos:");
        videojuego1.mostrar();
        videojuego2.mostrar();

        videojuego1.agregarJugadores();
        videojuego2.agregarJugadores(5);

        System.out.println("\nDetalles despues de agregar jugadores:");
        videojuego1.mostrar();
        videojuego2.mostrar();
    }    
}
