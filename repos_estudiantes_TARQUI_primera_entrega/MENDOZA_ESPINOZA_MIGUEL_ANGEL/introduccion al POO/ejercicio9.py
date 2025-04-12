class Computadora:
    def __init__(self, procesador, ram, almacenamiento, tarjeta_grafico):
        self.procesador=procesador
        self.ram=ram
        self.almacenamiento=almacenamiento
        self.tarjeta_graficca=tarjeta_grafico
        self.encendida= False
    def mostrar_componentes(self):
        print("compoentes de la computadora:")
        print(f"procesador:{self.procesador}")
        print(f"ram:{self.ram}")
        print(f"almacenamiento:{self.almacenamiento}")
        print(f"tarjeta grafica:{self.tarjeta_graficca}")
    def enceder(self):
        if not self.encendida:
            self.encendida= True
            print("la computadora se ha encendido")
        else:
            print("la computadora ya esta encendida")
    def apagar(self):
        if self.encendida:
            self.encendida = False
            print("la computadora se ha apagado")
        else:
            print("la computadora ya esta apagada")
    def mostrar_estado(self):
        estado="encendida"if self.encendida else "apagado"
        print(f"la computadora esta {estado}")
mi_pc= Computadora("intel core 17",16,512,"nvidia rtx 3060")
mi_pc.mostrar_componentes()
mi_pc.enceder()
mi_pc.mostrar_estado()
mi_pc.apagar()
mi_pc.mostrar_estado()