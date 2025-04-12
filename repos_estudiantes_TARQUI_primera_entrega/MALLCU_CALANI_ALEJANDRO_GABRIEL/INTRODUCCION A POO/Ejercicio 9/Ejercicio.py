class Computadora:
    def __init__(self, procesador, memoria_ram, almacenamiento):
        self.procesador = procesador
        self.memoria_ram = memoria_ram
        self.almacenamiento = almacenamiento
        self.encendida = False

    def encender(self):
        self.encendida = True
        return "La computadora está encendida."

    def apagar(self):
        self.encendida = False
        return "La computadora está apagada."

    def mostrar_estado(self):
        estado = "encendida" if self.encendida else "apagada"
        return f"La computadora está {estado}."

    def mostrar_componentes(self):
        return f"Procesador: {self.procesador}, RAM: {self.memoria_ram}GB, Almacenamiento: {self.almacenamiento}GB"

# Crear una instancia de la clase Computadora
mi_computadora = Computadora("Intel i7", 16, 512)

# Mostrar componentes principales
print(mi_computadora.mostrar_componentes())  # Muestra los componentes

# Simular encender y apagar la computadora
print(mi_computadora.encender())  # Enciende la computadora
print(mi_computadora.mostrar_estado())  # Muestra el estado actual
print(mi_computadora.apagar())  # Apaga la computadora
print(mi_computadora.mostrar_estado())  # Muestra el estado actual
