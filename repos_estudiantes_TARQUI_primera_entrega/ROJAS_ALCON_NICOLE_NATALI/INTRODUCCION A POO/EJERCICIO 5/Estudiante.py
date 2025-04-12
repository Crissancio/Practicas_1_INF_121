class Estudiante:
    def __init__(self,nombre,nota_1,nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2
    def promedio(self):
        return (self.nota_1 + self.nota_2) / 2
    def aprobo(self):
        return (self.promedio() >= 6)
estudiante1 = Estudiante("Rolando",10,9)
estudiante2 = Estudiante("Paola",5,3)
estudiante3 = Estudiante("Nadir",6,6)

for estudiante in [estudiante1, estudiante2, estudiante3]:
    promedios = estudiante.promedio()
    estado = "Aprobó" if estudiante.aprobo()else "Reprobó"
    print(f"{estudiante.nombre}\nPromedio: {promedios:.1f} ---> {estado}")
