class Celular:
    def __init__(self):
        self.aplicaciones = []  
        self.espacio_disponible = 1024  
        self.bateria = 100 
        self.aplicaciones_instaladas = 0  

    def instalar_aplicacion(self, nombre, tamano):
        if self.aplicaciones_instaladas < 20 and self.espacio_disponible >= tamano:
            self.aplicaciones.append({"nombre": nombre, "tamano": tamano})
            self.espacio_disponible -= tamano
            self.aplicaciones_instaladas += 1
            print(f"Aplicación {nombre} instalada correctamente.")
        else:
            print("No hay espacio suficiente o ya se alcanzó el límite de aplicaciones.")

    def utilizar_aplicacion(self, nombre, minutos):
        if self.bateria <= 0:
            print("Celular apagado. No tienes batería suficiente.")
            return

        tamano_aplicacion = self.obtener_tamano_aplicacion(nombre)
        if tamano_aplicacion == -1:
            print("Aplicación no encontrada.")
            return

        consumo_bateria = self.calcular_consumo_bateria(tamano_aplicacion, minutos)
        if self.bateria - consumo_bateria < 0:
            print("No tienes suficiente batería para usar la aplicación.")
            self.bateria = 0
        else:
            self.bateria -= consumo_bateria
            print(f"Usando la aplicación {nombre} durante {minutos} minutos.")

    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria}%")

    def obtener_tamano_aplicacion(self, nombre):
        for app in self.aplicaciones:
            if app["nombre"] == nombre:
                return app["tamano"]
        return -1

    def calcular_consumo_bateria(self, tamano, minutos):
        if tamano > 250:
            consumo_por_10minutos = 5
        elif tamano > 100:
            consumo_por_10minutos = 2
        else:
            consumo_por_10minutos = 1
        return (minutos // 10) * consumo_por_10minutos

celular = Celular()
celular.instalar_aplicacion("WhatsApp", 50)
celular.instalar_aplicacion("Instagram", 200)
celular.instalar_aplicacion("Facebook", 300)
celular.utilizar_aplicacion("Facebook", 180)
celular.mostrar_bateria()
