class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora)

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

    def mostrarSiSueldoEs(self, x):
        if self.sueldoMes == x:
            print(f"Administrativo: {self.nombre}, SueldoMes: {self.sueldoMes}, Cargo: {self.cargo}")

cocinero1 = Cocinero("Pedro", 2500, 10, 15)
mesero1 = Mesero("Ana", 1800, 5, 10, 200)
mesero2 = Mesero("Luis", 1900, 6, 12, 150)
admin1 = Administrativo("Marta", 2200, "Contadora")
admin2 = Administrativo("Carlos", 1800, "Recepcionista")
print("Sueldos Totales:")
print("Cocinero:", cocinero1.sueldoTotal())
print("Mesero 1:", mesero1.sueldoTotal())
print("Mesero 2:", mesero2.sueldoTotal())
print("Administrativo 1:", admin1.sueldoTotal())
print("Administrativo 2:", admin2.sueldoTotal())
print("\nEmpleados con SueldoMes igual a 1800:")
cocinero1.mostrarSiSueldoEs(1800)
mesero1.mostrarSiSueldoEs(1800)
mesero2.mostrarSiSueldoEs(1800)
admin1.mostrarSiSueldoEs(1800)
admin2.mostrarSiSueldoEs(1800)
