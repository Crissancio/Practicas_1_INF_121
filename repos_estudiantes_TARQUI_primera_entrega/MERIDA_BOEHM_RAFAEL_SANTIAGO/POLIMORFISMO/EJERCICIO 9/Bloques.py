class BloqueCofre:
    def __init__(self, capacidad: int, resistencia: int, tipo: str):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo

    def accion(self):
        print("Este cofre puede almacenar objetos.")

    def colocar(self, orientacion="suelo"):
        print(f"Colocando cofre en la {orientacion}.")

    def romper(self):
        print("¡El cofre se rompió y los objetos cayeron!")

    def __str__(self):
        return f"Bloque Cofre [capacidad={self.capacidad}, resistencia={self.resistencia}, tipo={self.tipo}]"


class BloqueTnt:
    def __init__(self, tipo: str, daño: int):
        self.tipo = tipo
        self.daño = daño

    def accion(self):
        print("La TNT está lista para explotar.")

    def colocar(self, orientacion="suelo"):
        print(f"Colocando TNT en la {orientacion}.")

    def romper(self):
        print("¡Boom! La TNT explotó.")

    def __str__(self):
        return f"Bloque Tnt [tipo={self.tipo}, daño={self.daño}]"


class BloqueHorno:
    def __init__(self, color: str, capacidadComida: int):
        self.color = color
        self.capacidadComida = capacidadComida

    def accion(self):
        print("El horno está cocinando alimentos.")

    def colocar(self, orientacion="suelo"):
        print(f"Colocando horno en la {orientacion}.")

    def romper(self):
        print("El horno se rompió y dejó caer los ingredientes.")

    def __str__(self):
        return f"Bloque Horno [color={self.color}, capacidadComida={self.capacidadComida}]"
    

cofre1 = BloqueCofre(20, 100, "Hierro")
cofre2 = BloqueCofre(40, 150, "Diamante")

tnt1 = BloqueTnt("TNT roja", 80)
tnt2 = BloqueTnt("TNT verde", 90)

horno1 = BloqueHorno("Negro", 10)
horno2 = BloqueHorno("Gris", 15)

print("----------------------------------")
cofre1.accion()
tnt1.accion()
horno1.accion()
print("----------------------------------")

cofre1.colocar()
tnt1.colocar("pared")
print("----------------------------------")

cofre1.romper()
tnt1.romper()
horno1.romper()
print("----------------------------------")


print(cofre1)
print(tnt2)
print(horno2)