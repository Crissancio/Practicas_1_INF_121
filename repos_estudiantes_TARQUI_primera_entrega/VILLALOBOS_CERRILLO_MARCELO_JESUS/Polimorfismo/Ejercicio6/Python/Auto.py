class Auto:
    def __init__(self, modelo, placa, color):
        self.modelo = modelo
        self.placa = placa
        self.color = color
    def mostrar(self):
        print("El mode lo del auto es: ", self.modelo, "la placa es", self.placa, "y es de color", self.color)
    def nuevoAuto(self):
        print("\n-------------------------------------")
        self.modelo = input("Ingrese el modelo del auto: ")
        self.placa = input("Ingrese la placa del auto: ")
        self.color = input("Ingrese el color del auto: ")
a1 = Auto("hilux", "69XYZ", "Rojo")
a2 = Auto("Takoma", "5932OLH", "Amarillo")
a3 = Auto("Ranger", "L9KJ", "Verde")
a1.mostrar()
a2.mostrar()
a3.mostrar()
a1.nuevoAuto()
a1.mostrar()
a2.nuevoAuto()
a2.mostrar()
a3.nuevoAuto()
a3.mostrar()