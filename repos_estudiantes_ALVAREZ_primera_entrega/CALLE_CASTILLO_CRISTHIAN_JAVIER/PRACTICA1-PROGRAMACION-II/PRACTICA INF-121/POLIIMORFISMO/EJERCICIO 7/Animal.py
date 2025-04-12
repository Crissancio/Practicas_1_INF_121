class Animal:
    def hacer_sonido(self):
        print("Sonido genérico de animal.")

    def moverse(self):
        print("Movimiento genérico de animal.")

class Perro(Animal):
    def hacer_sonido(self):
        print("El perro dice: ¡Guau guau!")

    def moverse(self):
        print("El perro corre alegremente.")

class Gato(Animal):
    def hacer_sonido(self):
        print("El gato dice: ¡Miau!")

    def moverse(self):
        print("El gato salta y camina con elegancia.")

class Pajaro(Animal):
    def hacer_sonido(self):
        print("El pájaro dice: ¡Pío pío!")

    def moverse(self):
        print("El pájaro vuela por el cielo.")

def main():
    perro = Perro()
    gato = Gato()
    pajaro = Pajaro()

    animales = [perro, gato, pajaro]

    for animal in animales:
        animal.hacer_sonido()
        animal.moverse()
        print("-" * 40)

if __name__ == "__main__":
    main()
