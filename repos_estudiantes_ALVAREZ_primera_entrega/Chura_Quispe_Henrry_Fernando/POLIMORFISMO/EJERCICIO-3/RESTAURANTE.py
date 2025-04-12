# Clase Cocinero
class Cocinero:
    def __init__(self, nombre, sueldo_mes, horas_extras, sueldo_hora):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extras = horas_extras
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self):
        sueldo_total = self.sueldo_mes + (self.horas_extras * self.sueldo_hora)
        print(f"El sueldo total del cocinero {self.nombre} es {sueldo_total}")

    def get_nombre(self):
        return self.nombre

    def get_sueldo_mes(self):
        return self.sueldo_mes


# Clase Mesero
class Mesero:
    def __init__(self, nombre, sueldo_mes, horas_extras, sueldo_hora, propina):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extras = horas_extras
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def sueldo_total(self):
        sueldo_total = self.sueldo_mes + self.horas_extras * self.sueldo_hora + self.propina
        print(f"El sueldo total del mesero {self.nombre} es {sueldo_total}")

    def get_nombre(self):
        return self.nombre

    def get_sueldo_mes(self):
        return self.sueldo_mes


# Clase Administrativo
class Administrativo:
    def __init__(self, nombre, sueldo_mes, cargo):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.cargo = cargo

    def sueldo_total(self):
        print(f"El sueldo total del administrativo {self.nombre} es {self.sueldo_mes}")

    def get_nombre(self):
        return self.nombre

    def get_sueldo_mes(self):
        return self.sueldo_mes


# Función para verificar sueldo
def verificar_sueldo(empleado, sueldo_x):
    if isinstance(empleado, Cocinero):
        if empleado.get_sueldo_mes() == sueldo_x:
            print(f"Cocinero {empleado.get_nombre()} tiene un sueldo igual a {sueldo_x}")
    elif isinstance(empleado, Mesero):
        if empleado.get_sueldo_mes() == sueldo_x:
            print(f"Mesero {empleado.get_nombre()} tiene un sueldo igual a {sueldo_x}")
    elif isinstance(empleado, Administrativo):
        if empleado.get_sueldo_mes() == sueldo_x:
            print(f"Administrativo {empleado.get_nombre()} tiene un sueldo igual a {sueldo_x}")


# Clase principal para instanciar objetos y realizar pruebas
if __name__ == "__main__":
    # Instanciar objetos
    cocinero = Cocinero("Chavelo", 300, 2, 3)
    mesero1 = Mesero("Juan", 200, 3, 23, 12)
    mesero2 = Mesero("Carlos", 500, 5, 13, 2)
    admin1 = Administrativo("Mario", 23, "administra productos")
    admin2 = Administrativo("Roberto", 20, "administra el local")

    # Mostrar sueldo total de cada empleado
    cocinero.sueldo_total()
    print("------------------")
    mesero1.sueldo_total()
    mesero2.sueldo_total()
    print("--------------------")
    admin1.sueldo_total()
    admin2.sueldo_total()

    # Verificar sueldos
    print("\nEmpleados con sueldo igual a 200:")
    verificar_sueldo(cocinero, 300)
    verificar_sueldo(mesero1, 200)
    verificar_sueldo(mesero2, 500)
    verificar_sueldo(admin1, 23)
    verificar_sueldo(admin2, 20)
