class Perro:
    def hacerSonido(self):
        print("----Perro----")
        return "guau! guau! guau!"
    
    def moverse(self):
        return "correr"
    
class Gato:
    def hacerSonido(self):
        print("----Gato----")
        return "miau miau"
    
    def moverse(self):
        return "saltar"
    
class Pajaro:
    def hacerSonido(self):
        print("----Pajaro----")
        return "pio pio pio"
    
    def moverse(self):
        return "volar"
    
#Main

#Instanciando clases
perro = Perro()
gato = Gato()
pajaro = Pajaro()

#Llamando a los métodos
print(perro.hacerSonido())
print(perro.moverse())

print(gato.hacerSonido())
print(gato.moverse())

print(pajaro.hacerSonido())
print(pajaro.moverse())
