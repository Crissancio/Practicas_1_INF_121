class Computadora:
    def __init__(self, memoria_ram, procesador, dispositivo_de_almacenamiento):
        self.__memoria = memoria_ram
        self.__procesador = procesador
        self.__almacenamiento = dispositivo_de_almacenamiento
        
    def mostrar_componentes(self):
        print("-------COMPONENTES------")
        print(
            f'''
            Memoria:{self.__memoria} GB
            Procesador: {self.__procesador}
            Almacenamiento: {self.__almacenamiento}
            '''
        )
        
    def encender(self):
        esta_encendido = True
        if esta_encendido == True:
            print("Computadora encendida")
            
    def apagar(self):
        esta_encendido = False
        if esta_encendido == False:
            print("Computadora apgada")
            
#Main
computadora_1 = Computadora(16, "Intel Core" , "SSD")
computadora_1.mostrar_componentes()
computadora_1.encender()
computadora_1.apagar()
computadora_1.encender()