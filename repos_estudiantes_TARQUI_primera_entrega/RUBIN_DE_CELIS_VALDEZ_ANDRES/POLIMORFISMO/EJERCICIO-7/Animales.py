class Perro:
    def __init__(self, nombre, edad, raza):
        self.nombre = nombre
        self.edad = edad
        self.raza = raza

    def hacerSonido(self):
        print(f"{self.nombre} dice: ¡Guau guau!")

    def moverse(self):
        print(f"{self.nombre} está corriendo.")

class Gato:
    def __init__(self, nombre, color):
        self.nombre = nombre
        self.color = color

    def hacerSonido(self):
        print(f"{self.nombre} dice: ¡Miau miau!")

    def moverse(self):
        print(f"{self.nombre} está saltando.")

class Pajaro:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo

    def hacerSonido(self):
        print(f"{self.nombre} dice: ¡Pío pío!")

    def moverse(self):
        print(f"{self.nombre} está volando.")

perro1 = Perro("Max", 3, "Labrador")
gato1 = Gato("Mimi", "Gris")
pajaro1 = Pajaro("Piolín", "Canario")

perro1.hacerSonido()
gato1.hacerSonido()
pajaro1.hacerSonido()

perro1.moverse()
gato1.moverse()
pajaro1.moverse()