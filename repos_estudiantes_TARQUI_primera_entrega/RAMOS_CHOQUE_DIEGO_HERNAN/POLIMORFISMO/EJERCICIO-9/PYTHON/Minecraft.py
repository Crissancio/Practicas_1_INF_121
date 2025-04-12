class BloqueCofre:
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo

    def accion(self):
        print("Este cofre puede almacenar objetos.")

    def colocar(self, orientacion):
        print("Cofre colocado en:", orientacion)

    def romper(self):
        print("Has roto un cofre, los objetos salen volando.")


class BloqueTnt:
    def __init__(self, tipo, dano):
        self.tipo = tipo
        self.dano = dano

    def accion(self):
        print("La TNT está lista para explotar.")

    def colocar(self, orientacion):
        print("TNT colocada en:", orientacion)

    def romper(self):
        print("La TNT se activa y explota.")


class BloqueHorno:
    def __init__(self, color, capacidad_comida):
        self.color = color
        self.capacidad_comida = capacidad_comida

    def accion(self):
        print("Este horno puede cocinar comida.")

    def colocar(self, orientacion):
        print("Horno colocado en:", orientacion)

    def romper(self):
        print("El horno se rompe y suelta los objetos cocinados.")


bloque1 = BloqueCofre(30, 10, "madera")
bloque2 = BloqueCofre(50, 20, "hierro")

bloque3 = BloqueTnt("básica", 100)
bloque4 = BloqueTnt("potente", 200)

bloque5 = BloqueHorno("gris", 5)
bloque6 = BloqueHorno("negro", 10)

bloques = [bloque1, bloque2, bloque3, bloque4, bloque5, bloque6]

for bloque in bloques:
    bloque.accion()
    bloque.colocar("suelo")
    bloque.romper()
    print("------------------------")
