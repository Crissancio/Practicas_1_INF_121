class Empleado:
    def __init__(self, nombre, sueldo):
        self.nombre = nombre
        self.sueldo = int(sueldo)

    def sueldoAnual(self):
        return self.sueldo * 12

    def aumento(self, porcentaje):
        aumento = self.sueldo * (porcentaje / 100)
        self.sueldo += aumento
        print(f"Se aplicó un aumento por su desempeño del {porcentaje}%. Se aumento : ${self.sueldo:.2f}")


Empleado1 = Empleado('Juan', 3000)
sueldo_anual1 = Empleado1.sueldoAnual()

Empleado2 = Empleado('Luis', 8000)
sueldo_anual2 = Empleado2.sueldoAnual()

print(f"El sueldo anual de {Empleado1.nombre} es : ${sueldo_anual1:.2f}")
print(f"El sueldo anual de {Empleado2.nombre} es : ${sueldo_anual2:.2f}")

Empleado1.aumento(10)
sueldo_anual1 = Empleado1.sueldoAnual()  

Empleado2.aumento(10)
sueldo_anual2 = Empleado2.sueldoAnual() 

print(f"El nuevo sueldo anual de {Empleado1.nombre} es : ${sueldo_anual1:.2f}")
print(f"El nuevo sueldo anual de {Empleado2.nombre} es : ${sueldo_anual2:.2f}")
