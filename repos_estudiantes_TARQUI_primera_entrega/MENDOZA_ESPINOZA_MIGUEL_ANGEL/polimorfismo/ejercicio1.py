class Videojuego:
    def __init__(self, nombre,plataforma,cantidad_jugadores=1):
        self.nombre=nombre
        self.plataforma=plataforma
        self.cantidad_jugadores=cantidad_jugadores
    def mostrar(self):
        print(f"nonbre: {self.nombre}, plataforma: {self.plataforma} , jugadores: {self.cantidad_jugadores}")
    def agregar_jugadores(self, cantidad=1):
        self.cantidad_jugadores += cantidad
juego1=Videojuego("fifa 23","playstation")
juego2=Videojuego("minecraf","pc",4)
juego1.mostrar()
juego2.mostrar()
juego1.agregar_jugadores()
juego2.agregar_jugadores(2)
juego1.mostrar()
juego2.mostrar()
