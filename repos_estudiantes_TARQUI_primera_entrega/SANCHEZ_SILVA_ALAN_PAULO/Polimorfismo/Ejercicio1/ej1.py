from multimethod import multimethod

class Videojuego:
    
    @multimethod
    def __init__(self, nombre:str, plataforma:str, cantidadJugadores:int):
        self.__nombre = nombre
        self.__plataforma = plataforma
        self.__cantidadJugadores = cantidadJugadores
    
    @multimethod
    def __init__(self):
        self.__nombre = ""
        self.__plataforma = ""
        self.__cantidadJugadores = 0
        
    @multimethod
    def __init__(self, plataforma:str , cantidadJugadores:int):
        self.__plataforma = plataforma
        self.__cantidadJugadores = cantidadJugadores
        self.__nombre = ""
        
    def instanciarJuego(self):
        self.__nombre = input("Ingrese el nombre del videojuego: ")
        self.__plataforma = input("Ingrese la plataforma: ")
        self.__cantidadJugadores = int(input("Ingrese la cantidad de jugadores: "))
    
    def mostrar(self):
        print("-----Videojuego-------")
        if self.__nombre == "" :
            self.__nombre = input("Ingrese el nombre del videojuego: ")
        
        print(
            f'''
            Nombre del videojuego: {self.__nombre}
            Plataforma: {self.__plataforma}
            Cantidad de jugadores: {self.__cantidadJugadores}
            '''
        ) 
        
    @multimethod
    def agregarJugadores(self):
        while self.__cantidadJugadores !=1 :
            self.__cantidadJugadores = int(input("Ingrese solamente un jugador para crear el juego: "))
            
        
    @multimethod
    def agregarJugadores(self, cantidad:int):
        self.__cantidadJugadores += cantidad
        return self.__cantidadJugadores
    
    

#Main
videojuego_1 =Videojuego("Rocket League","PC",2)
videojuego_1.agregarJugadores(3)
videojuego_1.mostrar()

videojuego_2 = Videojuego()
videojuego_2.instanciarJuego()
videojuego_2.agregarJugadores()
videojuego_2.mostrar()
