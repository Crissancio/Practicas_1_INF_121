from Vehiculo import Vehiculo
class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio, cilindrada, motor):
        super().__init__(marca, modelo, año, precio)
        self.cilindrada = cilindrada
        self.motor = motor
    def mostrar_info(self):
        return super().mostrar_info(), "Cilindrada: ", self.cilindrada, "cc", "Tipo Motor:", self.motor