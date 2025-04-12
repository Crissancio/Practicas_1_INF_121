class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    # Aumenta la velocidad en +10
    def acelerar(self):
        self.velocidad += 10
    
    # Disminuye la velocidad en -5
    def frenar(self):
        self.velocidad -= 5
        return self.velocidad  # Devolvemos la nueva velocidad
    
    def __str__(self):
        return f"Coche[Marca={self.marca}, Modelo={self.modelo}, Velocidad={self.velocidad}]"

# Pruebas
c1 = Coche("Toyota", 2021, 30)
c2 = Coche("Suzuki", 2025, 70)

# Coche 1 antes de acelerar
print("Coche 1: ",c1)
# Coche 2 antes de frenar
print("Coche 2: ",c2)

# Aumenta la velocidad en +10
print("Coche 1 Acelerando +10")
c1.acelerar()
print(c1)

# Disminuye la velocidad en -5
print("Coche 2 Frenando -5")
c2.frenar()
print(c2)