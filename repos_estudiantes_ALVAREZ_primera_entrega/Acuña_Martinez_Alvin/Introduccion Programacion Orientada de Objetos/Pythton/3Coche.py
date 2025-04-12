class Coche:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = 0

    # a) Método acelerar
    def acelerar(self):
        self.velocidad += 10

    # b) Método frenar
    def frenar(self):
        self.velocidad -= 5
        if self.velocidad < 0:
            self.velocidad = 0

    # c) Método para mostrar los datos
    def mostrar_datos(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Velocidad: {self.velocidad} km/h")

# d) Crear dos coches con datos diferentes
coche1 = Coche("Nissan", "GTR")
coche2 = Coche("Chevrolet", "Camaro")

# e) Acelerar y frenar los coches
coche1.acelerar()  # velocidad = 10
coche1.acelerar()  # velocidad = 20
coche1.frenar()    # velocidad = 15

coche2.acelerar()  # velocidad = 10
coche2.frenar()    # velocidad = 5
coche2.acelerar()  # velocidad = 15

# Mostrar los datos finales
coche1.mostrar_datos()
coche2.mostrar_datos()
