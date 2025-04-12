class Computadora:
    def __init__(self, procesador, ram_gb, almacenamiento_gb, tarjeta_grafica):
        self.procesador = procesador
        self.ram_gb = ram_gb
        self.almacenamiento_gb = almacenamiento_gb
        self.tarjeta_grafica = tarjeta_grafica
        self.encendida = False

    def mostrar_componentes(self):
        print("Componentes principales de la computadora:")
        print(f"Procesador: {self.procesador}")
        print(f"Memoria RAM: {self.ram_gb} GB")
        print(f"Almacenamiento: {self.almacenamiento_gb} GB")
        print(f"Tarjeta Gráfica: {self.tarjeta_grafica}")

    def estado(self):
        print("Estado de la computadora:", "Encendida" if self.encendida else "Apagada")

    def encender(self):
        if not self.encendida:
            self.encendida = True
            print("La computadora se ha encendido.")
        else:
            print("La computadora ya está encendida.")

    def apagar(self):
        if self.encendida:
            self.encendida = False
            print("La computadora se ha apagado.")
        else:
            print("La computadora ya está apagada.")
            
# Crear una instancia de la computadora
mi_pc = Computadora("Intel Core i7", 16, 512, "NVIDIA GTX 1660")

mi_pc.mostrar_componentes()
mi_pc.estado()

mi_pc.encender()
mi_pc.estado()

mi_pc.apagar()
mi_pc.estado()