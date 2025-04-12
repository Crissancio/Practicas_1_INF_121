class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def mostrar_saludo(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    def veri_edad(self, p):
        if p.edad > 18:
            print("Es mayor de edad")
        else:
            print("No es mayor de edad")


persona1 = Persona("Jimmy", 25, "La Paz")
persona2 = Persona("Ana", 17, "Cochabamba")
persona3 = Persona("Carlos", 30, "Santa Cruz")

persona1.mostrar_saludo()
persona2.mostrar_saludo()
persona3.mostrar_saludo()

print("---------******----------")

print(f"¿{persona1.nombre} es mayor de edad?")
persona1.veri_edad(persona1)
print(f"¿{persona2.nombre} es mayor de edad?")
persona2.veri_edad(persona2)
print(f"¿{persona3.nombre} es mayor de edad?")
persona3.veri_edad(persona3)