class Videojuego:
    def __init__(self, nombre="Desconocido", plataforma="Desconocida", cantidadJugadores= 1):
        self.__nombre = nombre
        self.__plataforma = plataforma
        self.__cantidadJugadores = cantidadJugadores
    def mostrar(self):
        print(f"nombre: {self.__nombre}")
        print(f"plataforma: {self.__plataforma}")
        print(f"Cantidad de jugadores: {self.__cantidadJugadores}")

    def agregarJugadores(self, cantidad = 1):
        self.__cantidadJugadores += cantidad
        print(f"se agregaron {cantidad}")
    
jug1 = Videojuego()
jug2 = Videojuego("pepe", "Steam")
jug3 = Videojuego("due", "Play", 10)

jug1.mostrar()
print()
jug2.mostrar()
print()
jug3.mostrar()

jug1.agregarJugadores()  
jug2.agregarJugadores(3) 

print("\nDespués de agregar jugadores:")
jug1.mostrar()
print()
jug2.mostrar()