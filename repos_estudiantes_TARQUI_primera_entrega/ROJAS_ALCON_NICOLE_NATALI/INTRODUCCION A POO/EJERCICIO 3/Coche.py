class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad
    def acelerar(self):
        self.velocidad += 10
        print(f"{self.marca} {self.modelo} acelerando... {self.velocidad} km/h")
    def frenar(self):
        self.velocidad = max(0, self.velocidad - 5)  
        print(f"{self.marca} {self.modelo} frenando... {self.velocidad} km/h")

coche1 = Coche("Toyota", "Corolla",160)
coche2 = Coche("Mitsubishi", "Montero",100)
coche1.acelerar()
coche2.acelerar()
coche1.frenar()
coche2.frenar()

