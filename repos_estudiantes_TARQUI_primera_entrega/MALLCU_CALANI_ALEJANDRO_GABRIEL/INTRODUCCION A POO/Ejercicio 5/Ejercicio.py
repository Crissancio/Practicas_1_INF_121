class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def verificar_aprobacion(self):
        promedio = self.calcular_promedio()
        return promedio >= 6

# Crear tres estudiantes
estudiante1 = Estudiante("Maria", 7, 8)
estudiante2 = Estudiante("Juan", 5, 6)
estudiante3 = Estudiante("Sofia", 9, 10)

# Mostrar promedios y resultados de aprobación
for estudiante in [estudiante1, estudiante2, estudiante3]:
    promedio = estudiante.calcular_promedio()
    aprobado = "Sí" if estudiante.verificar_aprobacion() else "No"
    print(f"Estudiante: {estudiante.nombre}, Promedio: {promedio}, Aprobado: {aprobado}")
