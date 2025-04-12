class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def SueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora)

    def mostrar(self):
        print(f"Cocinero: {self.nombre}, Sueldo Total: {self.SueldoTotal()}")

class Mesero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propina = propina

    def SueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora) + self.propina

    def mostrar(self):
        print(f"Mesero: {self.nombre}, Sueldo Total: {self.SueldoTotal()}")

class Administrativo:
    def __init__(self, nombre, sueldoMes, cargo):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.cargo = cargo

    def SueldoTotal(self):
        return self.sueldoMes

    def mostrar(self):
        print(f"Administrativo: {self.nombre}, Sueldo Total: {self.SueldoTotal()}")

cocinero1 = Cocinero("Juan", 2000, 10, 15)
mesero1 = Mesero("Carlos", 1500, 5, 10, 200)
mesero2 = Mesero("Ana", 1600, 8, 10, 250)
admin1 = Administrativo("Laura", 2500, "Gerente")
admin2 = Administrativo("Pedro", 2200, "Asistente")

cocinero1.mostrar()
mesero1.mostrar()
mesero2.mostrar()
admin1.mostrar()
admin2.mostrar()

def mostrar_empleados_con_sueldo(empleados, sueldoX):
    for empleado in empleados:
        if empleado.sueldoMes == sueldoX:
            empleado.mostrar()

empleados = [cocinero1, mesero1, mesero2, admin1, admin2]
mostrar_empleados_con_sueldo(empleados, 1500)
