class Persona:
    def __int__(self, nombre, edad, ciudad):
        self.n = nombre
        self.e = edad
        self.c = ciudad

    def saludo(self):
        return f"hola, soy {self.n}de{self.c}"

    def es_mayor_edad(self):
        return self.e >= 18


p1 = Persona('miguel', 20, "ciudad")
p2 = Persona("ana", 17, "cochabamba")
p3 = Persona("carlos", 25, "santa cruz")
print(p1.saludo())
print(p2.saludo())
print(p3.saludo())
print(f"{p1.n}es mayor de edad:{p1.es_mayor_edad()}")
print(f"{p2.n}es mayor de edad:{p2.es_mayor_edad()}")
print(f"{p3.n}es mayor de edad:{p3.es_mayor_edad()}")
