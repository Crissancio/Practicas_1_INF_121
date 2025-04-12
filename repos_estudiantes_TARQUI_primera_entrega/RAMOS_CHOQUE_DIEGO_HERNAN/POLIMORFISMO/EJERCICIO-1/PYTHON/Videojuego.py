class Videojuego:
    def __init__(self, nombre, plataforma, cantidadJugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Plataforma: {self.plataforma}, Jugadores: {self.cantidadJugadores}")

    def agregarJugadores(self):
        """Agrega 1 jugador por defecto."""
        self.cantidadJugadores += 1

    def agregarJugadoresConCantidad(self, cantidad):
        """Agrega una cantidad específica de jugadores."""
        self.cantidadJugadores += cantidad


juego1 = Videojuego("FIFA 22", "PlayStation", 4)
juego2 = Videojuego("Minecraft", "PC")


juego1.mostrar()
juego2.mostrar()


juego1.agregarJugadores()
juego2.agregarJugadoresConCantidad(3)


juego1.mostrar()
juego2.mostrar()
