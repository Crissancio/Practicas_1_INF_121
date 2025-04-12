class Calculadora:
    def sumar(self, a, b):
        return a + b
    def restar(self, a, b):
        return a - b
    def multiplicar(self, a, b):
        return a * b
    def dividir(self, a, b):
        if b != 0:
            return a / b
        else:
            return " =/ diferente de cero brou"
    def promedio(self, a, b, c):
        return (a + b + c) / 3
    def cuadratica(self, a, b, c):
        d = b**2 - 4*a*c
        if d < 0:
            return "no tiene solucion"
        else:
            x1 = (-b + (d**0.5)) / (2*a)
            x2 = (-b - (d**0.5)) / (2*a)
            return x1, x2
c = Calculadora()
print(c.sumar(5, 3))
print(c.restar(10, 2))
print(c.multiplicar(4, 5))
print(c.dividir(9, 3))
print(c.promedio(5, 7, 8))
print(c.cuadratica(1, -5, 6))
