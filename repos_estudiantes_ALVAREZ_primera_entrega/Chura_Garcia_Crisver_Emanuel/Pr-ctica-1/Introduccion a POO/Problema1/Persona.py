# 1. Crea una clase Persona con nombre, edad y ciudad
class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
    # a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
    def Saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"
    
    def Verificar_edad(self):
        if self.edad >= 18:
            return "Mayor de edad"
        else:
            return "Menor de edad"
        
print("Programa en Python")        
print("b) Crea tres personas y muestra su saludo")        
persona1 = Persona("Crisver", 19, "La Paz")
persona2 = Persona("Crismar", 18, "El Alto")
persona3 = Persona("Samuel", 15, "La Paz")
print(persona1.Saludo())
print(persona2.Saludo())
print(persona3.Saludo())
print("c) Agrega un método para verificar si es mayor de edad")
print(persona1.Verificar_edad())
print(persona2.Verificar_edad())
print(persona3.Verificar_edad())
    
