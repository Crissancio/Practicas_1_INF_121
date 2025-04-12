class Computadora:
    def __init__(self, marca, modelo, componentes):
        self.marca = marca
        self.modelo = modelo
        self.componentes = componentes  
        self.estado = False  

    def encender(self):
        self.estado = True
        print("La computadora ha sido encendida.")

    def apagar(self):
        self.estado = False
        print("La computadora ha sido apagada.")

    def mostrar_estado(self):
        estado_str = "Encendida" if self.estado else "Apagada"
        print(f"Estado: {estado_str}")

    def mostrar_componentes(self):
        print("Componentes de la computadora:")
        for comp in self.componentes:
            print(f"- {comp}")

componentes_pc = ["Procesador Intel i7", "8GB RAM", "SSD 512GB", "Tarjeta gráfica NVIDIA", "Placa madre ASUS"]

mi_pc = Computadora("Lenovo", "ThinkPad", componentes_pc)

mi_pc.mostrar_componentes()
mi_pc.mostrar_estado()
mi_pc.encender()
mi_pc.mostrar_estado()
mi_pc.apagar()
mi_pc.mostrar_estado()

