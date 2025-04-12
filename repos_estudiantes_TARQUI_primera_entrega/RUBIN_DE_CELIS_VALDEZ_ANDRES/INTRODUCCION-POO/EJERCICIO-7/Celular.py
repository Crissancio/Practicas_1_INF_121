class Celular:
    def __init__(self):
        self.espacio_total = 1024  
        self.espacio_ocupado = 0   
        self.aplicaciones = []     
        self.bateria = 100         

    def instalar_aplicacion(self, nombre, tamaño):
        if self.espacio_ocupado + tamaño > self.espacio_total:
            print(f"No hay suficiente espacio para instalar {nombre}.")
        elif len(self.aplicaciones) >= 20:
            print("No se pueden instalar más de 20 aplicaciones.")
        else:
            self.aplicaciones.append({"nombre": nombre, "tamaño": tamaño})
            self.espacio_ocupado += tamaño
            print(f"Aplicación {nombre} instalada correctamente.")

    def usar_aplicacion(self, nombre, minutos):
        if self.bateria <= 0:
            print("Celular apagado. No se puede usar ninguna aplicación.")
            return
        app = None
        for aplicacion in self.aplicaciones:
            if aplicacion["nombre"] == nombre:
                app = aplicacion
                break
        if not app:
            print(f"La aplicación {nombre} no está instalada.")
            return
        tamaño = app["tamaño"]
        if tamaño > 250:
            consumo = (minutos / 10) * 5
        elif tamaño > 100:
            consumo = (minutos / 10) * 2
        else:
            consumo = (minutos / 10) * 1
        self.bateria -= consumo
        if self.bateria < 0:
            self.bateria = 0
            print(f"Celular apagado. Batería agotada después de usar {nombre}.")
        else:
            print(f"Usando {nombre} durante {minutos} minutos. Batería restante: {self.bateria:.2f}%.")
    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria:.2f}%.")


celular = Celular()
celular.instalar_aplicacion("WhatsApp", 50)
celular.instalar_aplicacion("Instagram", 120)
celular.instalar_aplicacion("Juego Pesado", 300)
celular.usar_aplicacion("WhatsApp", 20)
celular.usar_aplicacion("Instagram", 30)
celular.usar_aplicacion("Juego Pesado", 10)
celular.mostrar_bateria()
celular.usar_aplicacion("WhatsApp", 50)
