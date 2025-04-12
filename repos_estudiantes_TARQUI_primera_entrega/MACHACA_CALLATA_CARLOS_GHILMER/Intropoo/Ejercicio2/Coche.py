#3. Crea una clase Coche con marca, modelo y velocidad
#a) Agrega un método acelerar () que aumente la velocidad en 10
#b) Agrega un método frenar () que disminuya la velocidad en 5
#c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades



class Coche:

    def __init__(self, marca, modelo, velocidad):
        self.__marca = marca
        self.__modelo = modelo 
        self.__velocidad = velocidad
# a) Crear un método que acelere 
    def acelerar(self):
        self.__velocidad += 10
        return f"El coche {self.__marca} {self.__modelo} ha acelerado a {self.__velocidad} km/h"
# b) Crear un método que frene
    def frenar(self):
        self.__velocidad -= 5
        return f"El coche {self.__marca} {self.__modelo} ha frenado a {self.__velocidad} km/h"

    def mostar(self):
        return f"La velocidad que va {self.__marca} {self.__modelo} es de: {self.__velocidad} km/h"

# c) Crear 2 coches
c1 = Coche("Toyota", "Corolla", 50)
c2 = Coche("Nissan", "Sentra", 80)
print(c1.mostar())
print(c2.mostar())
print("------ COCHE1 ------")
print(c1.acelerar())
print(c1.frenar())

print("------ COCHE2 ------")
print(c2.acelerar())
print(c2.frenar())