class Perro:
    def __init__(self, nombre, edad, raza):
        self.nombre=nombre
        self.edad=edad
        self.raza=raza
#b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
#característico   
    def hacerSonido(self):
        return print("Guau...!")
    #Metodo Moverse
    def moverse(self):
        return print("El perro corre.")  
    def moverse(self):
        return print("El perro Saltar.")  
    def moverse(self):
        return print("El perro Volar.")