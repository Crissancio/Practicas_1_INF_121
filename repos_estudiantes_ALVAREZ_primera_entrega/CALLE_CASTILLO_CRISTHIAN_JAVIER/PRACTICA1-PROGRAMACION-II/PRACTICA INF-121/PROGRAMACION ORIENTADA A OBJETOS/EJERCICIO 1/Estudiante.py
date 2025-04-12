class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def verificar_aprobado(self):
        return self.calcular_promedio() >= 6

    def mostrar_info(self):
        promedio = self.calcular_promedio()
        print(f"{self.nombre} tiene un promedio de {promedio:.2f}")
        if self.verificar_aprobado():
            print("Estado: Aprobado")
        else:
            print("Estado: Reprobado")
        print("-" * 30)

est1 = Estudiante("Juan", 7.5, 6.0)
est2 = Estudiante("Carla", 5.0, 4.5)
est3 = Estudiante("Luis", 8.0, 9.0)

for estudiante in [est1, est2, est3]:
    estudiante.mostrar_info()
