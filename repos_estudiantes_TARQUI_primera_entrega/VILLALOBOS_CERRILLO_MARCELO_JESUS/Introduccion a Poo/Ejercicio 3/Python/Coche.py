class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad
    def acelerar(self):
        self.velocidad = self.velocidad + 10
    def frenar(self):
        self.velocidad = self.velocidad - 5
c1 = Coche("Toyota", "Corolla", 0)
c2 = Coche("Ford", "Focus", 20)
c1.acelerar()
c1.frenar()
c2.acelerar()
c2.frenar()
print(c1.velocidad)
print(c2.velocidad)
