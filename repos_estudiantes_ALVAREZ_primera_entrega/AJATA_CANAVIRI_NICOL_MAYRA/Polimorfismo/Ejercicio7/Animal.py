class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hacerSonido(self):
        print("Sonido del animal")

    def moverse(self):
        print("Movimiento del animal")

class Perro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacerSonido(self):
        print("Perro: ¡Guau!")

    def moverse(self):
        print("Corre")

class Gato(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacerSonido(self):
        print("Gato: ¡Miau!")

    def moverse(self):
        print("Camina y salta")

class Pajaro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacerSonido(self):
        print("Pajaro: ¡Pio pio!")

    def moverse(self):
        print("Vuela")


mi_perro = Perro("Perla")
mi_gato = Gato("Whisky")
mi_pajaro = Pajaro("Roon")


print("Sonidos de los animales:")
mi_perro.hacerSonido()
mi_gato.hacerSonido()
mi_pajaro.hacerSonido()


print("\nMovimientos de los animales:")
mi_perro.moverse()
mi_gato.moverse()
mi_pajaro.moverse()