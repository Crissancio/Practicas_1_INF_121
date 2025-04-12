class Oficina:
    def __init__(self, nro_sillas, nro_escritorios, nro_estanterias):
        self.nro_sillas = nro_sillas
        self.nro_escritorios = nro_escritorios
        self.nro_estanterias = nro_estanterias

    def mostrar(self):
        print("Oficina:")
        print("Sillas:", self.nro_sillas)
        print("Escritorios:", self.nro_escritorios)
        print("Estanterías:", self.nro_estanterias)

    def cantidad_muebles(self):
        return self.nro_sillas + self.nro_escritorios + self.nro_estanterias


class Aula:
    def __init__(self, nombre, capacidad, nro_pupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nro_pupitres = nro_pupitres

    def mostrar(self):
        print("Aula:")
        print("Nombre:", self.nombre)
        print("Capacidad:", self.capacidad)
        print("Pupitres:", self.nro_pupitres)

    def cantidad_muebles(self):
        return self.nro_pupitres


class Laboratorio:
    def __init__(self, nombre, capacidad, nro_mesas, nro_sillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nro_mesas = nro_mesas
        self.nro_sillas = nro_sillas

    def mostrar(self):
        print("Laboratorio:")
        print("Nombre:", self.nombre)
        print("Capacidad:", self.capacidad)
        print("Mesas:", self.nro_mesas)
        print("Sillas:", self.nro_sillas)

    def cantidad_muebles(self):
        return self.nro_mesas + self.nro_sillas


def main():
    o1 = Oficina(6, 4, 4)
    o2 = Oficina(3, 3, 2)
    a1 = Aula("INF121", 95, 95)
    a2 = Aula("INF-133", 65, 65)
    l1 = Laboratorio("LASIN 1", 40, 35, 50)

    o1.mostrar()
    print("Total muebles:", o1.cantidad_muebles(), "\n")

    o2.mostrar()
    print("Total muebles:", o2.cantidad_muebles(), "\n")

    a1.mostrar()
    print("Total muebles:", a1.cantidad_muebles(), "\n")

    a2.mostrar()
    print("Total muebles:", a2.cantidad_muebles(), "\n")

    l1.mostrar()
    print("Total muebles:", l1.cantidad_muebles(), "\n")

main()
