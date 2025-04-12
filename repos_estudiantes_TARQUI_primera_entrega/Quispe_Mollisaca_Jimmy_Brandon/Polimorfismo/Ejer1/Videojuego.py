class Videojuego:
    def __init__(self, nombre="Rocket League", plataforma="PlayStation", cantidadJugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    def mostrar(self):
        print(f"Videojuego [nombre={self.nombre}, plataforma={self.plataforma}, cantidadJugadores={self.cantidadJugadores}]")

    def agregarJugadores(self):
        self.cantidadJugadores += 1
        print(f"Se agregó 1 jugador. Total ahora: {self.cantidadJugadores}")

    def agregarJugadoresCantidad(self, nuevosJugadores):
        self.cantidadJugadores += nuevosJugadores
        print(f"Se agregaron {nuevosJugadores} jugadores. Total ahora: {self.cantidadJugadores}")


v1 = Videojuego("Minecraft", "PC", 5)
v2 = Videojuego("FIFA 23", "PlayStation")

print("--- Videojuego 1 ---")
v1.mostrar()
print("--- Videojuego 2 ---")
v2.mostrar()

v1.agregarJugadores()
v1.agregarJugadoresCantidad(3)

v2.agregarJugadores()
v2.agregarJugadoresCantidad(4)