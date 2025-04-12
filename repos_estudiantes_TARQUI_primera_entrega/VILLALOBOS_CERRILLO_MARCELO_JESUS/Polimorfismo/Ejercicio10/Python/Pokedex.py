class Agua:
    def __init__(self, nombre, ptsvida, nivel):
        self.nombre = nombre
        self.ptsvida = ptsvida
        self.nivel = nivel
    def atacar(self):
        print(self.nombre + " lanza un ataque de Agua")
    def ataque1(self, daño):
        self.ptsvida -= daño
    def ataque2(self):
        self.ptsvida -= 5
class Fuego:
    def __init__(self, nombre, ptsvida, nivel, quemadura):
        self.nombre = nombre
        self.ptsvida = ptsvida
        self.nivel = nivel
        self.quemadura = quemadura
    def atacar(self):
        print(self.nombre + " lanza una llamarada(no la de mou)")
    def atacarConNombre(self, ataque):
        print(self.nombre + " usa " + ataque)
    def ataque1(self, daño):
        self.ptsvida -= daño
    def ataque2(self):
        self.ptsvida -= 5
class Planta:
    def __init__(self, nombre, ptsvida):
        self.nombre = nombre
        self.ptsvida = ptsvida
    def atacar(self):
        print(self.nombre + " usa látigo cepa")
    def ataque1(self, daño):
        self.ptsvida -= daño
    def ataque2(self):
        self.ptsvida -= 5
squirtle = Agua("Squirtle", 100, 5)
totodile = Agua("Totodile", 95, 6)
charmander = Fuego("Charmander", 90, 5, 10)
vulpix = Fuego("Vulpix", 85, 4, 8)
bulbasaur = Planta("Bulbasaur", 100)
greninja = Planta("Greninja", 90)
squirtle.atacar()
charmander.atacarConNombre("Lanzallamas")
bulbasaur.ataque1(20)
vulpix.ataque2()
print("Vida de Bulbasaur:", bulbasaur.ptsvida)
print("Vida de Vulpix:", vulpix.ptsvida)
print("Vida de Gremimja:", greninja.ptsvida)
