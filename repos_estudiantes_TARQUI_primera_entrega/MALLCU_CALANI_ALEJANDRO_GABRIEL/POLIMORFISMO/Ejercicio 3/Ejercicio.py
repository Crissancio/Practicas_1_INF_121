class Cocinero:
    def __init__(self, nombre, sueldo_por_hora, horas_extra):
        self.nombre = nombre
        self.sueldo_por_hora = sueldo_por_hora
        self.horas_extra = horas_extra

    def sueldo_total(self):
        return (self.sueldo_por_hora * 8) + (self.horas_extra * self.sueldo_por_hora)

    def mostrar(self):
        print(f"Cocinero: {self.nombre}, Sueldo Total: {self.sueldo_total()}")

class Mesero:
    def __init__(self, nombre, sueldo_por_hora, propina):
        self.nombre = nombre
        self.sueldo_por_hora = sueldo_por_hora
        self.propina = propina

    def sueldo_total(self):
        return (self.sueldo_por_hora * 8) + self.propina

    def mostrar(self):
        print(f"Mesero: {self.nombre}, Sueldo Total: {self.sueldo_total()}")

class Administrativo:
    def __init__(self, nombre, sueldo_por_hora):
        self.nombre = nombre
        self.sueldo_por_hora = sueldo_por_hora

    def sueldo_total(self):
        return self.sueldo_por_hora * 8

    def mostrar(self):
        print(f"Administrativo: {self.nombre}, Sueldo Total: {self.sueldo_total()}")

# Crear instancias de empleados y mostrar información
empleados = [
    Cocinero("Juan", 15, 2),
    Mesero("Ana", 10, 20),
    Mesero("Luis", 10, 15),
    Administrativo("Marta", 20),
    Administrativo("Pedro", 18)
]

for empleado in empleados:
    empleado.mostrar()
