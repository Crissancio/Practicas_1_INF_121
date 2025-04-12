class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
    def saludo(self):
        print("Hola soy", self.nombre, "de", self.ciudad)
    def mayor(self):
        if self.edad >= 18:
            return True
        else:
            return False
persona1 = Persona("MArce", 25, "Inglaterra")
persona2 = Persona("Jesus", 17, "Portugal")
persona3 = Persona("Villalobos", 30, "Madrid")
persona1.saludo()
persona2.saludo()
persona3.saludo()
print(persona1.mayor())
print(persona2.mayor())
print(persona3.mayor())
