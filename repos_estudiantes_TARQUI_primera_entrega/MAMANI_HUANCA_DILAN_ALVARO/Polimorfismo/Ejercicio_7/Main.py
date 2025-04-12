from Perro import Perro
from Gato import Gato
from Pajaro import Pajaro

class Main:
    def run(self):
        #Instanciamos
        perro1=Perro("Oso",2,"Mestizo")
        gato1=Gato("Minina", "Bicolor")
        pajaro1=Pajaro("Onix","Condor")
        #Animales hacen Sonido
        print("Perro:")
        perro1.hacerSonido()
        perro1.moverse()

        print("\nGato:")
        gato1.hacerSonido()
        gato1.moverse()

        print("\nPájaro:")
        pajaro1.hacerSonido()
        pajaro1.moverse()

#Ejecucion
if __name__ == "__main__":
    programa = Main()
    programa.run()