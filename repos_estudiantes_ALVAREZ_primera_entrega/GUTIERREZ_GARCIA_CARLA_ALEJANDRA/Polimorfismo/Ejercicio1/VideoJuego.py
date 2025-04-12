class Videojuego:
    def __init__(self, nombre="sinNombre", plataforma="sinPlataforma", cantidad_jugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de Jugadores: {self.cantidad_jugadores}")

    def agregar_un_jugador(self):
        self.cantidad_jugadores += 1
        print(f"Se agregó 1 jugador. Total jugadores: {self.cantidad_jugadores}")

    def agregar_varios_jugadores(self, cantidad):
        self.cantidad_jugadores += cantidad
        print(f"Se agregaron {cantidad} jugadores. Total jugadores: {self.cantidad_jugadores}")


if __name__ == "__main__":
    juego1 = Videojuego("Left 4 Dead", "Steam", 4)
    juego2 = Videojuego("Call of Duty", "PC")

    # Agregar jugadores
    juego1.agregar_un_jugador()
    juego1.agregar_varios_jugadores(3)
    juego2.agregar_un_jugador()
    juego2.agregar_varios_jugadores(5)

    # Mostrar información de los videojuegos
    juego1.mostrar()
    juego2.mostrar()