class Videojuego:
    def __init__(self, nombre="Desconocido", plataforma="online", cantidadJugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadJugadores = cantidadJugadores

    def mostrar(self):
        print(self)

    def agregarJugadores(self, cantidad=None):
        if cantidad is None:
            self.cantidadJugadores += 1
        else:
            self.cantidadJugadores += cantidad

    def __str__(self):
        return f"Videojuego(nombre='{self.nombre}', plataforma='{self.plataforma}', cantidadJugadores={self.cantidadJugadores})"

#---------------------------- Main
if __name__ == "__main__":
    v1 = Videojuego("call", "pubg", 1)
    v2 = Videojuego("Minecraft")

    v1.mostrar()
    v2.agregarJugadores(3)
    v2.mostrar()
