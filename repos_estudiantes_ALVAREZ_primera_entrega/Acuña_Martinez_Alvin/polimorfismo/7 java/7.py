class Animal:
    def hacerSonido(self):
        pass

    def moverse(self):
        pass


class Perro(Animal):
    def hacerSonido(self):
        # b) Sobrecargar hacerSonido() para que el Perro emita su sonido característico
        return "El perro dice: ¡Guau!"

    def moverse(self):
        # c) Implementar moverse() indicando que el Perro corre
        return "El perro corre."


class Gato(Animal):
    def hacerSonido(self):
        # b) Sobrecargar hacerSonido() para que el Gato emita su sonido característico
        return "El gato dice: ¡Miau!"

    def moverse(self):
        # c) Implementar moverse() indicando que el Gato salta
        return "El gato salta."


class Pajaro(Animal):
    def hacerSonido(self):
        # b) Sobrecargar hacerSonido() para que el Pájaro emita su sonido característico
        return "El pájaro dice: ¡Pío pío!"

    def moverse(self):
        # c) Implementar moverse() indicando que el Pájaro vuela
        return "El pájaro vuela."


# a) Instanciar 1 Perro, 1 Gato y 1 Pájaro
perro = Perro()
gato = Gato()
pajaro = Pajaro()

print(perro.hacerSonido())
print(perro.moverse())

print(gato.hacerSonido())
print(gato.moverse())

print(pajaro.hacerSonido())
print(pajaro.moverse())
