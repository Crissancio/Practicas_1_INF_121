class Animal:
    def hacerSonido(self):
        return "Este animal hace un sonido."

    def moverse(self):
        return "Este animal se mueve de alguna manera."

class Perro(Animal):
    def hacerSonido(self):
        return "Guau guau"

    def moverse(self):
        return "Corre"

class Gato(Animal):
    def hacerSonido(self):
        return "Miau miau"

    def moverse(self):
        return "Salta"

class Pajaro(Animal):
    def hacerSonido(self):
        return "Pío pío"

    def moverse(self):
        return "Vuela"

# Instanciar los animales
perro = Perro()
gato = Gato()
pajaro = Pajaro()

# Probar los métodos
animales = [perro, gato, pajaro]
for animal in animales:
    print(f"Sonido: {animal.hacerSonido()}")
    print(f"Movimiento: {animal.moverse()}")
