class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10

    def frenar(self):
        self.velocidad -= 5

    def mostrar_velocidad(self):
        print(f"{self.marca} {self.modelo} va a {self.velocidad} km/h")

coche1 = Coche("Toyota", "Corolla", 0)
coche2 = Coche("Ford", "Bronco", 20)

coche1.acelerar()
coche1.acelerar()
coche1.frenar()
coche1.mostrar_velocidad()

coche2.frenar()
coche2.acelerar()
coche2.mostrar_velocidad()
