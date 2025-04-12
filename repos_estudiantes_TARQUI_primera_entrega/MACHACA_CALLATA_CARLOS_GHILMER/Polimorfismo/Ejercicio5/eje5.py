
#39. Para los bloques del juego Minecraft se usará los siguientes objetos:

#a) Crear e instanciar al menos 2 bloques de cada tipo
#b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
#distintos mensajes según el tipo de bloque.
#c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
#orientaciones (por ejemplo, en el suelo o en la pared).
#d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
#distintos mensajes según el tipo de bloque y que puede suceder al romperlos.







class BloqueCofre:
    def __init__(self, capacidad, resistencia, tipo):
        self.__capacidad = capacidad
        self.__resistencia = resistencia
        self.__tipo = tipo

    def accion(self, madera):
        if self.__tipo == madera:
            print("Es un cofre normal")
        else:
            print("No abrir: Es un cofre bomba")
        return self.__tipo

    def colocar(self):
        if self.__capacidad < 20:
            print("Guardado en el cofre")
        else:
            print("El cofre está lleno")
        return self.__capacidad

    def romper(self):
        if self.__resistencia < 5:
            print("Cofre roto")
        else:
            print("El cofre ya está roto")
        return self.__resistencia


class BloqueTnt:
    def __init__(self, tipo, daño):
        self.__tipo = tipo
        self.__daño = daño
        self.__capacidad = 5  # Simula su espacio interno

    def accion(self, verde):
        if self.__tipo == verde:
            print("No va a explotar")
        else:
            print("¡Explota!")
        return self.__tipo

    def colocar(self):
        if self.__daño > 10:
            print("Exploto la casa ")
        else:
            print("La casa sigue en pie")
        return self.__capacidad

    def romper(self, casa_resistencia):
        if casa_resistencia < 20:
            print("Explotó la casa")
        else:
            print("La casa sigue en pie")
        return casa_resistencia


class BloqueHorno:
    def __init__(self, tipo, capacidad_comida):
        self.__tipo = tipo
        self.__capacidad_comida = capacidad_comida

    def accion(self, cocida):
        if self.__tipo == cocida:
            print("Sacar del horno")
        else:
            print("Aún está crudo")

    def colocar(self):
        if self.__capacidad_comida > 5:
            print("Se está cocinando")
        else:
            print("Horno lleno")

    def romper(self):
        if self.__capacidad_comida >= 15:
            print("El horno se rompió")
        else:
            print("El horno sigue funcionando")

# Instancias
cofre1 = BloqueCofre(30, 5, "madera")
cofre2 = BloqueCofre(10, 3, "cofrebomba")

tnt1 = BloqueTnt("rojo", 30)
tnt2 = BloqueTnt("verde", 50)

horno1 = BloqueHorno("Plomo", 10)
horno2 = BloqueHorno("Hierro", 20)

# Uso de métodos
print("---- COFRE 1 ----")
cofre1.accion("madera")
cofre1.colocar()
cofre1.romper()

print("\n---- COFRE 2 ----")
cofre2.accion("madera")
cofre2.colocar()
cofre2.romper()

print("\n---- TNT 1 ----")
tnt1.accion("verde")
tnt1.colocar()
tnt1.romper(casa_resistencia=25)

print("\n---- TNT 2 ----")
tnt2.accion("verde")
tnt2.colocar()
tnt2.romper(casa_resistencia=60)

print("\n---- HORNO 1 ----")
horno1.accion("Plomo")
horno1.colocar()
horno1.romper()
print("\n---- HORNO 2 ----")
horno2.accion("Hierro")
horno2.colocar()
horno2.romper()
