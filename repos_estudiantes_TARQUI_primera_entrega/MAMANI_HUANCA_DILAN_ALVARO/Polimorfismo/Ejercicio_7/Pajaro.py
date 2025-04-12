class Pajaro:
    def __init__(self, nombre, tipo):
        self.nombre=nombre
        self.tipo=tipo
    #Sobrecarga
    def hacerSonido(self):
        return print("Pio Pio...")
    #Metodo Moverse
    def moverse(self):
        return ("El pajaro vuela.")