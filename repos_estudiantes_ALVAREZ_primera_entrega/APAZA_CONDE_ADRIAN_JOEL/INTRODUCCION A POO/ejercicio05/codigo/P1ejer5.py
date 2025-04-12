# Ejercicio5 introduccion a POO: Crea una clase Estudiante con nombre, nota_1, nota_2
#         a) Agrega un método para calcular el promedio
#         b) Agrega un método para verificar si aprobó (promedio >=6)
#         c) Crea tres estudiantes, muestra sus promedios y si aprobaron
class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.__nombre = nombre
        self.__nota_1 = nota_1
        self.__nota_2 = nota_2
    # a) Agrega un método para calcular el promedio
    def promedio(self):
        return (self.__nota_1 + self.__nota_2) / 2
    # b) Agrega un método para verificar si aprobó (promedio >=6)
    def verificaAprobacion(self):
        promedio = self.promedio()
        print("el estudiante " + self.__nombre + " tiene un promedio de " + str(promedio), end='')
        if promedio >= 6:
            print(" aprobado ")
        else:
            print(" reprobado ")

# c)  creamos 3 estudiantes
e1 = Estudiante("Adrian", 10, 10)
e2 = Estudiante("Victor", 10, 5)
e3 = Estudiante("Ariel", 20, 20)

# a) calculamos el promedio
# b) verificamos la aprobación
e1.verificaAprobacion()
e2.verificaAprobacion()
e3.verificaAprobacion()
