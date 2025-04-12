class Computadora:
    def __init__(self, marca, modelo, procesador, memoria, almacenamiento, pantalla):
        """
        Inicializa los componentes principales de la computadora.
        """
        self.marca = marca  
        self.modelo = modelo 
        self.procesador = procesador  
        self.memoria = memoria  
        self.almacenamiento = almacenamiento  
        self.pantalla = pantalla  
        self.estado = "Apagado"  

    def encender(self):
        """
        Simula encender la computadora.
        Cambia el estado de la computadora a 'Encendido'.
        """
        if self.estado == "Apagado":
            self.estado = "Encendido"
            print(f"La computadora {self.marca} {self.modelo} está encendida.")
        else:
            print(f"La computadora {self.marca} {self.modelo} ya está encendida.")

    def apagar(self):
        """
        Simula apagar la computadora.
        Cambia el estado de la computadora a 'Apagado'.
        """
        if self.estado == "Encendido":
            self.estado = "Apagado"
            print(f"La computadora {self.marca} {self.modelo} está apagada.")
        else:
            print(f"La computadora {self.marca} {self.modelo} ya está apagada.")

    def mostrar_estado(self):
        """
        Muestra el estado actual de la computadora (Encendido o Apagado).
        """
        print(f"El estado de la computadora {self.marca} {self.modelo} es: {self.estado}")

    def mostrar_componentes(self):
        """
        Muestra los componentes principales de la computadora.
        """
        print(f"Componentes de la computadora {self.marca} {self.modelo}:")
        print(f"Procesador: {self.procesador}")
        print(f"Memoria: {self.memoria} GB")
        print(f"Almacenamiento: {self.almacenamiento} GB")
        print(f"Pantalla: {self.pantalla} pulgadas")


# c) Crear una instancia de la computadora con nuevos datos
mi_computadora = Computadora(
    marca="HP", 
    modelo="Omen 15", 
    procesador="AMD Ryzen 7", 
    memoria=32, 
    almacenamiento=1024, 
    pantalla=17.3
)

# b) Mostrar el estado inicial (Apagado)
mi_computadora.mostrar_estado()

# a) Mostrar los componentes principales de la computadora
mi_computadora.mostrar_componentes()

# c) Simular el encendido y mostrar el estado después de encenderla
mi_computadora.encender()
mi_computadora.mostrar_estado()

# c) Simular el apagado y mostrar el estado después de apagarla
mi_computadora.apagar()
mi_computadora.mostrar_estado()
