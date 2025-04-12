#6. Para el comportamiento de los atributos de un Auto se tiene en cuenta la siguiente clase:
class Auto:
    #a)	Sobrecargar el constructor 2 veces
    def __init__(self, modelo="Desconocido", placa="Desconocida", color="Desconocido"):
        self.modelo = modelo
        self.placa = placa
        self.color = color

    
    #c)	Sobrecargar el operador ++ para tener un nuevo auto.
    def __add__(self, otro):
        nuevo_modelo = "Nuevo_" + self.modelo
        return Auto(nuevo_modelo, self.placa, self.color)

    #d)	Sobrecargar el operador -- para mostrar los atributos de los dos objetos
    def __str__(self):
        return f"Modelo: {self.modelo}, Placa: {self.placa}, Color: {self.color}"
    
    
if __name__ == "__main__":
    #b)	Instanciar 2 objetos Auto, usando los diferentes constructores.
    auto1 = Auto()  
    auto2 = Auto("Toyota", "ABC-123") 

    nuevo_auto = auto1 + auto2  
    print(auto1)  
    print(auto2)
    print(nuevo_auto)