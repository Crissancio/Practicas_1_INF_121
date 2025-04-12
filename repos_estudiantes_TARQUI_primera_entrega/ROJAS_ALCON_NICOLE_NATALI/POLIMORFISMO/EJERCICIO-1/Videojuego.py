class Videojuego:
    def __init__(self, nombre, plataforma, cantidadJugadores):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores
    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de jugadores: {self.cantidadJugadores}")
    def agregarJugadores(self, cantidad=1):
        self.cantidadJugadores += cantidad

juego1 = Videojuego("Dragon Ball", "PlayStation", 2)
juego2 = Videojuego("Left4Dead", "PC", 1)

juego1.mostrar()
print()
juego2.mostrar()

juego1.agregarJugadores()      
juego2.agregarJugadores(3)      

print("\nDespués de agregar jugadores:")
juego1.mostrar()
print()
juego2.mostrar()
