class Celular :
    def __init__(self,bateria):
        self.bateria = bateria
        self.memoria = 1024
        self.aplicaciones = [None]*20
        self.aplicacionesInstaladas = 0
    
    def instalarApp(self,app):
        if self.bateriaAgotada():
            print("celular apagado")
        else:
            if self.aplicacionesInstaladas < 20:
                self.aplicaciones[self.aplicacionesInstaladas] = app
                self.aplicacionesInstaladas+=1
                print(f"Aplicación '{app}' instalada.")
            else:
                print("No hay espacio para instalar la aplicacion")

    def probarAplicacion(self,tamaño_de_app,tiempo_de_uso):
        if self.bateriaAgotada():
            print("celular apagado")
        else:
            if tamaño_de_app == 100:
                self.bateria = self.bateria - ((tiempo_de_uso * 2)/(10))

            elif tamaño_de_app == 250:
                self.bateria = self.bateria - ((tiempo_de_uso * 5)/(10))
            else:
                self.bateria = self.bateria - ((tiempo_de_uso *1)/(10))
    
    def mostrarPorcentajedeBateria(self):
        print("La bateria esta en un {}%".format(self.bateria))
    
    def bateriaAgotada(self):
        return self.bateria == 0

Infnix= Celular(10)
Infnix.instalarApp("Facebook")
Infnix.probarAplicacion(250,20)
Infnix.mostrarPorcentajedeBateria()
Infnix.instalarApp("Instagram")


