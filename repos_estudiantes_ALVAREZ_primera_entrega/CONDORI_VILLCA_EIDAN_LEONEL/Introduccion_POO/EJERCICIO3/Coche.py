class Coche:
    def __init__(self,marca,modelo,velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad
    def acelerar(self):
        self.velocidad += 10
        print(f"El coche {self.marca} aceleró a {self.velocidad} km/h.")

    def frenar(self):
        self.velocidad = self.velocidad - 5
        print(f"El coche {self.marca} frenó a {self.velocidad} km/h.")

    def mostrar(self):
        print(f"La  Velociad del Coche {self.marca} despues de frenar es : {self.velocidad} km/h")
coche1 = Coche("Toyota", "Corolla", 20)
coche1.acelerar()
coche1.frenar()
coche1.mostrar()
coche2 = Coche("Ford", "Mustang", 50)
coche2.acelerar()  
coche2.frenar()
coche2.mostrar()
