class Aplicacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño  # en MB

class Celular:
    def __init__(self):
        self.aplicaciones = []
        self.espacio_disponible = 1024  # en MB
        self.bateria = 100.0  

    def instalar_aplicacion(self, nombre, tamaño):
        if len(self.aplicaciones) >= 20:
            print("No se pueden instalar más de 20 aplicaciones.")
        elif tamaño > self.espacio_disponible:
            print("No hay suficiente espacio para instalar esta aplicación.")
        else:
            self.aplicaciones.append(Aplicacion(nombre, tamaño))
            self.espacio_disponible -= tamaño
            print(f"Aplicación '{nombre}' instalada exitosamente.")

    def usar_aplicacion(self, nombre, minutos):
        if self.bateria <= 0:
            print("Celular apagado")
            return

        app = next((a for a in self.aplicaciones if a.nombre == nombre), None)
        if not app:
            print(f"La aplicación '{nombre}' no está instalada.")
            return

        if app.tamaño > 250:
            consumo = 5 * (minutos / 10)
        elif app.tamaño > 100:
            consumo = 2 * (minutos / 10)
        else:
            consumo = 1 * (minutos / 10)

        self.bateria -= consumo
        if self.bateria < 0:
            self.bateria = 0

        print(f"Usaste '{nombre}' por {minutos} minutos. Batería actual: {self.bateria:.2f}%")
        if self.bateria == 0:
            print("Celular apagado")

    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria:.2f}%")

mi_celular = Celular()

mi_celular.instalar_aplicacion("Facebook", 300)
mi_celular.instalar_aplicacion("WhatsApp", 90)
mi_celular.instalar_aplicacion("YouTube", 250)

mi_celular.usar_aplicacion("Facebook", 30)   
mi_celular.usar_aplicacion("WhatsApp", 20)   
mi_celular.usar_aplicacion("YouTube", 40)    

mi_celular.mostrar_bateria()
