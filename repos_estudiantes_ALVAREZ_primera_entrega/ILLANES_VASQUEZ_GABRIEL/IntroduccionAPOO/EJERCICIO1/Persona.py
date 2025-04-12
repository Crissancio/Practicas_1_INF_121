class Persona:

    def __init__(self, nombre, ciudad, edad):
        self.nombre = nombre
        self.ciudad = ciudad
        self.edad = edad

    def mostrarSaludo(self):
        print("Hola mi nombre es:", self.nombre, "de la ciudad de:", self.ciudad)

    def mostrarEdad(self):
        if self.edad > 18:
            print("la persona:", self.nombre, "es mayor de edad")
        else:
            print("la persona:", self.nombre, "es menor de edad")

if __name__ == "__main__":
    p1 = Persona("Javier", "Lapaz", 12)
    p2 = Persona("Juan", "SantaCruz", 20)
    p3 = Persona("Eduardo", "Lapaz", 14)

    p1.mostrarSaludo()
    p2.mostrarSaludo()
    p3.mostrarSaludo()

    p1.mostrarEdad()
    p2.mostrarEdad()
    p3.mostrarEdad()
