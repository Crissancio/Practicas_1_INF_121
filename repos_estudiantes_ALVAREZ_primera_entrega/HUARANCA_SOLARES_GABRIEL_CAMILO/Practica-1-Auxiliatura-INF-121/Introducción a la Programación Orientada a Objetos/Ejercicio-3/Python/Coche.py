class Coche:
    def __init__(self,marca,modelo,velocidad):
        self.__marca = marca
        self.__modelo = modelo
        self.__velocidad = velocidad
    def acelerar(self):
        self.__velocidad = self.__velocidad+10
        return self.__velocidad
    def frenar(self):
        if (self.__velocidad>=5):
            self.__velocidad = self.__velocidad-5
        else:
            self.__velocidad = 0
        return self.__velocidad    
    def muestravelocidades(self):
        print(f"Marca: {self.__marca} \nModelo: {self.__modelo} \nVelocidad: {self.__velocidad} km/h")
c1 = Coche("Porsche","718 Cayman GT4 RS",249)
print("---------------------------------------------------------------------")
print("Introduccion a POO: ")
print("Ejercicio 3:")
print("---------------------------------------------------------------------")
print("Coches")
print("---------------------------------------------------------------------")
c1.muestravelocidades()
print("---------------------------------------------------------------------")
print("Velocidad Inicial: ",c1._Coche__velocidad,"km/h")
newvelocidad = c1.acelerar()
print(f"Velocidad al Acelerar: {newvelocidad} km/h")
frvelocidad = c1.frenar()
print(f"Velocidad al Frenar: {frvelocidad} km/h")
print("---------------------------------------------------------------------")
c2 = Coche("Lamborghini","Aventador LP700-4",290)
c2.muestravelocidades()
print("---------------------------------------------------------------------")
print("Velocidad Inicial: ",c2._Coche__velocidad,"km/h")
newovelocidad = c2.acelerar()
print(f"Velocidad al Acelerar: {newovelocidad} km/h")
fruvelocidad = c2.frenar()
print(f"Velocidad al Frenar: {fruvelocidad} km/h")
print("---------------------------------------------------------------------")
