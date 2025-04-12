class Oficina:
    def __init__(self, nroSillas, nroEscritorios, nroEstanterias):
        self.nroSillas = nroSillas
        self.nroEscritorios = nroEscritorios
        self.nroEstanterias = nroEstanterias

    def mostrar(self):
        #b) Método mostrar() para mostrar los datos
        print(f"Oficina - Sillas: {self.nroSillas}, Escritorios: {self.nroEscritorios}, Estanterías: {self.nroEstanterias}")

    def cantidadMuebles(self):
        #c) Método cantidadMuebles() para conocer el total de muebles
        return self.nroSillas + self.nroEscritorios + self.nroEstanterias

class Aula:
    def __init__(self, nombre, capacidad, nroPupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroPupitres = nroPupitres

    def mostrar(self):
        #b) Método mostrar() para mostrar los datos
        print(f"Aula - Nombre: {self.nombre}, Capacidad: {self.capacidad}, Pupitres: {self.nroPupitres}")

    def cantidadMuebles(self):
        #c) Método cantidadMuebles() para conocer el total de muebles
        return self.nroPupitres


class Laboratorio:
    def __init__(self, nombre, capacidad, nroMesas, nroSillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroMesas = nroMesas
        self.nroSillas = nroSillas

    def mostrar(self):
        #b) Método mostrar() para mostrar los datos
        print(f"Laboratorio - Nombre: {self.nombre}, Capacidad: {self.capacidad}, Mesas: {self.nroMesas}, Sillas: {self.nroSillas}")

    def cantidadMuebles(self):
        #c) Método cantidadMuebles() para conocer el total de muebles
        return self.nroMesas + self.nroSillas


#a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
oficina1 = Oficina(4, 2, 1)
oficina2 = Oficina(3, 3, 2)
aula1 = Aula("Aula 101", 30, 25)
aula2 = Aula("Aula 102", 40, 35)
lab1 = Laboratorio("Lab Física", 20, 10, 20)

oficina1.mostrar()
print("Total muebles:", oficina1.cantidadMuebles())

oficina2.mostrar()
print("Total muebles:", oficina2.cantidadMuebles())

aula1.mostrar()
print("Total muebles:", aula1.cantidadMuebles())

aula2.mostrar()
print("Total muebles:", aula2.cantidadMuebles())

lab1.mostrar()
print("Total muebles:", lab1.cantidadMuebles())
