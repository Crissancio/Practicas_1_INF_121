# -*- coding: utf-8 -*-
"""
Created on Fri Apr 11 09:24:14 2025

@author: Fabricio
"""

"""
ENUNCIADO:
5. Se hace referencia a algunos ambientes de la Universidad mediante las clases:
a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
b) Crear un método mostrar() para mostrar los datos de cada objeto
c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
   muebles dentro de cada ambiente
"""
class Ambiente:
    def __init__(self, nombre):
        self.nombre = nombre

    def mostrar(self):
        print(f"Ambiente: {self.nombre}")

    def cantidadMuebles(self):
        return 0

class Aula(Ambiente):
    def __init__(self, nombre, capacidad, nroSillas):
        super().__init__(nombre)
        self.capacidad = capacidad
        self.nroSillas = nroSillas

    def mostrar(self):
        super().mostrar()
        print(f"Capacidad: {self.capacidad} estudiantes")
        print(f"Sillas: {self.nroSillas}")

    def cantidadMuebles(self):
        return self.nroSillas

class Laboratorio(Ambiente):
    def __init__(self, nombre, nroComputadoras, nroSillas):
        super().__init__(nombre)
        self.nroComputadoras = nroComputadoras
        self.nroSillas = nroSillas

    def mostrar(self):
        super().mostrar()
        print(f"Computadoras: {self.nroComputadoras}")
        print(f"Sillas: {self.nroSillas}")

    def cantidadMuebles(self):
        return self.nroComputadoras + self.nroSillas


aula1 = Aula("Aula 101", 50, 30)
aula2 = Aula("Aula 202", 40, 25)
lab = Laboratorio("Lab de Informática", 20, 15)

aula1.mostrar()
print("Total muebles:", aula1.cantidadMuebles())
print("---")
aula2.mostrar()
print("Total muebles:", aula2.cantidadMuebles())
print("---")
lab.mostrar()
print("Total muebles:", lab.cantidadMuebles())