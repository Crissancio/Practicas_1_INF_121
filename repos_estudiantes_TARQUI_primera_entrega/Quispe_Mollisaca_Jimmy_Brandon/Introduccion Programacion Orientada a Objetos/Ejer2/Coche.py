class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self, a):
        self.velocidad += a

    def frenar(self, f):
        if self.velocidad >= f:
            self.velocidad -= f
        else:
            self.velocidad = 0

    def mostrar_velocidad(self):
        print(f"Velocidad del coche ({self.marca} {self.modelo}): {self.velocidad} km/h")


coche1 = Coche("Toyota", "Corolla", 30)
coche2 = Coche("Ford", "Focus", 50)

coche1.acelerar(10)
coche2.acelerar(10)

coche1.frenar(5)
coche2.frenar(5)

print("--------Coches--------")
coche1.mostrar_velocidad()
coche2.mostrar_velocidad()