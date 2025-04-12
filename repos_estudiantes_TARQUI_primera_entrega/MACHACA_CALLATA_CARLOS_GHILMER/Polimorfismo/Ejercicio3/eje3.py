#5. Se hace referencia a algunos de los diferentes ambientes de la Universidad
#mediante las siguientes clases:

#a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
#b) Crear un método mostrar() para mostrar los datos de cada objeto
#c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
#muebles dentro de cada ambiente





class Oficina:
    def __init__(self, nroSillas, nroEscritorios, nroEstanterias):
        self.__nroSillas = nroSillas
        self.__nroEscritorios = nroEscritorios
        self.__nroEstanterias = nroEstanterias

    def __str__(self):
         return (
            "Oficina:\n"
            f"  Número de sillas: {self.__nroSillas}\n"
            f"  Número de escritorios: {self.__nroEscritorios}\n"
            f"  Número de estanterías: {self.__nroEstanterias}"
        )

    def cantidadMuebles(self):
        return self.__nroSillas + self.__nroEscritorios + self.__nroEstanterias

class Aula:
    def __init__(self, nombre, capacidad, nropupitres):
        self.__nombre = nombre
        self.__capacidad = capacidad
        self.__nropupitres = nropupitres

    def __str__(self):
        return (
            "Aula:\n"
            f"  Nombre: {self.__nombre}\n"
            f"  Capacidad: {self.__capacidad}\n"
            f"  Número de pupitres: {self.__nropupitres}"
        )

    def cantidadMuebles(self):
        return self.__nropupitres

class Laboratorio:
    def __init__(self, nombre, capacidad, nroMesas, nroSillas):
        self.__nombre = nombre
        self.__capacidad = capacidad
        self.__nroMesas = nroMesas
        self.__nroSillas = nroSillas

    def __str__(self):
       return (
            "Laboratorio:\n"
            f"  Nombre: {self.__nombre}\n"
            f"  Capacidad: {self.__capacidad}\n"
            f"  Número de mesas: {self.__nroMesas}\n"
            f"  Número de sillas: {self.__nroSillas}"
        )

    def cantidadMuebles(self):
        return self.__nroMesas + self.__nroSillas


oficina1 = Oficina(10, 5, 3)
oficina2 = Oficina(8, 4, 2)
aula1 = Aula("PB A1", 50, 50)
aula2 = Aula("PB A2", 30, 30)
laboratorio1 = Laboratorio("Lab Fisica", 20, 5, 15)

print(oficina1)
print("------------------------------")
print(oficina2)
print("------------------------------")
print(aula1)
print("------------------------------")
print(aula2)
print("------------------------------")
print(laboratorio1)
print("------------------------------")
print(" CANTIDAD DE MUEBLES ")
print(f"En la oficina1 hay {oficina1.cantidadMuebles()} muebles")
print(f"En la oficina2 hay {oficina2.cantidadMuebles()} muebles")
print("------------------------------")
print(f"En el aula1 hay {aula1.cantidadMuebles()} muebles")
print(f"En el aula2 hay {aula2.cantidadMuebles()} muebles")
print("------------------------------")
print(f"En el laboratorio1 hay {laboratorio1.cantidadMuebles()} muebles")


