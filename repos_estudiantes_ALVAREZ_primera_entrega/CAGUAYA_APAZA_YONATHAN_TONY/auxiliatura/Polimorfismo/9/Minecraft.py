class BloqueCofre:
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo

    def accion(self):
        print(f"El cofre tipo {self.tipo} ha sido abierto.")

    def colocar(self):
        print("Cofre colocado en el suelo.")

    def colocar_con_orientacion(self, orientacion):
        print(f"Cofre colocado en la orientacion: {orientacion}")

    def romper(self):
        print("El cofre fue roto, los objetos han sido expulsados.")


class BloqueTnt:
    def __init__(self, tipo, dano):
        self.tipo = tipo
        self.dano = dano

    def accion(self):
        print(f"TNT tipo {self.tipo} activada, explotara pronto!")

    def colocar(self):
        print("TNT colocada en el suelo.")

    def colocar_con_orientacion(self, orientacion):
        print(f"TNT colocada en la orientacion: {orientacion}")

    def romper(self):
        print("La TNT se ha roto sin explotar.")


class BloqueHorno:
    def __init__(self, color, capacidad_comida):
        self.color = color
        self.capacidad_comida = capacidad_comida

    def accion(self):
        print(f"El horno de color {self.color} ha comenzado a cocinar.")

    def colocar(self):
        print("Horno colocado en el suelo.")

    def colocar_con_orientacion(self, orientacion):
        print(f"Horno colocado en la orientacion: {orientacion}")

    def romper(self):
        print("El horno fue roto, se perdio la comida.")
if __name__ == "__main__":
    cofre1 = BloqueCofre(27, 10, "Madera")
    cofre2 = BloqueCofre(54, 15, "Hierro")

    tnt1 = BloqueTnt("Basica", 20)
    tnt2 = BloqueTnt("Mega", 50)

    horno1 = BloqueHorno("Rojo", 5)
    horno2 = BloqueHorno("Gris", 8)

    cofre1.accion()
    tnt1.accion()
    horno1.accion()

    cofre2.colocar()
    cofre2.colocar_con_orientacion("pared")

    tnt2.colocar()
    tnt2.colocar_con_orientacion("pared")

    horno2.colocar()
    horno2.colocar_con_orientacion("esquina")

    cofre1.romper()
    tnt1.romper()
    horno1.romper()
