class Computadora:
    def __init__(self):
        self.procesador = "Intel Core i5"  
        self.memoria_ram = "8GB"          
        self.almacenamiento = "500GB SSD" 
        self.tarjeta_grafica = "NVIDIA GeForce GTX 1650" 
        self.placa_madre = "ASUS Prime B450"
        self.fuente_poder = "500W"        
        self.encendida = False

    def mostrar_componentes(self):
        print("Componentes de la computadora:")
        print(f"  Procesador: {self.procesador}")
        print(f"  Memoria RAM: {self.memoria_ram}")
        print(f"  Almacenamiento: {self.almacenamiento}")
        print(f"  Tarjeta Gráfica: {self.tarjeta_grafica}")
        print(f"  Placa Madre: {self.placa_madre}")
        print(f"  Fuente de Poder: {self.fuente_poder}")

    def mostrar_estado(self):
        if self.encendida:
            print("La computadora esta encendida")
        else:
            print("La computadora esta apagada")

    def encender(self):
        if not self.encendida:
            print("Encendiendo la computadora...")
            self.encendida = True
        else:
            print("La computadora ya esta encendida")

    def apagar(self):
        if self.encendida:
            print("Apagando la computadora...")
            self.encendida = False
        else:
            print("La computadora ya esta apagada")


mi_computadora = Computadora()

mi_computadora.mostrar_componentes()
mi_computadora.mostrar_estado()

mi_computadora.encender()
mi_computadora.mostrar_estado()

mi_computadora.apagar()
mi_computadora.mostrar_estado()

mi_computadora.apagar() 
mi_computadora.encender() 