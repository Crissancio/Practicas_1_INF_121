class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def verificar_aprobado(self):
        promedio = self.calcular_promedio()
        if promedio >= 6:
            print(f"{self.nombre} aprobó con promedio {promedio}")
        else:
            print(f"{self.nombre} no aprobó, su promedio es {promedio}")

def main():
    estudiante1 = Estudiante("Pedro", 7, 8)
    estudiante2 = Estudiante("María", 5, 6)
    estudiante3 = Estudiante("Luis", 4, 3)

    estudiante1.verificar_aprobado()
    estudiante2.verificar_aprobado()
    estudiante3.verificar_aprobado()

if __name__ == "__main__":
    main()
