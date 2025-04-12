class Cocinero:
    def __init__(self, nombre, sueldoMes, hrsExtra, sueldoHora):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.hrsExtra = hrsExtra
        self.sueldoHora = sueldoHora
    def mostrar(self):
        print("Nombre: ", self.nombre," Sueldo mensual: ", self.sueldoMes, " las horas extras trabajadas son: ", self.hrsExtra, " su sueldo por hora es de: ", self.sueldoHora)
class Mesero:
    def __init__(self, nombre, sueldoMes, hrsExtra, sueldoHora, propina):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.hrsExtra = hrsExtra
        self.sueldoHora = sueldoHora
        self.propina = propina
    def sueldoTotal(self):
        return self.sueldoMes + (self.hrsExtra * self.sueldoHora) + self.propina
    def mostrar(self):
        print("Nombre: ", self.nombre," Sueldo mensual: ", self.sueldoMes, " las horas extras trabajadas son: ", self.hrsExtra, " su sueldo por hora es de: ", self.sueldoHora, " recibe una propina de: ", self.propina)
        print("Su suelto total es de: ", self.sueldoTotal())
class Administrativo:
    def __init__(self, nombre, sueldoMes, cargo):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.cargo = cargo
    def mostrar(self):
        print("Nombre: ", self.nombre," Sueldo mensual: ", self.sueldoMes, " Cargo: ", self.cargo)
Cocinero1 = Cocinero("Mario", 3100, 5, 18.5)
Mesero1 = Mesero("Luigi", 2200, 5, 15.7, 5)
Mesero2 = Mesero("Luigi", 2100, 5, 15.3, 2)
Administrativo1 = Administrativo("Marcelo", 7500, "Gerente")
Administrativo2 = Administrativo("Jesus", 9500, "Gerente General")
Cocinero1.mostrar()
Mesero1.mostrar()
Mesero2.mostrar()
Administrativo1.mostrar()
Administrativo2.mostrar()