class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.__nombre = nombre
        self.__edad = edad
        self.__ciudad = ciudad

    def saludar(self):
        return f"Hola, soy {self.__nombre} de {self.__ciudad}"

    def es_mayor_de_edad(self):
        return self.__edad >= 18

    def __str__(self):
        return f"Nombre: {self.__nombre}, Edad: {self.__edad}, Ciudad: {self.__ciudad}"

