class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def mostrar(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    def mayor(self):
        if self.edad < 18 and self.edad >= 0:
            print("Es menor de edad")
        elif self.edad >= 18:
            print("Es mayor de edad")
        else:
            print("Edad inválida")

if __name__ == "__main__":
    p1 = Persona("Jhon", 11, "La Paz")
    p2 = Persona("Efrain", 18, "Cochabamba")
    p1.mostrar()
    p1.mayor()
    p2.mostrar()
    p2.mayor()
