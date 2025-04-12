class Celular:
    def __init__(self):
        self.espacio_total = 1024  # Espacio total en MB
        self.espacio_disponible = 1024  # Espacio disponible en MB
        self.bateria = 100  # Porcentaje de batería
        self.aplicaciones = {}  # Diccionario de aplicaciones instaladas (nombre -> tamaño en MB)
        self.max_aplicaciones = 20  # Máximo de aplicaciones a instalar

    # a) Método para instalar una nueva aplicación
    def instalar_aplicacion(self, nombre, tamaño):
        # Verifica si hay espacio suficiente y si no excede el límite de aplicaciones
        if len(self.aplicaciones) < self.max_aplicaciones and self.espacio_disponible >= tamaño:
            self.aplicaciones[nombre] = tamaño
            self.espacio_disponible -= tamaño
            print(f"Aplicación '{nombre}' instalada con éxito.")
        else:
            print("No hay suficiente espacio o se alcanzó el límite de aplicaciones.")

    # b) Método para utilizar una aplicación
    def utilizar_aplicacion(self, nombre, tiempo):
        # Verifica si la batería es suficiente y si la aplicación existe
        if self.bateria <= 0:
            print("Celular apagado. No hay batería suficiente.")
            return
        
        if nombre not in self.aplicaciones:
            print(f"La aplicación '{nombre}' no está instalada.")
            return
        
        tamaño = self.aplicaciones[nombre]

        if tamaño > 250:
            consumo_bateria = (5 * (tiempo / 10))  # 5% por cada 10 minutos
        elif tamaño > 100:
            consumo_bateria = (2 * (tiempo / 10))  # 2% por cada 10 minutos
        else:
            consumo_bateria = (1 * (tiempo / 10))  # 1% por cada 10 minutos

        self.bateria -= consumo_bateria
        
        if self.bateria <= 0:
            print("Celular apagado. No hay batería suficiente.")
        else:
            print(f"Has usado '{nombre}' durante {tiempo} minutos. Batería restante: {self.bateria:.2f}%")

    # c) Método para mostrar el porcentaje de batería restante
    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria:.2f}%")

# Ejemplo de uso
celular = Celular()
celular.instalar_aplicacion("Instagram", 150)
celular.instalar_aplicacion("WhatsApp", 90)
celular.mostrar_bateria()
celular.utilizar_aplicacion("Instagram", 30)
celular.mostrar_bateria()
celular.utilizar_aplicacion("WhatsApp", 10)  
celular.mostrar_bateria()
