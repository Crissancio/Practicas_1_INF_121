class Coche:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = 0

    def acelerar(self):
        self.velocidad += 10
        print("El coche", self.marca, self.modelo, "aceleró:", self.velocidad, "km/h")

    def frenar(self):
        if self.velocidad >= 5:
            self.velocidad -= 5
        else:
            self.velocidad = 0
        print("El coche", self.marca, self.modelo, "frenó:", self.velocidad, "km/h")


if __name__ == "__main__":
    c1 = Coche("Toyota", "Corolla")
    c2 = Coche("Ford", "Fiesta")

    c1.acelerar()
    c1.frenar()

    c2.acelerar()
    c2.acelerar()
    c2.frenar()

    print("Velocidad final del", c1.marca, c1.modelo + ":", c1.velocidad, "km/h")
    print("Velocidad final del", c2.marca, c2.modelo + ":", c2.velocidad, "km/h")
