#  Ejercicio1 introduccion a POO: Crea una clase Persona con nombre, edad y ciudad
#         a) Agrega un método para mostrar el saludo: "Hola, soy (nombre) de {ciudad}"
#         b) Crea tres personas y muestra su saludo
#         c) Agrega un método para verificar si es mayor de edad
class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
    # a) Agrega un método para mostrar el saludo: "Hola, soy (nombre) de {ciudad}"
    def saludo(self):
        print("Hola, soy " + self.nombre + " de " + self.ciudad)
    # c) verificando si son mayores de edad
    def verificandoEdad(self):
        if self.edad >= 18:
            print(self.nombre + " es mayor de edad")
        else:
            print(self.nombre + " no es mayor de edad")


# b) creamos tres personas mostrando su saludo del insiso a
a = Persona("Adrian", 22, "La Paz")
b = Persona("Andrea", 21, "La Paz")
c = Persona("Angel", 19, "Santa Cruz")

# a) mostrando saludo de cada persona
a.saludo()
b.saludo()
c.saludo()

# c) verificando si son mayores de edad
a.verificandoEdad()
b.verificandoEdad()
c.verificandoEdad()
