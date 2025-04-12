class Computadora:
    def __init__(self):
        self.componentes = {
            "CPU": "Intel i7",
            "Memoria RAM": "16GB",
            "Disco Duro": "1TB",
            "Tarjeta Gráfica": "NVIDIA GTX 1650"
        }
        self.estado = "Apagada"  
    def mostrar_componentes(self):
        print("Componentes principales de la computadora:")
        for componente, detalle in self.componentes.items():
            print(f"{componente}: {detalle}")
    def mostrar_estado(self):
        print(f"Estado de la computadora: {self.estado}")
    def encender(self):
        if self.estado == "Apagada":
            self.estado = "Encendida"
            print("La computadora está encendida.")
        else:
            print("La computadora ya está encendida.")
    def apagar(self):
        if self.estado == "Encendida":
            self.estado = "Apagada"
            print("La computadora está apagada.")
        else:
            print("La computadora ya está apagada.")



computadora = Computadora()
computadora.mostrar_componentes()
computadora.mostrar_estado()

computadora.encender()
computadora.mostrar_estado()

computadora.apagar()
computadora.mostrar_estado()

computadora.apagar()
