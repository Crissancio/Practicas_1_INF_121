class Oficina:
    def __init__(self, nro_sillas, nro_escritorios, nro_estanterias):
        self.nro_sillas = nro_sillas
        self.nro_escritorios = nro_escritorios
        self.nro_estanterias = nro_estanterias

    def mostrar(self):
        return f"Oficina - Sillas: {self.nro_sillas}, Escritorios: {self.nro_escritorios}, Estanterías: {self.nro_estanterias}"

    def cantidad_muebles(self):
        return self.nro_sillas + self.nro_escritorios + self.nro_estanterias


class Aula:
    def __init__(self, nombre, capacidad, nro_pupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nro_pupitres = nro_pupitres

    def mostrar(self):
        return f"Aula - Nombre: {self.nombre}, Capacidad: {self.capacidad}, Pupitres: {self.nro_pupitres}"

    def cantidad_muebles(self):
        return self.nro_pupitres


class Laboratorio:
    def __init__(self, nombre, capacidad, nro_mesas, nro_sillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nro_mesas = nro_mesas
        self.nro_sillas = nro_sillas

    def mostrar(self):
        return f"Laboratorio - Nombre: {self.nombre}, Capacidad: {self.capacidad}, Mesas: {self.nro_mesas}, Sillas: {self.nro_sillas}"

    def cantidad_muebles(self):
        return self.nro_mesas + self.nro_sillas


# Instanciar objetos
oficina1 = Oficina(4, 2, 1)
oficina2 = Oficina(6, 3, 2)
aula1 = Aula("Aula A", 40, 40)
aula2 = Aula("Aula B", 35, 35)
laboratorio1 = Laboratorio("Lab 101", 25, 10, 15)

# Mostrar datos y cantidad de muebles
ambientes = [oficina1, oficina2, aula1, aula2, laboratorio1]

for ambiente in ambientes:
    print(ambiente.mostrar())
    print(f"Cantidad total de muebles: {ambiente.cantidad_muebles()}")
