class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__horasExtra = horasExtra
        self.__sueldoHora = sueldoHora

    def sueldoTotal(self):
        sueldo_total = self.__sueldoMes + (self.__horasExtra * self.__sueldoHora)
        return sueldo_total
    
    def mostrarPorSueldo(empleados,sueldo):
        for empleado in empleados:
            if isinstance(empleado, Cocinero) and empleado.sueldoTotal() > sueldo:
                print(f"{empleado.getNombre()},{empleado.sueldoTotal()}")

    def getNombre(self):
        return self.__nombre
    
class Mesero:
    def __init__(self, nombre, sueldoMes , horasExtra, sueldoHora, propina):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__horasExtra = horasExtra
        self.__sueldoHora = sueldoHora
        self.__propina = propina
    
    def sueldoTotal(self):
        sueldo_total = self.__sueldoMes + (self.__horasExtra * self.__sueldoHora) + self.__propina
        return sueldo_total

    def mostrarPorSueldo( empleados,sueldo):
        for empleado in empleados:
            if isinstance(empleado, Mesero) and empleado.sueldoTotal() > sueldo:
                print(f"{empleado.getNombre()}, {empleado.sueldoTotal()}")
                
    def getNombre(self):
        return self.__nombre

class Administrativo:
    def __init__(self, nombre, sueldoMes, cargo):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__cargo = cargo
        
    def sueldoTotal(self):
        sueldo_total = self.__sueldoMes
        return sueldo_total
    
    def getNombre(self):
        return self.__nombre
    
    def mostrarPorSueldo(empleados,sueldo):
        for empleado in empleados:
            if isinstance(empleado, Administrativo) and empleado.sueldoTotal() > sueldo:
                print(f"{empleado.getNombre()},{empleado.sueldoTotal()}")
#Main
# Instanciando los objetos

cocinero = Cocinero("Henry", 2000, 10, 30)

mesero_1 = Mesero("Jhon", 1000, 5, 10, 400)
mesero_2 = Mesero("Pamela", 940, 3, 5, 500)

administrativo_1 = Administrativo("Alex", 2700, "Gerente")
administrativo_2 = Administrativo("Ernesto", 2100, "Asistente")

#Lista de empleados
empleados = [cocinero, mesero_1, mesero_2, administrativo_1, administrativo_2]
# llamando a los métodos
print("-------Sueldos Totales-------")

print("Sueldo total de los cocineros:")
print(f"{cocinero.getNombre()} {cocinero.sueldoTotal()}")

print("Sueldo total de los meseros:")
print(f"{mesero_1.getNombre()} {mesero_1.sueldoTotal()}")
print(f"{mesero_2.getNombre()} {mesero_2.sueldoTotal()}")

print("Sueldo total de los administrativos:")
print(f"{administrativo_1.getNombre()} {administrativo_1.sueldoTotal()}")
print(f"{administrativo_2.getNombre()} {administrativo_2.sueldoTotal()}")

#Mostrando los empleados con sueldo
print("-------Empleados con sueldo mayor a 1500-------")
Cocinero.mostrarPorSueldo(empleados, 2000)

Mesero.mostrarPorSueldo(empleados, 2000)

Administrativo.mostrarPorSueldo(empleados, 2000)