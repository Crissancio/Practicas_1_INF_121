class Celular:
    def _init_(self):
        self.espacio_disponible = 1024
        self.aplicaciones_instaladas = 0
        self.bateria = 100
        self.max_apps = 5
        self.app1_nombre = self.app1_tamano = None
        self.app2_nombre = self.app2_tamano = None
        self.app3_nombre = self.app3_tamano = None
        self.app4_nombre = self.app4_tamano = None
        self.app5_nombre = self.app5_tamano = None

    def instalar_app(self, nombre, tamaño):
        if self.aplicaciones_instaladas >= self.max_apps:
            print(f"No se puede instalar {nombre}, límite de aplicaciones alcanzado.")
            return
        if tamaño > self.espacio_disponible:
            print(f"No se puede instalar {nombre}, no hay suficiente espacio.")
            return

        self.espacio_disponible -= tamaño
        self.aplicaciones_instaladas += 1

        if self.aplicaciones_instaladas == 1:
            self.app1_nombre, self.app1_tamano = nombre, tamaño
        elif self.aplicaciones_instaladas == 2:
            self.app2_nombre, self.app2_tamano = nombre, tamaño
        elif self.aplicaciones_instaladas == 3:
            self.app3_nombre, self.app3_tamano = nombre, tamaño
        elif self.aplicaciones_instaladas == 4:
            self.app4_nombre, self.app4_tamano = nombre, tamaño
        elif self.aplicaciones_instaladas == 5:
            self.app5_nombre, self.app5_tamano = nombre, tamaño

        print(f"{nombre} instalada correctamente. Espacio restante: {self.espacio_disponible} MB")

    def usar_app(self, nombre, tiempo_minutos):
        if self.bateria <= 0:
            print("Celular apagado. No puedes usar aplicaciones.")
            return

        tamaño = None
        if nombre == self.app1_nombre:
            tamaño = self.app1_tamano
        elif nombre == self.app2_nombre:
            tamaño = self.app2_tamano
        elif nombre == self.app3_nombre:
            tamaño = self.app3_tamano
        elif nombre == self.app4_nombre:
            tamaño = self.app4_tamano
        elif nombre == self.app5_nombre:
            tamaño = self.app5_tamano

        if tamaño is None:
            print(f"{nombre} no está instalada en el celular.")
            return

        if tamaño > 250:
            consumo = (tiempo_minutos // 10) * 5  # 5% cada 10 minutos
        elif tamaño > 100:
            consumo = (tiempo_minutos // 10) * 2  # 2% cada 10 minutos
        else:
            consumo = (tiempo_minutos // 10) * 1  # 1% cada 10 minutos

        if consumo > self.bateria:
            print("Batería insuficiente. Celular apagado.")
            self.bateria = 0
        else:
            self.bateria -= consumo
            print(f"Usaste {nombre} por {tiempo_minutos} minutos. Batería restante: {self.bateria}%")

    def mostrar_bateria(self):
        print(f"Batería actual: {self.bateria}%")
        if self.bateria == 0:
            print("Celular apagado.")
mi_celular = Celular()
mi_celular.instalar_app("WhatsApp", 50)
mi_celular.instalar_app("Instagram", 120)
mi_celular.instalar_app("Call of Duty", 300)
mi_celular.usar_app("Instagram", 30)
mi_celular.usar_app("Call of Duty", 40)
mi_celular.usar_app("WhatsApp", 20)
mi_celular.mostrar_bateria()