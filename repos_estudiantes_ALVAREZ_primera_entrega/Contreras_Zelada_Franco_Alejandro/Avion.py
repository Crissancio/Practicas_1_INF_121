from datetime import datetime, timedelta

class Avion:
    def __init__(self, modelo, capacidad_maxima, combustible_litros, hora_vuelo):
        self.modelo = modelo
        self.capacidad_maxima = capacidad_maxima
        self.combustible_litros = combustible_litros
        self.hora_vuelo = hora_vuelo  
        self.pasajeros_actuales = 0

    def subir_pasajeros(self, cantidad):
        if self.pasajeros_actuales + cantidad <= self.capacidad_maxima:
            self.pasajeros_actuales += cantidad
            print(f"Subieron {cantidad} pasajeros. Total a bordo: {self.pasajeros_actuales}")
        else:
            print("¡No hay suficiente espacio para todos los pasajeros!")

    def verificar_combustible(self, distancia_km):
        combustible_necesario = distancia_km * 12
        if self.combustible_litros >= combustible_necesario:
            print(f"Combustible suficiente para {distancia_km} km.")
        else:
            print(f"⚠️ Combustible insuficiente para {distancia_km} km. Necesita {combustible_necesario}L, disponible: {self.combustible_litros}L.")

    def retrasar_vuelo(self, horas=3):
        self.hora_vuelo += timedelta(hours=horas)
        print(f"La hora de vuelo ha sido actualizada: {self.hora_vuelo.strftime('%H:%M')}")

    def mostrar_info(self):
        print(f"Modelo: {self.modelo}")
        print(f"Pasajeros a bordo: {self.pasajeros_actuales}/{self.capacidad_maxima}")
        print(f"Combustible disponible: {self.combustible_litros} litros")
        print(f"Hora de vuelo programada: {self.hora_vuelo.strftime('%H:%M')}")

hora_salida = datetime.strptime("14:30", "%H:%M")

avion1 = Avion(
    modelo="Boeing 747",
    capacidad_maxima=300,
    combustible_litros=50000,
    hora_vuelo=hora_salida
)

avion1.mostrar_info()
avion1.subir_pasajeros(250)
avion1.verificar_combustible(distancia_km=3500)
avion1.retrasar_vuelo()
avion1.mostrar_info()
