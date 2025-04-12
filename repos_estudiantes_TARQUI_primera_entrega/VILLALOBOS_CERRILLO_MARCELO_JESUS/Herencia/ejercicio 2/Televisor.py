from Electrodomestico import Electrodomestico
class Televisor(Electrodomestico):
    def __init__(self, precio, base, color, consumo, peso, resolucion, sintonizador):
        super().__init__(precio, base, color, consumo, peso)
        self.resolucion = resolucion
        self.sintonizador = sintonizador