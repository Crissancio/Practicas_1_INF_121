class Perro:
    def __init__(self, nombre, edad, raza):
        self.nombre = nombre
        self.edad = edad
        self.raza = raza

    def hacerSonido(self, volumen=None):
        if volumen is None:
            print("El perro ladra: ¡Guau Guau!")
        else:
            print(f"El perro ladra con volumen {volumen}: ¡GUAU GUAU!")

    def moverse(self):
        print("El perro corre")


class Gato:
    def __init__(self, nombre, color):
        self.nombre = nombre
        self.color = color

    def hacerSonido(self, volumen=None):
        if volumen is None:
            print("El gato maúlla: ¡Miau!")
        else:
            print(f"El gato maúlla muy {volumen}")

    def moverse(self):
        print("El gato salta")


class Pajaro:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo

    def hacerSonido(self, volumen=None):
        if volumen is None:
            print("El pájaro canta: ¡Pío Pío!")
        else:
            print(f"El pájaro canta con volumen {volumen}: ¡PÍO PÍO!")

    def moverse(self):
        print("El pájaro vuela")


def main():
    perro = Perro("Rex", 4, "Labrador")
    gato = Gato("Michi", "Blanco")
    pajaro = Pajaro("Piolín", "Canario")

    perro.hacerSonido()
    perro.hacerSonido("despacio")
    perro.moverse()

    gato.hacerSonido()
    gato.hacerSonido("despacio")
    gato.moverse()

    pajaro.hacerSonido()
    pajaro.hacerSonido("fuerte")
    pajaro.moverse()


if __name__ == "__main__":
    main()
