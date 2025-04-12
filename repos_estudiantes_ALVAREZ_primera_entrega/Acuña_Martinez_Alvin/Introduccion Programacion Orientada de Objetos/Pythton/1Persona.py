# Clase Persona
class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    # a) Método para mostrar el saludo
    def saludar(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    # c) Método para verificar si es mayor de edad
    def es_mayor_de_edad(self):
        return self.edad >= 18

# b) Crear tres personas con edades distintas
persona1 = Persona("Emilia", 21, "Buenos Aires")
persona2 = Persona("Mateo", 19, "Bogotá")
persona3 = Persona("Valentina", 17, "Santiago")

# Mostrar saludos y verificar si son mayores de edad
personas = [persona1, persona2, persona3]

for persona in personas:
    print(persona.saludar())
    print("¿Mayor de edad?", "Sí" if persona.es_mayor_de_edad() else "No")
    print()
