public class Videojuego{
    String nombre;
    String plataforma;
    int cantidaddejugadores;

    public Videojuego(String nombre, String plataforma, int cantidaddejugadores){
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidaddejugadores = cantidaddejugadores;
    }
    public Videojuego(){
        this.nombre = "Desconocido";
        this.plataforma = "PC";
        this.cantidaddejugadores = 1;
    }
    public String mostrar(){
        return "Nombre: "+nombre+" Plataforma: "+plataforma+" Cantidad: "+cantidaddejugadores;
    }
    public int cantidaddeJugadores(){
        this.cantidaddejugadores = cantidaddejugadores + 1;
        return cantidaddejugadores;
    }
    public int cantidaddeJugadores(int cantidad){
        this.cantidaddejugadores = cantidaddejugadores + cantidad;
        return cantidaddejugadores;
    }

    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("FIFA 22", "PlayStation", 4);
        Videojuego juego2 = new Videojuego();

  
    System.out.println(juego1.mostrar());
    System.out.println(juego2.mostrar());

   
    juego1.cantidaddeJugadores(); 
    juego2.cantidaddeJugadores(3); 

    System.out.println(juego1.mostrar());
    System.out.println(juego2.mostrar());
        
    }
    
}