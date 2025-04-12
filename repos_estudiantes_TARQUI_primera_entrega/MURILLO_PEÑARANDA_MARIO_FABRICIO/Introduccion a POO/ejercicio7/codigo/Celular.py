# -*- coding: utf-8 -*-
"""
Created on Fri Apr 11 08:04:59 2025

@author: Fabricio
"""

"""
ENUNCIADO:
7. Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio
a) Crea un método para instalar una nueva aplicación
b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más
   de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan
   más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza
   un 1% cada 10 minutos de uso)
c) Muestra el porcentaje de batería restante
d) Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar
   el mensaje de celular apagado
"""
class Celular:
    def __init__(self):
        self.bateria = 100
        self.aplicaciones = []
        self.espacioDisponible = 1024

    def instalarApp(self, nombre, tamañomb):
        if len(self.aplicaciones) >= 20:
            print("No se puede instalar: límite de apps alcanzado.")
            return
        if tamañomb > self.espacioDisponible:
            print("No se puede instalar: espacio insuficiente.")
            return

        self.aplicaciones.append({"nombre": nombre, "tamaño": tamañomb})
        self.espacioDisponible -= tamañomb
        print(f"App '{nombre}' instalada. Espacio restante: {self.espacioDisponible} MB")

    def usarApp(self, nombre, minutos):
        if self.bateria <= 0:
            print("Celular apagado. No se puede usar.")
            return

        for app in self.aplicaciones:
            if app["nombre"] == nombre:
                if app["tamaño"] > 250:
                    consumo = 5 * (minutos / 10)
                elif app["tamaño"] > 100:
                    consumo = 2 * (minutos / 10)
                else:
                    consumo = 1 * (minutos / 10)

                self.bateria = max(0, self.bateria - consumo)
                print(f"Usando '{nombre}'. Batería restante: {self.bateria:.1f}%")
                if self.bateria <= 0:
                    print("¡Batería agotada! Celular apagado.")
                return

        print(f"App '{nombre}' no encontrada.")


cel = Celular()
cel.instalarApp("WhatsApp", 80)
cel.instalarApp("Juego Pesado", 300)

cel.usarApp("WhatsApp", 30)
cel.usarApp("Juego Pesado", 20)
cel.usarApp("Instagram", 10)  