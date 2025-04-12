class Perro:
    def __init__(self, nombre, raza, edad):
        self.nombre = nombre
        self.raza = raza
        self.edad = edad
    def hacerSonido(self):
        print ("Guau!")
    def moverse(self):
        print("El perro corre")
    def mostrar(self):
        print("Nombre: ", self.nombre, "Raza: ", self.raza, "Edad: " ,self.edad)
class Gato:
    def __init__(self, nombre, color):
        self.nombre = nombre
        self.color = color
    def hacerSonido(self):
        print("Miauuu")
    def moverse(self):
        print("El gato salta")
    def mostrar(self):
        print("Nombre: ", self.nombre, "Color: ", self.color)
class Pajaro:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo
    def hacerSonido(self):
        print("Pio Pio")
    def moverse(self):
        print("El pájaro vuela")
    def mostrar(self):
        print("Nombre: ", self.nombre, "Tipo: ", self.tipo)
perro1 = Perro("Firulais", "Labrador", 3)
gato1 = Gato("Michi", "Blanco")
pajaro1 = Pajaro("Piolín", "Canario")
perro1.hacerSonido()
perro1.moverse()
perro1.mostrar()
gato1.hacerSonido()
gato1.moverse()
gato1.mostrar()
pajaro1.hacerSonido()
pajaro1.moverse()
pajaro1.mostrar()