class Videojuego:
    def __init__(self, nombre="", plataforma="", cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    @classmethod
    def constructor1(cls, nombre, plataforma):
        return cls(nombre, plataforma, 0)

    @classmethod
    def constructor2(cls, nombre, plataforma, cantidadJugadores):
        return cls(nombre, plataforma, cantidadJugadores)
 
    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de jugadores: {self.cantidadJugadores}")

    
    def agregarUnJugador(self):
        self.cantidadJugadores += 1

    def agregarJugadores(self, cantidad):
        self.cantidadJugadores += cantidad


videojuego1 = Videojuego.constructor1("Minecraft", "PC")
videojuego2 = Videojuego.constructor2("FIFA 25", "PlayStation", 4)
videojuego3 = Videojuego.constructor2("Call of Duty", "Xbox", 2)


print("Estado inicial:")
videojuego1.mostrar()
videojuego2.mostrar()
videojuego3.mostrar()


videojuego1.agregarUnJugador()  
videojuego2.agregarJugadores(2)  
videojuego3.agregarUnJugador()  

print("\nDespues de agregar jugadores:")
videojuego1.mostrar()
videojuego2.mostrar()
videojuego3.mostrar()
