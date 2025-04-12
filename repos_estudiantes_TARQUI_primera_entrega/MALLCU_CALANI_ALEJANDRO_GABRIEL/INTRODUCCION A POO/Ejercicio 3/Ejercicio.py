class Coche:
    def __init__(self, marca, modelo, velocidad=0):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10
        return f"La velocidad ahora es {self.velocidad} km/h"

    def frenar(self):
        self.velocidad -= 5
        if self.velocidad < 0:
            self.velocidad = 0
        return f"La velocidad ahora es {self.velocidad} km/h"

# Crear dos coches
coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Ford", "Mustang")

# Acelerar y frenar los coches
print(coche1.acelerar())  # Toyota acelera
print(coche1.frenar())    # Toyota frena
print(coche2.acelerar())  # Ford acelera
print(coche2.frenar())    # Ford frena

# Mostrar las velocidades finales
print(f"El coche {coche1.marca} {coche1.modelo} tiene una velocidad de {coche1.velocidad} km/h")
print(f"El coche {coche2.marca} {coche2.modelo} tiene una velocidad de {coche2.velocidad} km/h")
