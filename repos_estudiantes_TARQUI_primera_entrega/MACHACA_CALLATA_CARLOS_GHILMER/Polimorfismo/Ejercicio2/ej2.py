#  3. Un restaurante organiza a su personal mediante las siguientes clases:

#a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
#b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
#sumándole las horas extra, considerando el sueldo por hora y la propina
#en caso de los meseros.
#c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
# SueldoMes igual a X. */




class Cocinero:
    def __init__(self,nombre, sueldoMes, horasExtra, sueldoHora):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__horasExtra = horasExtra
        self.__suelddoHora = sueldoHora

    def sueldoTotal(self):
        return self.__sueldoMes + (self.__horasExtra * self.__suelddoHora) 

    def __str__(self):
        return f"El suel total del cocinero es: {self.sueldoTotal()}"

    def mostrarEmpleados(self):
         x = 2300
         if self.getSueldoMes() == x:
            print(f"El cocinero {self.__nombre} tiene el sueldo igual que {x}")
         else:
            print("no es el mismo ")
         return x
    
    def getSueldoMes(self):
        return self.__sueldoMes
    
class Mesero:

    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__horasExtra = horasExtra
        self.__suelddoHora = sueldoHora
        self.__propina = propina

    def sueldoTotal(self):
        return self.__sueldoMes + (self.__horasExtra * self.__suelddoHora) + self.__propina
    
    def __str__(self):
        return f"El sueldo total del mesero es: {self.sueldoTotal()}"
    
    def mostrarEmpleados(self):
        x = 2300
        if self.getSueldoMes() == x:
            print(f"El mesero {self.__nombre} tiene el sueldo igual que {x}")
        else:
            print("no es el mismo ")
        return x
    
    def getSueldoMes(self):
        return self.__sueldoMes
    
class Administrativo:
    def __init__(self,nombre, sueldoMes, cargo):
        self.__nombre = nombre
        self.__sueldoMes = sueldoMes
        self.__cargo = cargo

    def sueldoTotal(self):
        return self.__sueldoMes
    
    def __str__(self):
        return f"El sueldo total del administrativo es: {self.sueldoTotal()}"
    
    def mostrarEmpleados(self):
        x = 2300
        if self.getSueldoMes() == x:
            print(f"El administrativo {self.__nombre} tiene el sueldo igual que {x}")
        else:
            print("no es el mismo ")
        return x
    
    def getSueldoMes(self):
        return self.__sueldoMes
    
cocinero1 = Cocinero("Juan", 2300, 5, 240)
mesero1 = Mesero("Pedro", 2500, 2, 240, 12)
mesero2 = Mesero("Maria", 2430, 2, 240, 12)
administrativo1 = Administrativo("Rick", 2250, "jefe")
administrativo2 = Administrativo("Ana", 2500, "jefe")
print(cocinero1)
cocinero1.mostrarEmpleados()
print("----------------------------------------------")
print(mesero1)
mesero1.mostrarEmpleados()
print("----------------------------------------------")
print(mesero2)
mesero2.mostrarEmpleados()
print("----------------------------------------------")
print(administrativo1)
administrativo1.mostrarEmpleados()
print("----------------------------------------------")
print(administrativo2)
administrativo2.mostrarEmpleados()