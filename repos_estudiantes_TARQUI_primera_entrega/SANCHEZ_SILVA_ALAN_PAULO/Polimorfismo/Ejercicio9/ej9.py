class BloqueCofre:
    def __init__(self, capacidad, resistencia, tipo):
        self.__capacidad = capacidad
        self.__resistencia = resistencia
        self.__tipo = tipo
    
    def accion(self):
        print(f"El cofre de tipo {self.__tipo} y resistencia de {self.__resistencia} puede almacenar hasta {self.__capacidad} objetos")

    def colocar(self, lugar):
        if lugar:
            print(f"Bloque colocado en {lugar}")
            
    def romper(self):
        print("El cofre se rompe y se caen todos los objetos guardados")
    
class BloqueTnt:
    def __init__(self, tipo, daño):
        self.__tipo = tipo
        self.__daño = daño
        
    def accion(self):
        print(f"La TNT de tipo {self.__tipo} esta lista para explotar")
    
    def colocar(self, lugar):
        if lugar:
            print(f"Bloque TNT colocado en {lugar}")

    def romper(self):
        print(f"La TNT explota causando {self.__daño} de daño")

        
class BloqueHorno:
    def __init__(self, color, capacidadComida):
        self.__color = color
        self.__capacidadComida = capacidadComida

    def accion(self):
        print(f"El horno de capacidad de comida de  {self.__capacidadComida} y color {self.__color} está cocinando comida")
    
    def colocar(self, lugar):
        if lugar:
            print(f"Bloque horno colocando en {lugar}")
            
    def romper(self):
        print("El horno se rompe y deja caer su contenido")

#Main

#Instanciando objetos
bloque_cofre_1 = BloqueCofre(20, 5, "madera")
bloque_cofre_2 = BloqueCofre(40, 10, "hierro")

bloque_tnt_1 = BloqueTnt("Normal", 50)
bloque_tnt_2 = BloqueTnt("Potente", 100)

bloque_horno_1 = BloqueHorno("Gris", 3)
bloque_horno_2 = BloqueHorno("Negro", 5)
#Llamando a los métodos
print("------------------Métodos-----------------")
print("-----Bloque-Cofre----")
bloque_cofre_1.accion()
bloque_cofre_1.colocar("pared")
bloque_cofre_1.romper()

print()

bloque_cofre_2.accion()
bloque_cofre_2.colocar("pared")
bloque_cofre_2.romper()
print("-----Bloque-TNT-----")
bloque_tnt_1.accion()
bloque_tnt_1.colocar("pared")
bloque_tnt_1.romper()

print()

bloque_tnt_2.accion()
bloque_tnt_2.colocar("pared")
bloque_tnt_2.romper()
print("-----Bloque-Horno-----")
bloque_horno_1.accion()
bloque_horno_1.colocar("pared")
bloque_horno_1.romper()

print()

bloque_horno_2.accion()
bloque_horno_2.colocar("pared")
bloque_horno_2.romper()

