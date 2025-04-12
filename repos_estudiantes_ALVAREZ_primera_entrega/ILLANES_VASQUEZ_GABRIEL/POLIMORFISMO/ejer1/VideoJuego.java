
package Ejercicio2_1;

public class VideoJuego {
    private String nombre; 
    private String plataforma;
    private int cantJuga;
    
    public VideoJuego(){
    this.nombre="GodOfWar";
    this.plataforma="play";
    this.cantJuga=0;
}

public VideoJuego(String nombre, String plataforma, int cantJuga){
    this.nombre=nombre;
    this.plataforma=plataforma;
    this.cantJuga=cantJuga;
}

public void agregarJuga(){
    cantJuga +=1;
}
public void agregar(int cantidad){
    cantJuga += cantidad;

}

public void mostrar(){
    System.out.println("nombre " + nombre);
    System.out.println("pltaforma " + plataforma);
    System.out.println("cnatidad de jugadores: " + cantJuga);
}
public static void main(String[] args) {

        
        VideoJuego juego1 = new VideoJuego(); 
        VideoJuego juego2 = new VideoJuego("FIFA 24", "play", 2); 
        juego1.mostrar();
        juego2.mostrar();

        
        juego1.agregar(1); 
        juego2.agregar(3); 

        
        juego1.mostrar();
        juego2.mostrar();
    }




}

