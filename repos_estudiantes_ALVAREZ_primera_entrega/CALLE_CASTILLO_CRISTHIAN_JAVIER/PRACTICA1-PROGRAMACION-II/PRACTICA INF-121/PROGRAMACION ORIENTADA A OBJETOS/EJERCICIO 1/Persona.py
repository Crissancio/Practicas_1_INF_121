class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludar(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    def es_mayor_de_edad(self):
        return self.edad >= 18

persona1 = Persona("Ana", 22, "La Paz")
persona2 = Persona("Luis", 17, "Cochabamba")
persona3 = Persona("Maria", 30, "Santa Cruz")

personas = [persona1, persona2, persona3]
for persona in personas:
    persona.saludar()
    if persona.es_mayor_de_edad():
        print(f"{persona.nombre} es mayor de edad.")
    else:
        print(f"{persona.nombre} NO es mayor de edad.")
