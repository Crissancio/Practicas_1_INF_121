class Aplicacion:
    def __init__(self, nombre, p):
        self.nombre = nombre
        self.p = p
class Celular:
    def __init__(self):
        self.e = 1024
        self.bateria = 100
        self.apps = []
    def intalar(self, app):
        if len(self.apps) < 20 and app.p <= self.e:
            self.apps.append(app)
            self.e = self.e - app.p
        else:
            print("no puedo instalarlo")
    def usar(self, nombre, minutos):
        if self.bateria <= 0:
            print("se apago :(")
            return
        for app in self.apps:
            if app.nombre == nombre:
                if app.p > 250:
                    gasto = 5
                elif app.p > 100:
                    gasto = 2
                else:
                    gasto = 1
                total = (minutos / 10) * gasto
                self.bateria = self.bateria - total
                if self.bateria <= 0:
                    self.bateria = 0
                    print("se apago :(")
                return
    def mostrar(self):
        print("Batería:", self.bateria, "%")
cel = Celular()
app1 = Aplicacion("Facebook", 300)
app2 = Aplicacion("Notas", 50)
cel.intalar(app1)
cel.intalar(app2)
cel.usar("Facebook", 30)
cel.mostrar()