# (b) Método SueldoTotal sobrecargado según el tipo de empleado
class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora)

    # (c) Sobrecargar el método para mostrar empleados con sueldoMes igual a X
    def mostrarSiSueldoEs(self, x):
        if self.sueldoMes == x:
            print(f"Cocinero: {self.nombre}, SueldoMes: {self.sueldoMes}")

class Mesero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propina = propina

    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora) + self.propina

    # (c) Sobrecargar el método para mostrar empleados con sueldoMes igual a X
    def mostrarSiSueldoEs(self, x):
        if self.sueldoMes == x:
            print(f"Mesero: {self.nombre}, SueldoMes: {self.sueldoMes}")

class Administrativo:
    def __init__(self, nombre, sueldoMes, cargo):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.cargo = cargo

    def sueldoTotal(self):
        return self.sueldoMes

    # (c) Sobrecargar el método para mostrar empleados con sueldoMes igual a X
    def mostrarSiSueldoEs(self, x):
        if self.sueldoMes == x:
            print(f"Administrativo: {self.nombre}, SueldoMes: {self.sueldoMes}, Cargo: {self.cargo}")

# (a) Instanciar 1 Cocinero, 2 Meseros y 2 Administrativos
cocinero1 = Cocinero("Juan", 3000, 10, 20)
mesero1 = Mesero("Luis", 2500, 5, 15, 200)
mesero2 = Mesero("Ana", 2600, 8, 12, 150)
admin1 = Administrativo("Carla", 3200, "Contadora")
admin2 = Administrativo("Pedro", 3000, "Secretario")

print("Sueldos Totales:")
print(f"{cocinero1.nombre}: {cocinero1.sueldoTotal()}")
print(f"{mesero1.nombre}: {mesero1.sueldoTotal()}")
print(f"{mesero2.nombre}: {mesero2.sueldoTotal()}")
print(f"{admin1.nombre}: {admin1.sueldoTotal()}")
print(f"{admin2.nombre}: {admin2.sueldoTotal()}")
print("------")

# (c) Mostrar empleados con sueldo mensual igual a X
X = 3000
print(f"Empleados con sueldo mensual igual a {X}:")
cocinero1.mostrarSiSueldoEs(X)
mesero1.mostrarSiSueldoEs(X)
mesero2.mostrarSiSueldoEs(X)
admin1.mostrarSiSueldoEs(X)
admin2.mostrarSiSueldoEs(X)
