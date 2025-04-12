/*
1.Sea la clase Videojuego:
   a)Instanciar al menos 2 videojuegos
   b)Sobrecargar el constructor 2 veces
   c)Implementar un método mostrar()
   d)Sobrecargar el método agregarJugadores() 
     donde en el primero se agregue 
     solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar. 
*/
package Ejercicios;

public class VideoJuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public VideoJuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
    }

    public VideoJuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    
    public void mostrar(){
        System.out.println("Nombre del Video Juego: "+nombre);
        System.out.println("plataforma: "+plataforma);
        System.out.println("Cantidad de Jugadores: "+cantidadJugadores);
    }
    
    public void agreagarJugadores(){
        cantidadJugadores++;
        System.out.println("Se a agregado un jugador.Total de jugadores: "+cantidadJugadores);
    }
    
    public void agregarJugadores(int cantidad){
        if (cantidad>0) {
            cantidadJugadores+=cantidad;
            //cantidadJugadores = cantidadJugadores + cantidad;
            System.out.println("Se han agregado " + cantidad + " jugadores. Total de jugadores: " + cantidadJugadores);
        }else{
            System.out.println("Cantidad de jugadores invalida.");
        }
    }
    
    public static void main(String[] args) {
        VideoJuego juego1 = new VideoJuego("Mario", "Nintendo");
        VideoJuego juego2 = new VideoJuego("Efotball", "ps5",10);
        
        System.out.println("Información del primer videojuego:");
        juego1.mostrar();
        System.out.println();

        System.out.println("Información del segundo videojuego:");
        juego2.mostrar();
        System.out.println();

        // Agregar jugadores
        juego1.agreagarJugadores();  // Agregar 1 jugador
        juego2.agregarJugadores(3); // Agregar 3 jugadores

        // Mostrar la información actualizada de los videojuegos
        System.out.println("\nInformación actualizada del primer videojuego:");
        juego1.mostrar();
        System.out.println();

        System.out.println("Información actualizada del segundo videojuego:");
        juego2.mostrar();
                
    }
}
