from Electrodomestico import Electrodomestico
class Lavadora(Electrodomestico):
    def __init__(self, precio, base, color, consumo, peso, carga):
        super().__init__(precio, base, color, consumo, peso)
        self.carga = carga
        