#Clase(s)

class Choche:
    def __init__(self,marca,modelo):
        self.__marca = marca
        self.__modelo = modelo
        self.__velocidad = 0
        
    def acelerar(self):
        self.__velocidad += 10
        
    def frenar(self):
        self.__velocidad -= 5
        if(self.__velocidad < 0):
            self.__velocidad = 0
    
    def mostrar_velocidad(self):
        print(f"{self.__marca} - {self.__modelo} - Velocidad: {self.__velocidad} km/h")
        
#Main
coche_1 = Choche("Ford" , "Mustang")
coche_2 = Choche("Toyota" , "Corolla")

#acelerando y frenando coches
coche_1.acelerar()
coche_1.acelerar()
coche_1.frenar()

coche_2.acelerar()
coche_2.acelerar()
coche_2.frenar()
coche_2.acelerar()

#mostrando sus velocidades
coche_1.mostrar_velocidad()
coche_2.mostrar_velocidad()