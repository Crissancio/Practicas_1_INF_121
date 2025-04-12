class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def aprobo(self):
        return self.calcular_promedio() >= 6

# Crear tres estudiantes
est1 = Estudiante("Ana", 7.5, 8.0)
est2 = Estudiante("Luis", 5.0, 6.0)
est3 = Estudiante("Carla", 4.5, 5.5)

# Mostrar resultados
estudiantes = [est1, est2, est3]

for est in estudiantes:
    promedio = est.calcular_promedio()
    estado = "Aprobó" if est.aprobo() else "No aprobó"
    print(f"{est.nombre} - Promedio: {promedio:.2f} - {estado}")