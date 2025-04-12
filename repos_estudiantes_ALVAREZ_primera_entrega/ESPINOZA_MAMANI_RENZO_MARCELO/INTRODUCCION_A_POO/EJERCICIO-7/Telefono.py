class Celular:
    def __init__(self):
        self.espacio_total = 1024
        self.espacio_disponible = 1024
        self.max_apps = 20
        self.aplicaciones = {}  # clave: nombre, valor: tamaño
        self.bateria = 100  # porcentaje

    def instalar_app(self, nombre, tamaño_mb):
        if len(self.aplicaciones) >= self.max_apps:
            print(f"No se puede instalar '{nombre}': se alcanzó el límite de 20 aplicaciones.")
        elif tamaño_mb > self.espacio_disponible:
            print(f"No se puede instalar '{nombre}': espacio insuficiente.")
        elif nombre in self.aplicaciones:
            print(f"La aplicación '{nombre}' ya está instalada.")
        else:
            self.aplicaciones[nombre] = tamaño_mb
            self.espacio_disponible -= tamaño_mb
            print(f"Aplicación '{nombre}' instalada. Espacio restante: {self.espacio_disponible} MB")

    def usar_app(self, nombre, minutos):
        if self.bateria <= 0:
            print("Celular apagado. Sin batería.")
            return

        if nombre not in self.aplicaciones:
            print(f"La aplicación '{nombre}' no está instalada.")
            return

        tamaño = self.aplicaciones[nombre]
        bloques = minutos // 10

        if tamaño > 250:
            consumo = 5 * bloques
        elif tamaño > 100:
            consumo = 2 * bloques
        else:
            consumo = 1 * bloques

        if consumo >= self.bateria:
            print(f"Intentaste usar '{nombre}' pero la batería se agotó. Celular apagado.")
            self.bateria = 0
        else:
            self.bateria -= consumo
            print(f"Usaste '{nombre}' por {minutos} minutos. Batería restante: {self.bateria}%")

    def mostrar_bateria(self):
        if self.bateria <= 0:
            print("Celular apagado. Sin batería.")
        else:
            print(f"Batería restante: {self.bateria}%")


cel = Celular()
cel.instalar_app("Instagram", 120)
cel.instalar_app("Juego Pesado", 300)
cel.instalar_app("Notas", 50)

cel.usar_app("Juego Pesado", 30)  # 5% * 3 = 15%
cel.mostrar_bateria()

cel.usar_app("Notas", 50)         # 1% * 5 = 5%
cel.mostrar_bateria()

cel.usar_app("Instagram", 100)    # 2% * 10 = 20%
cel.mostrar_bateria()

cel.usar_app("Juego Pesado", 200) # debería apagar el celular
cel.mostrar_bateria()
