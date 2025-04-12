class Celular:
    def __init__(self, espacio_total=1024, bateria=100):
        self.espacio_total = espacio_total  # Espacio en Mb
        self.espacio_disponible = espacio_total
        self.bateria = bateria  # Porcentaje de batería
        self.aplicaciones = {}

    def instalar_aplicacion(self, nombre, tamaño):
        if tamaño > self.espacio_disponible:
            return f"No hay suficiente espacio para instalar {nombre}."
        self.aplicaciones[nombre] = tamaño
        self.espacio_disponible -= tamaño
        return f"Aplicación {nombre} instalada con éxito."

    def utilizar_aplicacion(self, nombre, minutos):
        if nombre not in self.aplicaciones:
            return f"La aplicación {nombre} no está instalada."
        tamaño = self.aplicaciones[nombre]
        if tamaño > 250:
            consumo = (5 * minutos) / 10
        elif tamaño > 100:
            consumo = (2 * minutos) / 10
        else:
            consumo = (1 * minutos) / 10
        if self.bateria - consumo <= 0:
            self.bateria = 0
            return "Celular apagado por batería agotada."
        self.bateria -= consumo
        return f"Usaste {nombre} por {minutos} minutos. Batería restante: {self.bateria}%."

    def mostrar_bateria(self):
        return f"Batería restante: {self.bateria}%"

# Prueba de la clase
celular = Celular()
print(celular.instalar_aplicacion("WhatsApp", 50))
print(celular.instalar_aplicacion("YouTube", 300))
print(celular.utilizar_aplicacion("YouTube", 20))
print(celular.mostrar_bateria())
print(celular.utilizar_aplicacion("WhatsApp", 50))
print(celular.utilizar_aplicacion("Spotify", 40))  # App no instalada
