class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.__nombre = nombre
        self.__edad = edad
        self.__ciudad = ciudad

    def saludos(self):
        print(f"Hola,soy {self.__nombre} de {self.__ciudad}")

    def compruebaEdadLegal(self):
        if self.__edad >= 18:
            return f"{self.__nombre} es Mayor de Edad"
        else:
            return f"{self.__nombre} no es Mayor de Edad"
p1 = Persona("Fernando", 26, "Lima")
p2 = Persona("Jazmín", 17, "Santa Cruz")
p3 = Persona("Ricardo", 42, "Montevideo")
print("Introducción a POO:")
print("Ejercicio 1:")
print("Salida del Código: ")
print()
print("---------------------------------")
print("Datos de 3 Personas: ")
print("---------------------------------")
p1.saludos()
p2.saludos()
p3.saludos()
print("---------------------------------")
print(p1.compruebaEdadLegal())
print(p2.compruebaEdadLegal())
print(p3.compruebaEdadLegal())
print("---------------------------------")
