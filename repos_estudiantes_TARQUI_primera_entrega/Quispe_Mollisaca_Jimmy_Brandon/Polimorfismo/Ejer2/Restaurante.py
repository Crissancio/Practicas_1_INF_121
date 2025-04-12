class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def sueldo_total(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora)

    def mostrar_info(self):
        print(f"Cocinero [nombre={self.nombre}, sueldoMes={self.sueldoMes}, horasExtra={self.horasExtra}, sueldoHora={self.sueldoHora}]")


class Mesero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propina = propina

    def sueldo_total(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora) + self.propina

    def mostrar_info(self):
        print(f"Mesero [nombre={self.nombre}, sueldoMes={self.sueldoMes}, horasExtra={self.horasExtra}, sueldoHora={self.sueldoHora}, propina={self.propina}]")


class Administrativo:
    def __init__(self, nombre, sueldoMes, cargo):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.cargo = cargo

    def sueldo_total(self):
        return self.sueldoMes

    def mostrar_info(self):
        print(f"Administrativo [nombre={self.nombre}, sueldoMes={self.sueldoMes}, cargo={self.cargo}]")


class Restaurante:
    @staticmethod
    def mostrar_por_sueldo(empleados):
        print("Información de todos los empleados:")
        for empleado in empleados:
            empleado.mostrar_info()

    @staticmethod
    def mostrar_por_sueldo_filtrado(sueldo, empleados):
        print(f"Empleados con sueldo mensual igual a {sueldo}:")
        for empleado in empleados:
            if isinstance(empleado, Cocinero) and empleado.sueldoMes == sueldo:
                empleado.mostrar_info()
            elif isinstance(empleado, Mesero) and empleado.sueldoMes == sueldo:
                empleado.mostrar_info()
            elif isinstance(empleado, Administrativo) and empleado.sueldoMes == sueldo:
                empleado.mostrar_info()


# Instanciar empleados y ejecutar métodos
if __name__ == "__main__":
    cocinero = Cocinero("Carlos", 2000, 10, 15.5)
    mesero1 = Mesero("Luis", 1500, 5, 10.0, 300.5)
    mesero2 = Mesero("Juan", 1800, 3, 8.0, 200.0)
    admin1 = Administrativo("Ana", 2500.0, "Gerente")
    admin2 = Administrativo("Pedro", 1500.0, "Supervisor")

    empleados = [cocinero, mesero1, mesero2, admin1, admin2]

    Restaurante.mostrar_por_sueldo(empleados)
    Restaurante.mostrar_por_sueldo_filtrado(1500, empleados)