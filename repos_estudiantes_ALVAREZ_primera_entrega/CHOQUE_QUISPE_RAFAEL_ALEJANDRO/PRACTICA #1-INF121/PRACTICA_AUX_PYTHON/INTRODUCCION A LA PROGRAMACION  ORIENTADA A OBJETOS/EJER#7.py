class Celular:
    def __init__(self):
        self.espacio_total = 1024
        self.aplicaciones = []
        self.bateria = 100

    def instalar_aplicacion(self, nombre, tamano):
        if len(self.aplicaciones) < 20 and self.espacio_total >= tamano:
            self.aplicaciones.append({"nombre": nombre, "tamano": tamano})
            self.espacio_total -= tamano
            print(f"Aplicación {nombre} instalada correctamente")
        else:
            print(f"No se pudo instalar {nombre}, espacio insuficiente o límite de apps alcanzado")

    def utilizar_aplicacion(self, nombre, minutos):
        if self.bateria <= 0:
            print("Celular apagado")
            return

        for app in self.aplicaciones:
            if app["nombre"] == nombre:
                tamano = app["tamano"]
                if tamano > 250:
                    consumo = (minutos / 10) * 5
                elif tamano > 100:
                    consumo = (minutos / 10) * 2
                else:
                    consumo = (minutos / 10) * 1

                self.bateria -= consumo
                if self.bateria <= 0:
                    self.bateria = 0
                    print(f"El celular se apagó mientras usabas {nombre}")
                else:
                    print(f"Usaste {nombre} por {minutos} minutos y consumiste {round(consumo)}% de batería")
                return

        print(f"La aplicación {nombre} no está instalada")

    def mostrar_bateria(self):
        print(f"Batería restante: {round(self.bateria)}%")

def main():
    celular = Celular()
    celular.instalar_aplicacion("Facebook", 300)
    celular.instalar_aplicacion("WhatsApp", 80)
    celular.instalar_aplicacion("YouTube", 150)

    celular.utilizar_aplicacion("Facebook", 30)
    celular.mostrar_bateria()

    celular.utilizar_aplicacion("YouTube", 40)
    celular.mostrar_bateria()

    celular.utilizar_aplicacion("WhatsApp", 100)
    celular.mostrar_bateria()

if __name__ == "__main__":
    main()
