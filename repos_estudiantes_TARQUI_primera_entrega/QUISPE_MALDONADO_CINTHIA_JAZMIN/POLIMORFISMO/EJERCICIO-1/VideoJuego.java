/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videojuego;

/**
 *
 * @author CINTHIA
 */
public class VideoJuego {
    private String nombre,plataforma;
    private int cantidadJugadores;
    VideoJuego(String nombre,String plataforma,int cantidadJugadores){
        this.nombre=nombre;
        this.plataforma=plataforma;
        this.cantidadJugadores=cantidadJugadores;
    }
    VideoJuego(String nombre, String plataforma){
        this.nombre=nombre;
        this.plataforma=plataforma;
        this.cantidadJugadores=1;
    }
    
    public void mostrar(){
        System.out.println("Nombre:  "+nombre);
        System.out.println("Plataforma:  "+plataforma);
        System.out.println("Cantidad de Jugadores:  "+cantidadJugadores);
        
    }
    public void agregarJugadores(){
        cantidadJugadores=cantidadJugadores+1;
        System.out.println("Se agrego 1 jugador");
        System.out.println(cantidadJugadores);
        
    }
    public void agregarJugadores(int njuga){
        cantidadJugadores=cantidadJugadores+njuga;
        System.out.println("Se agrego "+njuga+" jugadores");
        System.out.println(cantidadJugadores);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VideoJuego v1=new VideoJuego("Metal Sllu","PS",2);
        VideoJuego v2=new VideoJuego("God of war","Nintendo");
        v1.mostrar();
        System.out.println("----------------");
        v2.mostrar();
        System.out.println("------AGREGANDO JUGADORES----------");
        v1.agregarJugadores(2);
        v1.mostrar();
        
        
        System.out.println("----------------");
        v2.agregarJugadores();
        v2.mostrar();
    }
    
}
