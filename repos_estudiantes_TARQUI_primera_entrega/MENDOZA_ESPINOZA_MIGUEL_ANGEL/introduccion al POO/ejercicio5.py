class Estudiante:
    def __init__(self, nombre,nota_1,nota_2):
        self.nombre=nombre
        self.nota_1=nota_1
        self.nota_2=nota_2
    def calcular_promedio(self):
        return (self.nota_1+self.nota_2)/2
    def aprobo(self):
        return self.calcular_promedio()>=6
    def mostrar_resultado(self):
        promedio=self.calcular_promedio()
        estado="aprobo"if self.aprobo() else "reprobo"
        return f"{self.nombre}tiene un promedio de{promedio:.2f}y{estado}"
estudiante1=Estudiante("miguel",7,8)
estudiante2=Estudiante("ana",5,6)
estudiante3=Estudiante("carlos",3,4)
print(estudiante1.mostrar_resultado())
print(estudiante2.mostrar_resultado())
print(estudiante3.mostrar_resultado())
