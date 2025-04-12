class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
    def descuento(self):
        if self.precio % 2 == 0:
            self.precio = self.precio * 0.90
        else:
            self.precio = self.precio * 0.85
p1 = Producto("Pan", 10)
p2 = Producto("Leche", 15)
p3 = Producto("Queso", 20)
p1.descuento()
p2.descuento()
p3.descuento()
print(p1.precio)
print(p2.precio)
print(p3.precio)
p4 = Producto("Jugo", 12)
p5 = Producto("Galletas", 13)
p6 = Producto("Café", 22)
p7 = Producto("Arroz", 19)
p4.descuento()
p5.descuento()
p6.descuento()
p7.descuento()
s = p4.precio + p5.precio + p6.precio + p7.precio
print("total:", s)
