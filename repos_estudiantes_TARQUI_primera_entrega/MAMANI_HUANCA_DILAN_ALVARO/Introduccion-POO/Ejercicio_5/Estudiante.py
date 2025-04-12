class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    # Halla el Promedio
    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    # Verifica si Aprobo
    def aprobo(self):
        promedio = self.calcular_promedio() 
        if promedio >= 6:
            print("Aprobo")
        else: 
            print("Reprobo")
        print(f"{self.nombre} - Promedio: {promedio:.2f}")

#Main
class Main:
    e1 = Estudiante("Juan", 6, 8)
    e2 = Estudiante("Daniela", 3, 9)
    e3 = Estudiante("Gabriel", 6, 2)
    
    e1.aprobo()
    e2.aprobo()
    e3.aprobo()
