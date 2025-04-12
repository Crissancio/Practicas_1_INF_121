class Persona:
    def __init__(self,nombre,edad,ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
        
    def saludo(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")
        
    def mayor_de_edad(self):
        return self.edad >= 18

persona1 = Persona("Carolina",38,"Santa Cruz")
persona2 = Persona("Gabriel",15,"Oruro")
persona3 = Persona("Marcelo",26,"La Paz")
persona1.saludo()
persona2.saludo()
persona3.saludo()

print(f"¿{persona1.nombre} es mayor de edad?\n{persona1.mayor_de_edad()}")
print(f"¿{persona2.nombre} es mayor de edad?\n{persona2.mayor_de_edad()}")
print(f"¿{persona3.nombre} es mayor de edad?\n{persona3.mayor_de_edad()}")

    
    
