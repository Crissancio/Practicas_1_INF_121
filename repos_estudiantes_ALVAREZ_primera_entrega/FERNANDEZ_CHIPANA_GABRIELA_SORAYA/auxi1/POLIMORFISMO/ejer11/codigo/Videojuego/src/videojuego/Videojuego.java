
package videojuego;

public class Videojuego {
     private String nombre;
     private String plataforma;
     private int cantidadJugadores;
     public Videojuego(String nombre,String plataforma,int cantidadJugadores ){
         this.nombre=nombre;
         this.plataforma=plataforma;
         this.cantidadJugadores=cantidadJugadores;
     }
     public Videojuego(String plataforma,int cantidadJugadores,String nombre){
         this.plataforma=plataforma;
         this.cantidadJugadores=cantidadJugadores;
         this.nombre=nombre;
     }
     public void mostrar (){
         System.out.println(" nombre del juego: "+nombre+" plataforma "+plataforma+" cantidad de jugadores "+cantidadJugadores);
     }
     public void agregarJugadores(){
         cantidadJugadores++;
     }
      public void agregarJugadores(int cantidadJugadores){
         this.cantidadJugadores=cantidadJugadores;
     }
    public static void main(String[] args) {
        Videojuego videojuego1=new Videojuego ( "Mario Bross"," Steam ",4);
        Videojuego videojuego2=new Videojuego ( " Uno ",3,"Pedro");
        videojuego1.mostrar();
        videojuego2.mostrar();
        videojuego1.agregarJugadores();
        videojuego2.agregarJugadores(4);
    }
    
}
