class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__horasExtra = horasExtra
        self.__sueldoHora = sueldoHora
    def mostrar(self):
        print(f"nombre: {self.__nombre} Sueldo: {self.__sueldoMes} ")  
    
    def SueldoTotal(self):
        return self.__sueldoMes + (self.__horasExtra * self.__sueldoHora)
    def get_sueldoMes(self):
        return self.__sueldoMes
    

class Mesero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__horasExtra = horasExtra
        self.__sueldoHora = sueldoHora
        self.__propina = propina

    def SueldoTotal(self):
        return self.__sueldoMes + (self.__horasExtra * self.__sueldoHora) + self.__propina
    def mostrar(self):
        print(f"Mesero: {self.__nombre} Sueldo: {self.__sueldoMes} Sueldo total: {self.SueldoTotal()} ")  

    def get_sueldoMes(self):
        return self.__sueldoMes


class Administrativo:
    def __init__(self, nombre, sueldoMes, cargo):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__cargo = cargo
    def SueldoTotal(self):
        return self.__sueldoMes
    def mostrar(self):
        print(f"Administrativo: {self.__nombre} Cargo: {self.__cargo}, Sueldo: {self.__sueldoMes}")
    def get_sueldoMes(self):
        return self.__sueldoMes
    


cocinero = Cocinero("pepe", 234, 2, 45)
mesero1 = Mesero("rob", 150, 1, 4,15)
mesero2 = Mesero("pol", 140, 2, 6,10)
admin1 = Administrativo("kol",3000, "jef")
admin2 = Administrativo("rel", 1500, "gerente")


empleados = [cocinero, mesero1, mesero2, admin1, admin2]

for empleado in empleados:
    empleado.mostrar()


def mostrar_sueldo_x(empleados, sueldo_x):
    print(f"\n Empleados con sueldo igual a {sueldo_x}:")
    for empleado in empleados:
        if empleado.get_sueldoMes() == sueldo_x:
            empleado.mostrar()

mostrar_sueldo_x(empleados, 140)