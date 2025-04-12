class Videojuego:
    def __init__(self, nombre="Desconocido", plataforma="PC", cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    def mostrar(self):
        print(self.__str__())

    def agregarJugadores(self, cantidad=1):
        self.cantidadJugadores += cantidad

    def __str__(self):
        return f"Videojuego - Nombre: {self.nombre}, Plataforma: {self.plataforma}, Jugadores: {self.cantidadJugadores}"


juego1 = Videojuego()
juego2 = Videojuego("FIFA 25", "PlayStation", 4)

juego1.mostrar()
juego2.mostrar()

juego1.agregarJugadores()     # suma 1
juego2.agregarJugadores(3)    # suma 3

print(juego1)
print(juego2)
