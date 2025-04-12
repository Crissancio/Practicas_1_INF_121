class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad = self.velocidad + 10
        print("El coche esta acelerando ahora su velocidad es de:", self.velocidad)

    def frenar(self):
        self.velocidad = self.velocidad - 5
        if self.velocidad < 0:
            self.velocidad = 0
        print("El coche esta frenando su velocidad es de:", self.velocidad)

    

c1 = Coche("Toyota", "Corolla", 56)
c2 = Coche("Honda", "Civ", 39)

print("Marca:", c1.marca, ", Modelo:", c1.modelo, ", Velocidad:", c1.velocidad)
c1.acelerar()
c1.frenar()


print("Marca:", c2.marca, ", Modelo:", c2.modelo, ", Velocidad:", c2.velocidad)
c2.acelerar()
c2.frenar()
