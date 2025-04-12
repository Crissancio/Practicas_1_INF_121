# Ejercicio7 polimorfismo: Se hace referencia a algunos animales mediante las siguientes clases:
#  Perro,Gato,Pajaro.
#    a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
#    b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
#    c) Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).
class Perro:
    def __init__(self, nombre, edad, raza):
        self.nombre = nombre
        self.edad = edad
        self.raza = raza
    # b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
    def hacerSonido(self, n=None):
        if n is None:
            print("el perro " + self.nombre + " dice guau guau")
        else:
            print("el perro " + self.nombre + " dice ", end="")
            for i in range(n):
                print("guau", end="")
            print()
    # c) Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).
    def moverse(self):
        print("el perro " + self.nombre + " corre")

    def mostrar(self):
        print("el perro " + self.nombre + " tiene una edad de " + str(self.edad) + " de  raza: " + self.raza)
class Gato:
    def __init__(self, nombre, color):
        self.nombre = nombre
        self.color = color
    # b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
    def hacerSonido(self, x=None):
        if x is None:
            print(" el gato " + self.nombre + " dice miau miau")
        else:
            print("el gato " + self.nombre + " dice ", end="")
            for i in range(x):
                print("miau", end="")
            print()
    # c) Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).
    def moverse(self):
        print("el gato " + self.nombre + " salta")

    def mostrar(self):
        print("el gato " + self.nombre + " es de color " + self.color)


class Pajaro:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo
    # b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
    def hacerSonido(self, y=None):
        if y is None:
            print("el pajaro " + self.nombre + " dice gurgur ")
        else:
            print("el pajaro " + self.nombre + " dice ", end="")
            for i in range(y):
                print("gur", end="")
            print()
    # c) Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).
    def moverse(self):
        print("el pájaro " + self.nombre + " vuela")

    def mostrar(self):
        print("el pajaro: " + self.nombre + " de tipo: " + self.tipo)



if __name__ == "__main__":
    # a) instanciando 1 Perro, 1 Gato y 1 Pájaro
    a = Perro("hachi", 3, "Labrador")
    b = Gato("more", "gris")
    c = Pajaro("igor", "paloma")
    a.mostrar()
    b.mostrar()
    c.mostrar()
    # b)Metodo hacerSonido() sobrecargado para que cada animal emita su sonido característico.
    a.hacerSonido()
    b.hacerSonido()
    c.hacerSonido()
    print("\nel perro haciendo sonidos:")
    a.hacerSonido(3)
    print("\nel gato haciendo sonidos:")
    b.hacerSonido(2)
    print("\nel pajaro haciendo sonidos:")
    c.hacerSonido(1)
    # c)Metodo moverse()  implementado para que indique cómo se mueve cada animal.
    print("\nel movimientos de los Animales es:")
    a.moverse()
    b.moverse()
    c.moverse()
