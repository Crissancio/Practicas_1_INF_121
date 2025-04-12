class Bus:
    def __init__(self, modelo, placa, conductor, kilometraje, nroPasajeros):
        self.modelo = modelo
        self.placa = placa
        self.conductor = conductor
        self.kilometraje = kilometraje
        self.nroPasajeros = nroPasajeros
    def registrarViaje(self, distancia):
        self.kilometraje += distancia
        print("El kilometraje del Bus es: ", self.kilometraje, "km")
    def destino(self, destino, distancia):
        self.destino = destino
        self.distancia = distancia
        print("El destino es: ", destino, "y la distancia del inicio ahi es: ", distancia, "km")
    def mostrar(self):
        print("El modelo es; ", self.modelo, " el numreo de placa es: ", self.placa, " el conductor se llama: ", self.conductor, " su kilometraje es de: ", self.kilometraje, "tiene ", self.nroPasajeros, "pasajeros")
class Camioneta:
    def __init__(self, modelo, placa, conductor, kilometraje):
        self.modelo = modelo
        self.placa = placa
        self.conductor = conductor
        self.kilometraje = kilometraje
    def asignarConductor(self, nombre):
        self.conductor = nombre
        print("El conductor asignado es: ", nombre)
    def añoDeExperiencia(self, nombre, años):
        self.conductor = nombre
        self.años = años
        print("El conductor: ", nombre, "tiene", años, " años de experiencia")
    def mostrar(self):
        print("El modelo es; ", self.modelo, " el numreo de placa es: ", self.placa, " el conductor se llama: ", self.conductor, " su kilometraje es de: ", self.kilometraje)
Bus1 = Bus("Nissan", "1865pzq", "Otto", 500, 15)
Bus2 = Bus("Toyota", "9357hls", "Lui", 800, 19)
Camioneta1 = Camioneta("Chebrolett", "7624kdy", "Mario", 1000)
Bus1.mostrar()
Bus2.mostrar()
Camioneta1.mostrar()
Camioneta1.asignarConductor("Mario")
Camioneta1.añoDeExperiencia("Luigi", 15)
Bus1.registrarViaje(50)
Bus2.registrarViaje(50)
Bus1.destino("Oruro", 94)
Bus2.destino("Coroico", 104)