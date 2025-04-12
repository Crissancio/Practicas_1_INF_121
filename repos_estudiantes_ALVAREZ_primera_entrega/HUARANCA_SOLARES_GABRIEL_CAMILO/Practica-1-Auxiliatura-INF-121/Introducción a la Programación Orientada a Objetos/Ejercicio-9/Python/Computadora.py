class Computadora:
    def __init__(self, marca, modelo, procesador, ramGB, almacenamientoGB):
        self.__marca = marca
        self.__modelo = modelo
        self.__procesador = procesador
        self.__ramGB = ramGB
        self.__almacenamientoGB = almacenamientoGB
        self.encendida = False

    def encender(self):
        if not self.encendida:
            self.encendida = True
            print("La computadora se está encendiendo...")
            print("¡Computadora encendida!")
        else:
            print("La computadora ya está encendida.")

    def apagar(self):
        if self.encendida:
            self.encendida = False
            print("La computadora se está apagando...")
            print("¡Computadora apagada!")
        else:
            print("La computadora ya está apagada.")

    def mostrar_estado(self):
        estado = "encendida" if self.encendida else "apagada"
        print(f"Estado actual: {estado}")

    # Getters (no son estrictamente necesarios en Python, pero los incluyo para equivalencia)
    def get_marca(self):
        return self.__marca

    def get_modelo(self):
        return self.__modelo

    def get_procesador(self):
        return self.__procesador

    def get_ramGB(self):
        return self.__ramGB

    def get_almacenamientoGB(self):
        return self.__almacenamientoGB

    def is_encendida(self):
        return self.encendida


if __name__ == "__main__":
    miPC = Computadora("Asus", "ExpertCenter AiO", "Intel ® Celeron ®", 8, 32)
    print("-----------------------------------------------------------------------")
    print("Computadora")
    print("-----------------------------------------------------------------------")
    print(f"- Marca: {miPC.get_marca()}")
    print(f"- Modelo: {miPC.get_modelo()}")
    print(f"- Procesador: {miPC.get_procesador()}")
    print(f"- RAM: {miPC.get_ramGB()} GB")
    print(f"- Almacenamiento: {miPC.get_almacenamientoGB()} GB")
    print("-----------------------------------------------------------------------")
    miPC.mostrar_estado()
    print("-----------------------------------------------------------------------")
    print("\nEncendiendo la computadora...")
    miPC.encender()
    miPC.mostrar_estado()
    print("-----------------------------------------------------------------------")
    print("\nApagando la computadora...")
    miPC.apagar()
    miPC.mostrar_estado()
    print("-----------------------------------------------------------------------")
