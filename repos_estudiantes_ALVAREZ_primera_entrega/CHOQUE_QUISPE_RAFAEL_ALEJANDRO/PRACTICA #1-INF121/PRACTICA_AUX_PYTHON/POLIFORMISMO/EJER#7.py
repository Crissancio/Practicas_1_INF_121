from multipledispatch import dispatch

class Perro:
    @dispatch(str, int, str)
    def __init__(self, nombre, edad, raza):
        self.nombre = nombre
        self.edad = edad
        self.raza = raza

    @dispatch()
    def hacerSonido(self):
        print(f"{self.nombre} dice: ¡Guau guau!")

    @dispatch(int)
    def hacerSonido(self, intensidad):
        sonido = "¡" + "GUAU " * intensidad + "!"
        print(f"{self.nombre} (raza: {self.raza}) gruñe: {sonido}")

    def moverse(self):
        print(f"{self.nombre} está corriendo.")

class Gato:
    @dispatch(str, str)
    def __init__(self, nombre, color):
        self.nombre = nombre
        self.color = color

    @dispatch()
    def hacerSonido(self):
        print(f"{self.nombre} dice: ¡Miau!")

    @dispatch(str)
    def hacerSonido(self, animo):
        sonido = "Ronroneo" if animo == "feliz" else "Bufido"
        print(f"{self.nombre} (color: {self.color}) hace: {sonido}")

    def moverse(self):
        print(f"{self.nombre} está saltando sigilosamente.")

class Pajaro:
    @dispatch(str, str)
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo

    @dispatch()
    def hacerSonido(self):
        print(f"{self.nombre} canta: ¡Pío pío!")

    @dispatch(bool)
    def hacerSonido(self, esDeNoche):
        sonido = "Canto nocturno" if esDeNoche else "Trino matutino"
        print(f"{self.nombre} ({self.tipo}) emite: {sonido}")

    def moverse(self):
        print(f"{self.nombre} está volando.")

if __name__ == "__main__":
    perro = Perro("Rex", 3, "Pastor Alemán")
    gato = Gato("Luna", "Negro")
    pajaro = Pajaro("Piolín", "Canario")

    print("--- SONIDOS ---")
    perro.hacerSonido()
    perro.hacerSonido(3)
    gato.hacerSonido()
    gato.hacerSonido("feliz")
    pajaro.hacerSonido()
    pajaro.hacerSonido(True)

    print("\n--- MOVIMIENTO ---")
    perro.moverse()
    gato.moverse()
    pajaro.moverse()