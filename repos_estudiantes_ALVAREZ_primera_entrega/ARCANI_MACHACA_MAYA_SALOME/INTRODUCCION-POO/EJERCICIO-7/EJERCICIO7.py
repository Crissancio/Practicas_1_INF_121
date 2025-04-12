class Celular:
    def __init__(self):
        self.__espacio = 1024
        self.__apps = []
        self.__bateria = 100

    def instalar_app(self, nombre, peso):
        if len(self.__apps) < 20 and self.__espacio >= peso:
            self.__apps.append((nombre, peso))
            self.__espacio -= peso

    def usar_app(self, nombre, peso):
        if self.__bateria <= 0:
            print("Celular apagado")
            return
        consumo = 1
        if peso > 250:
            consumo = 5
        elif peso > 100:
            consumo = 2
        self.__bateria -= consumo
        if self.__bateria <= 0:
            self.__bateria = 0
            print("Celular apagado")

    def mostrar_bateria(self):
        print(f"Batería: {self.__bateria}%")

    def __str__(self):
        return f"Apps: {self.__apps}, Espacio: {self.__espacio}Mb, Batería: {self.__bateria}%"
