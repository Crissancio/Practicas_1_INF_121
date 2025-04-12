class BloqueCofre:
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo
    
    def accion(self):
        print(f"Abriendo cofre {self.tipo} con capacidad de {self.capacidad} items")
    
    def colocar(self, orientacion=None):
        if orientacion is None:
            print("Cofre colocado en el suelo")
        else:
            print(f"Cofre colocado en {orientacion}")
    
    def romper(self):
        print("Rompiendo cofre... ¡Cuidado con los items que caen!")


class BloqueTnt:
    def __init__(self, tipo, daño):
        self.tipo = tipo
        self.daño = daño
    
    def accion(self):
        print(f"¡La TNT {self.tipo} está a punto de explotar con {self.daño} de daño!")
    
    def colocar(self, orientacion=None):
        if orientacion is None:
            print("TNT colocada en el suelo")
        else:
            print(f"TNT colocada en {orientacion} (¡Ten cuidado!)")
    
    def romper(self):
        print(f"¡BOOM! La TNT ha explotado causando {self.daño} de daño")


class BloqueHorno:
    def __init__(self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida
    
    def accion(self):
        print(f"Horno {self.color} listo para cocinar {self.capacidadComida} alimentos")
    
    def colocar(self, orientacion=None):
        if orientacion is None:
            print("Horno colocado en el suelo")
        else:
            print(f"Horno colocado en {orientacion} (asegúrate de dejar espacio para el humo)")
    
    def romper(self):
        print("Rompiendo horno... ¡Recuerda sacar la comida primero!")


def main():
    # a) Instanciar 2 bloques de cada tipo
    cofre1 = BloqueCofre(27, 10, "Roble")
    cofre2 = BloqueCofre(54, 15, "End")
    
    tnt1 = BloqueTnt("Normal", 10)
    tnt2 = BloqueTnt("Super", 25)
    
    horno1 = BloqueHorno("Negro", 3)
    horno2 = BloqueHorno("Blanco", 5)

    # b) Probar método accion()
    print("=== ACCIONES DE BLOQUES ===")
    cofre1.accion()
    tnt1.accion()
    horno1.accion()

    # c) Probar método colocar() sobrecargado
    print("\n=== COLOCAR BLOQUES ===")
    cofre2.colocar()
    cofre2.colocar("la pared")
    
    tnt2.colocar()
    tnt2.colocar("el techo")
    
    horno2.colocar()
    horno2.colocar("una esquina")

    # d) Probar método romper()
    print("\n=== ROMPER BLOQUES ===")
    cofre1.romper()
    tnt1.romper()
    horno1.romper()


if __name__ == "__main__":
    main()