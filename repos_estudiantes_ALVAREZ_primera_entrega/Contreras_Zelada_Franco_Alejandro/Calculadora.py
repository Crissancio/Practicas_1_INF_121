from fractions import Fraction
import math
class Calculadora:
    def __init__(self, a , b, c):
        self.a = a
        self.b = b
        self.c = c
    
    def suma(self):
        return self.a + self.b
    
    def resta(self):
        return self.a - self.b
    
    def multiplicar(self):
        return self.a * self.b
    
    def division(self):
        return self.a / self.b
    
    def  calcular_promedio_de_tres(self):
        promedio = (self.a + self.b + self.c)/3
        return promedio
    
    def sol_cuadraticas(self):
        det = (self.b * self.b)- 4 * self.a *self.c 
        if det < 0:
            print("No existen soluciones en los reales")
        else:
            x1 = (-self.b + math.sqrt(det)) / (2*self.a)
            x2 = (self.b + math.sqrt(det)) / (2*self.a)
            print("Solucion x1:", x1)
            print("Solucion x2:", x2)
            
num1 = Calculadora(30, 20, 10)
num2 = Calculadora(10, 9, 1)
num3 = Calculadora(4, 12, 8)
print(f"Suma {num1.a} + {num1.b} = {num1.suma()}")
print(f"Suma {num2.a} + {num2.b} = {num2.suma()}")
print(f"Suma {num3.a} + {num3.b} = {num3.suma()}")
print("-------------------")
print(f"Resta {num1.a} - {num1.b} = {num1.resta()}")
print(f"Resta {num2.a} - {num2.b} = {num2.resta()}")
print(f"Resta {num3.a} - {num3.b} = {num3.resta()}")
print("-------------------")
print(f"Multiplicacion {num1.a} * {num1.b} = {num1.multiplicar()}")
print(f"Multiplicacion {num2.a} * {num2.b} = {num2.multiplicar()}")
print(f"Multiplicacion {num3.a} * {num3.b} = {num3.multiplicar()}")
print("-------------------")
print(f"Division {num1.a} / {num1.b} = {num1.division()}")
print(f"Division {num2.a} / {num2.b} = {num2.division()}")
print(f"Division {num3.a} / {num3.b} = {num3.division()}")
print("-------------------")
print(f"Promedio {num1.a} + {num1.b} + {num1.c} / 3 = {num1.calcular_promedio_de_tres()}")
print(f"Promedio {num2.a} + {num2.b} + {num2.c} / 3 = {num2.calcular_promedio_de_tres()}")
print(f"Promedio {num3.a} + {num3.b} + {num3.c} / 3 = {num3.calcular_promedio_de_tres()}")
print("-------------------")
num1.sol_cuadraticas()
num2.sol_cuadraticas()
num3.sol_cuadraticas()