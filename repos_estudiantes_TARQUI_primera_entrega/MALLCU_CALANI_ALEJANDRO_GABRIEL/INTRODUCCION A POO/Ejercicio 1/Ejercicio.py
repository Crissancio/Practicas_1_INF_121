class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    def es_mayor_edad(self):
        return self.edad >= 18

# Crear tres personas
persona1 = Persona("Alejandra", 25, "La Paz")
persona2 = Persona("Carlos", 16, "Cochabamba")
persona3 = Persona("Luis", 30, "Santa Cruz")

# Mostrar saludo de cada persona
print(persona1.saludo())  # Hola, soy Alejandra de La Paz
print(persona2.saludo())  # Hola, soy Carlos de Cochabamba
print(persona3.saludo())  # Hola, soy Luis de Santa Cruz

# Verificar si son mayores de edad
print(persona1.nombre, "es mayor de edad?", persona1.es_mayor_edad())
print(persona2.nombre, "es mayor de edad?", persona2.es_mayor_edad())
print(persona3.nombre, "es mayor de edad?", persona3.es_mayor_edad())
