class Vehiculo:
    def __init__(self, marca, modelo, año, precio):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio = precio
    def mostrar_info(self):
        return "Marca: ", self.marca, "Modelo: ", self.modelo, "Año: ", self.año, "Precio Base: ", self.precio 