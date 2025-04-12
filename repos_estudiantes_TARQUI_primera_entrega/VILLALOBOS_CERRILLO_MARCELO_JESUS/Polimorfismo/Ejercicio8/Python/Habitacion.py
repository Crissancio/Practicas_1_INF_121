class HabitacionSimple:
    def __init__(self, nroHabitacion, precioxNoche, nrodeNoches, capacidad):
        self.nroHabitacion = nroHabitacion
        self.precioxNoche = precioxNoche
        self.nrodeNoches = nrodeNoches
        self.capacidad = capacidad
    def reservar(self, noches, personas=None):
        if personas:
            print("Habitación reservada por", noches, "noches para", personas, "personas.")
        else:
            print("Habitación reservada por", noches, "noches")
    def calcularCosto(self, noches):
        return noches * 50
class HabitacionDoble:
    def __init__(self, nroHabitacion, precioxNoche, nrodeNoches, capacidad, nrodeHabitaciones):
        self.nroHabitacion = nroHabitacion
        self.precioxNoche = precioxNoche
        self.nrodeNoches = nrodeNoches
        self.capacidad = capacidad
        self.nrodeHabitaciones = nrodeHabitaciones
    def reservar(self, noches, personas=None):
        if personas:
            print("Habitación reservada por", noches, "noches para", personas, "personas.")
        else:
            print("Habitación reservada por", noches, "noches")
    def calcularCosto(self, noches):
        return noches * 80
class Suite:
    def __init__(self, nroHabitacion, precioxNoche, nrodeNoches, capacidad, nrodeHabitaciones):
        self.nroHabitacion = nroHabitacion
        self.precioxNoche = precioxNoche
        self.nrodeNoches = nrodeNoches
        self.capacidad = capacidad
        self.nrodeHabitaciones = nrodeHabitaciones
    def reservar(self, noches, personas=None):
        if personas:
            print("Habitación reservada por", noches, "noches para", personas, "personas.")
        else:
            print("Habitación reservada por", noches, "noches")
    def calcularCosto(self, noches):
        return noches * 150
h1 = HabitacionSimple(101, 50, 3, 2)
h2 = HabitacionDoble(202, 80, 2, 4, 2)
h3 = Suite(303, 150, 1, 6, 3)
h1.reservar(3)
h2.reservar(2, 2)
h3.reservar(1)
print("Costo Simple:", h1.calcularCosto(3))
print("Costo Doble:", h2.calcularCosto(2))
print("Costo Suite:", h3.calcularCosto(1))
