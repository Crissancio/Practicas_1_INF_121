class Aula:
    #Constructor
    def __init__(self, nombre, capacidad, nroPupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroPupitres = nroPupitres
    #Metodo Mostrar
    def mostrar(self):
        print("Aula:")
        print(f"  Nombre: {self.nombre}")
        print(f"  Capacidad: {self.capacidad}")
        print(f"  Pupitres: {self.nroPupitres}")
    #Metodo Cantidad de Muebles
    def cantidadMuebles(self):
        return self.nroPupitres