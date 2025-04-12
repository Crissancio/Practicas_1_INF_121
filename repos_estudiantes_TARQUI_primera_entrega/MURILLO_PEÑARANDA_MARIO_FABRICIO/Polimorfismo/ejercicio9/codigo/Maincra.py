# -*- coding: utf-8 -*-
"""
Created on Fri Apr 11 09:25:33 2025

@author: Fabricio
"""

"""
MAINCRA
ENUNCIADO:
9. Para los bloques del juego Minecraft:
a) Crear e instanciar al menos 2 bloques de cada tipo
b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
   distintos mensajes según el tipo de bloque
c) Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones
"""
class Bloque:
    def __init__(self, tipo):
        self.tipo = tipo

    def accion(self):
        print(f"Bloque {self.tipo}: No tiene acción especial")

    def colocar(self, orientacion="suelo"):
        print(f"Bloque {self.tipo} colocado en {orientacion}")

    def romper(self):
        print(f"Bloque {self.tipo} roto.")

class BloqueTnt(Bloque):
    def __init__(self):
        super().__init__("TNT")

    def accion(self):
        print("La TNT explotó!")

    def romper(self):
        print("Cuidado! La TNT explotará al romperse")

class BloqueHorno(Bloque):
    def __init__(self):
        super().__init__("Horno")

    def accion(self):
        print("El horno está fundiendo minerales")


bloque1 = Bloque("Piedra")
bloque2 = BloqueTnt()
bloque3 = BloqueHorno()

bloque1.accion()
bloque2.accion()
bloque3.accion()

bloque1.colocar()
bloque2.colocar("pared")
bloque3.colocar("techo")

bloque2.romper()