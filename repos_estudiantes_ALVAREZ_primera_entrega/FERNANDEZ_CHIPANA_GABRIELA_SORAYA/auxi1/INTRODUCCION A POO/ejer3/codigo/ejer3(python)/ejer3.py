class Estudiante:
    def __init__(self, nombre, nota1, nota2):
        self.nombre = nombre
        self.nota1 = nota1
        self.nota2 = nota2

    def promedio(self):
        return (self.nota1 + self.nota2) / 2

    def verificasiaprobo(self):
        if self.promedio() >= 5.5:
            return "aprobó"
        else:
            return "no aprobó"


# Programa principal
if __name__ == "__main__":
    e1 = Estudiante("Elvis", 5.1, 6)
    e2 = Estudiante("Ana", 3, 5)

    print("Promedio:", e1.promedio())
    print("Promedio:", e2.promedio())

    print(e1.nombre, e1.verificasiaprobo())
    print(e2.nombre, e2.verificasiaprobo())
