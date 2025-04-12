# -*- coding: utf-8 -*-
"""
Created on Fri Apr 11 09:01:07 2025

@author: Fabricio
"""

"""
ENUNCIADO:
1. Sea la clase Videojuego:
a) Instanciar al menos 2 videojuegos
b) Sobrecargar el constructor 2 veces
c) Implementar un método mostrar()
d) Sobrecargar el método agregarJugadores() donde en el primero se agregue
   solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
"""
class Videojuego:
    def __init__(self, titulo, genero="Desconocido"):
        self.titulo = titulo
        self.genero = genero
        self.jugadores = 1

    def mostrar(self):
        print(f"Título: {self.titulo}")
        print(f"Género: {self.genero}")
        print(f"Jugadores: {self.jugadores}")

    def agregarJugadores(self, cantidad=1):
        self.jugadores += cantidad

# Sobrecargando
class VideojuegoEspecial(Videojuego):
    def __init__(self, titulo, genero, año):
        super().__init__(titulo, genero)
        self.año = año

    def mostrar(self):
        super().mostrar()
        print(f"Año: {self.año}")


juego1 = Videojuego("Lolcito", "moba")
juego2 = VideojuegoEspecial("Albion Online", "mmorpg no lineal donde tu escribres tu propia historia", 2023)

juego1.agregarJugadores()
juego2.agregarJugadores(4)

juego1.mostrar()
print("---")
juego2.mostrar()