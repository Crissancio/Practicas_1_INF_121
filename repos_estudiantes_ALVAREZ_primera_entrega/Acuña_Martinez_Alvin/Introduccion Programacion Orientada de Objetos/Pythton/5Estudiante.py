# Clase Estudiante
class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    # a) Método para calcular el promedio
    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    # b) Método para verificar si aprobó
    def aprobo(self):
        return self.calcular_promedio() >= 6

    def mostrar_resultado(self):
        print(f"Estudiante: {self.nombre}")
        print(f"Promedio: {self.calcular_promedio()}")
        print(f"¿Aprobó? {'Sí' if self.aprobo() else 'No'}")
        print("----------------------")


# c) Crear 3 estudiantes y mostrar resultados
e1 = Estudiante("Valeria", 9.0, 8.5)
e2 = Estudiante("Emiliano", 3.5, 5.0)
e3 = Estudiante("Sofía", 6.5, 7.0)

e1.mostrar_resultado()
e2.mostrar_resultado()
e3.mostrar_resultado()
