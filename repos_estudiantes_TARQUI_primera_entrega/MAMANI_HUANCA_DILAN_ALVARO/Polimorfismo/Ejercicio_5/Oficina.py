class Oficina:
    #Constructor
    def __init__(self, nroSillas, nroEscritorios, nroEstanterias):
        self.nroSillas=nroSillas
        self.nroEscritorios=nroEscritorios
        self.nroEstanderias=nroEstanterias
    #Metodo Mostrar
    def mostrar(self):
        print("Oficina:")
        print(f"  Sillas: {self.nroSillas}")
        print(f"  Escritorios: {self.nroEscritorios}")
        print(f"  Estanterias: {self.nroEstanderias}") 
    #Metodo Cantidad de Muebles
    def cantidadMuebles(self):
        return self.nroSillas + self.nroEscritorios + self.nroEstanderias