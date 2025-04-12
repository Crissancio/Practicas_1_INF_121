class Coche:
    # atributos
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        print("Acelerando...")
        return self.velocidad + 10

    def frenar(self):
        print("Frenando...")
        return self.velocidad - 5

if __name__ == "__main__":
    peta = Coche("Toyota", "Corolla", 100)
    ferrari = Coche("Ferrari", "F40", 200)

    print("-------------------------------------------------")
    print("peta funcionando, velocidad inicial:", peta.velocidad, "km/h")
    print(peta.acelerar())
    print(peta.frenar())
    print("-------------------------------------------------")
    print("ferrari funcionando, velocidad inicial:", ferrari.velocidad, "km/h")
    print(ferrari.acelerar())
    print(ferrari.frenar())
