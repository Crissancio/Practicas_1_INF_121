class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludo(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    def verificar(self):
        if self.edad >= 18:
            print(f"{self.nombre} es mayor de edad")
        else:
            print(f"{self.nombre} es menor de edad")


# Programa principal
if __name__ == "__main__":
    p = Persona("Gabriela", 20, "El Alto")
    p1 = Persona("Soraya", 17, "Chuquisaca")
    p2 = Persona("Ruddy", 18, "Pando")

    p.saludo()
    p1.saludo()
    p2.saludo()

    p.verificar()
    p1.verificar()
    p2.verificar()
