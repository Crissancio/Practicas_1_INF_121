class Empleado:
    def __init__(self, nombre, sueldo):
        self.nombre = nombre
        self.sueldo = sueldo
    def sueldo_anual(self):
        return self.sueldo * 12
    def aumento(self):
        self.sueldo = self.sueldo * 1.10
e1 = Empleado("Nicole", 1000)
e2 = Empleado("Marcelo", 1200)
print(e1.sueldo)
print(e2.sueldo)
e1.aumento()
e2.aumento()
print(e1.sueldo)
print(e2.sueldo)
