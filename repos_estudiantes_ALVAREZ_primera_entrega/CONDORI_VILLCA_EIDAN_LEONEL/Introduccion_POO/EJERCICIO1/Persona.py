class Persona:
    def __init__(self,nombre,edad,ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
    def saludar(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")
    def MayorEdad(self):
        if (self.edad >= 18):
            print("Es Mayor de edad")
        else:
            print("Es Menor de edad")
            
persona1 = Persona("Leo",18,"La Paz")
persona1.saludar()
persona1.MayorEdad()
persona2 = Persona("Benito",15,"Oruro")
persona2.saludar()
persona2.MayorEdad()
persona3 = Persona("Laura",25,"Cochabamba")
persona3.saludar()
persona3.MayorEdad()
