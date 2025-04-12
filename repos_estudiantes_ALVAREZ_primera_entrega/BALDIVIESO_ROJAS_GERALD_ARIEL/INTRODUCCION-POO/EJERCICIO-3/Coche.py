class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad
    def acelerar(self):
        self.velocidad += 10
    def frenar(self):
        self.velocidad -= 5
    def __str__(self):
        return f"{self.marca}, {self.modelo} su velocidad es {self.velocidad}"
    
x = Coche("tesla", "X", 70)
y = Coche("toyota","rav4", 120)
print(x)
print(y)
#-----------------------------------------
x.acelerar()
x.frenar()
#-------------------------------------
y.acelerar()
y.frenar()
print("----------------------------------")
print(x)
print(y)
