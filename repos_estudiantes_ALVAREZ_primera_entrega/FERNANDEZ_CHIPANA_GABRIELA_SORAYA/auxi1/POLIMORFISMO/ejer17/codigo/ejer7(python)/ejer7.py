class Perro:
    def __init__(self, nombre, edad, raza):
        self.nombre = nombre
        self.edad = edad
        self.raza = raza

    def hacer_sonido(self):
        print(f"El sonido que emite {self.nombre} es: aua aua aaua")

    def moverse(self):
        print(f"El perro se mueve de forma terrestre: camina, también puede correr y echarse.")


class Gato:
    def __init__(self, nombre, color):
        self.nombre = nombre
        self.color = color

    def hacer_sonido(self):
        print(f"El sonido que emite {self.nombre} es: mmiau miau miau")

    def moverse(self):
        print(f"El gato se mueve de forma terrestre: camina, también puede correr y echarse.")


class Pajaro:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo

    def hacer_sonido(self):
        print(f"El sonido que emite {self.nombre} es: buuu buuu buu")

    def moverse(self):
        print(f"El pájaro puede volar.")


# Programa principal
if __name__ == "__main__":
    perro = Perro("Tali", 3, "Salchicha")
    gato = Gato("Vodoke", "Blanco")
    pajaro = Pajaro("Blue", "Zancudas")

    perro.hacer_sonido()
    perro.moverse()

    gato.hacer_sonido()
    gato.moverse()

    pajaro.hacer_sonido()
    pajaro.moverse()
