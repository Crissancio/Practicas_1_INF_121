class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def sueldoTotal(self):
        return self.sueldoMes + self.horasExtra * self.sueldoHora

    def mostrar(self, x):
        if self.sueldoMes == x:
            print(self)

    def __str__(self):
        return f"Cocinero(nombre='{self.nombre}', sueldoTotal={self.sueldoTotal()})"

class Mesero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propina = propina

    def sueldoTotal(self):
        return self.sueldoMes + self.horasExtra * self.sueldoHora + self.propina

    def mostrar(self, x):
        if self.sueldoMes == x:
            print(self)

    def __str__(self):
        return f"Mesero(nombre='{self.nombre}', sueldoTotal={self.sueldoTotal()})"

class Administrativo:
    def __init__(self, nombre, sueldoMes, cargo):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.cargo = cargo

    def sueldoTotal(self):
        return self.sueldoMes

    def mostrar(self, x):
        if int(self.sueldoMes) == x:
            print(self)

    def __str__(self):
        return f"Administrativo(nombre='{self.nombre}', sueldoTotal={self.sueldoTotal()})"

# ---------------------------Main
if __name__ == "__main__":
    c = Cocinero("Luis", 1000, 10, 15.5)
    m1 = Mesero("Ana", 900, 8, 12.5, 50)
    m2 = Mesero("Carlos", 900, 5, 10.0, 40)
    a1 = Administrativo("María", 1000, "Contadora")
    a2 = Administrativo("Juan", 950, "Jefe")

    c.mostrar(1000)
    m1.mostrar(900)
    m2.mostrar(900)
    a1.mostrar(1000)
    a2.mostrar(1000)
