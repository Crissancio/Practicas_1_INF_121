class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__horasExtra = horasExtra
        self.__sueldoHora = sueldoHora

    def sueldo_total(self):
        return self.__sueldoMes + (self.__horasExtra * self.__sueldoHora)

    def mostrar_si_sueldo_igual(self, x):
        if self.__sueldoMes == x:
            print(f"{self.__nombre} (Cocinero) tiene sueldoMes = {x}")


class Mesero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__horasExtra = horasExtra
        self.__sueldoHora = sueldoHora
        self.__propina = propina

    def sueldo_total(self):
        return self.__sueldoMes + (self.__horasExtra * self.__sueldoHora) + self.__propina

    def mostrar_si_sueldo_igual(self, x):
        if self.__sueldoMes == x:
            print(f"{self.__nombre} (Mesero) tiene sueldoMes = {x}")


class Administrativo:
    def __init__(self, nombre, sueldoMes, cargo):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__cargo = cargo

    def sueldo_total(self):
        return self.__sueldoMes

    def mostrar_si_sueldo_igual(self, x):
        if self.__sueldoMes == x:
            print(f"{self.__nombre} (Administrativo) tiene sueldoMes = {x}")


# === Zona principal ===

# a) Instanciar 1 Cocinero, 2 Meseros y 2 Administrativos
cocinero = Cocinero("Luis", 3000, 10, 50)
mesero1 = Mesero("Ana", 2500, 5, 40, 200)
mesero2 = Mesero("Carlos", 2600, 8, 35, 150)
admin1 = Administrativo("Beatriz", 2800, "Contadora")
admin2 = Administrativo("Jorge", 3000, "Gerente")

# b) Mostrar sueldo total de cada uno
print("=== Sueldos Totales ===")
print("Cocinero:", cocinero.sueldo_total())
print("Mesero 1:", mesero1.sueldo_total())
print("Mesero 2:", mesero2.sueldo_total())
print("Administrativo 1:", admin1.sueldo_total())
print("Administrativo 2:", admin2.sueldo_total())

# c) Mostrar los que tengan sueldoMes igual a X
x = 3000
print(f"\n=== Empleados con sueldoMes = {x} ===")
cocinero.mostrar_si_sueldo_igual(x)
mesero1.mostrar_si_sueldo_igual(x)
mesero2.mostrar_si_sueldo_igual(x)
admin1.mostrar_si_sueldo_igual(x)
admin2.mostrar_si_sueldo_igual(x)