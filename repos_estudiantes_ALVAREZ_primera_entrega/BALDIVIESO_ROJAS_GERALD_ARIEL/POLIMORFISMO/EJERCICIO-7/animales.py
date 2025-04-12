class Perro:
    def __init__(self, nombre, edad, raza):
        self.__nombre = nombre
        self.__edad = edad
        self.__raza = raza
    
    def hacerSonido(self):
        print(f"{self.__nombre}: guau!! guau!!")

    def moverse(self):
        print(f"{self.__nombre} salta")
        print(f"{self.__nombre} mover")
        print(f"{self.__nombre} nadar")
    
class Gato:
    def __init__(self, nombre, color):
        self.__nombre = nombre
        self.__color = color
    def hacerSonido(self):
        print(f"{self.__nombre}: miau miauuu!!!")
    def moverse(self):
        print(f"{self.__nombre} salta")
        print(f"{self.__nombre} mover")

class Pajaro:
    def __init__(self, nombre, tipo):
        self.__nombre = nombre
        self.__tipo = tipo
    def hacerSonido(self):
        print(f"{self.__nombre}: pio pio!!!!!!!!")
    def moverse(self):
        print(f"{self.__nombre} mover")
        print(f"{self.__nombre} volar")

perro = Perro("bogo", 7,"pastor")
gato = Gato("pendejichi", "negro")
pajaro = Pajaro("paco", "canario")
print("-------------------------")
perro.hacerSonido()
gato.hacerSonido()
pajaro.hacerSonido()
print("-------------------------")
perro.moverse()
print("-------------------------")
gato.moverse()
print("-------------------------")
pajaro.moverse()
