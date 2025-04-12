class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10
        print(f"El coche {self.marca} {self.modelo} ha acelerado. Velocidad: {self.velocidad}")

    def frenar(self):
        if self.velocidad >= 5:
            self.velocidad -= 5
            print(f"El coche {self.marca} {self.modelo} ha frenado. Velocidad: {self.velocidad}")
        else:
            self.velocidad = 0
            print(f"El coche {self.marca} {self.modelo} ha frenado hasta detenerse. Velocidad: {self.velocidad}")


coche1 = Coche("Toyota", "Corolla", 0)
coche2 = Coche("Ford", "Focus", 20)

print(f"Velocidad inicial del coche 1: {coche1.velocidad}")
print(f"Velocidad inicial del coche 2: {coche2.velocidad}")

coche1.acelerar()
coche1.acelerar()
coche2.frenar()
coche1.frenar()
coche2.acelerar()

print(f"Velocidad final del coche 1: {coche1.velocidad}")
print(f"Velocidad final del coche 2: {coche2.velocidad}")