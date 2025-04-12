class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
    def __str__(self):
        return F"Hola, soy {self.nombre} de {self.ciudad}"
    def esMayor(self):
        if self.edad >= 18:
            return f"{self.nombre} es mayor de edad"
        return f"{self.nombre} no es mayor de edad"

x = Persona("pepe", 8, "la paz")
y = Persona("lopo", 34, "Tarija")
z = Persona("remo", 18, "Trinidad")

print(x)
print(x.esMayor())
print("--------------------------")
print(y)
print(y.esMayor())
print("-------------------------------")
print(z)
print(z.esMayor())
