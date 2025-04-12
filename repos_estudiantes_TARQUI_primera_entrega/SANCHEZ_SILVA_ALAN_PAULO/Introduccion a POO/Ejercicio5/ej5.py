class Estudiante:
    def __init__(self, nombre, nota_1:float , nota_2:float):
        self.__nombre = nombre
        self.__nota_1 = nota_1
        self.__nota_2 = nota_2
    
    def promedio(self):
        if self.__nota_1 <= 10 and self.__nota_1 >= 0 and  self.__nota_2 <= 10 and self.__nota_2 >= 0:
            print(f"Promedio de {self.__nombre} es", end= " ")
            media= (self.__nota_1 + self.__nota_2)/2
            return media
    
    def aprobo(self):
        if (self.__nota_1 + self.__nota_2)/2 >= 6:
            print(f"{self.__nombre} aprobó")
        else:
            print(f"{self.__nombre} reprobó")

#Main
estudiante_1 = Estudiante("Alex" , 5 , 3)
estudiante_2 = Estudiante("German" , 10 , 2)
estudiante_3 = Estudiante("Juan" , 7 , 4)

#Mostrando promedios
print(estudiante_1.promedio())
print(estudiante_2.promedio())
print(estudiante_3.promedio())

estudiante_1.aprobo()
estudiante_2.aprobo()
estudiante_3.aprobo()