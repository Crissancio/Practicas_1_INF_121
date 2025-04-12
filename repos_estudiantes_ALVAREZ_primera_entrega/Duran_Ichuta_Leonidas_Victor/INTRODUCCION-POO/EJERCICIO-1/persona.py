#1. Crea una clase Persona con nombre, edad y ciudad
#a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
#b) Crea tres personas y muestra su saludo
#c) Agrega un método para verificar si es mayor de edad

class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludo(self):
        print(f"Hola soy {self.nombre} de {self.ciudad}")

    def verificarEdad(self):
        if self.edad <= 18:
            return print("No es mayor de edad")
        else:
            return print("Es mayor de edad")

persona1 = Persona("Juan", 22, "La Paz")
persona2 = Persona("Marcelo", 17, "Santa Cruz")
persona3 = Persona("Maria", 23, "Oruro")

persona1.saludo()
persona1.verificarEdad()
persona2.saludo()
persona2.verificarEdad()
persona3.saludo()
persona3.verificarEdad()
