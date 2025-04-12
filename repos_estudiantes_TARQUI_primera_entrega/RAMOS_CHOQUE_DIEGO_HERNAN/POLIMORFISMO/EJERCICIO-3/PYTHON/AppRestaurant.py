class Cocinero:
    def __init__(self,nombre,sueldoMes,horasExtra,sueldoHora):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora)
        
class Mesero:
    def __init__(self,nombre,sueldoMes,horasExtra,sueldoHora,propinas):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propinas = propinas

    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora) + self.propinas

class Administrativo:
    def __init__(self,nombre,sueldoMes,cargo):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.cargo = cargo

    def sueldoTotal(self):
        return self.sueldoMes
    

cocinero = Cocinero("Max",2000,20,20)
mesero1 = Mesero("Jorge",1200,5,10,20)
mesero2 = Mesero("Paul",1500,9,10,200)
administrativo1 = Administrativo("Juan",3000,"Gerente")
administrativo2 = Administrativo("Pedro",2500,"Contador")

print(f"El sueldo total del cocinero {cocinero.nombre} es de : {cocinero.sueldoTotal()}Bs")
print("El sueldo total del mesero {} es de {}Bs: ".format(mesero1.nombre, mesero1.sueldoTotal()))
print("El sueldo total del mesero {} es de {}Bs: ".format(mesero2.nombre, mesero2.sueldoTotal()))
print("El sueldo total del administrativo {} es de {}Bs: ".format(administrativo1.nombre, administrativo1.sueldoTotal()))
print("El sueldo total del administrativo {} es de {}Bs: ".format(administrativo2.nombre, administrativo2.sueldoTotal()))