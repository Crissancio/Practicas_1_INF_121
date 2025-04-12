class Computadora:
    def __init__(self, procesador, ram, almacenamiento, tarjeta_grafica):
        self.procesador = procesador
        self.ram = ram
        self.almacenamiento = almacenamiento
        self.tarjeta_grafica = tarjeta_grafica
        self.encendida = False

    def mostrar_componentes(self):
        print(f"Procesador: {self.procesador}")
        print(f"RAM: {self.ram}")
        print(f"Almacenamiento: {self.almacenamiento}")
        print(f"Tarjeta gráfica: {self.tarjeta_grafica}")

    def mostrar_estado(self):
        estado = "encendida" if self.encendida else "apagada"
        print(f"La computadora está {estado}")

    def encender(self):
        self.encendida = True
        print("La computadora se ha encendido")

    def apagar(self):
        self.encendida = False
        print("La computadora se ha apagado")

def main():
    compu = Computadora("Intel i7", "16GB", "1TB", "NVIDIA GTX 1660")
    compu.mostrar_componentes()
    compu.mostrar_estado()
    compu.encender()
    compu.mostrar_estado()
    compu.apagar()
    compu.mostrar_estado()

if __name__ == "__main__":
    main()
