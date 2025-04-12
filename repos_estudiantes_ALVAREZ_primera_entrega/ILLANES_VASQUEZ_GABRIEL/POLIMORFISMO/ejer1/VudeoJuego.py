class VideoJuego:
    def __init__(self, nombre="GodOfWar", plataforma="play", cantJuga=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantJuga = cantJuga

    def agregarJuga(self):
        self.cantJuga += 1

    def agregar(self, cantidad):
        self.cantJuga += cantidad

    def mostrar(self):
        print("nombre", self.nombre)
        print("pltaforma", self.plataforma)
        print("cnatidad de jugadores:", self.cantJuga)

def main():
    juego1 = VideoJuego()
    juego2 = VideoJuego("FIFA 24", "play", 2)

    juego1.mostrar()
    juego2.mostrar()

    juego1.agregar(1)
    juego2.agregar(3)

    juego1.mostrar()
    juego2.mostrar()

if __name__ == "__main__":
    main()
