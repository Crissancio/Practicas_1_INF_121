class BloqueCofre:
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo
    def accionar(self):
        print("Se abre el cofre.")
    def romper(self):
        print("El cofre se rompió y soltó objetos.")
    def colocar(self, colocar):
        print("el bloque se puso en", colocar)
class BloqueTnt:
    def __init__(self, tipo, daño):
        self.tipo = tipo
        self.daño = daño
    def accionar(self):
        print("La TNT se encendió.")
    def romper(self):
        print("¡BOOM! La TNT explotó.")
    def colocar(self, colocar):
        print("el bloque se puso en", colocar)
class BloqueHorno:
    def __init__(self, color, capacidadDeComida):
        self.color = color
        self.capacidadDeComida = capacidadDeComida
    def accionar(self):
        print("El horno se enciende para cocinar.")
    def romper(self):
        print("El horno se rompió.")
    def colocar(self, colocar):
        print("el bloque se puso en", colocar)
b1 = BloqueCofre()
b2 = BloqueTnt()
b3 = BloqueHorno()
b1.accionar()
b2.accionar()
b3.accionar()
b1.colocar("el suelo")
b2.colocar("la pared")
b1.romper()
b2.romper()
b3.romper()