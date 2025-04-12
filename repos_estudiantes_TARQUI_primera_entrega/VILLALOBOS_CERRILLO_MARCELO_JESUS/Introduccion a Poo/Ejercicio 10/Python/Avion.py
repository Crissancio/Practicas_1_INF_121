class Avion:
    def __init__(self):
        self.pasajeros = 0
        self.combustible = 100000
        self.hrVuelo = "10:00"
    def subir(self, cantidad):
        self.pasajeros = self.pasajeros + cantidad
    def conbustible(self, distancia):
        necesario = distancia * 12
        if necesario > self.combustible:
            print("No hay suficiente combustible")
        else:
            self.combustible = self.combustible - necesario
    def retraso(self):
        print("Vuelo retrasado 3 horas")
        self.hrVuelo = "13:00"
a = Avion()
a.subir(100)
a.conbustible(500)
a.retraso()
print("Nueva hora de vuelo:", a.hrVuelo)
