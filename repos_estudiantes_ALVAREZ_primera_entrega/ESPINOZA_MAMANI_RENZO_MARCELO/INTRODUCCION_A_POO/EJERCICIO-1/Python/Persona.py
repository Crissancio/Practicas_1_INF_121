class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludo(self):
        print(f"Hola, mi nombre es {self.nombre} de {self.ciudad}")

    def esmayor_de_edad(self):
        return self.edad >= 18
p1 = Persona("Juan", 25, "Madrid")
p2 = Persona("Ana", 17, "Barcelona")
p3 = Persona("Luis", 30, "Valencia")
p1.saludo()
p2.saludo()
p3.saludo()
print(f"{p1.nombre} es mayor de edad: {p1.esmayor_de_edad()}")