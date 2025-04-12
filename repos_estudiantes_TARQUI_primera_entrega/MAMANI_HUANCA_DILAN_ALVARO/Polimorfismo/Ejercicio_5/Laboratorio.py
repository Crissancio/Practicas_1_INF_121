class Laboratorio:
    #Constructor
    def __init__(self, nombre, capacidad, nroMesas, nroSillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroMesas = nroMesas
        self.nroSillas = nroSillas
    #Metodo Mostrar
    def mostrar(self):
        print("Laboratorio:")
        print(f"  Nombre: {self.nombre}")
        print(f"  Capacidad: {self.capacidad}")
        print(f"  Mesas: {self.nroMesas}")
        print(f"  Sillas: {self.nroSillas}")
    #Metodo Cantidad de Muebles
    def cantidadMuebles(self):
        return self.nroMesas + self.nroSillas
