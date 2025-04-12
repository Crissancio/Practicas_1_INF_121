class Oficina:
    def __init__(self, nroSillas, nroEscritorios, nroEstanterias):
        self.__nroSillas = nroSillas
        self.__nroEscritorios = nroEscritorios
        self.__nroEstanterias = nroEstanterias
    
    def mostrar(self):
        print("------Oficina------")
        return(f"""
            Nro de sillas: {self.__nroSillas}
            Nro de escritorios: {self.__nroEscritorios}
            Nro de estanterias: {self.__nroEstanterias}
            """)
        
    def cantidadMuebles(self):
        print("------Oficina------")
        total = self.__nroSillas + self.__nroEscritorios + self.__nroEstanterias
        return total
        
    
class Aula:
    def __init__(self,nombre, capacidad, nropupitres):
        self.__nombre = nombre
        self.__capacidad = capacidad
        self.__nropupitres = nropupitres
        
    def mostrar(self):
            print("-------Aula-------")
            return (f"""
                    Nombre: {self.__nombre}
                    Capacidad: {self.__capacidad}
                    Nro de pupitres: {self.__nropupitres}
                    """)
            
    def cantidadMuebles(self):
        print("-------Aula-------")
        total = self.__nropupitres
        return total
    
    def getNombre(self):
        return self.__nombre
            
class Laboratorio:
    def __init__(self, nombre, capacidad, nroMesas, nroSillas):
        self.__nombre = nombre
        self.__capacidad = capacidad
        self.__nroMesas = nroMesas
        self.__nroSillas = nroSillas
    def mostrar(self):
        print("------Laboratorio------")
        return(f"""
            Nombre: {self.__nombre}
            Capacidad: {self.__capacidad}
            Nro de mesas: {self.__nroMesas}
            Nro de sillas: {self.__nroSillas}
            """)
        
    def cantidadMuebles(self):
        print("------Laboratorio------")
        total = self.__nroMesas + self.__nroSillas
        return total
    def getNombre(self):
        return self.__nombre
#Main

#Instanciando los objetos
oficina_1 = Oficina(10, 10, 14)
oficina_2 = Oficina(12, 12, 20)

aula_1 = Aula("Aula1", 40, 45)
aula_2 = Aula("Aula2", 50, 60)

laboratorio = Laboratorio("Lab-1", 70, 65, 70)

#Llamando a los metodos
# print(f"Total de muebles : {oficina_1.cantidadMuebles()}")
# print(f"Total de muebles: {oficina_2.cantidadMuebles()}")

# print(f"Total de muebles en {aula_1.getNombre()}: {aula_1.cantidadMuebles()}")
# print(f"Total de muebles en {aula_2.getNombre()}: {aula_2.cantidadMuebles()}")

# print(f"Total de muebles en {laboratorio.getNombre()}: {laboratorio.cantidadMuebles()}")