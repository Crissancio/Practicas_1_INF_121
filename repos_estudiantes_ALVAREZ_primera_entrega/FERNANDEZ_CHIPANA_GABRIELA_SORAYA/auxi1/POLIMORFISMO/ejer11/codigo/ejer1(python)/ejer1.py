class Videojuego:
    def __init__(self, nombre, plataforma, cantidad_jugadores):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    def mostrar(self):
        print(f"Nombre del juego: {self.nombre}, Plataforma: {self.plataforma}, Cantidad de jugadores: {self.cantidad_jugadores}")

    def agregar_jugadores(self):
        self.cantidad_jugadores += 1

    def agregar_jugadores_cantidad(self, cantidad_jugadores):
        self.cantidad_jugadores = cantidad_jugadores

# Crear instancias de la clase Videojuego
videojuego1 = Videojuego("Mario Bross", "Steam", 4)
videojuego2 = Videojuego("Uno", "Pedro", 3)

# Mostrar información de los videojuegos
videojuego1.mostrar()
videojuego2.mostrar()

# Agregar jugadores
videojuego1.agregar_jugadores()
videojuego2.agregar_jugadores_cantidad(4)

# Mostrar la nueva cantidad de jugadores
videojuego1.mostrar()
videojuego2.mostrar()
