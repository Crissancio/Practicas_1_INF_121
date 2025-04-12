# Clase Persona
class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    # Método para mostrar saludo
    def mostrar_saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    # Método para verificar si es mayor de edad
    def es_mayor_de_edad(self):
        return self.edad >= 18


# Crear tres personas
persona1 = Persona("Ana", 25, "La Paz")
persona2 = Persona("Carlos", 17, "Cochabamba")
persona3 = Persona("María", 30, "Santa Cruz")

# Mostrar el saludo de cada persona
print(persona1.mostrar_saludo())
print(persona2.mostrar_saludo())
print(persona3.mostrar_saludo())

# Verificar si son mayores de edad
print(f"{persona1.nombre} es mayor de edad: {persona1.es_mayor_de_edad()}")
print(f"{persona2.nombre} es mayor de edad: {persona2.es_mayor_de_edad()}")
print(f"{persona3.nombre} es mayor de edad: {persona3.es_mayor_de_edad()}")
