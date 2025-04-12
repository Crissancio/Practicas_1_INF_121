class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10

    def frenar(self):
        self.velocidad -= 5

def main():
    coche1 = Coche("Toyota", "Corolla", 0)
    coche2 = Coche("Ford", "Focus", 0)

    coche1.acelerar()
    coche1.acelerar()
    coche1.frenar()

    coche2.acelerar()
    coche2.frenar()
    coche2.frenar()

    print(f"Velocidad actual del coche1: {coche1.velocidad} km/h")
    print(f"Velocidad actual del coche2: {coche2.velocidad} km/h")

if __name__ == "__main__":
    main()
