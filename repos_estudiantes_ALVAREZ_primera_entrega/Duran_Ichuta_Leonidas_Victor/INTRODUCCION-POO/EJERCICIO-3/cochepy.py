#3. Crea una clase Coche con marca, modelo y velocidad
#a) Agrega un método acelerar() que aumente la velocidad en 10
#b) Agrega un método frenar() que disminuya la velocidad en 5
#c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades

class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10
        print ("Acelerando coche")

    def frenar(self):
        self.velocidad -= 5
        print ("Frenanado coche")

    def velocidadFinal(self):
        print (f"La velocidad final de {self.marca} {self.modelo} es {self.velocidad}")

coche1 = Coche("nissan", "2020", 0)
coche2 = Coche("toyota", "2021", 30)

coche1.acelerar()
coche1.frenar()
coche1.velocidadFinal()

coche2.acelerar()
coche2.frenar()
coche2.velocidadFinal()
