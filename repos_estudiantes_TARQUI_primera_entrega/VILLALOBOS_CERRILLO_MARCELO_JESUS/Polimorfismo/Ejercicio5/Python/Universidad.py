class Oficina:
    def __init__(self, nroSillas, nroEscritorios, nroEstanterias):
        self.nroSillas = nroSillas
        self.nroEscritorios = nroEscritorios
        self.nroEstanterias = nroEstanterias
    def cantidadDeMuebles(self):
        print("La cantidad de muebles es de: ", self.nroSillas + self.nroEscritorios + self.nroEstanterias)
    def mostrar(self):
        print("La cantida de sillas es: ", self.nroSillas, "la cantidad de escritorios es de", self.nroEscritorios, "la cantidad de estanterias es", self.nroEstanterias)
class Aula:
    def __init__(self, nombre, capacidad, nroPupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroPupitres = nroPupitres
    def cantidadDeMuebles(self):
        print("La cantidad de muebles es de: ", self.nroPupitres)
    def mostrar(self):
        print("el aula se llama: ", self.nombre, "la capacidad es para", self.capacidad, "la cantidad de pupitres es", self.nroPupitres)
class Laboratorio:
    def __init__(self, nombre, capacidad, nroMesas, nroSillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroMesas = nroMesas
        self.nroSillas = nroSillas
    def cantidadDeMuebles(self):
        print("La cantidad de muebles es de: ",self.nroMesas + self.nroSillas)
    def mostrar(self):
        print("el laboratorio se llama: ", self.nombre, "la capacidad es de", self.capacidad, "la cantidad de mesas es", self.nroMesas, "y la cantidad de sillas es de", self.nroSillas)
oficina1 = Oficina(50, 25, 8)
oficina2 = Oficina(35, 65, 15)
aula1 = Aula("A3-210519", 150, 150)
aula2 = Aula("A1-210409", 100, 100)
laboratorio1 = Laboratorio("A1-Lab1", 150, 75, 150)
oficina1.mostrar()
oficina2.mostrar()
aula1.mostrar()
aula2.mostrar()
laboratorio1.mostrar()
oficina1.cantidadDeMuebles()
oficina2.cantidadDeMuebles()
aula1.cantidadDeMuebles()
aula2.cantidadDeMuebles()
laboratorio1.cantidadDeMuebles()