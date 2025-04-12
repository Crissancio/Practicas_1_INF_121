class Usuario:
    def __init__(self, nombre, s):
        self.nombre = nombre
        self.s = s
class Banco:
    def __init__(self):
        self.usuarios = []
    def agregar(self, u):
        if len(self.usuarios) < 10:
            self.usuarios.append(u)
    def retirar(self, nombre, cantidad):
        for u in self.usuarios:
            if u.nombre == nombre:
                u.s = u.s - cantidad
    def depositar(self, nombre, cantidad):
        for u in self.usuarios:
            if u.nombre == nombre:
                u.s = u.s + cantidad
    def bono(self):
        for u in self.usuarios:
            u.s = u.s * 1.02
    def total(self):
        t = 0
        for u in self.usuarios:
            t = t + u.s
        print("Dinero total en el banco:", t)
b = Banco()
u1 = Usuario("Ana", 100)
u2 = Usuario("Luis", 200)
b.agregar(u1)
b.agregar(u2)
b.depositar("Ana", 50)
b.retirar("Luis", 30)
b.bono()
b.total()