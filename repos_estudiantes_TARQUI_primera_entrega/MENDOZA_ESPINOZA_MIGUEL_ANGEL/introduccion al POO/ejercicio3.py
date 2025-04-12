class Coche:
    def __init__(self, marca, modelo,velocidad=0):
        self.marca=marca
        self.modelo=modelo
        self.velocidad = velocidad
    def acelerar(self):
        self.velocidad += 10
    def frenar(self):
        self.velocidad=max(0,self.velocidad - 5)
    def mostrar_velocidad(self):
        return f"{self.marca}{self.modelo} tiene una velocidad de {self.velocidad}km/m"
c1=Coche("toyota","corolla")
c2=Coche("ford","mustang")
c1.acelerar()
c1.acelerar()
c2.acelerar()
c1.frenar()
c2.frenar()
print(c1.mostrar_velocidad())
print(c2.mostrar_velocidad())