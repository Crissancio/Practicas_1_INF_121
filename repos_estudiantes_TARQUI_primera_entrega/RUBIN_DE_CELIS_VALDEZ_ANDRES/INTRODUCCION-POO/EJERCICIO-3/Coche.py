class Coche:
    
    def __init__(self, marca, modelo, velocidad=0):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad
        
    def acelerar(self):
        self.velocidad += 10
        print(f"{self.marca} {self.modelo} ha acelerado. Velocidad actual: {self.velocidad} km/h")

    def frenar(self):
        self.velocidad -= 5
        if self.velocidad < 0:
            self.velocidad = 0
        print(f"{self.marca} {self.modelo} ha frenado. Velocidad actual: {self.velocidad} km/h")

coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Ford", "Mustang")
coche1.acelerar()
coche2.acelerar()
coche1.frenar()
coche2.frenar()
print(f"Velocidad final de {coche1.marca} {coche1.modelo}: {coche1.velocidad} km/h")
print(f"Velocidad final de {coche2.marca} {coche2.modelo}: {coche2.velocidad} km/h")
