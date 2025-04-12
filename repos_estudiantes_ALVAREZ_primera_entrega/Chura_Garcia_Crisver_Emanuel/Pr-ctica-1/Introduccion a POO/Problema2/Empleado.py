# 2. Crea una clase Empleado con nombre y sueldo
class Empleado:
    def __init__(self,nombre, sueldo):
        self.nombre=nombre
        self.sueldo = sueldo

    #a) Agrega un método para calcular el sueldo anual
    def Calcular_Sueldo(self):
        return f"El sueldo mensual de: {self.sueldo} anualmente es de: {self.sueldo*12}"
    
    #b) Agrega un método para aplicar un aumento del 10%
    def Aplicar_Aumento(self):
        incremento= self.sueldo+(self.sueldo*(10/100))
        return f"El sueldo mensual incrementado al 10% es de: {incremento} , anualmente es de: {incremento*12}"

print("Programa python")
#c) Crea dos empleados y muestra sus sueldos antes y después del aumento    
empleado1 = Empleado("David", 1700.75)
empleado2 = Empleado("Hugo", 1900.89)

print("Antes del aumento")
print(empleado1.Calcular_Sueldo())
print(empleado2.Calcular_Sueldo())
print("Despues del aumento")
print(empleado1.Aplicar_Aumento())
print(empleado1.Aplicar_Aumento())

