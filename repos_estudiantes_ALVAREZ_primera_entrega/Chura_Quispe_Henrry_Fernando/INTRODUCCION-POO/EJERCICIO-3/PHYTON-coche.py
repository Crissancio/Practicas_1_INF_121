# Clase Coche
class Coche:
    def __init__(self, marca, modelo, velocidad=0):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    # Método para acelerar
    def acelerar(self):
        self.velocidad += 10
        print(f"{self.marca} {self.modelo} aceleró. Velocidad actual: {self.velocidad} km/h")

    # Método para frenar
    def frenar(self):
        if self.velocidad >= 5:  
            self.velocidad -= 5
        else:
            self.velocidad = 0
        print(f"{self.marca} {self.modelo} frenó. Velocidad actual: {self.velocidad} km/h")

    # Método para mostrar la velocidad actual
    def mostrar_velocidad(self):
        return f"{self.marca} {self.modelo} tiene una velocidad de {self.velocidad} km/h"


# Crear dos coches
coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Honda", "Civic")

# Acelerar y frenar los coches
coche1.acelerar()
coche1.acelerar()
coche1.frenar()
print(coche1.mostrar_velocidad())

coche2.acelerar()
coche2.frenar()
coche2.frenar()  # Frenar hasta llegar a velocidad 0
print(coche2.mostrar_velocidad())
