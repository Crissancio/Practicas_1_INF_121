class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludo(self):
        print("Hola, soy " , self.nombre , " de " , self.ciudad)

    def esMayor(self):
        if self.edad >= 18:
            print("--Sí es mayor de edad")
        else:
            print("--No es mayor de edad")
p1 = Persona("Ana", 22, "Perú")
p2 = Persona("Miguel", 17, "Bolivia")
p3 = Persona("Felipe", 25, "Colombia")

p1.saludo()
p1.esMayor()

p2.saludo()
p2.esMayor()

p3.saludo()
p3.esMayor()
