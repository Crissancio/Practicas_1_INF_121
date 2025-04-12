class Videojuego:
    # (b) Sobrecargar el constructor 2 veces usando métodos de clase
    def __init__(self, nombre="", plataforma="", cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    @classmethod
    def desde_nombre(cls, nombre):
        return cls(nombre=nombre)

    @classmethod
    def desde_nombre_plataforma(cls, nombre, plataforma):
        return cls(nombre=nombre, plataforma=plataforma)

    # (c) Implementar un método mostrar()
    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de Jugadores: {self.cantidadJugadores}")

    # (d) Sobrecargar el método agregarJugadores()
    def agregarJugadores(self, cantidad=1):
        self.cantidadJugadores += cantidad


# (a) Instanciar al menos 2 videojuegos
juego1 = Videojuego.desde_nombre("Minecraft")
juego2 = Videojuego.desde_nombre_plataforma("FIFA 23", "PS5")

# Mostrar datos iniciales
juego1.mostrar()
print("-----")
juego2.mostrar()
print("-----")

# (d) Usar la sobrecarga de agregarJugadores()
juego1.agregarJugadores()          # Agrega 1 jugador
juego2.agregarJugadores(3)         # Agrega 3 jugadores

# Mostrar datos después de agregar jugadores
juego1.mostrar()
print("-----")
juego2.mostrar()
