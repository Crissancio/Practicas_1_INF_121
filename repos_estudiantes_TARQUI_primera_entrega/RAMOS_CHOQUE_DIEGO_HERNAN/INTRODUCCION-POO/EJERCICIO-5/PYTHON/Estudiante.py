class Estudiante():
    def __init__(self,nombre,nota_1,nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def promedio(self):
        return (self.nota_1 + self.nota_2) / 2
    
    def verificaciondeAprobacion(self):
        promedio = self.promedio()
        if promedio >= 6:
            return 'Aprobado'
        else:
            return 'Reprobado'
    
    def __str__(self):
        return f'Nombre: {self.nombre}, Nota 1: {self.nota_1}, Nota 2: {self.nota_2}, Promedio: {self.Promedio()}, Estado: {self.verificaciondeAprobacion()}'
    

estudiante1 = Estudiante("Juan", 5, 8)
estudiante2 = Estudiante("Maria",2 , 3)
print("Su promedio es: ", estudiante1.promedio(), " y  esta" , estudiante1.verificaciondeAprobacion())
print("Su promedio es: ", estudiante2.promedio(),  " y  esta" , estudiante2.verificaciondeAprobacion())