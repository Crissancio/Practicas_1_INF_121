class Computadora:
    def __init__(self):
        self.estado = "apagada"
    def componentes(self):
        print("Procesador, RAM, Disco Duro, Tarjeta Madre")
    def encender(self):
        self.estado = "encendida"
        print("La computadora está encendida")
    def apagar(self):
        self.estado = "apagada"
        print("La computadora está apagada")
c = Computadora()
c.componentes()
c.encender()
c.apagar()
