#  Ejercicio9 polimorfismo: Para los bloques del juego Minecraft se usará los siguientes objetos:
#    BloqueCofre,BloqueTNT,BloqueHorno.
#    a) Crear e instanciar al menos 2 bloques de cada tipo
#    b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
#    c) Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
#    d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
class BloqueCofre:
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo
    # b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
    def accion(self):
        print("el cofre de " + self.tipo + " se abre con capacidad para " + str(self.capacidad) + " objetos")
    # c) Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
    def colocar(self, n=None):
        if n is None:
            print("colocando al suelo")
        else:
            print("colocado al " + n)
    # d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
    def romper(self):
        print("rompiendo el cofre")


class BloqueTNT:
    def __init__(self, tipo, daño):
        self.tipo = tipo
        self.daño = daño

    def accion(self):
        print("TNT de " + self.tipo + " está explotando con un daño de " + str(self.daño))

    def colocar(self, x=None):
        if x is None:
            print("colocada al suelo")
        else:
            print("colocada al " + x)

    def romper(self):
        print("¡boom! daño con " + str(self.daño) + " puntos de daño")


class BloqueHorno:
    def __init__(self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida

    def accion(self):
        print("el horno de " + self.color + " esta cocinando con una capacidad de " + str(self.capacidadComida) + " alimentos")

    def colocar(self, a=None):
        if a is None:
            print("colocado al suelo")
        else:
            print("colocado al " + a)

    def romper(self):
        print("rompiendo el horno.")


if __name__ == "__main__":
    # a) Instanciando al menos 2 bloques de cada tipo. 
    cofre1 = BloqueCofre(10, 5, "abeto")
    cofre2 = BloqueCofre(4, 5, "roble")
    tnt1 = BloqueTNT("explosivo", 12)
    tnt2 = BloqueTNT("explosivo2", 20)
    horno1 = BloqueHorno("rojo", 2)
    horno2 = BloqueHorno("blanco", 2)
    # b)Metodo accion() Sobreescrito en en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
    print("\nAccion de bloques:")
    cofre1.accion()
    tnt1.accion()
    horno1.accion()
    cofre2.accion()
    tnt2.accion()
    horno2.accion()
    # c) Metodo colocar() Sobrecargado para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
    print("\nColocando los bloques:")
    cofre1.colocar()
    cofre1.colocar("cueva")
    tnt1.colocar()
    tnt1.colocar("agua")
    cofre2.colocar()
    cofre2.colocar("pared")
    tnt2.colocar()
    tnt2.colocar("techo")
    # d)Metodo romper() Sobreescrito en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
    print("\nRompiendo los bloques:")
    cofre1.romper()
    tnt1.romper()
    horno1.romper()
    cofre2.romper()
    tnt2.romper()
    horno2.romper()
