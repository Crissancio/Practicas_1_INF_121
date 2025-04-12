class Aplicacion:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def __str__(self):
        return f'{self.nombre} ({self.peso}Mb)'


class Celular:
    def __init__(self):
        self.apps = []
        self.espacio_disponible = 1024
        self.bateria = 100

    def instalar(self, app):
        if len(self.apps) < 20 and app.peso <= self.espacio_disponible:
            self.apps.append(app)
            self.espacio_disponible -= app.peso
            print(f'Aplicación {app.nombre} instalada.')
        else:
            print("No hay espacio suficiente para instalar la aplicación.")

    def usar(self, nombre, minutos):
        if self.bateria <= 0:
            print("Celular apagado")
            return
        for app in self.apps:
            if app.nombre == nombre:
                if app.peso > 250:
                    gasto = (minutos // 10) * 5
                elif app.peso > 100:
                    gasto = (minutos // 10) * 2
                else:
                    gasto = (minutos // 10) * 1

                self.bateria -= gasto
                if self.bateria <= 0:
                    self.bateria = 0
                    print("Celular apagado")
                else:
                    print(f'Usando {app.nombre} por {minutos} minutos.')
                return
        print("Aplicación no encontrada.")

    def mostrar_bateria(self):
        print(f'Batería restante: {self.bateria}%')

    def __str__(self):
        return f'Celular con {len(self.apps)} apps, Espacio libre: {self.espacio_disponible}Mb, Batería: {self.bateria}%'


c = Celular()
a1 = Aplicacion("WhatsApp", 150)
a2 = Aplicacion("Juego", 300)
a3 = Aplicacion("Notas", 50)

c.instalar(a1)
c.instalar(a2)
c.instalar(a3)

c.usar("Juego", 30)
c.mostrar_bateria()

c.usar("Notas", 20)
c.mostrar_bateria()

c.usar("WhatsApp", 60)
c.mostrar_bateria()

print(c)