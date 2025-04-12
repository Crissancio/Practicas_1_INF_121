
# 1. Crea una clase Persona con nombre, edad y ciudad
#a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
#b) Crea tres personas y muestra su saludo
#c) Agrega un método para verificar si es mayor de edad 



class Persona:
    def __init__(self, edad, nombre, ciudad):
        self.__edad = edad
        self.__nombre = nombre
        self.__ciudad = ciudad

    def mostrar(self):
        return f"Hola, soy {self.__nombre} de {self.__ciudad}"

    def VerificarEdad(self):
        if(self.__edad >= 18):
            print(f"{self.__nombre} es mayor de edad")
        else:
            print(f"{self.__nombre} es menor de edad")
# a) Mostrar saludo
p1 = Persona(21,"carlos","La Paz")
print(p1.mostrar())
# b) Crea 3 persona y su saludo 
p2 = Persona(10,"Mauricio","Beni")
p3 = Persona(18,"Manuel","Santa Cruz")
p4 = Persona(10,"Erland","La Paz")
print(p2.mostrar())
print(p3.mostrar())
print(p4.mostrar())

# c) Verificar si es mayor de edad
p1.VerificarEdad()
p2.VerificarEdad()
p3.VerificarEdad()
p4.VerificarEdad()


