class VideoJuego {
    private String nombre;
    private  String plataforma;
    private int cantidadJugadores;
     // b) Sobrecargado el constructor 1 vez
    public VideoJuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        cantidadJugadores = 1;
    }
     // b) Sobrecargardo el constructor 2 veces
    public VideoJuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    // c) Implementar un método mostrar()
    public void mostrar() {
        System.out.println("nombre del juego : " + nombre);
        System.out.println("plataforma del juego : " + plataforma);
        System.out.println("jugadores del juego: " + cantidadJugadores);
    }
    // d) Sobrecargar el método agregarJugadores() donde en el primero se agregue solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
      public void agregarJugadores() {
        cantidadJugadores = cantidadJugadores + 1 ;
        System.out.println("se agrego solo un nuevo jugador, el  total es: " + cantidadJugadores);
    }

    public void agregarJugadores(int c) {
        cantidadJugadores = cantidadJugadores +  c;
        System.out.println("se agrego " + c + " jugadores, el total es: " + cantidadJugadores);
    }
}

