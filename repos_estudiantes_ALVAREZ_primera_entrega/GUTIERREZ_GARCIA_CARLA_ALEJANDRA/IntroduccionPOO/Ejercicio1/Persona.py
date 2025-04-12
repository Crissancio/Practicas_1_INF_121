class Persona:
    # Crea una clase Persona con nombre, edad y ciudad
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    # a) Agrega un método para mostrar el saludo
    def saludo(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    # c) Agrega un método para verificar si es mayor de edad
    def verificar_mayor_edad(self):
        if self.edad >= 18:
            print("Mayor de edad")
        else:
            print("Menor de edad")


# b) Crea tres personas y muestra su saludo
if __name__ == "__main__":
    p1 = Persona("Carol", 18, "La Paz")
    p2 = Persona("Maria", 22, "Cochabamba")
    p3 = Persona("Juan", 15, "Chuquisaca")

    p1.saludo()
    p2.saludo()
    p3.saludo()

    p1.verificar_mayor_edad()
    p2.verificar_mayor_edad()
    p3.verificar_mayor_edad()