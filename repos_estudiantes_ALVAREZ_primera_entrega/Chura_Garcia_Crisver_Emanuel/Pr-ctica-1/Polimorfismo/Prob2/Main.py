#2. Sean las siguientes clases que hacen referencia a diferentes tipos de figura:
from multimethod import multimethod
import math
class Cuadrado:
    def __init__(self, lado):
        self.lado=lado

    #b) Implementar un método mostrar() en cada clase para imprimir sus dimensiones y área.
    @multimethod
    def mostrar(self):
        area= self.lado*self.lado
        print(f"Dimensión del cuadrado: {self.lado} con un área de {area}")

class Rectangulo:
    def __init__(self, altura, base):
        self.altura=altura
        self.base=base

    #b) Implementar un método mostrar() en cada clase para imprimir sus dimensiones y área.
    @multimethod
    def mostrar(self):
        area= self.base*self.altura
        print(f"Dimensión del cuadrado: base: {self.base}, de altura: {self.altura}, con área de: {area}")


class Circulo:
    def __init__(self, radio):
        self.radio=radio

    #b) Implementar un método mostrar() en cada clase para imprimir sus dimensiones y área.
    @multimethod
    def mostrar(self):
        area= math.pi*(self.radio*self.radio)
        print(f"Dimensión del circulo con radio: {self.radio}, de área: {area}")

if __name__ == "__main__":
    # a) Instanciar 1 Cuadrado, 1 Rectángulo y 1 Círculo
    cuadrado = Cuadrado(3)
    rectangulo = Rectangulo(5, 8)
    circulo= Circulo(4)

    # c)Sobrecargar el método Área para mostrar el área de todas las figuras.
    cuadrado.mostrar()
    rectangulo.mostrar()
    circulo.mostrar()
