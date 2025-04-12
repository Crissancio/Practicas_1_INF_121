class Computadora:
    def __init__(self, procesador, memoriaRAM, almacenamiento, tarjetaGrafica):
        self.procesador = procesador
        self.memoriaRAM = memoriaRAM
        self.almacenamiento = almacenamiento
        self.tarjetaGrafica = tarjetaGrafica
        self.encendida = False

    def encender(self):
        if not self.encendida:
            self.encendida = True
            print("La computadora se ha encendido.")
        else:
            print("La computadora ya estaba encendida.")

    def apagar(self):
        if self.encendida:
            self.encendida = False
            print("La computadora se ha apagado.")
        else:
            print("La computadora ya estaba apagada.")

    def mostrarEstado(self):
        print("Procesador:", self.procesador)
        print("Memoria RAM:", self.memoriaRAM, "GB")
        print("Almacenamiento:", self.almacenamiento, "GB")
        print("Tarjeta grafica:", self.tarjetaGrafica)
        print("Estado:", "Encendida" if self.encendida else "Apagada")
        print("-------------------------------")

if __name__ == "__main__":
    pc = Computadora("Intel Core i7", 16, 512, "NVIDIA GTX 1660")
    pc.mostrarEstado()
    pc.encender()
    pc.mostrarEstado()
    pc.apagar()
    pc.mostrarEstado()
