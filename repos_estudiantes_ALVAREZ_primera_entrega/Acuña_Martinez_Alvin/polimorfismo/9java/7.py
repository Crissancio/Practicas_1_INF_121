class BloqueCofre:
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo
        print(f"Cofre creado: Tipo {tipo}, Capacidad {capacidad}, Resistencia {resistencia}")  # Mensaje de creación

    def accion(self):
        print(f"Abriendo cofre {self.tipo} (Capacidad: {self.capacidad}).")

    def colocar(self, orientacion="suelo"):
        print(f"Colocando cofre en {orientacion}.")

    def romper(self):
        print("¡Cofre roto! ¡Los items caen al suelo!")

class BloqueTnt:
    def __init__(self, tipo, daño):
        self.tipo = tipo
        self.daño = daño
        print(f"TNT creada: Tipo {tipo}, Daño {daño}")  # Mensaje de creación

    def accion(self):
        print(f"Encendiendo TNT {self.tipo} (Daño: {self.daño}). ¡Cuidado!")

    def colocar(self, orientacion="suelo"):
        print(f"Colocando TNT en {orientacion}. ¡Manéjala con cuidado!")

    def romper(self):
        print(f"¡BOOM! La TNT explotó al romperse. ¡Daño causado: {self.daño}!")

class BloqueHorno:
    def __init__(self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida
        print(f"Horno creado: Color {color}, Capacidad {capacidadComida} alimentos")  # Mensaje de creación

    def accion(self):
        print(f"Encendiendo horno {self.color} (Capacidad: {self.capacidadComida} alimentos).")

    def colocar(self, orientacion="suelo"):
        print(f"Colocando horno en {orientacion}.")

    def romper(self):
        print("¡Horno destruido! La comida se quemó.")


# (a) Crear 2 instancias de cada tipo de bloque (mostrando mensajes explícitos)
print("\n a) Creando 2 bloques de cada tipo:")
print("\n-- Cofres --")
cofre1 = BloqueCofre(27, 15, "Roble")
cofre2 = BloqueCofre(54, 30, "Hierro")

print("\n-- TNT --")
tnt1 = BloqueTnt("Normal", 50)
tnt2 = BloqueTnt("Mega", 100)

print("\n-- Hornos --")
horno1 = BloqueHorno("Rojo", 3)
horno2 = BloqueHorno("Negro", 6)

# (b) Probar método accion()
print("\n b) Acciones de bloques:")
cofre1.accion()
tnt1.accion()
horno1.accion()

# (c) Probar sobrecarga de colocar()
print("\n c) Colocación de bloques:")
cofre2.colocar()
tnt2.colocar("pared")
horno2.colocar("techo")

# (d) Probar método romper()
print("\n d) Rompiendo bloques:")
cofre2.romper()
tnt2.romper()
horno2.romper()
