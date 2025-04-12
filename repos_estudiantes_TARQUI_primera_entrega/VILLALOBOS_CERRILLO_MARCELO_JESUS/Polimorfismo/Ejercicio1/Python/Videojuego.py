class Videojuego:
    def __init__(self, nombre, plataforma, cantidadJugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores
    def mostrar(self):
        print("Videojuego: ", self.nombre, "Plataforma: ", self.plataforma, "Cantidad de jugadores: ", self.cantidadJugadores)
    def agregarJugadores(self, cantidad=1):
        self.cantidadJugadores += cantidad
        print(f"Cantidad de jugadores actualizada: {self.cantidadJugadores}")
juego1 = Videojuego("FIFA 24", "PlayStation", 2)
juego2 = Videojuego("Minecraft", "PC")
juego1.mostrar()
juego2.mostrar()
juego1.agregarJugadores()
juego2.agregarJugadores(3) 