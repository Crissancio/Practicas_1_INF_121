class Cuadrado:
    def __init__(self, lado):
        self.lado = lado
    def area(self):
        return self.lado ** 2
    def mostrar(self):
        print("Cuadrado: ", self.lado)
        print(self.area())
    
class Rectangulo:
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base
    def area(self):
        return self.altura * self.base
    def mostrar(self):
        print("Rectangulo: ", self.altura, self.base)
        print(self.area())
    
class Circulo:
    def __init__(self, radio):
        self.radio = radio
    def area(self):
        return 3.14 * self.radio ** 2
    def mostrar(self):
        print("Circulo: ", self.radio)
        print(self.area())
cuadrado1 = Cuadrado(2)
rectangulo1 = Rectangulo(3, 4)
circulo1 = Circulo(5)
cuadrado1.mostrar()
rectangulo1.mostrar()
circulo1.mostrar()