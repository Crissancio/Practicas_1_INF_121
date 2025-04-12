class Bloque:
    def colocar(self, orientacion="suelo"):
        return f"Bloque colocado en la orientación: {orientacion}"

    def romper(self):
        return "Has roto un bloque genérico."

class BloqueCofre(Bloque):
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo

    def accion(self):
        return f"Abriste un {self.tipo} cofre con capacidad de {self.capacidad}."

    def romper(self):
        return f"El {self.tipo} cofre se ha roto. ¡Cuidado con lo que contiene!"

class BloqueTnt(Bloque):
    def __init__(self, tipo, daño):
        self.tipo = tipo
        self.daño = daño

    def accion(self):
        return f"La {self.tipo} TNT está lista para explotar con daño de {self.daño}."

    def romper(self):
        return f"La {self.tipo} TNT explotó al romperla."

class BloqueHorno(Bloque):
    def __init__(self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida

    def accion(self):
        return f"Horno {self.color} encendido con capacidad para {self.capacidadComida} comidas."

    def romper(self):
        return f"El horno {self.color} se ha destruido. ¡Espero que no estuviera encendido!"

# Instanciar objetos
bloqueCofre1 = BloqueCofre(100, 50, "madera")
bloqueCofre2 = BloqueCofre(150, 75, "hierro")
bloqueTnt1 = BloqueTnt("TNT roja", 200)
bloqueTnt2 = BloqueTnt("TNT azul", 250)
bloqueHorno1 = BloqueHorno("gris", 10)
bloqueHorno2 = BloqueHorno("negro", 15)

# Probar métodos
bloques = [bloqueCofre1, bloqueCofre2, bloqueTnt1, bloqueTnt2, bloqueHorno1, bloqueHorno2]
for bloque in bloques:
    print(bloque.accion())
    print(bloque.colocar("pared"))
    print(bloque.romper())
