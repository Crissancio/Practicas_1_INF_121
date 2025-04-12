class Videojuego:
    def __init__(self, nombre="Sin nombre", genero="Desconocido", jugadores=0):
        self.nombre = nombre
        self.genero = genero
        self.jugadores = jugadores

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Género: {self.genero}, Jugadores: {self.jugadores}")

    # Sobrecarga mediante argumentos opcionales
    def agregar_jugadores(self, cantidad=1):
        self.jugadores += cantidad


def main():
    v1 = Videojuego("Minecraft")
    v2 = Videojuego("FIFA", "Deportes", 4)

    v1.agregar_jugadores()        # agrega 1 jugador
    v2.agregar_jugadores(3)       # agrega 3 jugadores

    v1.mostrar()
    v2.mostrar()

if __name__ == "__main__":
    main()
