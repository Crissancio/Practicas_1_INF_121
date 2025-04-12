# 1. Sea la clase Videojuego
from multimethod import multimethod
class Videojuego:
    def __init__(self, nombre, plataforma, cantidad_jugadores):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    def mostrar(self):
        print(f"Videojuego: {self.nombre}, de plataforma: {self.plataforma}, jugadores en juego: {self.cantidad_jugadores}")

    @multimethod
    def agregar_jugadores(self):
        print(f"El videojuego: {self.nombre}, de plataforma: {self.plataforma}, se integró 1 jugador, ahora son: {self.cantidad_jugadores + 1} jugadores en juego")

    @multimethod
    def agregar_jugadores(self, nueva_cantidad_de_jugadores: int):
        if nueva_cantidad_de_jugadores > 1:
            print(f"El videojuego: {self.nombre}, de plataforma: {self.plataforma}, se integraron {nueva_cantidad_de_jugadores} jugadores, ahora son: {self.cantidad_jugadores + nueva_cantidad_de_jugadores} jugadores en juego")
        else:
            self.agregar_jugadores()

if __name__ == "__main__":
    # a) Instanciar al menos 2 videojuegos
    # b) Sobrecargar el constructor 2 veces
    vid1 = Videojuego("Tetris", "Móvil", 1)
    vid2 = Videojuego("Teenage Mutant Ninja Turtles", "Arcade", 1)

    # c) Implementar un método mostrar()
    vid1.mostrar()
    vid2.mostrar()

    # d) Sobrecargar el método agregar_jugadores()
    vid1.agregar_jugadores()
    vid2.agregar_jugadores(3)