from Oficina import Oficina
from Aula import Aula
from Laboratorio import Laboratorio

class Main:
    def run(self):
        # Instanciamos
        # 2 objetos Oficina
        oficina1 = Oficina(5, 3, 2)
        oficina2 = Oficina(4, 2, 1)
        #2 Aula
        aula1 = Aula("Aula A", 30, 25)
        aula2 = Aula("Aula B", 40, 35)
        #1 Laboratorio
        laboratorio = Laboratorio("Lab.Computacion", 20, 10, 20)

        # Mostramos los datos
        print("\n<--OFICINAS-->")
        oficina1.mostrar()
        print("  Total muebles:", oficina1.cantidadMuebles())
        oficina2.mostrar()
        print("  Total muebles:", oficina2.cantidadMuebles())

        print("\n<--AULAS-->")
        aula1.mostrar()
        print("  Total muebles:", aula1.cantidadMuebles())

        aula2.mostrar()
        print("  Total muebles:", aula2.cantidadMuebles())

        print("\n<--LABORATORIO-->")
        laboratorio.mostrar()
        print("  Total muebles:", laboratorio.cantidadMuebles())

if __name__ == "__main__":
    programa = Main()
    programa.run()