class Estudiante:
    def __init__(self, nombre, nota1, nota2):
        self.nombre = nombre
        self.nota1 = nota1
        self.nota2 = nota2
    def promedio(self):
        return (self.nota1 + self.nota2) / 2
    def aprobo(self):
        if self.promedio() >= 6:
            return True
        else:
            return False
e1 = Estudiante("Luna", 7, 8)
e2 = Estudiante("Mario", 5, 4)
e3 = Estudiante("Julia", 6, 6)
print(e1.nombre, e1.promedio(), e1.aprobo())
print(e2.nombre, e2.promedio(), e2.aprobo())
print(e3.nombre, e3.promedio(), e3.aprobo())