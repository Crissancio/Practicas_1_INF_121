class Administrativo:
    def __init__(self, nombre, sueldo_mes, cargo):
        self.__nombre = nombre
        self.__sueldo_mes = sueldo_mes
        self.__cargo = cargo

    def sueldo_total(self):
        total = self.__sueldo_mes
        print(f"El sueldo del administrativo {self.__nombre} con cargo en: {self.__cargo} es: {total}")

    def sueldo_total_con_extra(self, horas_extra, sueldo_por_hora):
        total = self.__sueldo_mes + (horas_extra * sueldo_por_hora)
        print(f"El sueldo del administrativo {self.__nombre} con cargo en: {self.__cargo} (incluyendo horas extra) es: {total}")

    def mostrar(self, x):
        if self.__sueldo_mes == x:
            print(f"Administrativo {self.__nombre} tiene un sueldo igual a {x}")

    def mostrar_con_mensaje(self, x, mensaje):
        if self.__sueldo_mes == x:
            print(f"Administrativo {self.__nombre} tiene un sueldo igual a {x}. {mensaje}")
class Cocinero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_por_hora):
        self.__nombre = nombre
        self.__sueldo_mes = sueldo_mes
        self.__horas_extra = horas_extra
        self.__sueldo_por_hora = sueldo_por_hora

    def sueldo_total(self):
        total = self.__sueldo_mes + (self.__horas_extra * self.__sueldo_por_hora)
        print(f"El sueldo del cocinero {self.__nombre} es: {total}")

    def mostrar(self, x):
        if self.__sueldo_mes == x:
            print(f"Cocinero {self.__nombre} tiene un sueldo igual a {x}")

    def mostrar_con_mensaje(self, x, mensaje):
        if self.__sueldo_mes == x:
            print(f"Cocinero {self.__nombre} tiene un sueldo igual a {x}. {mensaje}")

class Mesero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_por_hora, propina):
        self.__nombre = nombre
        self.__sueldo_mes = sueldo_mes
        self.__horas_extra = horas_extra
        self.__sueldo_por_hora = sueldo_por_hora
        self.__propina = propina

    def sueldo_total(self):
        total = self.__sueldo_mes + (self.__horas_extra * self.__sueldo_por_hora) + self.__propina
        print(f"El sueldo del mesero {self.__nombre} es: {total}")

    def mostrar(self, x):
        if self.__sueldo_mes == x:
            print(f"Mesero {self.__nombre} tiene un sueldo igual a {x}")

    def mostrar_con_mensaje(self, x, mensaje):
        if self.__sueldo_mes == x:
            print(f"Mesero {self.__nombre} tiene un sueldo igual a {x}. {mensaje}")


if __name__ == "__main__":
    # Instanciar al menos 2 objetos de cada clase
    cocinero1 = Cocinero("Raul Cordobeza", 6500, 3, 150)
    cocinero2 = Cocinero("Maria Lopez", 7000, 5, 200)
    mesero1 = Mesero("Pablo Mese1", 4000, 2, 100, 300)
    mesero2 = Mesero("Teresa Mese2", 4000, 1, 100, 500)
    admin1 = Administrativo("Axel Admin", 5000, "Gerente")
    admin2 = Administrativo("Joaquin Admin", 4500, "Encargado")

    # Mostrar el sueldo total de cada empleado
    print("-------I N C I S O     B-------")
    cocinero1.sueldo_total()
    cocinero2.sueldo_total()
    mesero1.sueldo_total()
    mesero2.sueldo_total()
    admin1.sueldo_total()
    admin2.sueldo_total_con_extra(10, 100)

    # Mostrar empleados con sueldo igual a X
    print("-------I N C I S O     C-------")
    x = 5000
    cocinero1.mostrar(x)
    cocinero2.mostrar_con_mensaje(x, "Este cocinero tiene un sueldo igual al buscado.")
    mesero1.mostrar(x)
    mesero2.mostrar_con_mensaje(x, "Este mesero tiene un sueldo igual al buscado.")
    admin1.mostrar(x)
    admin2.mostrar_con_mensaje(x, "Este administrativo tiene un sueldo igual al buscado.")