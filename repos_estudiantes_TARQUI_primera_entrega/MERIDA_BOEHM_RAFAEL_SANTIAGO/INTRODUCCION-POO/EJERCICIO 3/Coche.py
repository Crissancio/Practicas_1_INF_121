class Coche:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = 0

    def acelerar(self):
        self.velocidad += 10

    def frenar(self):
        self.velocidad -= 5
        if self.velocidad < 0:
            self.velocidad = 0

    def __str__(self):
        return f'Coche {self.marca} {self.modelo}, Velocidad: {self.velocidad} km/h'


c1 = Coche("Toyota", "Corolla")
c2 = Coche("Honda", "Civic")
c1.acelerar()
c1.acelerar()
c1.frenar()

c2.acelerar()
c2.frenar()
c2.frenar()

print(c1)
print(c2)


