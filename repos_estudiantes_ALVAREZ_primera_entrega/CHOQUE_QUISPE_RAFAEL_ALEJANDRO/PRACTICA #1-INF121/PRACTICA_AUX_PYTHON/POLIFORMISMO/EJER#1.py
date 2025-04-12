from multipledispatch import dispatch

class Videojuego:
    @dispatch(str)
    def __init__(self, titulo):
        self.titulo = titulo
        self.genero = None
        self.jugadores = 1

    @dispatch(str, str)
    def __init__(self, titulo, genero):
        self.titulo = titulo
        self.genero = genero
        self.jugadores = 1

    @dispatch(str, str, int)
    def __init__(self, titulo, genero, jugadores):
        self.titulo = titulo
        self.genero = genero
        self.jugadores = jugadores

    def mostrar(self):
        print("Titulo: " + self.titulo)
        if self.genero is not None:
            print("Genero: " + self.genero)
        print("Jugadores: " + str(self.jugadores))

    @dispatch()
    def agregarJugadores(self):
        self.jugadores += 1

    @dispatch(int)
    def agregarJugadores(self, cantidad):
        self.jugadores += cantidad

if __name__ == "__main__":
    juego1 = Videojuego("Mario Kart")
    juego2 = Videojuego("Zelda", "Aventura")
    juego3 = Videojuego("FIFA", "Deportes", 4)
    
    print("--- Informacion inicial ---")
    juego1.mostrar()
    juego2.mostrar()
    juego3.mostrar()
    
    juego1.agregarJugadores()
    juego2.agregarJugadores(3)
    
    print("\n--- Despues de agregar jugadores ---")
    juego1.mostrar()
    juego2.mostrar()