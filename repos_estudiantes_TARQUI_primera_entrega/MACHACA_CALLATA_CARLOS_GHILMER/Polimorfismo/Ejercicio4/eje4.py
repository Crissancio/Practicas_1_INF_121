
#7. Se hace referencia a algunos animales mediante las siguientes clases:
#a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
#b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
#característico.
#c) Implementar un método moverse() que indique cómo se mueve cada animal
#(correr, saltar, volar, etc.).



class Perro:
    def __init__(self, nombre, edad, raza):
        self.__nombre = nombre
        self.__edad = edad
        self.__raza = raza

    def hacerSonido(self):
        return ("Perro:\n"
                f" Nombre: {self.__nombre}\n"
                f" Sonido: guau guau!!!\n") 

    def moverse(self):
        return ("Perro:\n"
                f" Nombre: {self.__nombre}\n"
                f" Moverse: correr\n") 

class Gato:
    def __init__(self, nombre, color):
        self.__nombre = nombre
        self.__color = color

    def hacerSonido(self):
        return ("Gato:\n"
                f" Nombre: {self.__nombre}\n"
                f" Sonido: miau maiau!!!\n") 
        

    def moverse(self):
        return ("Gato:\n"
                f" Nombre: {self.__nombre}\n"
                f" Moverse: Saltar\n") 

class Pajaro:
    def __init__(self, nombre, tipo):
        self.__nombre = nombre
        self.__tipo = tipo

    def hacerSonido(self):
        return ("Pajaro:\n"
                f" Nombre: {self.__nombre}\n"
                f" Sonido: pio pio!!!\n") 

    def moverse(self):
        return ("Pajaro:\n"
                f" Nombre: {self.__nombre}\n"
                f" Moverse: volar\n") 

perro = Perro("sparky", 5, "labrador")
gato = Gato("jacks", "blanco")
pajaro = Pajaro("paco", "canario")
print(perro.hacerSonido())
print(perro.moverse())
print("------------------------------") 
print(gato.hacerSonido())
print(gato.moverse())
print("------------------------------")
print(pajaro.hacerSonido())
print(pajaro.moverse())
    