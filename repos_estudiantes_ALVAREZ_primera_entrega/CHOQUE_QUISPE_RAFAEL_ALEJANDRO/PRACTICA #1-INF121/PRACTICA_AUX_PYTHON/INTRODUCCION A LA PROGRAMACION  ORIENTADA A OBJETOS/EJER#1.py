class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def mostrar_saludo(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    def es_mayor_de_edad(self):
        if self.edad >= 18:
            print(f"Sí tiene {self.edad} años, es mayor de edad")
        else:
            print(f"No tiene {self.edad} años, es menor de edad")

def main():
    persona1 = Persona("Andrea", 20, "La Paz")
    persona2 = Persona("Carlos", 17, "Cochabamba")
    persona3 = Persona("Lucía", 25, "Santa Cruz")

    persona1.mostrar_saludo()
    persona1.es_mayor_de_edad()

    persona2.mostrar_saludo()
    persona2.es_mayor_de_edad()

    persona3.mostrar_saludo()
    persona3.es_mayor_de_edad()

if __name__ == "__main__":
    main()
